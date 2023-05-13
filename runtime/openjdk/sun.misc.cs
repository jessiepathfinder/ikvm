/*
  Copyright (C) 2007-2015 Jeroen Frijters
  Copyright (C) 2009 Volker Berlin (i-net software)

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
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Reflection;
using System.Reflection.Emit;
using System.Runtime.ConstrainedExecution;
using System.Runtime.InteropServices;
using System.Runtime.Serialization;
using System.Security;
using System.Threading;
using System.Threading.Tasks;
using IKVM.Internal;
using System.Collections.Concurrent;
using Field = java.lang.reflect.Field;
using System.Runtime.CompilerServices;

public static class Java_sun_misc_GC
{
	public static long maxObjectInspectionAge()
	{
		return 0;
	}
}

public static class Java_sun_misc_MessageUtils
{
	public static void toStderr(string msg)
	{
		Console.Error.Write(msg);
	}

	public static void toStdout(string msg)
	{
		Console.Out.Write(msg);
	}
}

public static class Java_sun_misc_MiscHelper
{
	public static object getAssemblyClassLoader(Assembly asm, object extcl)
	{
		if (extcl == null || asm.IsDefined(typeof(IKVM.Attributes.CustomAssemblyClassLoaderAttribute), false))
		{
			return AssemblyClassLoader.FromAssembly(asm).GetJavaClassLoader();
		}
		return null;
	}
}

public static class Java_sun_misc_Signal
{
	/* derived from version 6.0 VC98/include/signal.h */
	private const int SIGINT = 2;       /* interrupt */
	private const int SIGILL = 4;       /* illegal instruction - invalid function image */
	private const int SIGFPE = 8;       /* floating point exception */
	private const int SIGSEGV = 11;     /* segment violation */
	private const int SIGTERM = 15;     /* Software termination signal from kill */
	private const int SIGBREAK = 21;    /* Ctrl-Break sequence */
	private const int SIGABRT = 22;     /* abnormal termination triggered by abort call */

	private static Dictionary<int, long> handler = new Dictionary<int, long>();

	// Delegate type to be used as the Handler Routine for SetConsoleCtrlHandler
	private delegate Boolean ConsoleCtrlDelegate(CtrlTypes CtrlType);

	// Enumerated type for the control messages sent to the handler routine
	private enum CtrlTypes : uint
	{
		CTRL_C_EVENT = 0,
		CTRL_BREAK_EVENT,
		CTRL_CLOSE_EVENT,
		CTRL_LOGOFF_EVENT = 5,
		CTRL_SHUTDOWN_EVENT
	}

	[SecurityCritical]
	private sealed class CriticalCtrlHandler : CriticalFinalizerObject
	{
		private ConsoleCtrlDelegate consoleCtrlDelegate;
		private bool ok;

		[DllImport("kernel32.dll")]
		private static extern bool SetConsoleCtrlHandler(ConsoleCtrlDelegate e, bool add);

		internal CriticalCtrlHandler()
		{
			consoleCtrlDelegate = new ConsoleCtrlDelegate(ConsoleCtrlCheck);
			ok = SetConsoleCtrlHandler(consoleCtrlDelegate, true);
		}

		[SecuritySafeCritical]
		~CriticalCtrlHandler()
		{
			if (ok)
			{
				SetConsoleCtrlHandler(consoleCtrlDelegate, false);
			}
		}
	}

	private static object defaultConsoleCtrlDelegate;

	private static bool ConsoleCtrlCheck(CtrlTypes ctrlType)
	{
#if !FIRST_PASS
		switch (ctrlType)
		{
			case CtrlTypes.CTRL_BREAK_EVENT:
				DumpAllJavaThreads();
				return true;

		}
#endif
		return false;
	}

#if !FIRST_PASS
	private static void DumpAllJavaThreads()
	{
		Console.WriteLine(DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss"));
		java.util.Map traces = java.lang.Thread.getAllStackTraces();
		Console.WriteLine("Full thread dump IKVM.NET {0} ({1} bit):", JVM.SafeGetAssemblyVersion(Assembly.GetExecutingAssembly()), IntPtr.Size * 8);
		java.util.Iterator entries = traces.entrySet().iterator();
		while (entries.hasNext())
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)entries.next();
			java.lang.Thread thread = (java.lang.Thread)entry.getKey();
			Console.WriteLine("\n\"{0}\"{1} prio={2} tid=0x{3:X8}", thread.getName(), thread.isDaemon() ? " daemon" : "", thread.getPriority(), thread.getId());
			Console.WriteLine("   java.lang.Thread.State: " + thread.getState());
			java.lang.StackTraceElement[] trace = (java.lang.StackTraceElement[])entry.getValue();
			for (int i = 0; i < trace.Length; i++)
			{
				Console.WriteLine("\tat {0}", trace[i]);
			}
		}
		Console.WriteLine();
	}
#endif

	public static int findSignal(string sigName)
	{
		if (Environment.OSVersion.Platform == PlatformID.Win32NT)
		{
			switch (sigName)
			{
				case "ABRT": /* abnormal termination triggered by abort cl */
					return SIGABRT;
				case "FPE": /* floating point exception */
					return SIGFPE;
				case "SEGV": /* segment violation */
					return SIGSEGV;
				case "INT": /* interrupt */
					return SIGINT;
				case "TERM": /* software term signal from kill */
					return SIGTERM;
				case "BREAK": /* Ctrl-Break sequence */
					return SIGBREAK;
				case "ILL": /* illegal instruction */
					return SIGILL;
			}
		}
		return -1;
	}

	// this is a separate method to be able to catch the SecurityException (for the LinkDemand)
	[SecuritySafeCritical]
	private static void RegisterCriticalCtrlHandler()
	{
		defaultConsoleCtrlDelegate = new CriticalCtrlHandler();
	}

	// Register a signal handler
	public static long handle0(int sig, long nativeH)
	{
		long oldHandler;
		handler.TryGetValue(sig, out oldHandler);
		switch (nativeH)
		{
			case 0: // Default Signal Handler
				if (defaultConsoleCtrlDelegate == null && Environment.OSVersion.Platform == PlatformID.Win32NT)
				{
					try
					{
						RegisterCriticalCtrlHandler();
					}
					catch (SecurityException)
					{
					}
				}
				break;
			case 1: // Ignore Signal
				break;
			case 2: // Custom Signal Handler
				switch (sig)
				{
					case SIGBREAK:
					case SIGFPE:
						return -1;
				}
				break;
		}
		handler[sig] = nativeH;
		return oldHandler;
	}

	public static void raise0(int sig)
	{
#if !FIRST_PASS
		java.security.AccessController.doPrivileged(ikvm.runtime.Delegates.toPrivilegedAction(delegate
		{
			java.lang.Class clazz = typeof(sun.misc.Signal);
			java.lang.reflect.Method dispatch = clazz.getDeclaredMethod("dispatch", java.lang.Integer.TYPE);
			dispatch.setAccessible(true);
			dispatch.invoke(null, java.lang.Integer.valueOf(sig));
			return null;
		}));
#endif
	}
}

public static class Java_sun_misc_NativeSignalHandler
{
	public static void handle0(int number, long handler)
	{
		throw new NotImplementedException();
	}
}

public static class Java_sun_misc_Perf
{
	public static object attach(object thisPerf, string user, int lvmid, int mode)
	{
		throw new NotImplementedException();
	}

	public static void detach(object thisPerf, object bb)
	{
		throw new NotImplementedException();
	}

	public static object createLong(object thisPerf, string name, int variability, int units, long value)
	{
#if FIRST_PASS
		return null;
#else
		return java.nio.ByteBuffer.allocate(8);
#endif
	}

	public static object createByteArray(object thisPerf, string name, int variability, int units, byte[] value, int maxLength)
	{
#if FIRST_PASS
		return null;
#else
		return java.nio.ByteBuffer.allocate(maxLength).put(value);
#endif
	}

	public static long highResCounter(object thisPerf)
	{
		throw new NotImplementedException();
	}

	public static long highResFrequency(object thisPerf)
	{
		throw new NotImplementedException();
	}

	public static void registerNatives()
	{
	}
}

public static class Java_sun_misc_Unsafe
{
	public static java.lang.reflect.Field createFieldAndMakeAccessible(java.lang.Class c, string fieldName)
	{
#if FIRST_PASS
		return null;
#else
		// we pass in ReflectAccess.class as the field type (which isn't used)
		// to make Field.toString() return something "meaningful" instead of crash
		java.lang.reflect.Field field = new java.lang.reflect.Field(c, fieldName, ikvm.@internal.ClassLiteral<java.lang.reflect.ReflectAccess>.Value, 0, -1, null, null);
		field.@override = true;
		return field;
#endif
	}

	public static java.lang.reflect.Field copyFieldAndMakeAccessible(java.lang.reflect.Field field)
	{
#if FIRST_PASS
		return null;
#else
		field = new java.lang.reflect.Field(field.getDeclaringClass(), field.getName(), field.getType(), field.getModifiers() & ~java.lang.reflect.Modifier.FINAL, field._slot(), null, null);
		field.@override = true;
		return field;
#endif
	}

	private static void CheckArrayBounds(object obj, long offset, int accessLength)
	{
		// NOTE we rely on the fact that Buffer.ByteLength() requires a primitive array
		int arrayLength = Buffer.ByteLength((Array)obj);
		if (offset < 0 || offset > arrayLength - accessLength || accessLength > arrayLength)
		{
			throw new IndexOutOfRangeException();
		}
	}
	
	[SecuritySafeCritical]
	public static byte ReadByte(object obj, long offset)
	{
		Stats.Log("ReadByte");
		CheckArrayBounds(obj, offset, 1);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		byte value = Marshal.ReadByte((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset));
		handle.Free();
		return value;
	}

	[SecuritySafeCritical]
	public static void WriteByte(object obj, long offset, byte value)
	{
		Stats.Log("WriteByte");
		CheckArrayBounds(obj, offset, 2);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		Marshal.WriteInt16((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset), value);
		handle.Free();
	}

	[SecuritySafeCritical]
	public static short ReadInt16(object obj, long offset)
	{
		Stats.Log("ReadInt16");
		CheckArrayBounds(obj, offset, 2);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		short value = Marshal.ReadInt16((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset));
		handle.Free();
		return value;
	}

	[SecuritySafeCritical]
	public static int ReadInt32(object obj, long offset)
	{
		Stats.Log("ReadInt32");
		CheckArrayBounds(obj, offset, 4);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		int value = Marshal.ReadInt32((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset));
		handle.Free();
		return value;
	}
	[SecuritySafeCritical]
	public static float ReadFloat2(object obj, long offset)
	{
		Stats.Log("ReadFloat2");
		CheckArrayBounds(obj, offset, 4);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		float value = ToRef2<float>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset));
		handle.Free();
		return value;
	}
	[SecuritySafeCritical]
	public static void WriteFloat2(object obj, long offset, float value)
	{
		Stats.Log("WriteFloat2");
		CheckArrayBounds(obj, offset, 4);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		ToRef2<float>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset)) = value;
		handle.Free();
	}

	[SecuritySafeCritical]
	public static long ReadInt64(object obj, long offset, bool atomic)
	{
		Stats.Log("ReadInt64");
		CheckArrayBounds(obj, offset, 8);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		IntPtr ptr = (IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset);
		long value = atomic ? Volatile.Read(ref UnsafeIntPtrToRef<long>(ptr)) : Marshal.ReadInt64(ptr);
		handle.Free();
		return value;
	}

	[SecuritySafeCritical]
	public static void WriteInt16(object obj, long offset, short value)
	{
		Stats.Log("WriteInt16");
		CheckArrayBounds(obj, offset, 2);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		Marshal.WriteInt16((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset), value);
		handle.Free();
	}

	[SecuritySafeCritical]
	public static void WriteInt32(object obj, long offset, int value)
	{
		Stats.Log("WriteInt32");
		CheckArrayBounds(obj, offset, 4);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		Marshal.WriteInt32((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset), value);
		handle.Free();
	}
	private static unsafe ref T UnsafeIntPtrToRef<T>(IntPtr intPtr){
		return ref Unsafe.AsRef<T>(intPtr.ToPointer());
	}

	[SecuritySafeCritical]
	public static void WriteInt64(object obj, long offset, long value, bool atomic)
	{
		Stats.Log("WriteInt64");
		CheckArrayBounds(obj, offset, 8);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		IntPtr ptr = (IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset);
		if(atomic){
			Volatile.Write(ref UnsafeIntPtrToRef<long>(ptr), value);
		} else{
			Marshal.WriteInt64(ptr, value);
		}
		handle.Free();
	}

	private static unsafe ref T ToRef2<T>(IntPtr intPtr){
		return ref Unsafe.AsRef<T>(intPtr.ToPointer());
	}

	[SecuritySafeCritical]
	public static byte ReadByteVolatile(object obj, long offset)
	{
		Stats.Log("ReadByteVolatile");
		CheckArrayBounds(obj, offset, 1);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		byte value = Volatile.Read(ref ToRef2<byte>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset)));
		handle.Free();
		return value;
	}

	[SecuritySafeCritical]
	public static void WriteByteVolatile(object obj, long offset, byte value)
	{
		Stats.Log("WriteByteVolatile");
		CheckArrayBounds(obj, offset, 2);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		Volatile.Write(ref ToRef2<byte>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset)), value);
		handle.Free();
	}
	[SecuritySafeCritical]
	public static short ReadShortVolatile(object obj, long offset)
	{
		Stats.Log("ReadShortVolatile");
		CheckArrayBounds(obj, offset, 1);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		short value = Volatile.Read(ref ToRef2<short>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset)));
		handle.Free();
		return value;
	}

	[SecuritySafeCritical]
	public static void WriteShortVolatile(object obj, long offset, short value)
	{
		Stats.Log("WriteShortVolatile");
		CheckArrayBounds(obj, offset, 2);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		Volatile.Write(ref ToRef2<short>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset)), value);
		handle.Free();
	}
	[SecuritySafeCritical]
	public static int ReadIntVolatile(object obj, long offset)
	{
		Stats.Log("ReadIntVolatile");
		CheckArrayBounds(obj, offset, 1);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		int value = Volatile.Read(ref ToRef2<int>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset)));
		handle.Free();
		return value;
	}

	[SecuritySafeCritical]
	public static void WriteIntVolatile(object obj, long offset, int value)
	{
		Stats.Log("WriteIntVolatile");
		CheckArrayBounds(obj, offset, 2);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		Volatile.Write(ref ToRef2<int>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset)), value);
		handle.Free();
	}
	[SecuritySafeCritical]
	public static float ReadFloatVolatile(object obj, long offset)
	{
		Stats.Log("ReadFloatVolatile");
		CheckArrayBounds(obj, offset, 1);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		float value = Volatile.Read(ref ToRef2<int>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset)));
		handle.Free();
		return value;
	}

	[SecuritySafeCritical]
	public static void WriteFloatVolatile(object obj, long offset, float value)
	{
		Stats.Log("WriteFloatVolatile");
		CheckArrayBounds(obj, offset, 2);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		Volatile.Write(ref ToRef2<float>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset)), value);
		handle.Free();
	}
	[SecuritySafeCritical]
	public static void WriteDouble(object obj, long offset, double value)
	{
		Stats.Log("WriteDouble");
		CheckArrayBounds(obj, offset, 2);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		ToRef2<double>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset)) = value;
		handle.Free();
	}
	[SecuritySafeCritical]
	public static double ReadDouble(object obj, long offset)
	{
		Stats.Log("ReadDouble");
		CheckArrayBounds(obj, offset, 2);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		double val = ToRef2<double>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset));
		handle.Free();
		return val;
	}
	[SecuritySafeCritical]
	public static void WriteDoubleVolatile(object obj, long offset, double value)
	{
		Stats.Log("WriteDoubleVolatile");
		CheckArrayBounds(obj, offset, 2);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		Volatile.Write(ref ToRef2<double>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset)), value);
		handle.Free();
	}
	[SecuritySafeCritical]
	public static double ReadDoubleVolatile(object obj, long offset)
	{
		Stats.Log("ReadDoubleVolatile");
		CheckArrayBounds(obj, offset, 2);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		double val = Volatile.Read(ref ToRef2<double>((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset)));
		handle.Free();
		return val;
	}


	public static void throwException(object thisUnsafe, System.Exception x)
	{
		throw x;
	}

	public static bool shouldBeInitialized(object thisUnsafe, java.lang.Class clazz)
	{
		return TypeWrapper.FromClass(clazz).HasStaticInitializer;
	}

	public static void ensureClassInitialized(object thisUnsafe, java.lang.Class clazz)
	{
		TypeWrapper tw = TypeWrapper.FromClass(clazz);
		if (!tw.IsArray)
		{
			try
			{
				tw.Finish();
			}
			catch (RetargetableJavaException x)
			{
				throw x.ToJava();
			}
			tw.RunClassInit();
		}
	}

	[SecurityCritical]
	public static object allocateInstance(object thisUnsafe, java.lang.Class clazz)
	{
		TypeWrapper wrapper = TypeWrapper.FromClass(clazz);
		try
		{
			wrapper.Finish();
		}
		catch (RetargetableJavaException x)
		{
			throw x.ToJava();
		}
		return FormatterServices.GetUninitializedObject(wrapper.TypeAsBaseType);
	}

	public static java.lang.Class defineClass(object thisUnsafe, string name, byte[] buf, int offset, int length, java.lang.ClassLoader cl, java.security.ProtectionDomain pd)
	{
		return Java_java_lang_ClassLoader.defineClass1(cl, name.Replace('/', '.'), buf, offset, length, pd, null);
	}

	public static java.lang.Class defineClass(object thisUnsafe, string name, byte[] buf, int offset, int length, ikvm.@internal.CallerID callerID)
	{
#if FIRST_PASS
		return null;
#else
		return defineClass(thisUnsafe, name, buf, offset, length, callerID.getCallerClassLoader(), callerID.getCallerClass().pd);
#endif
	}

	public static java.lang.Class defineAnonymousClass(object thisUnsafe, java.lang.Class host, byte[] data, object[] cpPatches)
	{
#if FIRST_PASS
		return null;
#else
		try
		{
			ClassLoaderWrapper loader = TypeWrapper.FromClass(host).GetClassLoader();
			ClassFile classFile = new ClassFile(data, 0, data.Length, "<Unknown>", loader.ClassFileParseOptions, cpPatches);
			if (classFile.IKVMAssemblyAttribute != null)
			{
				// if this happens, the OpenJDK is probably trying to load an OpenJDK class file as a resource,
				// make sure the build process includes the original class file as a resource in that case
				throw new java.lang.ClassFormatError("Trying to define anonymous class based on stub class: " + classFile.Name);
			}
			return loader.GetTypeWrapperFactory().DefineClassImpl(null, TypeWrapper.FromClass(host), classFile, loader, host.pd).ClassObject;
		}
		catch (RetargetableJavaException x)
		{
			throw x.ToJava();
		}
#endif
	}

	[DllImport("ikUnsafe.dll")]
	private static extern int IKVM_CompareExchangeInt(IntPtr ptr, int expect, int update);

	[DllImport("ikUnsafe.dll")]
	private static extern long IKVM_CompareExchangeLong(IntPtr ptr, long expect, long update);
	[DllImport("ikUnsafe.dll")]
	private static extern int IKVM_ExchangeInt(IntPtr ptr, int update);
	[DllImport("ikUnsafe.dll")]
	private static extern long IKVM_ExchangeLong(IntPtr ptr, long update);
	[DllImport("ikUnsafe.dll")]
	private static extern int IKVM_AddInt(IntPtr ptr, int value);
	[DllImport("ikUnsafe.dll")]
	private static extern long IKVM_AddLong(IntPtr ptr, long value);
	
	//Must be accessible from sun.misc.Unsafe
	[DllImport("ikUnsafe.dll")]
	public static extern void IKVM_SetLong(IntPtr ptr, long value);
	[DllImport("ikUnsafe.dll")]
	public static extern long IKVM_GetLong(IntPtr ptr);
	[SecuritySafeCritical]
	private static unsafe ref U RefFieldValue<U>(object obj, long offset)
	{
		IntPtr pobj = Unsafe.As<object, IntPtr>(ref obj);
		pobj += IntPtr.Size + ((int)offset);
		return ref Unsafe.AsRef<U>(pobj.ToPointer());
	}

	public static bool compareAndSwapInt(object thisUnsafe, object obj, long offset, int expect, int update)
	{
		if (obj is Array)
		{
			Stats.Log("compareAndSwapInt.unaligned");
			CheckArrayBounds(obj, offset, 4);
			GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
			int whatever = IKVM_CompareExchangeInt((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset), expect, update);
			handle.Free();
			return whatever == expect;
		} else
		{
			Stats.Log("compareAndSwapInt.", offset);
			if(obj is null){
				return ((CompareExchangeInt32)GetDelegate(offset))(update, expect) == expect;
			} else{
				return Interlocked.CompareExchange(ref RefFieldValue<int>(obj, offset), update, expect) == expect;
			}
		}
	}

	public static bool compareAndSwapLong(object thisUnsafe, object obj, long offset, long expect, long update)
	{
		if (obj is Array)
		{
			Stats.Log("compareAndSwapLong.unaligned");
			CheckArrayBounds(obj, offset, 8);
			GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
			long whatever = IKVM_CompareExchangeLong((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset), expect, update);
			handle.Free();
			return whatever == expect;
		}
		else
		{
			Stats.Log("compareAndSwapLong.", offset);
			if(obj is null){
				return ((CompareExchangeInt64)GetDelegate(offset))(update, expect) == expect;
			} else{
				return Interlocked.CompareExchange(ref RefFieldValue<long>(obj, offset), update, expect) == expect;
			}
			
		}
	}
	public static int getAndAddInt(object thisUnsafe, object obj, long offset, int delta)
	{
		if (obj is Array)
		{
			Stats.Log("getAndAddInt.unaligned");
			CheckArrayBounds(obj, offset, 4);
			GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
			return IKVM_AddInt((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset), delta);
		} else {
			if(obj is null){
				int i = getIntVolatile(null, null, offset);
				CompareExchangeInt32 cmpxchg = ((CompareExchangeInt32)GetDelegate(offset));
				while (true)
				{
					int z = cmpxchg(i + delta, i);
					if (z == i)
					{
						return i;
					}
					i = z;
				}
			} else{
				return Interlocked.Add(ref RefFieldValue<int>(obj, offset), delta) - delta;
			}
		}
	}
	public static long getAndAddLong(object thisUnsafe, object obj, long offset, long delta)
	{
		if (obj is Array)
		{
			Stats.Log("getAndAddLong.unaligned");
			CheckArrayBounds(obj, offset, 8);
			GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
			return IKVM_AddLong((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset), delta);
		} else {
			if (obj is null)
			{
				long i = getLongVolatile(null, null, offset);
				CompareExchangeInt64 cmpxchg = ((CompareExchangeInt64)GetDelegate(offset));
				while (true)
				{
					long z = cmpxchg(i + delta, i);
					if (z == i)
					{
						return i;
					}
					i = z;
				}
			}
			else
			{
				return Interlocked.Add(ref RefFieldValue<long>(obj, offset), delta) - delta;
			}
		}
	}
	public static int getAndSetInt(object thisUnsafe, object obj, long offset, int delta)
	{
		if (obj is Array)
		{
			Stats.Log("getAndSetInt.unaligned");
			CheckArrayBounds(obj, offset, 4);
			GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
			return IKVM_ExchangeInt((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset), delta);
		}
		else {
			
			if (obj is null)
			{
				int i = getIntVolatile(null, null, offset);
				CompareExchangeInt32 cmpxchg = ((CompareExchangeInt32)GetDelegate(offset));
				while (true)
				{
					int z = cmpxchg(delta, i);
					if(i == z){
						return i;
					}
					i = z;
				}
			}
			else
			{
				return Interlocked.Exchange(ref RefFieldValue<int>(obj, offset), delta);
			}
		}
	}

	public static object getAndSetObject(object thisUnsafe, object o, long offset, object newValue){
		if (o is null)
		{
			object val = getObjectVolatile(null, null, offset);
			CompareExchangeObject tmp = (CompareExchangeObject)GetDelegate(offset);
			while (true)
			{

				object z = tmp(newValue, val);
				if (ReferenceEquals(z, val))
				{
					return val;
				}
				val = z;
			}
		}
		object[] array = o as object[];
		if(array is null){
			return Interlocked.Exchange(ref RefFieldValue<object>(o, offset), newValue);
		} else{
			if(offset % 4 == 0){
				return Interlocked.Exchange(ref array[offset / 4], newValue);
			} else{
				throw new NotImplementedException("IKVM.NET doesn't support unaligned object arrays");
			}
		}
	}
	public static long getAndSetLong(object thisUnsafe, object obj, long offset, long delta)
	{
		if (obj is Array)
		{
			Stats.Log("getAndSetLong.unaligned");
			CheckArrayBounds(obj, offset, 8);
			GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
			return IKVM_ExchangeLong((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset), delta);
		}
		else {
			if (obj is null)
			{
				long i = getLongVolatile(null, null, offset);
				CompareExchangeInt64 cmpxchg = ((CompareExchangeInt64)GetDelegate(offset));
				while (true)
				{
					long z = cmpxchg(delta, i);
					if (i == z)
					{
						return i;
					}
					i = z;
				}
			}
			else
			{
				return Interlocked.Exchange(ref RefFieldValue<long>(obj, offset), delta);
			}
		}
	}
	private delegate int CompareExchangeInt32(int value, int comparand);
	private delegate long CompareExchangeInt64(long value, long comparand);
	private delegate object CompareExchangeObject(object value, object comparand);
	private static readonly ConcurrentDictionary<long, WeakReference> cacheCompareExchange = new ConcurrentDictionary<long, WeakReference>();

	private static Delegate CreateCompareExchange(long fieldOffset)
	{
#if FIRST_PASS
		return null;
#else
		FieldInfo field = GetFieldInfo(fieldOffset);
		bool primitive = field.FieldType.IsPrimitive;
		Type signatureType = primitive ? field.FieldType : typeof(object);
		MethodInfo compareExchange;
		Type delegateType;
		if (signatureType == typeof(int))
		{
			compareExchange = InterlockedMethods.CompareExchangeInt32;
			delegateType = typeof(CompareExchangeInt32);
		}
		else if (signatureType == typeof(long))
		{
			compareExchange = InterlockedMethods.CompareExchangeInt64;
			delegateType = typeof(CompareExchangeInt64);
		}
		else
		{
			compareExchange = InterlockedMethods.CompareExchangeOfT.MakeGenericMethod(field.FieldType);
			delegateType = typeof(CompareExchangeObject);
		}
		DynamicMethod dm = new DynamicMethod("CompareExchange", signatureType, new Type[] { signatureType, signatureType }, field.DeclaringType);
		ILGenerator ilgen = dm.GetILGenerator();
		// note that we don't bother will special casing static fields, because it is legal to use ldflda on a static field
		ilgen.Emit(OpCodes.Ldnull);
		ilgen.Emit(OpCodes.Ldflda, field);
		ilgen.Emit(OpCodes.Ldarg_0);
		if (!primitive)
		{
			ilgen.Emit(OpCodes.Castclass, field.FieldType);
		}
		ilgen.Emit(OpCodes.Ldarg_1);
		if (!primitive)
		{
			ilgen.Emit(OpCodes.Castclass, field.FieldType);
		}
		ilgen.Emit(OpCodes.Call, compareExchange);
		ilgen.Emit(OpCodes.Ret);
		return dm.CreateDelegate(delegateType);
#endif
	}
#if !FIRST_PASS
	private static FieldInfo GetFieldInfo(long offset)
	{
		FieldWrapper fw = FieldWrapper.FromField(sun.misc.Unsafe.getField(offset));
		fw.Link();
		fw.ResolveField();
		return fw.GetField();
	}
#endif
	private static FieldInfo GetFieldInfo(Field field)
	{
#if FIRST_PASS
		throw new NotImplementedException();
#else
		FieldWrapper fw = FieldWrapper.FromField(field);
		fw.Link();
		fw.ResolveField();
		return fw.GetField();
#endif
	}

	public static bool compareAndSwapObject(object thisUnsafe, object obj, long offset, object expect, object update)
	{
#if FIRST_PASS
		return false;
#else
		if (obj is null)
		{
			Stats.Log("compareAndSwapObject.", offset);
			return ((CompareExchangeObject)GetDelegate(offset))(update, expect) == expect;
		}
		object[] array = obj as object[];
		if (array is null)
		{
			Stats.Log("compareAndSwapObject.", offset);
			return Interlocked.CompareExchange(ref RefFieldValue<object>(obj, offset), update, expect) == expect;
		}
		else
		{
			Stats.Log("compareAndSwapObject.array");
			if(offset % 4 == 0){
				return ReferenceEquals(Interlocked.CompareExchange(ref array[offset / 4], update, expect), expect);
			} else{
				throw new NotImplementedException("IKVM.NET doesn't support unaligned object arrays");
			}
		}
#endif
	}
	[SecuritySafeCritical]
	public static long objectFieldOffset(object theUnsafe, Field field){
		int offset = Marshal.ReadInt32(GetFieldInfo(field).FieldHandle.Value + (4 + IntPtr.Size)) & 0xFFFFFF;
		return offset;
	}

	public static bool getBoolean(object theUnsafe, object obj, long offset){
		if (obj is Array)
        {
			return ReadByte(obj, offset) != 0;
		}

		else
		{
			if(obj is null){
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					return sun.misc.Unsafe.getField(offset).getBoolean(obj);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			} else{
				return RefFieldValue<bool>(obj, offset);
			}
		}
		
	}
	public static bool getBooleanVolatile(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadByteVolatile(obj, offset) != 0;
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					Field field = sun.misc.Unsafe.getField(offset);
					Interlocked.MemoryBarrier();
					bool v = field.getBoolean(obj);
					Interlocked.MemoryBarrier();
					return v;
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<bool>(obj, offset);
			}
		}

	}
	public static void putBoolean(object theUnsafe, object obj, long offset, bool value)
	{
		if (obj is Array)
		{
			WriteByte(obj, offset, value ? (byte)1 : (byte)0);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					sun.misc.Unsafe.getField(offset).setBoolean(obj, value);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				RefFieldValue<bool>(obj, offset) = value;
			}
		}
	}
	public static void putBooleanVolatile(object theUnsafe, object obj, long offset, bool value)
	{
		if (obj is Array)
		{
			WriteByteVolatile(obj, offset, value ? (byte)1 : (byte)0);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					Field field = sun.misc.Unsafe.getField(offset);
					Interlocked.MemoryBarrier();
					field.setBoolean(obj, value);
					Interlocked.MemoryBarrier();
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				Volatile.Write(ref RefFieldValue<bool>(obj, offset), value);
			}
		}
	}
	public static byte getByte(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadByte(obj, offset);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					return sun.misc.Unsafe.getField(offset).getByte(obj);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<byte>(obj, offset);
			}
		}

	}
	public static byte getByteVolatile(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadByteVolatile(obj, offset);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					Field field = sun.misc.Unsafe.getField(offset);
					Interlocked.MemoryBarrier();
					byte v = field.getByte(obj);
					Interlocked.MemoryBarrier();
					return v;
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<byte>(obj, offset);
			}
		}

	}
	public static void putByte(object theUnsafe, object obj, long offset, byte value)
	{
		if (obj is Array)
		{
			WriteByte(obj, offset, value);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					sun.misc.Unsafe.getField(offset).setByte(obj, value);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				RefFieldValue<byte>(obj, offset) = value;
			}
		}
	}
	public static void putByteVolatile(object theUnsafe, object obj, long offset, byte value)
	{
		if (obj is Array)
		{
			WriteByteVolatile(obj, offset, value);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					Field field = sun.misc.Unsafe.getField(offset);
					Interlocked.MemoryBarrier();
					field.setByte(obj, value);
					Interlocked.MemoryBarrier();
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				Volatile.Write(ref RefFieldValue<byte>(obj, offset), value);
			}
		}
	}
	public static short getShort(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadInt16(obj, offset);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					return sun.misc.Unsafe.getField(offset).getShort(obj);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<short>(obj, offset);
			}
		}

	}
	public static short getShortVolatile(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadShortVolatile(obj, offset);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					Field field = sun.misc.Unsafe.getField(offset);
					Interlocked.MemoryBarrier();
					short v = field.getShort(obj);
					Interlocked.MemoryBarrier();
					return v;
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<short>(obj, offset);
			}
		}

	}
	public static void putShort(object theUnsafe, object obj, long offset, short value)
	{
		if (obj is Array)
		{
			WriteInt16(obj, offset, value);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					sun.misc.Unsafe.getField(offset).setShort(obj, value);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				RefFieldValue<short>(obj, offset) = value;
			}
		}
	}
	public static void putShortVolatile(object theUnsafe, object obj, long offset, short value)
	{
		if (obj is Array)
		{
			WriteShortVolatile(obj, offset, value);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					Field field = sun.misc.Unsafe.getField(offset);
					Interlocked.MemoryBarrier();
					field.setShort(obj, value);
					Interlocked.MemoryBarrier();
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				Volatile.Write(ref RefFieldValue<short>(obj, offset), value);
			}
		}
	}
	public static int getInt(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadInt32(obj, offset);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					return sun.misc.Unsafe.getField(offset).getInt(obj);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<int>(obj, offset);
			}
		}

	}
	public static int getIntVolatile(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadIntVolatile(obj, offset);
		}

		else
		{
			if (obj is null)
			{
				return ((CompareExchangeInt32)GetDelegate(offset))(0, 0);
			}
			else
			{
				return RefFieldValue<int>(obj, offset);
			}
		}

	}
	public static void putInt(object theUnsafe, object obj, long offset, int value)
	{
		if (obj is Array)
		{
			WriteInt32(obj, offset, value);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					sun.misc.Unsafe.getField(offset).setInt(obj, value);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				RefFieldValue<int>(obj, offset) = value;
			}
		}
	}
	public static void putIntVolatile(object theUnsafe, object obj, long offset, int value)
	{
		if (obj is Array)
		{
			WriteIntVolatile(obj, offset, value);
		}

		else
		{
			if (obj is null)
			{
				getAndAddInt(null, null, offset, value);
			}
			else
			{
				Volatile.Write(ref RefFieldValue<int>(obj, offset), value);
			}
		}
	}
	public static char getChar(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return (char)ReadInt16(obj, offset);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					return sun.misc.Unsafe.getField(offset).getChar(obj);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<char>(obj, offset);
			}
		}

	}
	public static char getCharVolatile(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return (char)ReadShortVolatile(obj, offset);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					Field field = sun.misc.Unsafe.getField(offset);
					Interlocked.MemoryBarrier();
					char v = field.getChar(obj);
					Interlocked.MemoryBarrier();
					return v;
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<char>(obj, offset);
			}
		}

	}
	public static void putChar(object theUnsafe, object obj, long offset, char value)
	{
		if (obj is Array)
		{
			WriteInt16(obj, offset, (short)value);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					sun.misc.Unsafe.getField(offset).setChar(obj, value);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				RefFieldValue<char>(obj, offset) = value;
			}
		}
	}
	public static void putCharVolatile(object theUnsafe, object obj, long offset, char value)
	{
		if (obj is Array)
		{
			WriteShortVolatile(obj, offset, (short)value);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					Field field = sun.misc.Unsafe.getField(offset);
					Interlocked.MemoryBarrier();
					field.setChar(obj, value);
					Interlocked.MemoryBarrier();
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				Volatile.Write(ref RefFieldValue<short>(obj, offset), (short)value);
			}
		}
	}
	public static float getFloat(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadFloat2(obj, offset);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					return sun.misc.Unsafe.getField(offset).getFloat(obj);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<float>(obj, offset);
			}
		}

	}
	public static float getFloatVolatile(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadFloatVolatile(obj, offset);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					Field field = sun.misc.Unsafe.getField(offset);
					Interlocked.MemoryBarrier();
					float v = field.getFloat(obj);
					Interlocked.MemoryBarrier();
					return v;
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<float>(obj, offset);
			}
		}

	}
	public static void putFloat(object theUnsafe, object obj, long offset, float value)
	{
		if (obj is Array)
		{
			WriteFloat2(obj, offset, value);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					sun.misc.Unsafe.getField(offset).setFloat(obj, value);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				RefFieldValue<float>(obj, offset) = value;
			}
		}
	}
	public static void putFloatVolatile(object theUnsafe, object obj, long offset, float value)
	{
		if (obj is Array)
		{
			WriteFloatVolatile(obj, offset, value);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					Field field = sun.misc.Unsafe.getField(offset);
					Interlocked.MemoryBarrier();
					field.setFloat(obj, value);
					Interlocked.MemoryBarrier();
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				Volatile.Write(ref RefFieldValue<float>(obj, offset), value);
			}
		}
	}
	public static long getLong(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadInt64(obj, offset, false);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					return sun.misc.Unsafe.getField(offset).getLong(obj);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<long>(obj, offset);
			}
		}

	}
	public static long getLongVolatile(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadInt64(obj, offset, true);
		}

		else
		{
			if (obj is null)
			{
				return ((CompareExchangeInt64)GetDelegate(offset))(0, 0);
			}
			else
			{
				return Interlocked.Read(ref RefFieldValue<long>(obj, offset));
			}
		}

	}
	public static void putLong(object theUnsafe, object obj, long offset, long value)
	{
		if (obj is Array)
		{
			WriteInt64(obj, offset, value, false);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					sun.misc.Unsafe.getField(offset).setLong(obj, value);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				RefFieldValue<long>(obj, offset) = value;
			}
		}
	}
	public static void putLongVolatile(object theUnsafe, object obj, long offset, long value)
	{
		if (obj is Array)
		{
			WriteInt64(obj, offset, value, true);
		}

		else
		{
			if (obj is null)
			{
				getAndAddLong(null, null, offset, value);
			}
			else
			{
				Interlocked.Write(ref RefFieldValue<long>(obj, offset), value);
			}
		}
	}
	public static double getDouble(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadDouble(obj, offset);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					return sun.misc.Unsafe.getField(offset).getDouble(obj);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<double>(obj, offset);
			}
		}

	}
	public static double getDoubleVolatile(object theUnsafe, object obj, long offset)
	{
		if (obj is Array)
		{
			return ReadDoubleVolatile(obj, offset);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					Field field = sun.misc.Unsafe.getField(offset);
					Interlocked.MemoryBarrier();
					double v = field.getDouble(obj);
					Interlocked.MemoryBarrier();
					return v;
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				return RefFieldValue<double>(obj, offset);
			}
		}

	}
	public static void putDouble(object theUnsafe, object obj, long offset, double value)
	{
		if (obj is Array)
		{
			WriteDouble(obj, offset, value);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					sun.misc.Unsafe.getField(offset).setDouble(obj, value);
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				RefFieldValue<double>(obj, offset) = value;
			}
		}
	}
	public static void putDoubleVolatile(object theUnsafe, object obj, long offset, double value)
	{
		if (obj is Array)
		{
			WriteDoubleVolatile(obj, offset, value);
		}

		else
		{
			if (obj is null)
			{
#if FIRST_PASS
				throw new NotImplementedException();
#else
				try
				{
					Field field = sun.misc.Unsafe.getField(offset);
					Interlocked.MemoryBarrier();
					field.setDouble(obj, value);
					Interlocked.MemoryBarrier();
				}
				catch (java.lang.IllegalAccessException x)
				{
					throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
				}
#endif
			}
			else
			{
				Volatile.Write(ref RefFieldValue<double>(obj, offset), value);
			}
		}
	}
	public static object getObject(object theUnsafe, object obj, long offset)
	{
		if (obj is null)
		{
#if FIRST_PASS
				throw new NotImplementedException();
#else
			try
			{
				return sun.misc.Unsafe.getField(offset).get(obj);
			}
			catch (java.lang.IllegalAccessException x)
			{
				throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
			}
#endif
		}
		object[] array = obj as object[];
		if (array is null)
		{
			return RefFieldValue<object>(obj, offset);
		}
		else
		{
			if (offset % 4 == 0)
			{
				return array[offset / 4];
			}
			else
			{
				throw new NotImplementedException("IKVM.NET doesn't support unaligned object arrays");
			}

		}
	}
	private static readonly object placehodler = new object();
	public static object getObjectVolatile(object theUnsafe, object obj, long offset)
	{
		if (obj is null)
		{
			return ((CompareExchangeObject)GetDelegate(offset))(placehodler, placehodler);
		}
		object[] array = obj as object[];
		if (array is null)
		{
			return RefFieldValue<object>(obj, offset);
		}
		else
		{
			if (offset % 4 == 0)
			{
				return array[offset / 4];
			}
			else
			{
				throw new NotImplementedException("IKVM.NET doesn't support unaligned object arrays");
			}

		}
	}
	public static void putObject(object theUnsafe, object obj, long offset, object value)
	{
		if (obj is null)
		{
#if FIRST_PASS
				throw new NotImplementedException();
#else
			try
			{
				sun.misc.Unsafe.getField(offset).set(obj, value);
			}
			catch (java.lang.IllegalAccessException x)
			{
				throw (java.lang.InternalError)new java.lang.InternalError().initCause(x);
			}
#endif
		}
		object[] array = obj as object[];
		if (array is null)
		{
			RefFieldValue<object>(obj, offset) = value;
		}
		else
		{
			if (offset % 4 == 0)
			{
				array[offset / 4] = value;
			}
			else
			{
				throw new NotImplementedException("IKVM.NET doesn't support unaligned object arrays");
			}

		}
	}
	public static void putObjectVolatile(object theUnsafe, object obj, long offset, object value)
	{
		if (obj is null)
		{
			getAndSetObject(null, null, offset, value);
			return;
		}
		object[] array = obj as object[];
		if (array is null)
		{
			Volatile.Write(ref RefFieldValue<object>(obj, offset), value);
		}
		else
		{
			if (offset % 4 == 0)
			{
				Volatile.Write(ref array[offset / 4], value);
			}
			else
			{
				throw new NotImplementedException("IKVM.NET doesn't support unaligned object arrays");
			}

		}
	}




	private sealed class SwapWrapper{
		private readonly long offset;
		public readonly Delegate underlying;

		public SwapWrapper(long offset)
		{
			this.offset = offset;
			underlying = CreateCompareExchange(offset);
		}
		~SwapWrapper(){
			WeakReference wr;
			cacheCompareExchange.TryRemove(offset, out wr);
		}
	}

	private static Delegate GetDelegate(long offset){
		SwapWrapper compareExchange;
		WeakReference wr;
		if (cacheCompareExchange.TryGetValue(offset, out wr))
		{
			compareExchange = (SwapWrapper)wr.Target;
			if (compareExchange is null)
			{
				compareExchange = new SwapWrapper(offset);
				
				if(!cacheCompareExchange.TryAdd(offset, new WeakReference(compareExchange, false))){
					GC.SuppressFinalize(compareExchange);
				}
			}
		}
		else
		{
			compareExchange = new SwapWrapper(offset);
			if (!cacheCompareExchange.TryAdd(offset, new WeakReference(compareExchange, false)))
			{
				GC.SuppressFinalize(compareExchange);
			}
		}
		return compareExchange.underlying;
	}

	abstract class Atomic
	{
		// NOTE we don't care that we keep the Type alive, because Unsafe should only be used inside the core class libraries
		private static Dictionary<Type, Atomic> impls = new Dictionary<Type, Atomic>();

		internal static object CompareExchange(object[] array, int index, object value, object comparand)
		{
			return GetImpl(array.GetType().GetElementType()).CompareExchangeImpl(array, index, value, comparand);
		}

		private static Atomic GetImpl(Type type)
		{
			Atomic impl;
			if (!impls.TryGetValue(type, out impl))
			{
				impl = (Atomic)Activator.CreateInstance(typeof(Impl<>).MakeGenericType(type));
				Dictionary<Type, Atomic> curr = impls;
				Dictionary<Type, Atomic> copy = new Dictionary<Type, Atomic>(curr);
				copy[type] = impl;
				Interlocked.CompareExchange(ref impls, copy, curr);
			}
			return impl;
		}

		protected abstract object CompareExchangeImpl(object[] array, int index, object value, object comparand);

		sealed class Impl<T> : Atomic
			where T : class
		{
			protected override object CompareExchangeImpl(object[] array, int index, object value, object comparand)
			{
				return Interlocked.CompareExchange<T>(ref ((T[])array)[index], (T)value, (T)comparand);
			}
		}
	}

	public static class Stats
	{
#if !FIRST_PASS && UNSAFE_STATISTICS
		private static readonly Dictionary<string, int> dict = new Dictionary<string, int>();

		static Stats()
		{
			java.lang.Runtime.getRuntime().addShutdownHook(new DumpStats());
		}

		sealed class DumpStats : java.lang.Thread
		{
			public override void run()
			{
				List<KeyValuePair<string, int>> list = new List<KeyValuePair<string, int>>(dict);
				list.Sort(delegate(KeyValuePair<string, int> kv1, KeyValuePair<string, int> kv2) { return kv1.Value.CompareTo(kv2.Value); });
				foreach (KeyValuePair<string, int> kv in list)
				{
					Console.WriteLine("{0,10}: {1}", kv.Value, kv.Key);
				}
			}
		}
#endif

		[Conditional("UNSAFE_STATISTICS")]
		internal static void Log(string key)
		{
#if !FIRST_PASS && UNSAFE_STATISTICS
			lock (dict)
			{
				int count;
				dict.TryGetValue(key, out count);
				dict[key] = count + 1;
			}
#endif
		}

		[Conditional("UNSAFE_STATISTICS")]
		internal static void Log(string key, long offset)
		{
#if !FIRST_PASS && UNSAFE_STATISTICS
			FieldWrapper field = FieldWrapper.FromField(sun.misc.Unsafe.getField(offset));
			key += field.DeclaringType.Name + "::" + field.Name;
			Log(key);
#endif
		}
	}
}

public static class Java_sun_misc_URLClassPath
{
	public static java.net.URL[] getLookupCacheURLs(java.lang.ClassLoader loader)
	{
		return null;
	}

	public static int[] getLookupCacheForClassLoader(java.lang.ClassLoader loader, string name)
	{
		return null;
	}

	public static bool knownToNotExist0(java.lang.ClassLoader loader, string className)
	{
		return false;
	}
}

public static class Java_sun_misc_Version
{
	public static string getJvmSpecialVersion()
	{
		throw new NotImplementedException();
	}

	public static string getJdkSpecialVersion()
	{
		throw new NotImplementedException();
	}

	public static bool getJvmVersionInfo()
	{
		throw new NotImplementedException();
	}

	public static void getJdkVersionInfo()
	{
		throw new NotImplementedException();
	}
}

public static class Java_sun_misc_VM
{
	public static void initialize()
	{
	}

	public static java.lang.ClassLoader latestUserDefinedLoader()
	{
		// testing shows that it is cheaper the get the full stack trace and then look at a few frames than getting the frames individually
		StackTrace trace = new StackTrace(2, false);
		for (int i = 0; i < trace.FrameCount; i++)
		{
			StackFrame frame = trace.GetFrame(i);
			MethodBase method = frame.GetMethod();
			if (method == null)
			{
				continue;
			}
			Type type = method.DeclaringType;
			if (type != null)
			{
				TypeWrapper tw = ClassLoaderWrapper.GetWrapperFromType(type);
				if (tw != null)
				{
					ClassLoaderWrapper classLoader = tw.GetClassLoader();
					AssemblyClassLoader acl = classLoader as AssemblyClassLoader;
					if (acl == null || acl.GetAssembly(tw) != typeof(object).Assembly)
					{
						java.lang.ClassLoader javaClassLoader = classLoader.GetJavaClassLoader();
						if (javaClassLoader != null)
						{
							return javaClassLoader;
						}
					}
				}
			}
		}
		return null;
	}
}

public static class Java_sun_misc_VMSupport
{
	public static object initAgentProperties(object props)
	{
		return props;
	}

	public static string getVMTemporaryDirectory()
	{
		return System.IO.Path.GetTempPath();
	}
}