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

package sun.text.resources.cldr.nus;

import java.util.ListResourceBundle;

public class FormatData_nus extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "Tiop thar p\u025bt",
                    "P\u025bt",
                    "Du\u0254\u0331\u0254\u0331\u014b",
                    "Guak",
                    "Du\u00e4t",
                    "Kornyoot",
                    "Pay yie\u0331tni",
                    "Tho\u0331o\u0331r",
                    "T\u025b\u025br",
                    "Laath",
                    "Kur",
                    "Tio\u0331p in di\u0331i\u0331t",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "Tiop",
                    "P\u025bt",
                    "Du\u0254\u0331\u0254\u0331",
                    "Guak",
                    "Du\u00e4",
                    "Kor",
                    "Pay",
                    "Thoo",
                    "T\u025b\u025b",
                    "Laa",
                    "Kur",
                    "Tid",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "T",
                    "P",
                    "D",
                    "G",
                    "D",
                    "K",
                    "P",
                    "T",
                    "T",
                    "L",
                    "K",
                    "T",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "C\u00e4\u014b ku\u0254th",
                    "Jiec la\u0331t",
                    "R\u025bw l\u00e4tni",
                    "Di\u0254\u0331k l\u00e4tni",
                    "\u014auaan l\u00e4tni",
                    "Dhieec l\u00e4tni",
                    "B\u00e4k\u025bl l\u00e4tni",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "C\u00e4\u014b",
                    "Jiec",
                    "R\u025bw",
                    "Di\u0254\u0331k",
                    "\u014auaan",
                    "Dhieec",
                    "B\u00e4k\u025bl",
                }
            },
            { "DayNarrows",
                new String[] {
                    "C",
                    "J",
                    "R",
                    "D",
                    "\u014a",
                    "D",
                    "B",
                }
            },
            { "QuarterNames",
                new String[] {
                    "P\u00e4th di\u0254k tin nhiam",
                    "P\u00e4th di\u0254k tin guur\u025b",
                    "P\u00e4th di\u0254k tin w\u00e4 k\u0254\u0254ri\u025bn",
                    "P\u00e4th di\u0254k tin ji\u0254akdi\u025bn",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "P1",
                    "P2",
                    "P3",
                    "P4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "RW",
                    "T\u014a",
                }
            },
            { "long.Eras",
                new String[] {
                    "A ka\u0331n Yecu ni dap",
                    "\u0190 ca Yecu dap",
                }
            },
            { "Eras",
                new String[] {
                    "AY",
                    "\u0190Y",
                }
            },
            { "field.era", "Gua\u0331a\u0331th Ru\u00ebc" },
            { "field.year", "Ru\u0254\u0331n" },
            { "field.month", "Pay" },
            { "field.week", "Ji\u0254k" },
            { "field.weekday", "Ni\u0331n jok\u00e4" },
            { "field.hour", "Thaak" },
            { "field.minute", "Minit" },
            { "field.second", "Th\u025bk\u025bni" },
            { "TimePatterns",
                new String[] {
                    "zzzz h:mm:ss a",
                    "z h:mm:ss a",
                    "h:mm:ss a",
                    "h:mm a",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "d/MM/yyyy",
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
                    "#,##0.###",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
