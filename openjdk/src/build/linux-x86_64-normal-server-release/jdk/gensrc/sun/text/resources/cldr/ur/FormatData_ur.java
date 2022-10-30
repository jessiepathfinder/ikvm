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

package sun.text.resources.cldr.ur;

import java.util.ListResourceBundle;

public class FormatData_ur extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u062c\u0646\u0648\u0631\u06cc",
                    "\u0641\u0631\u0648\u0631\u06cc",
                    "\u0645\u0627\u0631\u0686",
                    "\u0627\u067e\u0631\u064a\u0644",
                    "\u0645\u0626",
                    "\u062c\u0648\u0646",
                    "\u062c\u0648\u0644\u0627\u0626",
                    "\u0627\u06af\u0633\u062a",
                    "\u0633\u062a\u0645\u0628\u0631",
                    "\u0627\u06a9\u062a\u0648\u0628\u0631",
                    "\u0646\u0648\u0645\u0628\u0631",
                    "\u062f\u0633\u0645\u0628\u0631",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u0627\u062a\u0648\u0627\u0631",
                    "\u067e\u064a\u0631",
                    "\u0645\u0646\u06af\u0644",
                    "\u0628\u062f\u0647",
                    "\u062c\u0645\u0639\u0631\u0627\u062a",
                    "\u062c\u0645\u0639\u06c1",
                    "\u06c1\u0641\u062a\u06c1",
                }
            },
            { "QuarterNames",
                new String[] {
                    "\u067e\u06c1\u0644\u06cc \u0633\u06c1 \u0645\u0627\u06c1\u06cc",
                    "\u062f\u0648\u0633\u0631\u06cc \u0633\u06c1 \u0645\u0627\u06c1\u06cc",
                    "\u062a\u064a\u0633\u0631\u06cc \u0633\u06c1 \u0645\u0627\u06c1\u06cc",
                    "\u0686\u0648\u062a\u0647\u06cc \u0633\u06c1 \u0645\u0627\u06c1\u06cc",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "\u062f\u0646",
                    "\u0631\u0627\u062a",
                }
            },
            { "long.Eras",
                new String[] {
                    "\u0642\u0628\u0644 \u0645\u0633\u064a\u062d",
                    "\u0639\u064a\u0633\u0648\u06cc \u0633\u0646",
                }
            },
            { "Eras",
                new String[] {
                    "\u0642 \u0645",
                    "\u0639\u064a\u0633\u0648\u06cc \u0633\u0646",
                }
            },
            { "field.era", "\u0639\u06c1\u062f" },
            { "field.year", "\u0633\u0627\u0644" },
            { "field.month", "\u0645\u06c1\u06cc\u0646\u06c1" },
            { "field.week", "\u06c1\u0641\u062a\u06c1" },
            { "field.weekday", "\u06c1\u0641\u062a\u06d2 \u06a9\u0627 \u062f\u0646" },
            { "field.dayperiod", "\u0631\u0627\u062a/\u0635\u0628\u062d" },
            { "field.hour", "\u06af\u06be\u0646\u0679\u06c1" },
            { "field.minute", "\u0645\u0646\u0679" },
            { "field.second", "\u0633\u06cc\u06a9\u0646\u0688" },
            { "field.zone", "\u0645\u0646\u0637\u0642\u06c2 \u0648\u0642\u062a" },
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
                    "EEEE\u060d d\u060d MMMM y",
                    "d\u060d MMMM y",
                    "d\u060d MMM y",
                    "d/M/yy",
                }
            },
            { "islamic.MonthNames",
                new String[] {
                    "\u0645\u062d\u0631\u0645",
                    "\u0635\u0641\u0631",
                    "\u0631 \u0628\u064a\u0639 \u0627\u0644\u0627\u0648\u0644",
                    "\u0631 \u0628\u064a\u0639 \u0627\u0644\u062b\u0627\u0646\u06cc",
                    "\u062c\u0645\u0627\u062f\u06cc \u0627\u0644\u0627\u0648\u0644",
                    "\u062c\u0645\u0627\u062f\u06cc \u0627\u0644\u062b\u0627\u0646\u06cc",
                    "\u0631\u062c\u0628",
                    "\u0634\u0639\u0628\u0627\u0646",
                    "\u0631\u0645\u0636\u0627\u0646",
                    "\u0634\u0648\u0627\u0644",
                    "Dhu\u02bbl-Qi\u02bbdah",
                    "Dhu\u02bbl-Hijjah",
                    "",
                }
            },
            { "calendarname.islamic", "\u0627\u0633\u0644\u0627\u0645\u06cc \u06a9\u06cc\u0644\u0646\u0688\u0631" },
            { "calendarname.buddhist", "\u0628\u0648\u062f\u06be \u06a9\u0644\u06cc\u0646\u0688\u0631" },
            { "calendarname.gregorian", "\u062c\u0627\u0631\u062c\u06cc\u0627\u0626\u06cc \u06a9\u06cc\u0644\u0646\u0688\u0631" },
            { "calendarname.gregory", "\u062c\u0627\u0631\u062c\u06cc\u0627\u0626\u06cc \u06a9\u06cc\u0644\u0646\u0688\u0631" },
            { "calendarname.islamic-civil", "\u0627\u0633\u0644\u0627\u0645\u06cc \u0634\u06c1\u0631\u06cc \u06a9\u06cc\u0644\u0646\u0688\u0631" },
            { "calendarname.islamicc", "\u0627\u0633\u0644\u0627\u0645\u06cc \u0634\u06c1\u0631\u06cc \u06a9\u06cc\u0644\u0646\u0688\u0631" },
            { "calendarname.roc", "\u0645\u0646\u06af\u0648\u0648 \u06a9\u06cc\u0644\u0646\u0688\u0631" },
            { "calendarname.japanese", "\u062c\u0627\u067e\u0627\u0646\u06cc \u06a9\u06cc\u0644\u0646\u0688\u0631" },
            { "DefaultNumberingSystem", "latn" },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
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
                    "\u00a4#,##0.00",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
