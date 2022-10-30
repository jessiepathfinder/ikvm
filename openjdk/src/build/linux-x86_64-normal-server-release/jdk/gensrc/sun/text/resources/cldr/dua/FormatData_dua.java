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

package sun.text.resources.cldr.dua;

import java.util.ListResourceBundle;

public class FormatData_dua extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "dim\u0254\u0301di",
                    "\u014bg\u0254nd\u025b",
                    "s\u0254\u014b\u025b",
                    "di\u0253\u00e1\u0253\u00e1",
                    "emiasele",
                    "es\u0254p\u025bs\u0254p\u025b",
                    "madi\u0253\u025b\u0301d\u00ed\u0253\u025b\u0301",
                    "di\u014bgindi",
                    "ny\u025bt\u025bki",
                    "may\u00e9s\u025b\u0301",
                    "tin\u00edn\u00ed",
                    "el\u00e1\u014bg\u025b\u0301",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "di",
                    "\u014bg\u0254n",
                    "s\u0254\u014b",
                    "di\u0253",
                    "emi",
                    "es\u0254",
                    "mad",
                    "di\u014b",
                    "ny\u025bt",
                    "may",
                    "tin",
                    "el\u00e1",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "d",
                    "\u014b",
                    "s",
                    "d",
                    "e",
                    "e",
                    "m",
                    "d",
                    "n",
                    "m",
                    "t",
                    "e",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u00e9ti",
                    "m\u0254\u0301s\u00fa",
                    "kwas\u00fa",
                    "muk\u0254\u0301s\u00fa",
                    "\u014bgis\u00fa",
                    "\u0257\u00f3n\u025bs\u00fa",
                    "esa\u0253as\u00fa",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u00e9t",
                    "m\u0254\u0301s",
                    "kwa",
                    "muk",
                    "\u014bgi",
                    "\u0257\u00f3n",
                    "esa",
                }
            },
            { "DayNarrows",
                new String[] {
                    "e",
                    "m",
                    "k",
                    "m",
                    "\u014b",
                    "\u0257",
                    "e",
                }
            },
            { "QuarterNames",
                new String[] {
                    "nd\u00famb\u016b ny\u00e1 \u0253os\u00f3",
                    "nd\u00famb\u016b n\u00ed l\u00f3nd\u025b\u0301 \u00ed\u0253a\u00e1",
                    "nd\u00famb\u016b n\u00ed l\u00f3nd\u025b\u0301 \u00edl\u00e1lo",
                    "nd\u00famb\u016b n\u00ed l\u00f3nd\u025b\u0301 \u00edn\u025b\u0301y",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "ndu1",
                    "ndu2",
                    "ndu3",
                    "ndu4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "idi\u0253a",
                    "eby\u00e1mu",
                }
            },
            { "long.Eras",
                new String[] {
                    "\u0253oso \u0253w\u00e1 y\u00e1\u0253e l\u00e1",
                    "mb\u00fasa kw\u00e9di a Y\u00e9s",
                }
            },
            { "Eras",
                new String[] {
                    "\u0253.Ys",
                    "mb.Ys",
                }
            },
            { "field.era", "p\u00f3nd\u00e1" },
            { "field.year", "mb\u00fa" },
            { "field.month", "m\u0254\u0301di" },
            { "field.week", "disama" },
            { "field.weekday", "m\u00edny\u00e1 m\u00e1 disama" },
            { "field.dayperiod", "epasi a b\u00fany\u00e1" },
            { "field.hour", "\u014bgand\u025b" },
            { "field.minute", "nd\u0254k\u0254" },
            { "field.second", "p\u00ednd\u00ed" },
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
                    "#,##0\u00a0%",
                }
            },
        };
        return data;
    }
}
