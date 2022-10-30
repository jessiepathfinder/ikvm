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

package sun.text.resources.cldr.nmg;

import java.util.ListResourceBundle;

public class FormatData_nmg extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "ngw\u025bn mat\u00e1hra",
                    "ngw\u025bn \u0144mba",
                    "ngw\u025bn \u0144lal",
                    "ngw\u025bn \u0144na",
                    "ngw\u025bn \u0144tan",
                    "ngw\u025bn \u0144tu\u00f3",
                    "ngw\u025bn h\u025bmbu\u025br\u00ed",
                    "ngw\u025bn l\u0254mbi",
                    "ngw\u025bn r\u025bbvu\u00e2",
                    "ngw\u025bn wum",
                    "ngw\u025bn wum nav\u016dr",
                    "kr\u00edsimin",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "ng1",
                    "ng2",
                    "ng3",
                    "ng4",
                    "ng5",
                    "ng6",
                    "ng7",
                    "ng8",
                    "ng9",
                    "ng10",
                    "ng11",
                    "kris",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "s\u0254\u0301nd\u0254",
                    "m\u0254\u0301nd\u0254",
                    "s\u0254\u0301nd\u0254 maf\u00fa m\u00e1ba",
                    "s\u0254\u0301nd\u0254 maf\u00fa m\u00e1lal",
                    "s\u0254\u0301nd\u0254 maf\u00fa m\u00e1na",
                    "mab\u00e1g\u00e1 m\u00e1 sukul",
                    "s\u00e1sadi",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "s\u0254\u0301n",
                    "m\u0254\u0301n",
                    "smb",
                    "sml",
                    "smn",
                    "mbs",
                    "sas",
                }
            },
            { "DayNarrows",
                new String[] {
                    "s",
                    "m",
                    "s",
                    "s",
                    "s",
                    "m",
                    "s",
                }
            },
            { "QuarterNames",
                new String[] {
                    "Tind\u025b nv\u00far",
                    "Tind\u025b \u0144mba",
                    "Tind\u025b \u0144lal",
                    "Tind\u025b \u0144na",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "T1",
                    "T2",
                    "T3",
                    "T4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "man\u00e1",
                    "kug\u00fa",
                }
            },
            { "long.Eras",
                new String[] {
                    "B\u00f3 Lahl\u025b\u0304",
                    "Pfi\u025b Bur\u012b",
                }
            },
            { "Eras",
                new String[] {
                    "BL",
                    "PB",
                }
            },
            { "field.era", "P\u012bl/Lahl\u025b\u0304" },
            { "field.year", "Mbvu" },
            { "field.month", "Ngw\u025bn" },
            { "field.week", "S\u0254\u0301nd\u0254" },
            { "field.weekday", "Du\u00f6" },
            { "field.dayperiod", "M\u00e1n\u00e1, Mu\u00f3, Kug\u00fa, Bvul" },
            { "field.hour", "Wul\u0101" },
            { "field.minute", "Mp\u00e1l\u00e2" },
            { "field.second", "Nyi\u025bl" },
            { "field.zone", "Nk\u025b\u030cl wul\u0101" },
            { "TimePatterns",
                new String[] {
                    "HH:mm:ss zzzz",
                    "HH:mm:ss z",
                    "HH:mm:ss",
                    "HH:mm",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "d/M/yyyy",
                }
            },
            { "DefaultNumberingSystem", "latn" },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    "\u00a0",
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
                    "#,##0.00\u00a0\u00a4",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
