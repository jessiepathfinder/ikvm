@echo off
set infile=%1
powershell -Command "(gc %infile%) -replace 'IKVM_VERSION','%IKVM_VERSION%' | Out-File -encoding ASCII %infile:~0,-3%"