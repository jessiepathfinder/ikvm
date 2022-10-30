# IKVMClass
[![Build status](https://ci.appveyor.com/api/projects/status/kcatl3j9bq54rtp6?svg=true)](https://ci.appveyor.com/project/jessielesbian/ikvmclass)

IKVMClass is an OpenJDK fork built for IKVM.NET. Contains some work from Jeroen Frijters, Windward Studios, and ikvm-revived as well.
## Build
You need to add [this ikvmstub file](https://mega.nz/file/cqARyYSR#011dw2hXY-eHVU2-I8-3e9Yl39kB2FWnkp4_U4rLFMM) to your boot class path for the build, cd into /OpenJDK and ````javac -g:none -sourcepath sourcepath282 -bootclasspath ikvmstubs.jar````!
