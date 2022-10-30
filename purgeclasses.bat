@echo off
FOR /R %%F IN (*.class) DO DEL %%F & ECHO %%F
pause