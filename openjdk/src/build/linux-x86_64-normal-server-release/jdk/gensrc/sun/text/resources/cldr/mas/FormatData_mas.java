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

package sun.text.resources.cldr.mas;

import java.util.ListResourceBundle;

public class FormatData_mas extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "Oladal\u0289\u0301",
                    "Ar\u00e1t",
                    "\u0186\u025bn\u0268\u0301\u0254\u0268\u014b\u0254k",
                    "Olodoy\u00ed\u00f3r\u00ed\u00ea ink\u00f3k\u00fa\u00e2",
                    "Oloil\u00e9p\u016bny\u012b\u0113 ink\u00f3k\u00fa\u00e2",
                    "K\u00faj\u00fa\u0254r\u0254k",
                    "M\u00f3rus\u00e1sin",
                    "\u0186l\u0254\u0301\u0268\u0301b\u0254\u0301r\u00e1r\u025b",
                    "K\u00fash\u00een",
                    "Olg\u00edsan",
                    "P\u0289sh\u0289\u0301ka",
                    "Nt\u0289\u0301\u014b\u0289\u0301s",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "Dal",
                    "Ar\u00e1",
                    "\u0186\u025bn",
                    "Doy",
                    "L\u00e9p",
                    "Rok",
                    "S\u00e1s",
                    "B\u0254\u0301r",
                    "K\u00fas",
                    "G\u00eds",
                    "Sh\u0289\u0301",
                    "Nt\u0289\u0301",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "Jumap\u00edl\u00ed",
                    "Jumat\u00e1tu",
                    "Jumane",
                    "Jumat\u00e1n\u0254",
                    "Ala\u00e1misi",
                    "Jum\u00e1a",
                    "Jumam\u00f3si",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "Jpi",
                    "Jtt",
                    "Jnn",
                    "Jtn",
                    "Alh",
                    "Iju",
                    "Jmo",
                }
            },
            { "DayNarrows",
                new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "1",
                }
            },
            { "QuarterNames",
                new String[] {
                    "Erobo 1",
                    "Erobo 2",
                    "Erobo 3",
                    "Erobo 4",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "E1",
                    "E2",
                    "E3",
                    "E4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "\u0190nkak\u025bny\u00e1",
                    "\u0190nd\u00e1m\u00e2",
                }
            },
            { "long.Eras",
                new String[] {
                    "Me\u00edn\u014d Y\u025b\u0301s\u0289",
                    "E\u00edn\u014d Y\u025b\u0301s\u0289",
                }
            },
            { "Eras",
                new String[] {
                    "MY",
                    "EY",
                }
            },
            { "field.era", "\u0190nk\u00e1t\u00e1" },
            { "field.year", "\u0186l\u00e1r\u00ec" },
            { "field.month", "\u0186l\u00e1p\u00e0" },
            { "field.week", "Ew\u00edk\u00ee" },
            { "field.weekday", "\u0190nk\u0254\u0301l\u0254\u014b ew\u00edk\u00ee" },
            { "field.dayperiod", "\u0190nkak\u025bny\u00e1/\u0190nd\u00e1m\u00e2" },
            { "field.hour", "\u0190\u0301s\u00e1\u00e2" },
            { "field.minute", "Old\u00e1kika\u00e8" },
            { "field.second", "Sekunde" },
            { "field.zone", "\u0190\u0301s\u00e1\u00e2 o inkuap\u00ed" },
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
