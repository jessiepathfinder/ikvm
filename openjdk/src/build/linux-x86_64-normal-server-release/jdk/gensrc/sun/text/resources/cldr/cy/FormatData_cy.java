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

package sun.text.resources.cldr.cy;

import java.util.ListResourceBundle;

public class FormatData_cy extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "Ionawr",
                    "Chwefror",
                    "Mawrth",
                    "Ebrill",
                    "Mai",
                    "Mehefin",
                    "Gorffenaf",
                    "Awst",
                    "Medi",
                    "Hydref",
                    "Tachwedd",
                    "Rhagfyr",
                    "",
                }
            },
            { "standalone.MonthNames",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "Gorffennaf",
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
                    "Ion",
                    "Chwef",
                    "Mawrth",
                    "Ebrill",
                    "Mai",
                    "Meh",
                    "Gorff",
                    "Awst",
                    "Medi",
                    "Hyd",
                    "Tach",
                    "Rhag",
                    "",
                }
            },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "",
                    "Chwe",
                    "Maw",
                    "Ebr",
                    "",
                    "",
                    "Gor",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "I",
                    "C",
                    "M",
                    "E",
                    "M",
                    "M",
                    "G",
                    "A",
                    "M",
                    "H",
                    "T",
                    "R",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "Dydd Sul",
                    "Dydd Llun",
                    "Dydd Mawrth",
                    "Dydd Mercher",
                    "Dydd Iau",
                    "Dydd Gwener",
                    "Dydd Sadwrn",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "Sul",
                    "Llun",
                    "Maw",
                    "Mer",
                    "Iau",
                    "Gwen",
                    "Sad",
                }
            },
            { "standalone.DayAbbreviations",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "Gwe",
                    "",
                }
            },
            { "DayNarrows",
                new String[] {
                    "S",
                    "L",
                    "M",
                    "M",
                    "I",
                    "G",
                    "S",
                }
            },
            { "QuarterNames",
                new String[] {
                    "Chwarter 1af",
                    "2il chwarter",
                    "3ydd chwarter",
                    "4ydd chwarter",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "Ch1",
                    "Ch2",
                    "Ch3",
                    "Ch4",
                }
            },
            { "long.Eras",
                new String[] {
                    "Cyn Crist",
                    "Oed Crist",
                }
            },
            { "Eras",
                new String[] {
                    "CC",
                    "OC",
                }
            },
            { "narrow.Eras",
                new String[] {
                    "C",
                    "O",
                }
            },
            { "field.era", "Oes" },
            { "field.year", "Blwyddyn" },
            { "field.month", "Mis" },
            { "field.week", "Wythnos" },
            { "field.weekday", "Dydd o'r Wythnos" },
            { "field.dayperiod", "AM/PM" },
            { "field.hour", "Awr" },
            { "field.minute", "Munud" },
            { "field.second", "Eiliad" },
            { "field.zone", "Cylchfa" },
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
                    "EEEE, d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "dd/MM/yyyy",
                }
            },
        };
        return data;
    }
}
