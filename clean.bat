@echo off
cd %~dp0
echo cleaning class files...
FOR /R %%F IN (*.class) DO DEL %%F
echo cleaning pdb files...
FOR /R %%F IN (*.pdb) DO DEL %%F
echo cleaning cache files...
rmdir /s /q .vs
rmdir /s /q awt\obj
rmdir /s /q runtime\obj
rmdir /s /q ikvm\obj
rmdir /s /q obj
rmdir /s /q ikvmstub\obj
rmdir /s /q nuget
rmdir /s /q packages

echo cleaning other files...
FOR /F "usebackq delims=" %%A IN (".gitignore") DO DEL /F /Q /S "%%A" >nul 2>nul
