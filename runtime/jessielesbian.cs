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
		private static Instruction GetInstuction(NormalizedByteCode bc)
		{
			Instruction instruction = new Instruction();
			instruction.PatchOpCode(bc);
			return instruction;
		}
		private static Instruction GetInstuction(NormalizedByteCode bc, int arg1)
		{
			Instruction instruction = new Instruction();
			instruction.PatchOpCode(bc, arg1);
			return instruction;
		}
		private static Instruction GetInstuction(NormalizedByteCode bc, int arg1, short arg2)
		{
			Instruction instruction = new Instruction();
			instruction.PatchOpCode(bc, arg1, arg2);
			return instruction;
		}
		private static bool IsBranchInstruction(Instruction instruction)
		{
			switch (instruction.NormalizedOpCode)
			{
				case NormalizedByteCode.__goto:
				case NormalizedByteCode.__goto_finally:
				case NormalizedByteCode.__ifeq:
				case NormalizedByteCode.__ifge:
				case NormalizedByteCode.__ifgt:
				case NormalizedByteCode.__ifle:
				case NormalizedByteCode.__iflt:
				case NormalizedByteCode.__ifne:
				case NormalizedByteCode.__ifnonnull:
				case NormalizedByteCode.__ifnull:
				case NormalizedByteCode.__if_acmpeq:
				case NormalizedByteCode.__if_acmpne:
				case NormalizedByteCode.__if_icmpeq:
				case NormalizedByteCode.__if_icmpge:
				case NormalizedByteCode.__if_icmpgt:
				case NormalizedByteCode.__if_icmple:
				case NormalizedByteCode.__if_icmplt:
				case NormalizedByteCode.__if_icmpne:
					return true;
				default:
					return false;
			}
		}
		private static bool IsLoadConstInstruction(Instruction instruction)
		{
			switch (instruction.NormalizedOpCode)
			{
				case NormalizedByteCode.__aconst_null:
				case NormalizedByteCode.__iconst:
				case NormalizedByteCode.__lconst_0:
				case NormalizedByteCode.__lconst_1:
				case NormalizedByteCode.__dconst_0:
				case NormalizedByteCode.__dconst_1:
				case NormalizedByteCode.__fconst_0:
				case NormalizedByteCode.__fconst_1:
				case NormalizedByteCode.__fconst_2:
				case NormalizedByteCode.__ldc:
					return true;
				default:
					return false;
			}
		}
		private static bool IsLoadLocalInstruction(Instruction instruction)
		{
			switch (instruction.NormalizedOpCode)
			{
				case NormalizedByteCode.__aload:
				case NormalizedByteCode.__iload:
				case NormalizedByteCode.__lload:
				case NormalizedByteCode.__dload:
				case NormalizedByteCode.__fload:
					return true;
				default:
					return false;
			}
		}
		private static bool IsLoadInstruction(Instruction instruction)
		{
			return IsLoadConstInstruction(instruction) || IsLoadLocalInstruction(instruction);
		}
		private static bool IsArrayLoadInstruction(Instruction instruction)
		{
			switch (instruction.NormalizedOpCode)
			{
				case NormalizedByteCode.__aaload:
				case NormalizedByteCode.__iaload:
				case NormalizedByteCode.__laload:
				case NormalizedByteCode.__daload:
				case NormalizedByteCode.__faload:
					return true;
				default:
					return false;
			}
		}
		private static bool IsStoreInstruction(Instruction instruction)
		{
			switch (instruction.NormalizedOpCode)
			{
				case NormalizedByteCode.__astore:
				case NormalizedByteCode.__istore:
				case NormalizedByteCode.__lstore:
				case NormalizedByteCode.__dstore:
				case NormalizedByteCode.__fstore:
					return true;
				default:
					return false;
			}
		}
		internal static Instruction[] Optimize(Instruction[] instructions)
		{
			//Jessie Lesbian's IKVM.NET JIT Optimizer
			//The lesbian had waivered all her rights over this algorigmth.

			instructions = (Instruction[])instructions.Clone();
			int optimizations = 1279738452;
			while (optimizations != 0)
			{
				optimizations = 0;
				for (int i = 1; i < instructions.Length; i++)
				{
					int prevIndex = i - 1;
					while (prevIndex > 1 && instructions[prevIndex].NormalizedOpCode == NormalizedByteCode.__nop)
					{
						prevIndex--;
					}
					Instruction current = instructions[i];
					Instruction prev = instructions[prevIndex];
					if (IsBranchInstruction(current) || IsBranchInstruction(prev))
					{
						continue;
					}
					//peephole optimization: anihilation of pops
					if (current.NormalizedOpCode == NormalizedByteCode.__pop)
					{
						switch (prev.NormalizedOpCode)
						{
							case NormalizedByteCode.__iadd:
							case NormalizedByteCode.__isub:
							case NormalizedByteCode.__imul:
							case NormalizedByteCode.__idiv:
							case NormalizedByteCode.__irem:
							case NormalizedByteCode.__ishl:
							case NormalizedByteCode.__ishr:
							case NormalizedByteCode.__iushr:
							case NormalizedByteCode.__iand:
							case NormalizedByteCode.__ior:
							case NormalizedByteCode.__ixor:
							case NormalizedByteCode.__fadd:
							case NormalizedByteCode.__fsub:
							case NormalizedByteCode.__fmul:
							case NormalizedByteCode.__fdiv:
							case NormalizedByteCode.__frem:
							case NormalizedByteCode.__fcmpl:
							case NormalizedByteCode.__fcmpg:
							case NormalizedByteCode.__ladd:
							case NormalizedByteCode.__lsub:
							case NormalizedByteCode.__lmul:
							case NormalizedByteCode.__ldiv:
							case NormalizedByteCode.__lrem:
							case NormalizedByteCode.__lshl:
							case NormalizedByteCode.__lshr:
							case NormalizedByteCode.__lushr:
							case NormalizedByteCode.__land:
							case NormalizedByteCode.__lor:
							case NormalizedByteCode.__lxor:
							case NormalizedByteCode.__lcmp:
							case NormalizedByteCode.__dadd:
							case NormalizedByteCode.__dsub:
							case NormalizedByteCode.__dmul:
							case NormalizedByteCode.__ddiv:
							case NormalizedByteCode.__drem:
							case NormalizedByteCode.__dcmpl:
							case NormalizedByteCode.__dcmpg:
								prev = GetInstuction(NormalizedByteCode.__pop);
								optimizations = optimizations + 1;
								break;
							case NormalizedByteCode.__anewarray:
								prev = GetInstuction(NormalizedByteCode.__nop);
								break;
							default:
								if (IsBranchInstruction(prev))
								{
									prev = GetInstuction(NormalizedByteCode.__nop);
									current = GetInstuction(NormalizedByteCode.__nop);
									optimizations = optimizations + 1;
								}
								if (IsArrayLoadInstruction(prev))
								{
									prev = GetInstuction(NormalizedByteCode.__pop);
									optimizations = optimizations + 1;
								}
								break;
						}
					}
					//peephole optimization: removal of self-cancelling operations
					if (current.NormalizedOpCode == prev.NormalizedOpCode)
					{
						switch (instructions[i].NormalizedOpCode)
						{
							case NormalizedByteCode.__ineg:
							case NormalizedByteCode.__lneg:
							case NormalizedByteCode.__fneg:
							case NormalizedByteCode.__dneg:
							case NormalizedByteCode.__swap:
								current = GetInstuction(NormalizedByteCode.__nop);
								prev = GetInstuction(NormalizedByteCode.__nop);
								optimizations = optimizations + 1;
								break;
							default:
								break;
						}
					}
					//peephole optimization: strength reduction
					if (current.NormalizedOpCode == prev.NormalizedOpCode && IsBranchInstruction(current) && current.NormalizedArg1 == prev.NormalizedArg1)
					{
						current = GetInstuction(NormalizedByteCode.__dup);
						optimizations = optimizations + 1;
					}
					if (current.NormalizedOpCode == prev.NormalizedOpCode && IsStoreInstruction(current) && current.NormalizedArg1 == prev.NormalizedArg1)
					{
						prev = GetInstuction(NormalizedByteCode.__pop);
						optimizations = optimizations + 1;
					}
					//peephole optimization: optimize addition and subtraction
					if ((prev.NormalizedOpCode == NormalizedByteCode.__ineg))
					{
						if (current.NormalizedOpCode == NormalizedByteCode.__iadd)
						{
							current = GetInstuction(NormalizedByteCode.__isub);
							prev = GetInstuction(NormalizedByteCode.__nop);
							optimizations = optimizations + 1;
						}
						if (current.NormalizedOpCode == NormalizedByteCode.__isub)
						{
							current = GetInstuction(NormalizedByteCode.__iadd);
							prev = GetInstuction(NormalizedByteCode.__nop);
							optimizations = optimizations + 1;
						}
					}
					if (prev.NormalizedOpCode == NormalizedByteCode.__lneg)
					{
						if (current.NormalizedOpCode == NormalizedByteCode.__ladd)
						{
							current = GetInstuction(NormalizedByteCode.__lsub);
							prev = GetInstuction(NormalizedByteCode.__nop);
							optimizations = optimizations + 1;
						}
						if (current.NormalizedOpCode == NormalizedByteCode.__lsub)
						{
							current = GetInstuction(NormalizedByteCode.__ladd);
							prev = GetInstuction(NormalizedByteCode.__nop);
							optimizations = optimizations + 1;
						}
					}
					if (prev.NormalizedOpCode == NormalizedByteCode.__fneg)
					{
						if (current.NormalizedOpCode == NormalizedByteCode.__fadd)
						{
							current = GetInstuction(NormalizedByteCode.__fsub);
							prev = GetInstuction(NormalizedByteCode.__nop);
							optimizations = optimizations + 1;
						}
						if (current.NormalizedOpCode == NormalizedByteCode.__fsub)
						{
							current = GetInstuction(NormalizedByteCode.__fadd);
							prev = GetInstuction(NormalizedByteCode.__nop);
							optimizations = optimizations + 1;
						}
					}
					if (prev.NormalizedOpCode == NormalizedByteCode.__dneg)
					{
						if (current.NormalizedOpCode == NormalizedByteCode.__dadd)
						{
							current = GetInstuction(NormalizedByteCode.__dsub);
							prev = GetInstuction(NormalizedByteCode.__nop);
							optimizations = optimizations + 1;
						}
						if (current.NormalizedOpCode == NormalizedByteCode.__dsub)
						{
							current = GetInstuction(NormalizedByteCode.__dadd);
							prev = GetInstuction(NormalizedByteCode.__nop);
							optimizations = optimizations + 1;
						}
					}
					//peephole optimization: remove unnecessary swaps
					if (prev.NormalizedOpCode == NormalizedByteCode.__swap)
					{
						switch (current.NormalizedOpCode)
						{
							case NormalizedByteCode.__iadd:
							case NormalizedByteCode.__ladd:
							case NormalizedByteCode.__fadd:
							case NormalizedByteCode.__dadd:
							case NormalizedByteCode.__imul:
							case NormalizedByteCode.__lmul:
							case NormalizedByteCode.__fmul:
							case NormalizedByteCode.__dmul:
								prev = GetInstuction(NormalizedByteCode.__nop);
								optimizations = optimizations + 1;
								break;
							default:
								break;
						}
					}
					if (current.NormalizedOpCode == NormalizedByteCode.__swap && prev.NormalizedOpCode == NormalizedByteCode.__dup)
					{
						current = GetInstuction(NormalizedByteCode.__nop);
						optimizations = optimizations + 1;
					}
					instructions[i] = current;
					instructions[prevIndex] = prev;
				}
			}
			return instructions;
		}
		internal static readonly MethodInfo ArrayLoad;
		internal static readonly MethodInfo ArrayStore;
	}
}
