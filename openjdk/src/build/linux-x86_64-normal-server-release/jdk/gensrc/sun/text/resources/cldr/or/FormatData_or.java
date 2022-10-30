/*
 * Copyright (c) 2012, 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (C) 1991-2012 Unicode, Inc. All rights reserved. Distributed under
 * the Terms of Use in http://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of the Unicode data files and any associated documentation (the "Data
 * Files") or Unicode software and any associated documentation (the
 * "Software") to deal in the Data Files or Software without restriction,
 * including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, and/or sell copies of the Data Files or Software, and
 * to permit persons to whom the Data Files or Software are furnished to do so,
 * provided that (a) the above copyright notice(s) and this permission notice
 * appear with all copies of the Data Files or Software, (b) both the above
 * copyright notice(s) and this permission notice appear in associated
 * documentation, and (c) there is clear notice in each modified Data File or
 * in the Software as well as in the documentation associated with the Data
 * File(s) or Software that the data or software has been modified.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF ANY
 * KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT OF
 * THIRD PARTY RIGHTS. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS
 * INCLUDED IN THIS NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR
 * CONSEQUENTIAL DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder shall not
 * be used in advertising or otherwise to promote the sale, use or other
 * dealings in these Data Files or Software without prior written authorization
 * of the copyright holder.
 */

package sun.text.resources.cldr.or;

import java.util.ListResourceBundle;

public class FormatData_or extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u0b1c\u0b3e\u0b28\u0b41\u0b06\u0b30\u0b40",
                    "\u0b2b\u0b47\u0b2c\u0b4d\u0b30\u0b41\u0b5f\u0b3e\u0b30\u0b40",
                    "\u0b2e\u0b3e\u0b30\u0b4d\u0b1a\u0b4d\u0b1a",
                    "\u0b05\u0b2a\u0b4d\u0b30\u0b47\u0b32",
                    "\u0b2e\u0b47",
                    "\u0b1c\u0b41\u0b28",
                    "\u0b1c\u0b41\u0b32\u0b3e\u0b07",
                    "\u0b05\u0b17\u0b37\u0b4d\u0b1f",
                    "\u0b38\u0b47\u0b2a\u0b4d\u0b1f\u0b47\u0b2e\u0b4d\u0b2c\u0b30",
                    "\u0b05\u0b15\u0b4d\u0b1f\u0b4b\u0b2c\u0b30",
                    "\u0b28\u0b2d\u0b47\u0b2e\u0b4d\u0b2c\u0b30",
                    "\u0b21\u0b3f\u0b38\u0b47\u0b2e\u0b4d\u0b2c\u0b30",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "\u0b1c\u0b3e",
                    "\u0b2b\u0b47",
                    "\u0b2e\u0b3e",
                    "\u0b05",
                    "\u0b2e\u0b47",
                    "\u0b1c\u0b41",
                    "\u0b1c\u0b41",
                    "\u0b05",
                    "\u0b38\u0b47",
                    "\u0b05",
                    "\u0b28",
                    "\u0b21\u0b3f",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u0b30\u0b2c\u0b3f\u0b2c\u0b3e\u0b30",
                    "\u0b38\u0b4b\u0b2e\u0b2c\u0b3e\u0b30",
                    "\u0b2e\u0b19\u0b4d\u0b17\u0b33\u0b2c\u0b3e\u0b30",
                    "\u0b2c\u0b41\u0b27\u0b2c\u0b3e\u0b30",
                    "\u0b17\u0b41\u0b30\u0b41\u0b2c\u0b3e\u0b30",
                    "\u0b36\u0b41\u0b15\u0b4d\u0b30\u0b2c\u0b3e\u0b30",
                    "\u0b36\u0b28\u0b3f\u0b2c\u0b3e\u0b30",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u0b30\u0b2c\u0b3f",
                    "\u0b38\u0b4b\u0b2e",
                    "\u0b2e\u0b19\u0b4d\u0b17\u0b33",
                    "\u0b2c\u0b41\u0b27",
                    "\u0b17\u0b41\u0b30\u0b41",
                    "\u0b36\u0b41\u0b15\u0b4d\u0b30",
                    "\u0b36\u0b28\u0b3f",
                }
            },
            { "DayNarrows",
                new String[] {
                    "\u0b30",
                    "\u0b38\u0b4b",
                    "\u0b2e",
                    "\u0b2c\u0b41",
                    "\u0b17\u0b41",
                    "\u0b36\u0b41",
                    "\u0b36",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "am",
                    "pm",
                }
            },
            { "TimePatterns",
                new String[] {
                    "h:mm:ss a zzzz",
                    "h:mm:ss a z",
                    "h:mm:ss a",
                    "h:mm a",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "d-M-yy",
                }
            },
            { "DefaultNumberingSystem", "latn" },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "NumberPatterns",
                new String[] {
                    "#,##,##0.###",
                    "\u00a4\u00a0#,##,##0.00",
                    "#,##,##0%",
                }
            },
        };
        return data;
    }
}
