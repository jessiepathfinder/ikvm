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
        return allocateUnsafeFieldId(createFieldAndMakeAccessible(c, field));
    }

    // NOTE we have a really lame (and slow) implementation!
    public long objectFieldOffset(Field field)
    {
        if(Modifier.isStatic(field.getModifiers()))
        {
            throw new IllegalArgumentException();
        }
        return allocateUnsafeFieldId(field);
    }
    
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
        return allocateUnsafeFieldId(original);
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
	
    public void putObjectVolatile(Object obj, long offset, Object newValue)
    {
		if(obj == null){
			throwException(new UnsupportedOperationException("IKVM.NET doesn't support off-heap object references, please use JNI instead"));
		}
        if(obj instanceof Object[])
        {
			if(offset % 4 == 0){
				Interlocked.MemoryBarrier();
				((Object[])obj)[(int)(offset / 4)] = newValue;
				Interlocked.MemoryBarrier();
			} else{
				throwException(new UnsupportedOperationException("IKVM.NET doesn't support unaligned object arrays"));
			}
        }
        else
        {
            Field field = getField(offset);
            synchronized(field)
            {
                try
                {
                    field.set(obj, newValue);
                }
                catch(IllegalAccessException x)
                {
                    throw (InternalError)new InternalError().initCause(x);
                }
            }
        }
    }

    public void putOrderedObject(Object obj, long offset, Object newValue)
    {
        putObjectVolatile(obj, offset, newValue);
    }
    public Object getObjectVolatile(Object obj, long offset)
    {
        if(obj == null){
			throwException(new UnsupportedOperationException("IKVM.NET doesn't support off-heap object references, please use JNI instead"));
		}
		if(obj instanceof Object[])
        {
			if(offset % 4 == 0){
				Interlocked.MemoryBarrier();
				obj = ((Object[])obj)[(int)(offset / 4)];
				Interlocked.MemoryBarrier();
				return obj;
			} else{
				return null;
			}
        }
        else
        {
            Field field = getField(offset);
            synchronized(field)
            {
                try
                {
                    return field.get(obj);
                }
                catch(IllegalAccessException x)
                {
                    throw (InternalError)new InternalError().initCause(x);
                }
            }
        }
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
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public void putIntVolatile(Object obj, long offset, int newValue)
    {
        if(obj == null){
			Interlocked.MemoryBarrier();
			putInt(offset, newValue);
			Interlocked.MemoryBarrier();
		} else if (obj instanceof cli.System.Array)
        {
			Interlocked.MemoryBarrier();
            WriteInt32(obj, offset, newValue);
            Interlocked.MemoryBarrier();
        }
        else
        {
            Field field = getField(offset);
            synchronized(field)
            {
                try
                {
                    field.setInt(obj, newValue);
                }
                catch(IllegalAccessException x)
                {
                    throw (InternalError)new InternalError().initCause(x);
                }
            }
        }
    }

    public void putOrderedInt(Object obj, long offset, int newValue)
    {
        putIntVolatile(obj, offset, newValue);
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public int getIntVolatile(Object obj, long offset)
    {
        if(obj == null){
			Interlocked.MemoryBarrier();
			int res = getInt(offset);
			Interlocked.MemoryBarrier();
			return res;
		} else if (obj instanceof cli.System.Array)
        {
			Interlocked.MemoryBarrier();
			int val = ReadInt32(obj, offset);
			Interlocked.MemoryBarrier();
            return val;
        }
        else
        {
            Field field = getField(offset);
            synchronized(field)
            {
                try
                {
                    return field.getInt(obj);
                }
                catch(IllegalAccessException x)
                {
                    throw (InternalError)new InternalError().initCause(x);
                }
            }
        }
    }

    public final native boolean compareAndSwapLong(Object obj, long offset, long expect, long update);
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public void putLongVolatile(Object obj, long offset, long newValue)
    {
        if(obj == null){
			IKVM_SetLong(IntPtr.op_Explicit(offset), newValue);
		} else if (obj instanceof cli.System.Array)
        {
            WriteInt64(obj, offset, newValue, true);
        }
        else
        {
            Field field = getField(offset);
            synchronized(field)
            {
                try
                {
                    field.setLong(obj, newValue);
                }
                catch(IllegalAccessException x)
                {
                    throw (InternalError)new InternalError().initCause(x);
                }
            }
        }
    }

    public void putOrderedLong(Object obj, long offset, long newValue)
    {
        putLongVolatile(obj, offset, newValue);
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public long getLongVolatile(Object obj, long offset)
    {
        if(obj == null){
			return IKVM_GetLong(IntPtr.op_Explicit(offset));
		} else if (obj instanceof cli.System.Array)
        {
            long val = ReadInt64(obj, offset, true);
			return val;
        }
        else
        {
            Field field = getField(offset);
            synchronized(field)
            {
                try
                {
                    return field.getLong(obj);
                }
                catch(IllegalAccessException x)
                {
                    throw (InternalError)new InternalError().initCause(x);
                }
            }
        }
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public void putBoolean(Object obj, long offset, boolean newValue)
    {
        if (obj instanceof cli.System.Array || obj == null)
        {
            putByte(obj, offset, newValue ? (byte)1 : (byte)0);
        }
        else
        {
            try
            {
                getField(offset).setBoolean(obj, newValue);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public void putBooleanVolatile(Object obj, long offset, boolean newValue)
    {
		if (obj instanceof cli.System.Array || obj == null)
        {
            putByteVolatile(obj, offset, newValue ? (byte)1 : (byte)0);
        }
        else
        {
            try
            {
				Field fld = getField(offset);
				Interlocked.MemoryBarrier();
                fld.setBoolean(obj, newValue);
				Interlocked.MemoryBarrier();
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public boolean getBoolean(Object obj, long offset)
    {
        if (obj instanceof cli.System.Array || obj == null)
        {
            return getByte(obj, offset) != 0;
        }
        else
        {
            try
            {
                return getField(offset).getBoolean(obj);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public boolean getBooleanVolatile(Object obj, long offset)
    {
		if (obj instanceof cli.System.Array || obj == null)
        {
            return getByteVolatile(obj, offset) != 0;
        }
        else
        {
			try
            {
				Field fld = getField(offset);
				Interlocked.MemoryBarrier();
                boolean res = fld.getBoolean(obj);
				Interlocked.MemoryBarrier();
				return res;
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public void putByte(Object obj, long offset, byte newValue)
    {
        if(obj == null){
			putByte(offset, newValue);
		} else if (obj instanceof cli.System.Array)
        {
            WriteByte(obj, offset, newValue);
        }
        else
        {
            try
            {
                getField(offset).setByte(obj, newValue);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public void putByteVolatile(Object obj, long offset, byte newValue)
    {
		Interlocked.MemoryBarrier();
        putByte(obj, offset, newValue);
		Interlocked.MemoryBarrier();
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public byte getByte(Object obj, long offset)
    {
        if(obj == null){
			return getByte(offset);
		} else if (obj instanceof cli.System.Array)
        {
            return ReadByte(obj, offset);
        }
        else
        {
            try
            {
                return getField(offset).getByte(obj);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public byte getByteVolatile(Object obj, long offset)
    {
		Interlocked.MemoryBarrier();
        byte res = getByte(obj, offset);
		Interlocked.MemoryBarrier();
		return res;
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public void putChar(Object obj, long offset, char newValue)
    {
        if(obj == null){
			putChar(offset, newValue);
		} else if (obj instanceof cli.System.Array)
        {
            WriteInt16(obj, offset, (short)newValue);
        }
        else
        {
            try
            {
                getField(offset).setChar(obj, newValue);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public void putCharVolatile(Object obj, long offset, char newValue)
    {
		Interlocked.MemoryBarrier();
        putChar(obj, offset, newValue);
		Interlocked.MemoryBarrier();
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public char getChar(Object obj, long offset)
    {
        if(obj == null){
			return getChar(offset);
		} else if (obj instanceof cli.System.Array)
        {
            return (char)ReadInt16(obj, offset);
        }
        else
        {
            try
            {
                return getField(offset).getChar(obj);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public char getCharVolatile(Object obj, long offset)
    {
		Interlocked.MemoryBarrier();
        char res = getChar(obj, offset);
		Interlocked.MemoryBarrier();
		return res;
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public void putShort(Object obj, long offset, short newValue)
    {
        if(obj == null){
			putShort(offset, newValue);
		} else if (obj instanceof cli.System.Array)
        {
            WriteInt16(obj, offset, newValue);
        }
        else
        {
            try
            {
                getField(offset).setShort(obj, newValue);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public void putShortVolatile(Object obj, long offset, short newValue)
    {
		Interlocked.MemoryBarrier();
        putShort(obj, offset, newValue);
		Interlocked.MemoryBarrier();
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public short getShort(Object obj, long offset)
    {
        if(obj == null){
			return getShort(offset);
		} else if (obj instanceof cli.System.Array)
        {
            return ReadInt16(obj, offset);
        }
        else
        {
            try
            {
                return getField(offset).getShort(obj);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public short getShortVolatile(Object obj, long offset)
    {
		Interlocked.MemoryBarrier();
        short res = getShort(obj, offset);
		Interlocked.MemoryBarrier();
		return res;
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public void putInt(Object obj, long offset, int newValue)
    {
        if(obj == null){
			putInt(offset, newValue);
		} else if (obj instanceof cli.System.Array)
        {
            WriteInt32(obj, offset, newValue);
        }
        else
        {
            try
            {
                getField(offset).setInt(obj, newValue);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public int getInt(Object obj, long offset)
    {
        if(obj == null){
			return getInt(offset);
		} else if (obj instanceof cli.System.Array)
        {
            return ReadInt32(obj, offset);
        }
        else
        {
            try
            {
                return getField(offset).getInt(obj);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public void putFloat(Object obj, long offset, float newValue)
    {
        if (obj instanceof cli.System.Array)
        {
            WriteInt32(obj, offset, Float.floatToRawIntBits(newValue));
        }
        else
        {
            try
            {
                getField(offset).setFloat(obj, newValue);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public void putFloatVolatile(Object obj, long offset, float newValue)
    {
		Interlocked.MemoryBarrier();
        putFloat(obj, offset, newValue);
		Interlocked.MemoryBarrier();
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public float getFloat(Object obj, long offset)
    {
        if (obj instanceof cli.System.Array)
        {
            return Float.intBitsToFloat(ReadInt32(obj, offset));
        }
        else
        {
            try
            {
                return getField(offset).getFloat(obj);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public float getFloatVolatile(Object obj, long offset)
    {
		Interlocked.MemoryBarrier();
        float res = getFloat(obj, offset);
		Interlocked.MemoryBarrier();
		return res;
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public void putLong(Object obj, long offset, long newValue)
    {
        if(obj == null){
			putLong(offset, newValue);
		} else if (obj instanceof cli.System.Array)
        {
            WriteInt64(obj, offset, newValue, false);
        }
        else
        {
            try
            {
                getField(offset).setLong(obj, newValue);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public long getLong(Object obj, long offset)
    {
        if(obj == null){
			return getLong(offset);
		} else if (obj instanceof cli.System.Array)
        {
            return ReadInt64(obj, offset, false);
        }
        else
        {
            try
            {
                return getField(offset).getLong(obj);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }
    public void putDouble(Object obj, long offset, double newValue)
    {
        if (obj instanceof cli.System.Array || obj == null)
        {
            putLong(obj, offset, Double.doubleToRawLongBits(newValue));
        }
        else
        {
            try
            {
                getField(offset).setDouble(obj, newValue);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public void putDoubleVolatile(Object obj, long offset, double newValue)
    {
        if (obj instanceof cli.System.Array || obj == null)
        {
            putLongVolatile(obj, offset, Double.doubleToRawLongBits(newValue));
        }
        else
        {
			Field field = getField(offset);
            synchronized(field)
            {
                try
                {
                    field.setDouble(obj, newValue);
                }
                catch(IllegalAccessException x)
                {
                    throw (InternalError)new InternalError().initCause(x);
                }
            }
        }
    }
	@cli.System.Security.SecuritySafeCriticalAttribute.Annotation
    public double getDouble(Object obj, long offset)
    {
        if (obj instanceof cli.System.Array || obj == null)
        {
            return Double.longBitsToDouble(getLong(obj, offset));
        }
        else
        {
            try
            {
                return getField(offset).getDouble(obj);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public double getDoubleVolatile(Object obj, long offset)
    {
        if (obj instanceof cli.System.Array || obj == null)
        {
            return Double.longBitsToDouble(getLongVolatile(obj, offset));
        }
        else
        {
			Field field = getField(offset);
            synchronized(field)
            {
                try
                {
                    return field.getDouble(obj);
                }
                catch(IllegalAccessException x)
                {
                    throw (InternalError)new InternalError().initCause(x);
                }
            }
        }
    }

    public void putObject(Object obj, long offset, Object newValue)
    {
		if(obj == null){
			throwException(new UnsupportedOperationException("IKVM.NET doesn't support off-heap object references, please use JNI instead"));
		}
        if (obj instanceof Object[])
        {
            if(offset % 4 == 0){
				((Object[])obj)[(int)(offset / 4)] = newValue;
			} else{
				throwException(new UnsupportedOperationException("IKVM.NET doesn't support unaligned object arrays"));
			}
        }
        else
        {
            try
            {
                getField(offset).set(obj, newValue);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
    }

    public Object getObject(Object obj, long offset)
    {
		if(obj == null){
			throwException(new UnsupportedOperationException("IKVM.NET doesn't support off-heap object references, please use JNI instead"));
		}
        if (obj instanceof Object[])
        {
			return (offset % 4 == 0) ? ((Object[])obj)[(int)(offset / 4)] : null;
        }
        else
        {
            try
            {
                return getField(offset).get(obj);
            }
            catch (IllegalAccessException x)
            {
                throw (InternalError)new InternalError().initCause(x);
            }
        }
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
}