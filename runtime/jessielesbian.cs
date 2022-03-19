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
		private static readonly ManualResetEventSlim manualResetEventSlim = new ManualResetEventSlim();
		private static readonly ConcurrentQueue<ParallelJob> parallelJobs = new ConcurrentQueue<ParallelJob>();
		private static void ParallelExecThread()
		{
			while (true)
			{
				ParallelJob result;
				if (parallelJobs.TryDequeue(out result))
				{
					result.Execute();
				}
				else
				{
					lock (manualResetEventSlim)
					{
						if (manualResetEventSlim.IsSet && parallelJobs.IsEmpty)
						{
							manualResetEventSlim.Reset();
						}
					}
					manualResetEventSlim.Wait();
				}
			}
		}
#if STATIC_COMPILER
		public static bool useMultithreadedCompilation = true;
#else
		public static bool useMultithreadedCompilation = false;
#endif
		static Helper()
		{
			Array array = new object[0];
			ArrayLoad = new Func<int, object>(array.GetValue).Method;
			ArrayStore = new Action<object, int>(array.SetValue).Method;
			Type[] TypeArray = new Type[2];
			TypeArray[0] = typeof(object);
			TypeArray[1] = typeof(object);
			ObjectCheckRefEqual = typeof(object).GetMethod("ReferenceEquals", TypeArray);
			int limit = Environment.ProcessorCount;
			for (int i = 0; i < limit; i++)
			{
				Thread thread = new Thread(ParallelExecThread);
				thread.IsBackground = true;
				thread.Name = "IKVM.NET Worker Thread #" + i.ToString();
				thread.Start();
			}
		}
		internal static object Dowork(ParallelJob parallelJob)
		{
			lock (manualResetEventSlim)
			{
				parallelJobs.Enqueue(parallelJob);
				if(!manualResetEventSlim.IsSet){
					manualResetEventSlim.Set();
				}
			}
			parallelJob.Sync();
			if(parallelJob.Error == null){
				return parallelJob.Returns;
			} else{
				throw parallelJob.Error;
			}

		}
	}
	internal abstract class ParallelJob
	{
		private readonly ManualResetEventSlim sync = new ManualResetEventSlim();
		public object Returns { get; private set; }
		public Exception Error { get; private set; }

		public ParallelJob(){
			Returns = null;
			Error = null;
		}

		public void Execute(){
			try{
				Returns = Execute2();
			} catch(Exception e){
				Error = e;
			} finally{
				sync.Set();
			}
		}
		public void Sync(){
			sync.Wait();
			sync.Dispose();
		}

		protected abstract object Execute2();
	}
}
