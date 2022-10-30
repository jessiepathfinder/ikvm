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

package sun.text.resources.cldr.bm;

import java.util.ListResourceBundle;

public class FormatData_bm extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "zanwuye",
                    "feburuye",
                    "marisi",
                    "awirili",
                    "m\u025b",
                    "zuw\u025bn",
                    "zuluye",
                    "uti",
                    "s\u025btanburu",
                    "\u0254kut\u0254buru",
                    "nowanburu",
                    "desanburu",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "zan",
                    "feb",
                    "nar",
                    "awi",
                    "m\u025b",
                    "zuw",
                    "zul",
                    "uti",
                    "s\u025bt",
                    "\u0254ku",
                    "now",
                    "des",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "Z",
                    "F",
                    "M",
                    "A",
                    "M",
                    "Z",
                    "Z",
                    "U",
                    "S",
                    "\u0186",
                    "N",
                    "D",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "kari",
                    "nt\u025bn\u025b",
                    "tarata",
                    "araba",
                    "alamisa",
                    "juma",
                    "sibiri",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "kar",
                    "nt\u025b",
                    "tar",
                    "ara",
                    "ala",
                    "jum",
                    "sib",
                }
            },
            { "DayNarrows",
                new String[] {
                    "K",
                    "N",
                    "T",
                    "A",
                    "A",
                    "J",
                    "S",
                }
            },
            { "QuarterNames",
                new String[] {
                    "kalo saba f\u0254l\u0254",
                    "kalo saba filanan",
                    "kalo saba sabanan",
                    "kalo saba naaninan",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "KS1",
                    "KS2",
                    "KS3",
                    "KS4",
                }
            },
            { "long.Eras",
                new String[] {
                    "jezu krisiti \u0272\u025b",
                    "jezu krisiti mink\u025b",
                }
            },
            { "Eras",
                new String[] {
                    "J.-C. \u0272\u025b",
                    "ni J.-C.",
                }
            },
            { "field.era", "tile" },
            { "field.year", "san" },
            { "field.month", "kalo" },
            { "field.week", "d\u0254g\u0254kun" },
            { "field.weekday", "don" },
            { "field.dayperiod", "s\u0254g\u0254ma/tile/wula/su" },
            { "field.hour", "l\u025br\u025b" },
            { "field.minute", "miniti" },
            { "field.second", "sekondi" },
            { "field.zone", "sigikun tilena" },
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
                    "d MMM, y",
                    "d/M/yyyy",
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
