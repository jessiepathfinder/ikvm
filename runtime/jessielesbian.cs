using System;
using IKVM.Attributes;
using System.Collections.Generic;
using System.Reflection;
using System.Reflection.Emit;
using System.Security;
using System.IO;
using Instruction = IKVM.Internal.ClassFile.Method.Instruction;
using System.Collections.Concurrent;
using System.Threading;

//Do you believe in high-quality code by Female/LGBT programmers? Leave u/jessielesbian a PM on Reddit!

[assembly: jessielesbian.IKVM.MadeByLGBTProgrammers]

namespace jessielesbian.IKVM
{
	public sealed class ListOfObjects : List<object>, System.Collections.IList{
		
	}
	public class MadeByLGBTProgrammersAttribute : Attribute
	{

	}
	#if !FIRST_PASS && !STATIC_COMPILER
	[HideFromJava]
	#endif
	public static class Helper
	{
		static Helper()
		{
			Array array = new object[0];
			ArrayLoad = new Func<int, object>(array.GetValue).Method;
			ArrayStore = new Action<object, int>(array.SetValue).Method;
			Type[] TypeArray = new Type[2];
			TypeArray[0] = typeof(object);
			TypeArray[1] = typeof(object);
			ObjectCheckRefEqual = typeof(object).GetMethod("ReferenceEquals", TypeArray);
		}
		public static int FileIOCacheSize = 65536;
		public static object IKVMSYNC = new object();
		public static string FirstDynamicAssemblyName = "";
		public static AssemblyBuilder FirstDynamicAssembly = null;
		public static bool UseSingleDynamicAssembly = false;
		public static bool DisableGlobalConstantPool = false;
		public static readonly MethodInfo ObjectCheckRefEqual;
		public static bool TraceMeths = false;
		public static int optpasses = 0;
		public static bool enableJITPreOptimization = false;
		public static bool extremeOptimizations = false;
		internal static bool experimentalOptimizations
		{
			get
			{
				if(extremeOptimizations){
					optpasses = 1;
				}
				return (optpasses > 0) || extremeOptimizations;
			}
		}
		internal static readonly MethodInfo ArrayLoad;
		internal static readonly MethodInfo ArrayStore;
	}
}
