/*
  Copyright (C) 2006-2014 Jeroen Frijters

  This software is provided 'as-is', without any express or implied
  warranty.  In no event will the authors be held liable for any damages
  arising from the use of this software.

  Permission is granted to anyone to use this software for any purpose,
  including commercial applications, and to alter it and redistribute it
  freely, subject to the following restrictions:

  1. The origin of this software must not be misrepresented; you must not
     claim that you wrote the original software. If you use this software
     in a product, an acknowledgment in the product documentation would be
     appreciated but is not required.
  2. Altered source versions must be plainly marked as such, and must not be
     misrepresented as being the original software.
  3. This notice may not be removed or altered from any source distribution.

  Jeroen Frijters
  jeroen@frijters.net
  
*/

package sun.misc;

import cli.System.Buffer;
import cli.System.IntPtr;
import cli.System.Runtime.InteropServices.Marshal;
import cli.System.Security.Permissions.SecurityAction;
import cli.System.Security.Permissions.SecurityPermissionAttribute;
import ikvm.lang.Internal;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import cli.System.Threading.Interlocked;
import cli.System.Threading.ReaderWriterLockSlim;
import cli.System.Threading.LockRecursionPolicy;

public final class Unsafe
{
    public static final int INVALID_FIELD_OFFSET = -1;
    public static final int ARRAY_BYTE_BASE_OFFSET = 0;
    // NOTE sun.corba.Bridge actually access this field directly (via reflection),
    // so the name must match the JDK name.
    private static final Unsafe theUnsafe = new Unsafe();
    private static final ArrayList<Field> fields = new ArrayList<Field>();
	private static final ReaderWriterLockSlim unsafeLocker = new ReaderWriterLockSlim();

    private Unsafe() { }

    @sun.reflect.CallerSensitive
    public static Unsafe getUnsafe()
    {
        if(!VM.isSystemDomainLoader(ikvm.internal.CallerID.getCallerID().getCallerClassLoader()))
        {
            throw new SecurityException("Unsafe");
        }
        return theUnsafe;
    }

    private static native Field createFieldAndMakeAccessible(Class c, String field);
    private static native Field copyFieldAndMakeAccessible(Field field);

    // this is the intrinsified version of objectFieldOffset(XXX.class.getDeclaredField("xxx"))
    public long objectFieldOffset(Class c, String field)
    {
        return objectFieldOffset(createFieldAndMakeAccessible(c, field));
    }

    public native long objectFieldOffset(Field field);
    
    public long staticFieldOffset(Field field)
    {
        if(!Modifier.isStatic(field.getModifiers()))
        {
            throw new IllegalArgumentException();
        }
        return allocateUnsafeFieldId(field);
    }

    @Deprecated
    public int fieldOffset(Field original)
    {
        return (int)(Modifier.isStatic(original.getModifiers()) ? staticFieldOffset(original) : objectFieldOffset(original));
    }
    
    static int allocateUnsafeFieldId(Field original)
    {
		Field copy = copyFieldAndMakeAccessible(original);
		try
        {
			unsafeLocker.EnterWriteLock();
            int id = fields.size();
            fields.add(copy);
            return id;
        } finally{
			if(unsafeLocker.get_IsWriteLockHeld()){
				unsafeLocker.ExitWriteLock();
			}
		}
    }
    /** The value of {@code arrayBaseOffset(boolean[].class)} */
    public static final int ARRAY_BOOLEAN_BASE_OFFSET = 0;

    /** The value of {@code arrayBaseOffset(short[].class)} */
    public static final int ARRAY_SHORT_BASE_OFFSET
            = 0;

    /** The value of {@code arrayBaseOffset(char[].class)} */
    public static final int ARRAY_CHAR_BASE_OFFSET
            = 0;

    /** The value of {@code arrayBaseOffset(int[].class)} */
    public static final int ARRAY_INT_BASE_OFFSET
            = 0;

    /** The value of {@code arrayBaseOffset(long[].class)} */
    public static final int ARRAY_LONG_BASE_OFFSET
            = 0;

    /** The value of {@code arrayBaseOffset(float[].class)} */
    public static final int ARRAY_FLOAT_BASE_OFFSET
            = 0;

    /** The value of {@code arrayBaseOffset(double[].class)} */
    public static final int ARRAY_DOUBLE_BASE_OFFSET
            = 0;

    /** The value of {@code arrayBaseOffset(Object[].class)} */
    public static final int ARRAY_OBJECT_BASE_OFFSET
            = 0;

    public int arrayBaseOffset(Class c)
    {
        // don't change this, the Unsafe intrinsics depend on this value
        return 0;
    }

    public int arrayIndexScale(Class c)
    {
        if (c == byte[].class || c == boolean[].class)
        {
            return 1;
        }
        if (c == char[].class || c == short[].class)
        {
            return 2;
        }
        if (c == int[].class || c == float[].class || c == Object[].class)
        {
            return 4;
        }
        if (c == long[].class || c == double[].class)
        {
            return 8;
        }
        // don't change this, the Unsafe intrinsics depend on this value
        return 1;
    }

    static Field getField(long offset)
    {
        try
        {
			unsafeLocker.EnterReadLock();
            return fields.get((int)offset);
        } finally{
			if(unsafeLocker.get_IsReadLockHeld()){
				unsafeLocker.ExitReadLock();
			}
		}
    }

    public final native boolean compareAndSwapObject(Object obj, long offset, Object expect, Object update);
	

    public void putOrderedObject(Object obj, long offset, Object newValue)
    {
        putObjectVolatile(obj, offset, newValue);
    }

	private static native byte ReadByte(Object obj, long offset);
    private static native short ReadInt16(Object obj, long offset);
    private static native int ReadInt32(Object obj, long offset);
    private static native long ReadInt64(Object obj, long offset, boolean atomic);
	private static native void WriteByte(Object obj, long offset, byte value);
    private static native void WriteInt16(Object obj, long offset, short value);
    private static native void WriteInt32(Object obj, long offset, int value);
    private static native void WriteInt64(Object obj, long offset, long value, boolean atomic);
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
	private static native long IKVM_GetLong(IntPtr offset);
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
	private static native long IKVM_SetLong(IntPtr offset, long value);

    public final native boolean compareAndSwapInt(Object obj, long offset, int expect, int update);

    public void putOrderedInt(Object obj, long offset, int newValue)
    {
        putIntVolatile(obj, offset, newValue);
    }

    public final native boolean compareAndSwapLong(Object obj, long offset, long expect, long update);

    public void putOrderedLong(Object obj, long offset, long newValue)
    {
        putLongVolatile(obj, offset, newValue);
    }
	

    @Deprecated
    public int getInt(Object o, int offset)
    {
        return getInt(o, (long)offset);
    }

    @Deprecated
    public void putInt(Object o, int offset, int x)
    {
        putInt(o, (long)offset, x);
    }

    @Deprecated
    public Object getObject(Object o, int offset)
    {
        return getObject(o, (long)offset);
    }

    @Deprecated
    public void putObject(Object o, int offset, Object x)
    {
        putObject(o, (long)offset, x);
    }

    @Deprecated
    public boolean getBoolean(Object o, int offset)
    {
        return getBoolean(o, (long)offset);
    }

    @Deprecated
    public void putBoolean(Object o, int offset, boolean x)
    {
        putBoolean(o, (long)offset, x);
    }

    @Deprecated
    public byte getByte(Object o, int offset)
    {
        return getByte(o, (long)offset);
    }

    @Deprecated
    public void putByte(Object o, int offset, byte x)
    {
        putByte(o, (long)offset, x);
    }

    @Deprecated
    public short getShort(Object o, int offset)
    {
        return getShort(o, (long)offset);
    }

    @Deprecated
    public void putShort(Object o, int offset, short x)
    {
        putShort(o, (long)offset, x);
    }

    @Deprecated
    public char getChar(Object o, int offset)
    {
        return getChar(o, (long)offset);
    }

    @Deprecated
    public void putChar(Object o, int offset, char x)
    {
        putChar(o, (long)offset, x);
    }

    @Deprecated
    public long getLong(Object o, int offset)
    {
        return getLong(o, (long)offset);
    }

    @Deprecated
    public void putLong(Object o, int offset, long x)
    {
        putLong(o, (long)offset, x);
    }

    @Deprecated
    public float getFloat(Object o, int offset)
    {
        return getFloat(o, (long)offset);
    }

    @Deprecated
    public void putFloat(Object o, int offset, float x)
    {
        putFloat(o, (long)offset, x);
    }

    @Deprecated
    public double getDouble(Object o, int offset)
    {
        return getDouble(o, (long)offset);
    }

    @Deprecated
    public void putDouble(Object o, int offset, double x)
    {
        putDouble(o, (long)offset, x);
    }

    public native void throwException(Throwable t);

    public native void ensureClassInitialized(Class clazz);

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, SerializationFormatter = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public native Object allocateInstance(Class clazz) throws InstantiationException;

    public int addressSize()
    {
        return IntPtr.get_Size();
    }

    public int pageSize()
    {
        return 4096;
    }

    // The really unsafe methods start here. They are all have a LinkDemand for unmanaged code.

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public long allocateMemory(long bytes)
    {
        if (bytes == 0)
        {
            return 0;
        }
        try
        {
            if (false) throw new cli.System.OutOfMemoryException();
            return Marshal.AllocHGlobal(IntPtr.op_Explicit(bytes)).ToInt64();
        }
        catch (cli.System.OutOfMemoryException x)
        {
            throw new OutOfMemoryError(x.get_Message());
        }
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public long reallocateMemory(long address, long bytes)
    {
        if (bytes == 0)
        {
            freeMemory(address);
            return 0;
        }
        try
        {
            if (false) throw new cli.System.OutOfMemoryException();
            return Marshal.ReAllocHGlobal(IntPtr.op_Explicit(address), IntPtr.op_Explicit(bytes)).ToInt64();
        }
        catch (cli.System.OutOfMemoryException x)
        {
            throw new OutOfMemoryError(x.get_Message());
        }
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void freeMemory(long address)
    {
        Marshal.FreeHGlobal(IntPtr.op_Explicit(address));
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void setMemory(long address, long bytes, byte value)
    {
        for(long i = 0; i < bytes; i++){
			cli.System.Runtime.InteropServices.Marshal.WriteByte(IntPtr.op_Explicit(address + i), value);
		}
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void setMemory(Object o, long offset, long bytes, byte value)
    {
        if (o == null)
        {
            setMemory(offset, bytes, value);
        }
        else if (o instanceof byte[])
        {
            byte[] array = (byte[])o;
            for (int i = 0; i < bytes; i++)
            {
                array[(int)(offset + i)] = value;
            }
        }
        else if (o instanceof cli.System.Array)
        {
            cli.System.Array array = (cli.System.Array)o;
            for (int i = 0; i < bytes; i++)
            {
                cli.System.Buffer.SetByte(array, (int)(offset + i), value);
            }
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void copyMemory(long srcAddress, long destAddress, long bytes)
    {
		for (long i = 0; i < bytes; i++)
		{
			cli.System.Runtime.InteropServices.Marshal.WriteByte(IntPtr.op_Explicit(destAddress + i), cli.System.Runtime.InteropServices.Marshal.ReadByte(IntPtr.op_Explicit(srcAddress + i)));
		}
    }
    
    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void copyMemory(Object srcBase, long srcOffset, Object destBase, long destOffset, long bytes)
    {
        if (srcBase == null)
        {
            if (destBase instanceof byte[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy(IntPtr.op_Explicit(srcOffset), (byte[])destBase, (int)destOffset, (int)bytes);
            }
            else if (destBase instanceof boolean[])
            {
                byte[] tmp = new byte[(int)bytes];
                copyMemory(srcBase, srcOffset, tmp, 0, bytes);
                copyMemory(tmp, 0, destBase, destOffset, bytes);
            }
            else if (destBase instanceof short[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy(IntPtr.op_Explicit(srcOffset), (short[])destBase, (int)(destOffset >> 1), (int)(bytes >> 1));
            }
            else if (destBase instanceof char[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy(IntPtr.op_Explicit(srcOffset), (char[])destBase, (int)(destOffset >> 1), (int)(bytes >> 1));
            }
            else if (destBase instanceof int[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy(IntPtr.op_Explicit(srcOffset), (int[])destBase, (int)(destOffset >> 2), (int)(bytes >> 2));
            }
            else if (destBase instanceof float[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy(IntPtr.op_Explicit(srcOffset), (float[])destBase, (int)(destOffset >> 2), (int)(bytes >> 2));
            }
            else if (destBase instanceof long[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy(IntPtr.op_Explicit(srcOffset), (long[])destBase, (int)(destOffset >> 3), (int)(bytes >> 3));
            }
            else if (destBase instanceof double[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy(IntPtr.op_Explicit(srcOffset), (double[])destBase, (int)(destOffset >> 3), (int)(bytes >> 3));
            }
            else if (destBase == null)
            {
                copyMemory(srcOffset, destOffset, bytes);
            }
            else
            {
                throw new IllegalArgumentException();
            }
        }
        else if (srcBase instanceof cli.System.Array && destBase instanceof cli.System.Array)
        {
            cli.System.Buffer.BlockCopy((cli.System.Array)srcBase, (int)srcOffset, (cli.System.Array)destBase, (int)destOffset, (int)bytes);
        }
        else
        {
            if (srcBase instanceof byte[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy((byte[])srcBase, (int)srcOffset, IntPtr.op_Explicit(destOffset), (int)bytes);
            }
            else if (srcBase instanceof boolean[])
            {
                byte[] tmp = new byte[(int)bytes];
                copyMemory(srcBase, srcOffset, tmp, 0, bytes);
                copyMemory(tmp, 0, destBase, destOffset, bytes);
            }
            else if (srcBase instanceof short[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy((short[])srcBase, (int)(srcOffset >> 1), IntPtr.op_Explicit(destOffset), (int)(bytes >> 1));
            }
            else if (srcBase instanceof char[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy((char[])srcBase, (int)(srcOffset >> 1), IntPtr.op_Explicit(destOffset), (int)(bytes >> 1));
            }
            else if (srcBase instanceof int[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy((int[])srcBase, (int)(srcOffset >> 2), IntPtr.op_Explicit(destOffset), (int)(bytes >> 2));
            }
            else if (srcBase instanceof float[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy((float[])srcBase, (int)(srcOffset >> 2), IntPtr.op_Explicit(destOffset), (int)(bytes >> 2));
            }
            else if (srcBase instanceof long[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy((long[])srcBase, (int)(srcOffset >> 3), IntPtr.op_Explicit(destOffset), (int)(bytes >> 3));
            }
            else if (srcBase instanceof double[])
            {
                cli.System.Runtime.InteropServices.Marshal.Copy((double[])srcBase, (int)(srcOffset >> 3), IntPtr.op_Explicit(destOffset), (int)(bytes >> 3));
            }
            else
            {
                throw new IllegalArgumentException();
            }
        }
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public byte getByte(long address)
    {
	return cli.System.Runtime.InteropServices.Marshal.ReadByte(IntPtr.op_Explicit(address));
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void putByte(long address, byte x)
    {
	cli.System.Runtime.InteropServices.Marshal.WriteByte(IntPtr.op_Explicit(address), x);
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public short getShort(long address)
    {
	return cli.System.Runtime.InteropServices.Marshal.ReadInt16(IntPtr.op_Explicit(address));
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void putShort(long address, short x)
    {
	cli.System.Runtime.InteropServices.Marshal.WriteInt16(IntPtr.op_Explicit(address), x);
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public char getChar(long address)
    {
        return (char)cli.System.Runtime.InteropServices.Marshal.ReadInt16(IntPtr.op_Explicit(address));
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void putChar(long address, char x)
    {
        cli.System.Runtime.InteropServices.Marshal.WriteInt16(IntPtr.op_Explicit(address), (short)x);
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public int getInt(long address)
    {
	return cli.System.Runtime.InteropServices.Marshal.ReadInt32(IntPtr.op_Explicit(address));
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void putInt(long address, int x)
    {
	cli.System.Runtime.InteropServices.Marshal.WriteInt32(IntPtr.op_Explicit(address), x);
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public long getLong(long address)
    {
	return cli.System.Runtime.InteropServices.Marshal.ReadInt64(IntPtr.op_Explicit(address));
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void putLong(long address, long x)
    {
	cli.System.Runtime.InteropServices.Marshal.WriteInt64(IntPtr.op_Explicit(address), x);
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public long getAddress(long address)
    {
	return cli.System.Runtime.InteropServices.Marshal.ReadIntPtr(IntPtr.op_Explicit(address)).ToInt64();
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void putAddress(long address, long x)
    {
	cli.System.Runtime.InteropServices.Marshal.WriteIntPtr(IntPtr.op_Explicit(address), IntPtr.op_Explicit(x));
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public float getFloat(long address)
    {
        return Float.intBitsToFloat(getInt(address));
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void putFloat(long address, float x)
    {
        putInt(address, Float.floatToIntBits(x));
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public double getDouble(long address)
    {
        return Double.longBitsToDouble(getLong(address));
    }

    @SecurityPermissionAttribute.Annotation(value = SecurityAction.__Enum.LinkDemand, UnmanagedCode = true)
    @cli.System.Security.SecurityCriticalAttribute.Annotation
    public void putDouble(long address, double x)
    {
        putLong(address, Double.doubleToLongBits(x));
    }
    
    public int getLoadAverage(double[] loadavg, int nelems)
    {
        return -1;
    }

    public void park(boolean isAbsolute, long time)
    {
        if (isAbsolute)
        {
            java.util.concurrent.locks.LockSupport.parkUntil(time);
        }
        else
        {
            if (time == 0)
            {
                time = Long.MAX_VALUE;
            }
            java.util.concurrent.locks.LockSupport.parkNanos(time);
        }
    }

    public void unpark(Object thread)
    {
        java.util.concurrent.locks.LockSupport.unpark((Thread)thread);
    }

    public Object staticFieldBase(Field f)
    {
        return null;
    }
    
    @Deprecated
    public Object staticFieldBase(Class<?> c)
    {
        return null;
    }

    public native boolean shouldBeInitialized(Class<?> c);

    public native Class defineClass(String name, byte[] buf, int offset, int length, ClassLoader cl, ProtectionDomain pd);

    @Deprecated
    @sun.reflect.CallerSensitive
    public native Class defineClass(String name, byte[] b, int off, int len);

    public native Class defineAnonymousClass(Class hostClass, byte[] data, Object[] cpPatches);

    public void monitorEnter(Object o)
    {
        cli.System.Threading.Monitor.Enter(o);
    }

    public void monitorExit(Object o)
    {
        cli.System.Threading.Monitor.Exit(o);
    }

    public boolean tryMonitorEnter(Object o)
    {
        return cli.System.Threading.Monitor.TryEnter(o);
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public native final int getAndAddInt(Object o, long offset, int delta);
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public native final long getAndAddLong(Object o, long offset, long delta);
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public native final int getAndSetInt(Object o, long offset, int newValue);
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public native final long getAndSetLong(Object o, long offset, long newValue);

    public native final Object getAndSetObject(Object o, long offset, Object newValue);

    public void loadFence()
    {
        cli.System.Threading.Thread.MemoryBarrier();
    }

    public void storeFence()
    {
        cli.System.Threading.Thread.MemoryBarrier();
    }

    public void fullFence()
    {
        cli.System.Threading.Thread.MemoryBarrier();
    }
	
	/**
     * Fetches a reference value from a given Java variable, with volatile
     * load semantics. Otherwise identical to {@link #getObject(Object, long)}
     */
    public native Object getObjectVolatile(Object o, long offset);

    /**
     * Stores a reference value into a given Java variable, with
     * volatile store semantics. Otherwise identical to {@link #putObject(Object, long, Object)}
     */
    public native void    putObjectVolatile(Object o, long offset, Object x);

    /** Volatile version of {@link #getInt(Object, long)}  */
    public native int     getIntVolatile(Object o, long offset);

    /** Volatile version of {@link #putInt(Object, long, int)}  */
    public native void    putIntVolatile(Object o, long offset, int x);

    /** Volatile version of {@link #getBoolean(Object, long)}  */
    public native boolean getBooleanVolatile(Object o, long offset);

    /** Volatile version of {@link #putBoolean(Object, long, boolean)}  */
    public native void    putBooleanVolatile(Object o, long offset, boolean x);

    /** Volatile version of {@link #getByte(Object, long)}  */
    public native byte    getByteVolatile(Object o, long offset);

    /** Volatile version of {@link #putByte(Object, long, byte)}  */
    public native void    putByteVolatile(Object o, long offset, byte x);

    /** Volatile version of {@link #getShort(Object, long)}  */
    public native short   getShortVolatile(Object o, long offset);

    /** Volatile version of {@link #putShort(Object, long, short)}  */
    public native void    putShortVolatile(Object o, long offset, short x);

    /** Volatile version of {@link #getChar(Object, long)}  */
    public native char    getCharVolatile(Object o, long offset);

    /** Volatile version of {@link #putChar(Object, long, char)}  */
    public native void    putCharVolatile(Object o, long offset, char x);

    /** Volatile version of {@link #getLong(Object, long)}  */
    public native long    getLongVolatile(Object o, long offset);

    /** Volatile version of {@link #putLong(Object, long, long)}  */
    public native void    putLongVolatile(Object o, long offset, long x);

    /** Volatile version of {@link #getFloat(Object, long)}  */
    public native float   getFloatVolatile(Object o, long offset);

    /** Volatile version of {@link #putFloat(Object, long, float)}  */
    public native void    putFloatVolatile(Object o, long offset, float x);

    /** Volatile version of {@link #getDouble(Object, long)}  */
    public native double  getDoubleVolatile(Object o, long offset);

    /** Volatile version of {@link #putDouble(Object, long, double)}  */
    public native void    putDoubleVolatile(Object o, long offset, double x);
	    /**
     * Fetches a value from a given Java variable.
     * More specifically, fetches a field or array element within the given
     * object <code>o</code> at the given offset, or (if <code>o</code> is
     * null) from the memory address whose numerical value is the given
     * offset.
     * <p>
     * The results are undefined unless one of the following cases is true:
     * <ul>
     * <li>The offset was obtained from {@link #objectFieldOffset} on
     * the {@link java.lang.reflect.Field} of some Java field and the object
     * referred to by <code>o</code> is of a class compatible with that
     * field's class.
     *
     * <li>The offset and object reference <code>o</code> (either null or
     * non-null) were both obtained via {@link #staticFieldOffset}
     * and {@link #staticFieldBase} (respectively) from the
     * reflective {@link Field} representation of some Java field.
     *
     * <li>The object referred to by <code>o</code> is an array, and the offset
     * is an integer of the form <code>B+N*S</code>, where <code>N</code> is
     * a valid index into the array, and <code>B</code> and <code>S</code> are
     * the values obtained by {@link #arrayBaseOffset} and {@link
     * #arrayIndexScale} (respectively) from the array's class.  The value
     * referred to is the <code>N</code><em>th</em> element of the array.
     *
     * </ul>
     * <p>
     * If one of the above cases is true, the call references a specific Java
     * variable (field or array element).  However, the results are undefined
     * if that variable is not in fact of the type returned by this method.
     * <p>
     * This method refers to a variable by means of two parameters, and so
     * it provides (in effect) a <em>double-register</em> addressing mode
     * for Java variables.  When the object reference is null, this method
     * uses its offset as an absolute address.  This is similar in operation
     * to methods such as {@link #getInt(long)}, which provide (in effect) a
     * <em>single-register</em> addressing mode for non-Java variables.
     * However, because Java variables may have a different layout in memory
     * from non-Java variables, programmers should not assume that these
     * two addressing modes are ever equivalent.  Also, programmers should
     * remember that offsets from the double-register addressing mode cannot
     * be portably confused with longs used in the single-register addressing
     * mode.
     *
     * @param o Java heap object in which the variable resides, if any, else
     *        null
     * @param offset indication of where the variable resides in a Java heap
     *        object, if any, else a memory address locating the variable
     *        statically
     * @return the value fetched from the indicated Java variable
     * @throws RuntimeException No defined exceptions are thrown, not even
     *         {@link NullPointerException}
     */
    public native int getInt(Object o, long offset);

    /**
     * Stores a value into a given Java variable.
     * <p>
     * The first two parameters are interpreted exactly as with
     * {@link #getInt(Object, long)} to refer to a specific
     * Java variable (field or array element).  The given value
     * is stored into that variable.
     * <p>
     * The variable must be of the same type as the method
     * parameter <code>x</code>.
     *
     * @param o Java heap object in which the variable resides, if any, else
     *        null
     * @param offset indication of where the variable resides in a Java heap
     *        object, if any, else a memory address locating the variable
     *        statically
     * @param x the value to store into the indicated Java variable
     * @throws RuntimeException No defined exceptions are thrown, not even
     *         {@link NullPointerException}
     */
    public native void putInt(Object o, long offset, int x);

    /**
     * Fetches a reference value from a given Java variable.
     * @see #getInt(Object, long)
     */
    public native Object getObject(Object o, long offset);

    /**
     * Stores a reference value into a given Java variable.
     * <p>
     * Unless the reference <code>x</code> being stored is either null
     * or matches the field type, the results are undefined.
     * If the reference <code>o</code> is non-null, car marks or
     * other store barriers for that object (if the VM requires them)
     * are updated.
     * @see #putInt(Object, int, int)
     */
    public native void putObject(Object o, long offset, Object x);

    /** @see #getInt(Object, long) */
    public native boolean getBoolean(Object o, long offset);
    /** @see #putInt(Object, int, int) */
    public native void    putBoolean(Object o, long offset, boolean x);
    /** @see #getInt(Object, long) */
    public native byte    getByte(Object o, long offset);
    /** @see #putInt(Object, int, int) */
    public native void    putByte(Object o, long offset, byte x);
    /** @see #getInt(Object, long) */
    public native short   getShort(Object o, long offset);
    /** @see #putInt(Object, int, int) */
    public native void    putShort(Object o, long offset, short x);
    /** @see #getInt(Object, long) */
    public native char    getChar(Object o, long offset);
    /** @see #putInt(Object, int, int) */
    public native void    putChar(Object o, long offset, char x);
    /** @see #getInt(Object, long) */
    public native long    getLong(Object o, long offset);
    /** @see #putInt(Object, int, int) */
    public native void    putLong(Object o, long offset, long x);
    /** @see #getInt(Object, long) */
    public native float   getFloat(Object o, long offset);
    /** @see #putInt(Object, int, int) */
    public native void    putFloat(Object o, long offset, float x);
    /** @see #getInt(Object, long) */
    public native double  getDouble(Object o, long offset);
    /** @see #putInt(Object, int, int) */
    public native void    putDouble(Object o, long offset, double x);
}