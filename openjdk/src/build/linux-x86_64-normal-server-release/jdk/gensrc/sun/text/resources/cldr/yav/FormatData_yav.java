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

package sun.text.resources.cldr.yav;

import java.util.ListResourceBundle;

public class FormatData_yav extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "pik\u00edt\u00edk\u00edtie, o\u00f3l\u00ed \u00fa kut\u00faan",
                    "si\u025by\u025b\u0301, o\u00f3li \u00fa k\u00e1nd\u00ed\u025b",
                    "\u0254ns\u00famb\u0254l, o\u00f3li \u00fa k\u00e1t\u00e1t\u00fa\u025b",
                    "mesi\u014b, o\u00f3li \u00fa k\u00e9nie",
                    "ensil, o\u00f3li \u00fa k\u00e1t\u00e1nu\u025b",
                    "\u0254s\u0254n",
                    "efute",
                    "pisuy\u00fa",
                    "im\u025b\u014b i pu\u0254s",
                    "im\u025b\u014b i put\u00fak,o\u00f3li \u00fa k\u00e1t\u00ed\u025b",
                    "makandik\u025b",
                    "pil\u0254nd\u0254\u0301",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "o.1",
                    "o.2",
                    "o.3",
                    "o.4",
                    "o.5",
                    "o.6",
                    "o.7",
                    "o.8",
                    "o.9",
                    "o.10",
                    "o.11",
                    "o.12",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "s\u0254\u0301ndi\u025b",
                    "m\u00f3ndie",
                    "mu\u00e1ny\u00e1\u014bm\u00f3ndie",
                    "met\u00fakp\u00ed\u00e1p\u025b",
                    "k\u00fap\u00e9limet\u00fakpiap\u025b",
                    "fel\u00e9te",
                    "s\u00e9sel\u00e9",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "sd",
                    "md",
                    "mw",
                    "et",
                    "kl",
                    "fl",
                    "ss",
                }
            },
            { "DayNarrows",
                new String[] {
                    "s",
                    "m",
                    "m",
                    "e",
                    "k",
                    "f",
                    "s",
                }
            },
            { "QuarterNames",
                new String[] {
                    "nd\u00e1t\u00fa\u025b 1",
                    "nd\u00e1t\u00fa\u025b 2",
                    "nd\u00e1t\u00fa\u025b 3",
                    "nd\u00e1t\u00fa\u025b 4",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "Q1",
                    "Q2",
                    "Q3",
                    "Q4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "ki\u025bm\u025b\u0301\u025bm",
                    "kis\u025b\u0301nd\u025b",
                }
            },
            { "long.Eras",
                new String[] {
                    "katikup\u00eden Y\u00e9suse",
                    "\u00e9k\u00e9l\u00e9mk\u00fanup\u00ed\u00e9n n",
                }
            },
            { "Eras",
                new String[] {
                    "-J.C.",
                    "+J.C.",
                }
            },
            { "field.era", "kip\u00e9\u014b\u00e9n" },
            { "field.year", "y\u0254\u0254\u014b" },
            { "field.month", "o\u00f3li" },
            { "field.week", "s\u0254\u0301ndi\u025b" },
            { "field.weekday", "met\u00fak m\u0254\u0301s\u0254\u0301ndi\u025b" },
            { "field.dayperiod", "ki\u025bm\u025b\u0301\u025bm,kis\u025b\u0301nd\u025b" },
            { "field.hour", "kisik\u025bl," },
            { "field.minute", "min\u00edt" },
            { "field.second", "s\u00edk\u025bn" },
            { "field.zone", "kin\u00faki kisik\u025bl \u0254\u0301 pit\u0254\u014b" },
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
                    "#,##0.00\u00a0\u00a4;(#,##0.00\u00a0\u00a4)",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
