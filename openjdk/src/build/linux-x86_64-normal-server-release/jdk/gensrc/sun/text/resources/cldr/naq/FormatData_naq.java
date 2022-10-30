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

package sun.text.resources.cldr.naq;

import java.util.ListResourceBundle;

public class FormatData_naq extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u01c3Khanni",
                    "\u01c3Khan\u01c0g\u00f4ab",
                    "\u01c0Khuu\u01c1kh\u00e2b",
                    "\u01c3H\u00f4a\u01c2khaib",
                    "\u01c3Khaits\u00e2b",
                    "Gama\u01c0aeb",
                    "\u01c2Khoesaob",
                    "Ao\u01c1khuum\u00fb\u01c1kh\u00e2b",
                    "Tara\u01c0khuum\u00fb\u01c1kh\u00e2b",
                    "\u01c2N\u00fb\u01c1n\u00e2iseb",
                    "\u01c0Hoo\u01c2gaeb",
                    "H\u00f4asore\u01c1kh\u00e2b",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "Jan",
                    "Feb",
                    "Mar",
                    "Apr",
                    "May",
                    "Jun",
                    "Jul",
                    "Aug",
                    "Sep",
                    "Oct",
                    "Nov",
                    "Dec",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "J",
                    "F",
                    "M",
                    "A",
                    "M",
                    "J",
                    "J",
                    "A",
                    "S",
                    "O",
                    "N",
                    "D",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "Sontaxtsees",
                    "Mantaxtsees",
                    "Denstaxtsees",
                    "Wunstaxtsees",
                    "Dondertaxtsees",
                    "Fraitaxtsees",
                    "Satertaxtsees",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "Son",
                    "Ma",
                    "De",
                    "Wu",
                    "Do",
                    "Fr",
                    "Sat",
                }
            },
            { "DayNarrows",
                new String[] {
                    "S",
                    "M",
                    "E",
                    "W",
                    "D",
                    "F",
                    "A",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1ro kwartals",
                    "2\u01c1\u00ee kwartals",
                    "3\u01c1\u00ee kwartals",
                    "4\u01c1\u00ee kwartals",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "KW1",
                    "KW2",
                    "KW3",
                    "KW4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "\u01c1goagas",
                    "\u01c3uias",
                }
            },
            { "long.Eras",
                new String[] {
                    "Xristub ai\u01c3\u00e2",
                    "Xristub khao\u01c3g\u00e2",
                }
            },
            { "Eras",
                new String[] {
                    "BC",
                    "AD",
                }
            },
            { "field.era", "\u01c1Ae\u01c3g\u00e2s" },
            { "field.year", "Kurib" },
            { "field.month", "\u01c1Kh\u00e2b" },
            { "field.week", "Wekheb" },
            { "field.weekday", "Wekheb tsees" },
            { "field.dayperiod", "\u01c1goas/\u01c3uis" },
            { "field.hour", "Iiri" },
            { "field.minute", "Haib" },
            { "field.second", "\u01c0G\u00e2ub" },
            { "field.zone", "\u01c1Aeb \u01c0harib" },
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
                    "\u00a4#,##0.00",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
