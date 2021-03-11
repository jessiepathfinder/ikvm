# Jessie Lesbian's IKVM.NET fork (aka Jessie Lesbian's cute-looking .NET-based Java Virtual Machine)

![Latest AppVeyor build](https://ci.appveyor.com/api/projects/status/32r7s2skrgm9ubva?retina=false)

![Latest CircleCI build](https://circleci.com/gh/jessielesbian/ikvm.svg?style=svg)

## YourKit Sponsorship

YourKit supports open source projects with innovative and intelligent tools for monitoring and profiling Java and .NET applications. YourKit is the creator of <a href="https://www.yourkit.com/java/profiler/">YourKit Java Profiler</a>, <a href="https://www.yourkit.com/.net/profiler/">YourKit .NET Profiler</a>, and <a href="https://www.yourkit.com/youmonitor/">YourKit YouMonitor</a>.

## List of changes Jessie Lesbian made

 + Mono fork of IKVM.reflect
 + Precompiled classpath
 + Easy to use build script
 + Official builds
 + OpenJDK library performance optimizations
 + OpenJDK library base addresses behavior changed
 + Build OpenJDK tools alongside with core
 + OpenJDK library file alignment changed to 4096
 + Added OpenJDK.NET: The OpenJDK port for Microsoft.NET made by Jessie Lesbian
 + Removed excess spaces from response.txt
 + Added more JDK tools: jar, rmic and native2ascii
 + Use JDK tools from sun.tools instead of com.sun.tools when possible
 + Tweaked class loader wrapper for performance
 + Added an easter egg
 + Removed SwingAWT Remap
 + 5 passes of expiremental optimization in OpenJDK library
 + Controllable optimization level
 + Optimization in IKVM Dynamic Launcher
 + Optimize encodings in dynamic mode to save RAM
 + Optimize branch sizes in dynamic mode to save RAM
 + Refactored OpenJDK Library build
 + Removed allsources.lst
 + Slight speedup for IKVMC and ikvmstub
 + Added ikvmw.exe - the IKVM equivalent of javaw.exe
 + Fixed a few bugs using code by @ikvm-revived
 + Changed OpenJDK library build behavior
 + STRICT Floating Point
 + precompilation optimizations
 + NEW IKVMC options: -optimize:n, -preoptimize and -extremeoptimize
 + NEW IKVM options: -Xoptimize:n, -Xpreoptimize and -Xextremeoptimize
 + Added file caching
 + Converted quardspaces to indentations
 + Upgraded to IKVMClass v1.0.3 from OpenJDK 8u45
 + Improved Dynamic Class Loading

## List of changes Jessie Lesbian want to make

 + MORE OPTIMIZATIONS!
 + Fully support Swing and AWT
 + Play Minecraft with this IKVM.NET fork

![this software is proudly made by LGBT programmers](https://raw.githubusercontent.com/jessielesbian/ikvm/master/ikvmbadge.png)

## What I done well

 + There are some closed-source versions with whole-program optimization
 + Highest compartiable Minecraft version: client - 1.11.2, server - 1.12.2

## Build

step 1: extract the repository

step 2: make sure that you have the Microsoft.NET SDKs installed

step 3: run build.bat

NOTE: The built-in NANT tool may not work if you extract using windows explorer's built-in ZIP extractor due to some stupid security measures. You may need to unblock the archive in properties or extract using 7-zip.

If you hate building or can't build, don't worry, you will still experience the Java Virtual Machine made in C#. The cute-looking Jessie Lesbian had built all of this herself just in case you don't want to or can't build.

[download](https://github.com/jessielesbian/ikvm/releases/download/8.6.7.0/ikvmbin-8.6.7.0.zip)

If you have a problem or an opinion, please send an email to jessielesbian@protonmail.com or go to https://www.reddit.com/r/IKVM/.

## About OpenJDK.NET: The OpenJDK port for Microsoft.NET made by Jessie Lesbian

OpenJDK.NET is an OpenJDK port for Microsoft.NET made by Jessie Lesbian. It contains 6 JDK tools: javac, javah, javap, jar, native2ascii, and rmic. It is currently an experimental feature and may not work.

OpenJDK.NET enables IKVM to be used as a drop-in Java Development Kit. It is shipped with all Jessie Lesbian IKVM releases except the first one.
