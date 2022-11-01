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
using System.Linq.Expressions;

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
	private static readonly MethodInfo compareExchangeObject = typeof(Interlocked).GetMethod("CompareExchange", new System.Type[] { typeof(object).MakeByRefType(), typeof(object), typeof(object) });
	private static readonly MethodInfo exchangeObject = typeof(Interlocked).GetMethod("Exchange", new System.Type[] { typeof(object).MakeByRefType(), typeof(object) });
	private static readonly ConcurrentDictionary<FieldInfo, Func<object, object, object, object>> compareExchangeObjectCache = new ConcurrentDictionary<FieldInfo, Func<object, object, object, object>>();
	private static readonly ConcurrentDictionary<FieldInfo, Func<object, object, object>> exchangeObjectCache = new ConcurrentDictionary<FieldInfo, Func<object, object, object>>();

	private static Func<object, object, object, object> CreateCompareExchangeObjectCall(FieldInfo valueField)
	{
		var instanceParam = Expression.Parameter(typeof(object));
		var field = Expression.Field(valueField.IsStatic ? null : Expression.Convert(instanceParam, valueField.DeclaringType), valueField);
		var valueParam = Expression.Parameter(typeof(object));
		var comparandParam = Expression.Parameter(typeof(object));
		var lambda = Expression.Lambda<Func<object, object, object, object>>(Expression.Call(null, compareExchangeObject, field, valueParam, comparandParam), instanceParam, valueParam, comparandParam);
		return lambda.Compile();
	}
	private static Func<object, object, object> CreateExchangeObjectCall(FieldInfo valueField)
	{
		var instanceParam = Expression.Parameter(typeof(object));
		var field = Expression.Field(valueField.IsStatic ? null : Expression.Convert(instanceParam, valueField.DeclaringType), valueField);
		var valueParam = Expression.Parameter(typeof(object));
		var lambda = Expression.Lambda<Func<object, object, object>>(Expression.Call(null, exchangeObject, field, valueParam), instanceParam, valueParam);
		return lambda.Compile();
	}

	private static class TripleAtomicHelper<T>
	{
		private static readonly ConcurrentDictionary<FieldInfo, Func<object, T, T, T>> compareExchangeCache = new ConcurrentDictionary<FieldInfo, Func<object, T, T, T>>();
		private static readonly ConcurrentDictionary<FieldInfo, Func<object, T, T>> exchangeCache = new ConcurrentDictionary<FieldInfo, Func<object, T, T>>();
		private static readonly ConcurrentDictionary<FieldInfo, Func<object, T, T>> addCache = new ConcurrentDictionary<FieldInfo, Func<object, T, T>>();
		public static T CompareExchange(object obj, FieldInfo fieldInfo, T val, T compare)
		{
			return compareExchangeCache.GetOrAdd(fieldInfo, CreateCompareExchangeCall)(obj, val, compare);
		}
		public static T Exchange(object obj, FieldInfo fieldInfo, T val)
		{
			return exchangeCache.GetOrAdd(fieldInfo, CreateExchangeCall)(obj, val);
		}
		public static T Add(object obj, FieldInfo fieldInfo, T val)
		{
			return addCache.GetOrAdd(fieldInfo, CreateAddCall)(obj, val);
		}
		private static readonly MethodInfo compareExchange = typeof(Interlocked).GetMethod("CompareExchange", new System.Type[] { typeof(T).MakeByRefType(), typeof(T), typeof(T) });
		private static readonly MethodInfo exchange = typeof(Interlocked).GetMethod("Exchange", new System.Type[] { typeof(T).MakeByRefType(), typeof(T) });
		private static readonly MethodInfo add = typeof(Interlocked).GetMethod("Add", new System.Type[] { typeof(T).MakeByRefType(), typeof(T) });
		private static Func<object, T, T, T> CreateCompareExchangeCall(FieldInfo valueField)
		{
			if (valueField.FieldType != typeof(T))
				throw new ArgumentOutOfRangeException(nameof(valueField), $"Expected {typeof(T).Name} type field but got {valueField.FieldType.Name}");
			var instanceParam = Expression.Parameter(typeof(object));
			var field = Expression.Field(valueField.IsStatic ? null : Expression.Convert(instanceParam, valueField.DeclaringType), valueField);
			var valueParam = Expression.Parameter(typeof(T));
			var comparandParam = Expression.Parameter(typeof(T));
			var lambda = Expression.Lambda<Func<object, T, T, T>>(Expression.Call(null, compareExchange, field, valueParam, comparandParam), instanceParam, valueParam, comparandParam);
			return lambda.Compile();
		}
		private static Func<object, T, T> CreateExchangeCall(FieldInfo valueField)
		{
			if (valueField.FieldType != typeof(T))
				throw new ArgumentOutOfRangeException(nameof(valueField), $"Expected {typeof(T).Name} type field but got {valueField.FieldType.Name}");
			var instanceParam = Expression.Parameter(typeof(object));
			var field = Expression.Field(valueField.IsStatic ? null : Expression.Convert(instanceParam, valueField.DeclaringType), valueField);
			var valueParam = Expression.Parameter(typeof(T));
			var lambda = Expression.Lambda<Func<object, T, T>>(Expression.Call(null, exchange, field, valueParam), instanceParam, valueParam);
			return lambda.Compile();
		}
		private static Func<object, T, T> CreateAddCall(FieldInfo valueField)
		{
			if (valueField.FieldType != typeof(T))
				throw new ArgumentOutOfRangeException(nameof(valueField), $"Expected {typeof(T).Name} type field but got {valueField.FieldType.Name}");
			var instanceParam = Expression.Parameter(typeof(object));
			var field = Expression.Field(valueField.IsStatic ? null : Expression.Convert(instanceParam, valueField.DeclaringType), valueField);
			var valueParam = Expression.Parameter(typeof(T));
			var lambda = Expression.Lambda<Func<object, T, T>>(Expression.Call(null, add, field, valueParam), instanceParam, valueParam);
			return lambda.Compile();
		}
	}
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
	public static long ReadInt64(object obj, long offset, bool atomic)
	{
		Stats.Log("ReadInt64");
		CheckArrayBounds(obj, offset, 8);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		IntPtr ptr = (IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset);
		long value = atomic ? IKVM_GetLong(ptr) : Marshal.ReadInt64(ptr);
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

	[SecuritySafeCritical]
	public static void WriteInt64(object obj, long offset, long value, bool atomic)
	{
		Stats.Log("WriteInt64");
		CheckArrayBounds(obj, offset, 8);
		GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
		IntPtr ptr = (IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset);
		if(atomic){
			IKVM_SetLong(ptr, value);
		} else{
			Marshal.WriteInt64(ptr, value);
		}
		handle.Free();
	}

	public static void throwException(object thisUnsafe, Exception x)
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

	public static bool compareAndSwapInt(object thisUnsafe, object obj, long offset, int expect, int update)
	{
		if (obj is Array)
		{
			Stats.Log("compareAndSwapInt.unaligned");
			CheckArrayBounds(obj, offset, 4);
			GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
			return IKVM_CompareExchangeInt((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset), expect, update) == expect;
		} else
		{
			Stats.Log("compareAndSwapInt.", offset);
			return TripleAtomicHelper<int>.CompareExchange(obj, GetFieldInfo(offset), update, expect) == expect;
		}
	}

	public static bool compareAndSwapLong(object thisUnsafe, object obj, long offset, long expect, long update)
	{
		if (obj is Array)
		{
			Stats.Log("compareAndSwapLong.unaligned");
			CheckArrayBounds(obj, offset, 8);
			GCHandle handle = GCHandle.Alloc(obj, GCHandleType.Pinned);
			return IKVM_CompareExchangeLong((IntPtr)(handle.AddrOfPinnedObject().ToInt64() + offset), expect, update) == expect;
		}
		else
		{
			Stats.Log("compareAndSwapLong.", offset);

			return TripleAtomicHelper<long>.CompareExchange(obj, GetFieldInfo(offset), update, expect) == expect;
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
			return TripleAtomicHelper<int>.Add(obj, GetFieldInfo(offset), delta);
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
			return TripleAtomicHelper<long>.Add(obj, GetFieldInfo(offset), delta);
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
			return TripleAtomicHelper<int>.Exchange(obj, GetFieldInfo(offset), delta);
		}
	}
	public static float getFloatVolatile2(object obj, long offset)
	{
		return TripleAtomicHelper<float>.CompareExchange(obj, GetFieldInfo(offset), 0, 0);
	}
	public static double getDoubleVolatile2(object obj, long offset)
	{
		return TripleAtomicHelper<double>.CompareExchange(obj, GetFieldInfo(offset), 0, 0);
	}
	public static void setFloatVolatile2(object obj, long offset, float val)
	{
		TripleAtomicHelper<float>.Exchange(obj, GetFieldInfo(offset), val);
	}
	public static void setDoubleVolatile2(object obj, long offset, double val)
	{
		TripleAtomicHelper<double>.Exchange(obj, GetFieldInfo(offset), val);
	}

	public static object getObjectVolatile2(object obj, long offset){
		return compareExchangeObjectCache.GetOrAdd(GetFieldInfo(offset), CreateCompareExchangeObjectCall)(obj, null, null);
	}

	public static object getAndSetObject(object thisUnsafe, object o, long offset, object newValue){
		object[] array = o as object[];
		if(ReferenceEquals(array, null)){
			return exchangeObjectCache.GetOrAdd(GetFieldInfo(offset), CreateExchangeObjectCall)(o, newValue);
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
			return TripleAtomicHelper<long>.Exchange(obj, GetFieldInfo(offset), delta);
		}
	}
#if FIRST_PASS
	private static FieldInfo GetFieldInfo(long offset)
	{
		throw new NotImplementedException();
	}
#else
	private static FieldInfo GetFieldInfo(long offset)
	{
		FieldWrapper fw = FieldWrapper.FromField(sun.misc.Unsafe.getField(offset));
		fw.Link();
		fw.ResolveField();
		return fw.GetField();
	}
#endif

	public static bool compareAndSwapObject(object thisUnsafe, object obj, long offset, object expect, object update)
	{
#if FIRST_PASS
		return false;
#else
		object[] array = obj as object[];
		if (ReferenceEquals(array, null))
		{
			Stats.Log("compareAndSwapObject.", offset);
			return ReferenceEquals(compareExchangeObjectCache.GetOrAdd(GetFieldInfo(offset), CreateCompareExchangeObjectCall)(obj, expect, update), expect);
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
