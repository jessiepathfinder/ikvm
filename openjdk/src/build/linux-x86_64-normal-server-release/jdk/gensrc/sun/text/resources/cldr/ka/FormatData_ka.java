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

package sun.text.resources.cldr.ka;

import java.util.ListResourceBundle;

public class FormatData_ka extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u10d8\u10d0\u10dc\u10d5\u10d0\u10e0\u10d8",
                    "\u10d7\u10d4\u10d1\u10d4\u10e0\u10d5\u10d0\u10da\u10d8",
                    "\u10db\u10d0\u10e0\u10e2\u10d8",
                    "\u10d0\u10de\u10e0\u10d8\u10da\u10d8",
                    "\u10db\u10d0\u10d8\u10e1\u10d8",
                    "\u10d8\u10d5\u10dc\u10d8\u10e1\u10d8",
                    "\u10d8\u10d5\u10da\u10d8\u10e1",
                    "\u10d0\u10d2\u10d5\u10d8\u10e1\u10e2\u10dd",
                    "\u10e1\u10d4\u10e5\u10e2\u10d4\u10db\u10d1\u10d4\u10e0\u10d8",
                    "\u10dd\u10e5\u10e2\u10dd\u10db\u10d1\u10d4\u10e0\u10d8",
                    "\u10dc\u10dd\u10d4\u10db\u10d1\u10d4\u10e0\u10d8",
                    "\u10d3\u10d4\u10d9\u10d4\u10db\u10d1\u10d4\u10e0\u10d8",
                    "",
                }
            },
            { "standalone.MonthNames",
                new String[] {
                    "",
                    "",
                    "",
                    "\u10d0\u10de\u10e0\u10d8\u10da\u10d8",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "\u10d8\u10d0\u10dc",
                    "\u10d7\u10d4\u10d1",
                    "\u10db\u10d0\u10e0",
                    "\u10d0\u10de\u10e0",
                    "\u10db\u10d0\u10d8",
                    "\u10d8\u10d5\u10dc",
                    "\u10d8\u10d5\u10da",
                    "\u10d0\u10d2\u10d5",
                    "\u10e1\u10d4\u10e5",
                    "\u10dd\u10e5\u10e2",
                    "\u10dc\u10dd\u10d4",
                    "\u10d3\u10d4\u10d9",
                    "",
                }
            },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "\u10d8\u10d0\u10dc",
                    "\u10d7\u10d4\u10d1",
                    "\u10db\u10d0\u10e0",
                    "\u10d0\u10de\u10e0",
                    "",
                    "\u10d8\u10d5\u10dc",
                    "\u10d8\u10d5\u10da",
                    "\u10d0\u10d2\u10d5",
                    "\u10e1\u10d4\u10e5",
                    "",
                    "\u10dc\u10dd\u10d4",
                    "\u10d3\u10d4\u10d9",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "\u10d8",
                    "\u10d7",
                    "\u10db",
                    "\u10d0",
                    "\u10db",
                    "\u10d8",
                    "7",
                    "\u10d0",
                    "\u10e1",
                    "\u10dd",
                    "\u10dc",
                    "\u10d3",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u10d9\u10d5\u10d8\u10e0\u10d0",
                    "2",
                    "\u10e1\u10d0\u10db\u10e8\u10d0\u10d1\u10d0\u10d7\u10d8",
                    "\u10dd\u10d7\u10ee\u10e8\u10d0\u10d1\u10d0\u10d7\u10d8",
                    "\u10ee\u10e3\u10d7\u10e8\u10d0\u10d1\u10d0\u10d7\u10d8",
                    "\u10de\u10d0\u10e0\u10d0\u10e1\u10d9\u10d4\u10d5\u10d8",
                    "\u10e8\u10d0\u10d1\u10d0\u10d7\u10d8",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "",
                    "\u10dd\u10e0\u10e8",
                    "\u10e1\u10d0\u10db",
                    "\u10dd\u10d7\u10ee",
                    "\u10ee\u10e3\u10d7",
                    "\u10de\u10d0\u10e0",
                    "\u10e8\u10d0\u10d1",
                }
            },
            { "DayNarrows",
                new String[] {
                    "\u10d9",
                    "2",
                    "\u10e1",
                    "4",
                    "\u10ee",
                    "6",
                    "\u10e8",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1-\u10da\u10d8 \u10d9\u10d5\u10d0\u10e0\u10e2\u10d0\u10da\u10d8",
                    "\u10db\u10d4-2 \u10d9\u10d5\u10d0\u10e0\u10e2\u10d0\u10da\u10d8",
                    "\u10db\u10d4-3 \u10d9\u10d5\u10d0\u10e0\u10e2\u10d0\u10da\u10d8",
                    "\u10db\u10d4-4 \u10d9\u10d5\u10d0\u10e0\u10e2\u10d0\u10da\u10d8",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "I \u10d9\u10d5.",
                    "II \u10d9\u10d5.",
                    "III \u10d9\u10d5.",
                    "IV \u10d9\u10d5.",
                }
            },
            { "Eras",
                new String[] {
                    "\u10e9\u10d5\u10d4\u10dc\u10e1 \u10ec\u10d4\u10da\u10d7\u10d0\u10e6\u10e0\u10d8\u10ea\u10ee\u10d5\u10d0\u10db\u10d3\u10d4",
                    "\u10e9\u10d5\u10d4\u10dc\u10d8 \u10ec\u10d4\u10da\u10d7\u10d0\u10e6\u10e0\u10d8\u10ea\u10ee\u10d5\u10d8\u10d7",
                }
            },
            { "field.era", "\u10d4\u10e0\u10d0" },
            { "field.year", "\u10ec\u10d4\u10da\u10d8" },
            { "field.month", "\u10d7\u10d5\u10d4" },
            { "field.week", "\u10d9\u10d5\u10d8\u10e0\u10d0" },
            { "field.weekday", "\u10d9\u10d5\u10d8\u10e0\u10d8\u10e1 \u10d3\u10e6\u10d4" },
            { "field.dayperiod", "AM/PM" },
            { "field.hour", "\u10e1\u10d0\u10d0\u10d7\u10d8" },
            { "field.minute", "\u10ec\u10e3\u10d7\u10d8" },
            { "field.second", "\u10ec\u10d0\u10db\u10d8" },
            { "field.zone", "\u10e1\u10d0\u10e1\u10d0\u10d0\u10d7\u10dd \u10e1\u10d0\u10e0\u10e2\u10e7\u10d4\u10da\u10d8" },
            { "calendarname.islamic", "\u10d8\u10e1\u10da\u10d0\u10db\u10e3\u10e0\u10d8 \u10d9\u10d0\u10da\u10d4\u10dc\u10d3\u10d0\u10e0\u10d8" },
            { "calendarname.buddhist", "\u10d1\u10e3\u10d3\u10d8\u10e1\u10e2\u10e3\u10e0\u10d8 \u10d9\u10d0\u10da\u10d4\u10dc\u10d3\u10d0\u10e0\u10d8" },
            { "calendarname.gregorian", "\u10d2\u10e0\u10d8\u10d2\u10dd\u10e0\u10d8\u10d0\u10dc\u10e3\u10da\u10d8 \u10d9\u10d0\u10da\u10d4\u10dc\u10d3\u10d0\u10e0\u10d8" },
            { "calendarname.gregory", "\u10d2\u10e0\u10d8\u10d2\u10dd\u10e0\u10d8\u10d0\u10dc\u10e3\u10da\u10d8 \u10d9\u10d0\u10da\u10d4\u10dc\u10d3\u10d0\u10e0\u10d8" },
            { "calendarname.islamic-civil", "\u10d8\u10e1\u10da\u10d0\u10db\u10e3\u10e0\u10d8 \u10e1\u10d0\u10db\u10dd\u10e5\u10d0\u10da\u10d0\u10e5\u10dd \u10d9\u10d0\u10da\u10d4\u10dc\u10d3\u10d0\u10e0\u10d8" },
            { "calendarname.islamicc", "\u10d8\u10e1\u10da\u10d0\u10db\u10e3\u10e0\u10d8 \u10e1\u10d0\u10db\u10dd\u10e5\u10d0\u10da\u10d0\u10e5\u10dd \u10d9\u10d0\u10da\u10d4\u10dc\u10d3\u10d0\u10e0\u10d8" },
            { "calendarname.roc", "\u10e9\u10d8\u10dc\u10d4\u10d7\u10d8\u10e1 \u10e0\u10d4\u10e1\u10de\u10e3\u10d1\u10da\u10d8\u10d9\u10d8\u10e1 \u10d9\u10d0\u10da\u10d4\u10dc\u10d3\u10d0\u10e0\u10d8" },
            { "calendarname.japanese", "\u10d8\u10d0\u10de\u10dd\u10dc\u10e3\u10e0\u10d8 \u10d9\u10d0\u10da\u10d4\u10dc\u10d3\u10d0\u10e0\u10d8" },
            { "DefaultNumberingSystem", "latn" },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    ".",
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
