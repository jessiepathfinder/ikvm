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

package sun.text.resources.cldr.kab;

import java.util.ListResourceBundle;

public class FormatData_kab extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "Yennayer",
                    "Fu\u1e5bar",
                    "Me\u0263res",
                    "Yebrir",
                    "Mayyu",
                    "Yunyu",
                    "Yulyu",
                    "\u0194uct",
                    "Ctembe\u1e5b",
                    "Tube\u1e5b",
                    "Nunembe\u1e5b",
                    "Du\u01e7embe\u1e5b",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "Yen",
                    "Fur",
                    "Me\u0263",
                    "Yeb",
                    "May",
                    "Yun",
                    "Yul",
                    "\u0194uc",
                    "Cte",
                    "Tub",
                    "Nun",
                    "Du\u01e7",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "Y",
                    "F",
                    "M",
                    "Y",
                    "M",
                    "Y",
                    "Y",
                    "\u0194",
                    "C",
                    "T",
                    "N",
                    "D",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "Yanass",
                    "Sanass",
                    "Kra\u1e0dass",
                    "Ku\u1e93ass",
                    "Samass",
                    "S\u1e0disass",
                    "Sayass",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "Yan",
                    "San",
                    "Kra\u1e0d",
                    "Ku\u1e93",
                    "Sam",
                    "S\u1e0dis",
                    "Say",
                }
            },
            { "DayNarrows",
                new String[] {
                    "Y",
                    "S",
                    "K",
                    "K",
                    "S",
                    "S",
                    "S",
                }
            },
            { "QuarterNames",
                new String[] {
                    "akra\u1e0daggur amenzu",
                    "akra\u1e0daggur wis-sin",
                    "akra\u1e0daggur wis-kra\u1e0d",
                    "akra\u1e0daggur wis-ku\u1e93",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "K\u1e0dg1",
                    "K\u1e0dg2",
                    "K\u1e0dg3",
                    "K\u1e0dg4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "n tufat",
                    "n tmeddit",
                }
            },
            { "long.Eras",
                new String[] {
                    "send talalit n \u0190isa",
                    "seld talalit n \u0190isa",
                }
            },
            { "Eras",
                new String[] {
                    "snd. T.\u0190",
                    "sld. T.\u0190",
                }
            },
            { "field.era", "Tallit" },
            { "field.year", "Aseggas" },
            { "field.month", "Aggur" },
            { "field.week", "Ddurt" },
            { "field.weekday", "Ussan n ddurt" },
            { "field.dayperiod", "n tufat / n tmeddit" },
            { "field.hour", "Tamert" },
            { "field.minute", "Tamrect" },
            { "field.second", "Tasint" },
            { "field.zone", "Aseglem asergan" },
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
                    "#,##0.00\u00a4",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
