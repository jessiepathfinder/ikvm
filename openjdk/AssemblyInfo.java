/*
  Copyright (C) 2006-2014 Jeroen Frijters

  This software is provided 'as-is', without any express or implied
  warranty.  In no event will the authors be held liable for any damages
  arising from the use of this software.

  Permission is granted to anyone to use this software for any purpose,
  including commercial applications, and to alter it and redistribute it
  freely, subject to the following restrictions:

  1. The origin of this software must not be misrepresented; you must not
     claim that you wrote the original software. If you use this software
     in a product, an acknowledgment in the product documentation would be
     appreciated but is not required.
  2. Altered source versions must be plainly marked as such, and must not be
     misrepresented as being the original software.
  3. This notice may not be removed or altered from any source distribution.

  Jeroen Frijters
  jeroen@frijters.net
  
*/

@cli.System.Reflection.AssemblyCopyrightAttribute.Annotation(
    "This software is licensed under the GNU General Public License version 2 + \"Classpath\" exception.\r\n" +
    "See http://www.gnu.org/software/classpath/license.html for details.\r\n" +
"1988       AT&T\r\n2009-2014  Attila Szegedi\r\n1995       Colin Plumb\r\n1999-2014  Free Software Foundation\r\n2001-2005  freebxml.org\r\n1998       FundsXpress, INC.\r\n2009       Google Inc.\r\n2008-2013  i-net software\r\n2000-2013  INRIA, France Telecom\r\n1993-2013  International Business Machines, Inc.\r\n2002-2015  Jeroen Frijters\r\n1994-2015  Oracle and/or its affiliates\r\n2007       Red Hat, Inc.\r\n2007-2013  Stephen Colebourne & Michael Nascimento Santos\r\n1993-1997  Sun Microsystems, Inc.\r\n1996-1998  Taligent, Inc.\r\n2001-2002  Thai Open Source Software Center Ltd\r\n1999-2006  The Apache Software Foundation\r\n1995-2000  The Cryptix Foundation Limited\r\n1997       The Open Group Research Institute\r\n1991-2012  Unicode, Inc.\r\n1999       Visual Numerics Inc.\r\n2003       Wily Technology, Inc.\r\n2000-2004  World Wide Web Consortium\r\n2019-2021  Jessie Lesbian")

@cli.System.Reflection.AssemblyTitleAttribute.Annotation("IKVM.NET OpenJDK Library for .NET")
@cli.System.Reflection.AssemblyProductAttribute.Annotation("IKVM.NET")
@cli.System.Reflection.AssemblyCompanyAttribute.Annotation("Jeroen Frijters")
@cli.System.Reflection.AssemblyInformationalVersionAttribute.Annotation("8.7.0.0")

@cli.System.Runtime.CompilerServices.InternalsVisibleToAttribute.Annotation.__Multiple({
    @cli.System.Runtime.CompilerServices.InternalsVisibleToAttribute.Annotation("IKVM.Runtime"),
    @cli.System.Runtime.CompilerServices.InternalsVisibleToAttribute.Annotation("IKVM.AWT.WinForms")
})

@cli.System.Security.AllowPartiallyTrustedCallersAttribute.Annotation

// type to collect Assembly attributes applicable to all core library assemblies
interface commonAttributes {}

/////////////////////////////////////////////////////////////////////////////

// Roslyn requires that assemblies that contain types that define extension methods have the attribute on the assembly as well
@cli.System.Runtime.CompilerServices.ExtensionAttribute.Annotation

// type to collect Assembly attributes specific to IKVM.OpenJDK.Core
interface coreAttributes {}
