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
	public class SelfHashingInteger{
		public readonly int val;
		public SelfHashingInteger(int any){
			val = any;
		}
		public override int GetHashCode(){
			return val;
		}
		public override bool Equals(Object obj)
		{
			if (obj == null || ! (obj is SelfHashingInteger)){
				return false;
			}
			else{
				return val == ((SelfHashingInteger) obj).val;
			}
			
		}
	}
	public class MadeByLGBTProgrammersAttribute : Attribute
	{

	}
	//Idea from stack overflow user blueraja-danny-pflughoeft
	public static class ThreadSafeRandom
	{
		private static readonly Random _global = new Random();
		[ThreadStatic] private static Random _local;

		public static int Next()
		{
			if (_local == null)
			{
				lock (_global)
				{
					if (_local == null)
					{
						int seed = _global.Next();
						_local = new Random(seed);
					}
				}
			}
			return _local.Next();
		}
	}
	#if !FIRST_PASS
	[HideFromJava]
	#endif
	public static class Helper
	{
		static Helper()
		{
			Array array = new object[0];
			ArrayLoad = new Func<int, object>(array.GetValue).Method;
			ArrayStore = new Action<object, int>(array.SetValue).Method;
			GlobalConstantPoolIndexer = new ConcurrentDictionary<string, int>();
			GlobalConstantPool = new ConcurrentDictionary<SelfHashingInteger, object>();
			Type[] TypeArray = new Type[1];
			TypeArray[0] = typeof(int);
			GetGlobalConstantPoolItemReflected = typeof(Helper).GetMethod("GetGlobalConstantPoolItem", TypeArray);
			TypeArray = new Type[2];
			TypeArray[0] = typeof(object);
			TypeArray[1] = typeof(object);
			ObjectCheckRefEqual = typeof(object).GetMethod("ReferenceEquals", TypeArray);
		}
		public static volatile bool StillInMinecraftMode = true;
		public static void MinecraftModeGCLoop(){
			while(StillInMinecraftMode){
				Thread.Sleep(1500);
				GC.Collect();
			}
		}
		public static void EnterMinecraftMode(){
			new Thread(new ThreadStart(MinecraftModeGCLoop)).Start();
		}
		public static void ExitMinecraftMode(){
			StillInMinecraftMode = false;
		}
		public static int FileIOCacheSize = 65536;
		public static object IKVMSYNC = new object();
		public static string FirstDynamicAssemblyName = "";
		public static AssemblyBuilder FirstDynamicAssembly = null;
		public static bool UseSingleDynamicAssembly = false;
		public static bool DisableGlobalConstantPool = false;
		public static readonly MethodInfo GetGlobalConstantPoolItemReflected;
		public static readonly MethodInfo ObjectCheckRefEqual;
		public static int GlobalConstantPoolCounter = 0;
		public static ConcurrentDictionary<string, int> GlobalConstantPoolIndexer;
		public static ConcurrentDictionary<SelfHashingInteger, object> GlobalConstantPool;
		public static bool TraceMeths = false;
		public static object GetGlobalConstantPoolItem(int index){
			object result;
			if(GlobalConstantPool.TryGetValue(new SelfHashingInteger(index), out result)){
				return result;
			} else{
				throw new VerificationException("ERROR: Attempt to access non-existent global constant detected!");
			}
		}
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
		//REMOVED preoptimizer
		internal static Instruction[] Optimize(Instruction[] instructions)
		{
			return instructions;
		}
		internal static readonly MethodInfo ArrayLoad;
		internal static readonly MethodInfo ArrayStore;
	}
}
