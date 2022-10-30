@echo off
title BUILD Jessie Lesbian's cute-looking IKVM.NET fork
echo building Jessie Lesbian's cute-looking IKVM.NET fork
REM This script is should be ran after initial build
cd %~dp0\openjdk
"%cd%\..\nant\nant.exe"
pause
exit