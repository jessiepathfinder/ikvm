@echo off
built-ikvm\bin\ikvm.exe -Xextremeoptimize -jar dacapo-9.12-MR1-bach.jar %1>ikvmtest.txt 2>&1
rmdir /s /q scratch
FOR /F "tokens=* delims=" %%x in (ikvmtest.txt) DO call chktestpassing.bat "%%x"
if exist TEST_PASSING goto pass
appveyor AddTest -Name %1 -Framework IKVMTest -FileName built-ikvm\bin\ikvm.exe -Outcome Failed
goto end
:pass
appveyor AddTest -Name %1 -Framework IKVMTest -FileName built-ikvm\bin\ikvm.exe -Outcome Passed
del /f /q TEST_PASSING
:end
set ERRORLEVEL=0
FOR /F "tokens=* delims=" %%x in (ikvmtest.txt) DO echo %%x
del /f /q ikvmtest.txt
