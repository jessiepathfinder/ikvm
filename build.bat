@echo off
cd %~dp0
if exist prebuild.bat call prebuild.bat ::prebuild script
echo cleaning...
call clean.bat
echo setting variables...
::DEFAULT IKVM.NET version, since 8.7.0.0 had a HUGE number of closed-source previews
if not defined IKVM_VERSION set IKVM_VERSION=8.7.0.0
if not defined IKVM_DOTNET_BUILD_ARGS set "IKVM_DOTNET_BUILD_ARGS= "
set IKVM_BUILD_CONFIG=-c Release
if '%IKVM_DEBUG%' equ 'true' set IKVM_BUILD_CONFIG=-c Debug
if not defined IKVM_JAVAC_ARGS set IKVM_JAVAC_ARGS=-J-Xmx1536M -source 8 -target 8
set IKVM_JAVAC_DEBUG=-g
if '%IKVM_DEBUG%' neq 'true' set IKVM_JAVAC_DEBUG=-g:none
if not defined IKVM_JAVAC set IKVM_JAVAC=javac

echo generating info files...
call set_version.bat CommonAssemblyInfo.cs.in
call set_version.bat openjdk\AssemblyInfo.java.in
call set_version.bat openjdk\java\lang\PropertyConstants.java.in

echo building core tools...
dotnet build %IKVM_BUILD_CONFIG% %IKVM_DOTNET_BUILD_ARGS% ikvmc.8.csproj
dotnet build %IKVM_BUILD_CONFIG% %IKVM_DOTNET_BUILD_ARGS% ikvmstub\ikvmstub.8.csproj

echo building first-pass assemblies...
dotnet build -c Release %IKVM_DOTNET_BUILD_ARGS% runtime\Dummy.OpenJDK.Core.csproj
dotnet build -c first_pass %IKVM_DOTNET_BUILD_ARGS% runtime\IKVM.Runtime.8.csproj
dotnet build -c first_pass %IKVM_DOTNET_BUILD_ARGS% awt\IKVM.AWT.WinForms.8.csproj
copy /B /Y stubs\IKVM.Runtime.JNI.dll bin\

echo generating stubs...
bin\ikvmstub -out:openjdk\mscorlib.jar -bootstrap mscorlib
bin\ikvmstub -out:openjdk\System.jar -bootstrap System
bin\ikvmstub -out:openjdk\System.Core.jar -bootstrap System.Core
bin\ikvmstub -out:openjdk\System.Data.jar -bootstrap System.Data
bin\ikvmstub -out:openjdk\System.Drawing.jar -bootstrap System.Drawing
bin\ikvmstub -out:openjdk\System.XML.jar -bootstrap System.XML
bin\ikvmstub -out:openjdk\IKVM.Runtime.jar -bootstrap bin\IKVM.Runtime.dll
bin\ikvmstub -out:openjdk\IKVM.AWT.WinForms.jar -bootstrap bin\IKVM.AWT.WinForms.dll

echo building OpenJDK...
cd openjdk
%IKVM_JAVAC% %IKVM_JAVAC_ARGS% %IKVM_JAVAC_DEBUG% -sourcepath sourcepath282 -bootclasspath mscorlib.jar;System.jar;System.Core.jar;System.Data.jar;System.Drawing.jar;System.XML.jar;IKVM.Runtime.jar;IKVM.AWT.WinForms.jar @allsources.lst
..\bin\ikvmc -assemblyattributes:commonAttributes.class "-version:%IKVM_VERSION%" -strictfinalfieldsemantics -target:library -sharedclassloader -r:mscorlib.dll -r:System.dll -r:System.Core.dll -r:System.Xml.dll -r:..\bin\IKVM.Runtime.dll -w4 -maintainunsafeintrinsics -removeassertions -compressresources -opt:fields -noparameterreflection -filealign:4096 -noautoserialization @response.txt
cd ..\

echo building runtime assemblies...
dotnet build %IKVM_BUILD_CONFIG% %IKVM_DOTNET_BUILD_ARGS% runtime\IKVM.Runtime.JNI.8.csproj
dotnet build %IKVM_BUILD_CONFIG% %IKVM_DOTNET_BUILD_ARGS% runtime\IKVM.Runtime.8.csproj
dotnet build %IKVM_BUILD_CONFIG% %IKVM_DOTNET_BUILD_ARGS% awt\IKVM.AWT.WinForms.8.csproj

echo building IKVM.NET launcher...
dotnet build %IKVM_BUILD_CONFIG% %IKVM_DOTNET_BUILD_ARGS% ikvm\ikvm.8.csproj