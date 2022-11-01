@echo off
set IKVM_TOOLNAME=%1
bin\ikvmc -version:%IKVM_VERSION% -out:bin/%IKVM_TOOLNAME%.exe -main:com.sun.tools.%IKVM_TOOLNAME%.Main
