@echo off
set IKVM_VERSION=%APPVEYOR_BUILD_VERSION%
set IKVM_JAVAC="C:\Program Files\Java\jdk17\bin\javac.exe"
set IKVM_JAVAC_ARGS=-J-Xmx2G -J-XX:+UnlockExperimentalVMOptions -J-XX:-UseJVMCINativeLibrary -J-XX:+UseJVMCICompiler -J-XX:+UseG1GC -J-XX:G1NewSizePercent=20 -J-XX:G1ReservePercent=20 -J-XX:MaxGCPauseMillis=50 -J-XX:G1HeapRegionSize=32M -source 8 -target 8