using System;
using IKVM.Attributes;
using System.Collections.Generic;
using System.IO;
#if STATIC_COMPILER
using IKVM.Reflection;
using IKVM.Reflection.Emit;
#else
using System.Reflection;
using System.Reflection.Emit;
#endif
using IKVM.Internal;

//Do you believe in high-quality code by Female/LGBT programmers? Leave u/jessielesbian a PM on Reddit!

[assembly: jessielesbian.IKVM.MadeByLGBTProgrammers]

namespace jessielesbian.IKVM
{
	public sealed class ListOfObjects : List<object>, System.Collections.IList{
		
	}
	public class MadeByLGBTProgrammersAttribute : Attribute
	{

	}

	public static class Helper
	{
		public static void DoNothing(){
			
		}
		
#if STATIC_COMPILER
		public static int optpasses = 0;
		public static bool extremeOptimizations = false;
		internal static bool disableUnsafeIntrinsics = true;
#else
		internal static readonly int optpasses;
		internal static readonly bool extremeOptimizations;
		public static readonly string ikvmroot = Path.Combine(typeof(Helper).Assembly.Location, ".." + Path.DirectorySeparatorChar + "..") + Path.DirectorySeparatorChar;
#endif
		internal static bool experimentalOptimizations
		{
			get
			{
				return (optpasses > 0) || extremeOptimizations;
			}
		}
#if !FIRST_PASS && !STATIC_COMPILER
		static Helper()
		{
			extremeOptimizations = java.lang.System.getProperty("ikvm.runtime.useExtremeOptimizations") == "true";
			string tmp = java.lang.System.getProperty("ikvm.runtime.experimentalOptimizationPasses");
			if(!string.IsNullOrEmpty(tmp)){
				optpasses = Convert.ToInt32(tmp);
			}

		}
		public static readonly bool EnableLazyDFUMod = java.lang.System.getProperty("ikvm.runtime.LazyDFU") == "true";
#endif
	}
}
