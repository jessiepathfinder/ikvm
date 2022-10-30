@echo off
set line=%1
if %line% NEQ %line:PASSED=FAILED% echo passed >> TEST_PASSING