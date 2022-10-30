@echo off
set IKVM_VERSION=%APPVEYOR_BUILD_VERSION%
set IKVM_JAVAC="C:\Program Files\Java\jdk1.8.0\bin\javac.exe"
set IKVM_JAVAC_ARGS=-J-Xmx2G -J-Xms2G