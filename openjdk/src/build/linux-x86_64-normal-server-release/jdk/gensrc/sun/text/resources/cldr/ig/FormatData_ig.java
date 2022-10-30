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

package sun.text.resources.cldr.ig;

import java.util.ListResourceBundle;

public class FormatData_ig extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "Jen\u1ee5war\u1ecb",
                    "Febr\u1ee5war\u1ecb",
                    "Maach\u1ecb",
                    "Eprel",
                    "Mee",
                    "Juun",
                    "Jula\u1ecb",
                    "\u1eccg\u1ecd\u1ecdst",
                    "Septemba",
                    "\u1eccktoba",
                    "Novemba",
                    "Disemba",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "Jen",
                    "Feb",
                    "Maa",
                    "Epr",
                    "Mee",
                    "Juu",
                    "Jul",
                    "\u1eccg\u1ecd",
                    "Sep",
                    "\u1ecckt",
                    "Nov",
                    "Dis",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "Mb\u1ecds\u1ecb \u1ee4ka",
                    "M\u1ecdnde",
                    "Tiuzdee",
                    "Wenezdee",
                    "T\u1ecd\u1ecdzdee",
                    "Fra\u1ecbdee",
                    "Sat\u1ecddee",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u1ee4ka",
                    "M\u1ecdn",
                    "Tiu",
                    "Wen",
                    "T\u1ecd\u1ecd",
                    "Fra\u1ecb",
                    "Sat",
                }
            },
            { "QuarterNames",
                new String[] {
                    "\u1ecckara 1",
                    "\u1ecckara 2",
                    "\u1ecckara 3",
                    "\u1ecckara 4",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "\u1ecc1",
                    "\u1ecc2",
                    "\u1ecc3",
                    "\u1ecc4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "A.M.",
                    "P.M.",
                }
            },
            { "long.Eras",
                new String[] {
                    "Tupu Kristi",
                    "Af\u1ecd Kristi",
                }
            },
            { "Eras",
                new String[] {
                    "T.K.",
                    "A.K.",
                }
            },
            { "field.era", "Agba" },
            { "field.year", "Af\u1ecd" },
            { "field.month", "\u1eccnwa" },
            { "field.week", "Izu" },
            { "field.weekday", "\u1ee4b\u1ecdch\u1ecb izu" },
            { "field.dayperiod", "N'\u1ee5t\u1ee5t\u1ee5/N'anyas\u1ecb" },
            { "field.hour", "Elekere" },
            { "field.minute", "Nkeji" },
            { "field.second", "Nkejinta" },
            { "field.zone", "Mpaghara oge" },
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
                    "dd/MM/yyyy",
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
