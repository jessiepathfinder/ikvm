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

package sun.text.resources.cldr.am;

import java.util.ListResourceBundle;

public class FormatData_am extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u1303\u1295\u12e9\u12c8\u122a",
                    "\u134c\u1265\u1229\u12c8\u122a",
                    "\u121b\u122d\u127d",
                    "\u12a4\u1355\u1228\u120d",
                    "\u121c\u12ed",
                    "\u1301\u1295",
                    "\u1301\u120b\u12ed",
                    "\u12a6\u1308\u1235\u1275",
                    "\u1234\u1355\u1274\u121d\u1260\u122d",
                    "\u12a6\u12ad\u1270\u12cd\u1260\u122d",
                    "\u1296\u126c\u121d\u1260\u122d",
                    "\u12f2\u1234\u121d\u1260\u122d",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "\u1303\u1295\u12e9",
                    "\u134c\u1265\u1229",
                    "\u121b\u122d\u127d",
                    "\u12a4\u1355\u1228",
                    "\u121c\u12ed",
                    "\u1301\u1295",
                    "\u1301\u120b\u12ed",
                    "\u12a6\u1308\u1235",
                    "\u1234\u1355\u1274",
                    "\u12a6\u12ad\u1270",
                    "\u1296\u126c\u121d",
                    "\u12f2\u1234\u121d",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "\u1303",
                    "\u134c",
                    "\u121b",
                    "\u12a4",
                    "\u121c",
                    "\u1301",
                    "\u1301",
                    "\u12a6",
                    "\u1234",
                    "\u12a6",
                    "\u1296",
                    "\u12f2",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u12a5\u1211\u12f5",
                    "\u1230\u129e",
                    "\u121b\u12ad\u1230\u129e",
                    "\u1228\u1261\u12d5",
                    "\u1210\u1219\u1235",
                    "\u12d3\u122d\u1265",
                    "\u1245\u12f3\u121c",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u12a5\u1211\u12f5",
                    "\u1230\u129e",
                    "\u121b\u12ad\u1230",
                    "\u1228\u1261\u12d5",
                    "\u1210\u1219\u1235",
                    "\u12d3\u122d\u1265",
                    "\u1245\u12f3\u121c",
                }
            },
            { "DayNarrows",
                new String[] {
                    "\u12a5",
                    "\u1230",
                    "\u121b",
                    "\u1228",
                    "\u1210",
                    "\u12d3",
                    "\u1245",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1\u129b\u12cd \u1229\u1265",
                    "\u1201\u1208\u1270\u129b\u12cd \u1229\u1265",
                    "3\u129b\u12cd \u1229\u1265",
                    "4\u129b\u12cd \u1229\u1265",
                }
            },
            { "standalone.QuarterNames",
                new String[] {
                    "1\u129b\u12cd \u1229\u1265",
                    "2\u129b\u12cd \u1229\u1265",
                    "3\u129b\u12cd \u1229\u1265",
                    "4\u129b\u12cd \u1229\u1265",
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
            { "standalone.QuarterAbbreviations",
                new String[] {
                    "Q1",
                    "Q2",
                    "Q3",
                    "Q4",
                }
            },
            { "QuarterNarrows",
                new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "\u1321\u12cb\u1275",
                    "\u12a8\u1233\u12d3\u1275",
                }
            },
            { "long.Eras",
                new String[] {
                    "\u12d3\u1218\u1270 \u12d3\u1208\u121d",
                    "\u12d3\u1218\u1270 \u121d\u1215\u1228\u1275",
                }
            },
            { "Eras",
                new String[] {
                    "\u12d3/\u12d3",
                    "\u12d3/\u121d",
                }
            },
            { "field.era", "\u12d8\u1218\u1295" },
            { "field.year", "\u12d3\u1218\u1275" },
            { "field.month", "\u12c8\u122d" },
            { "field.week", "\u1233\u121d\u1295\u1275" },
            { "field.weekday", "\u12a0\u12d8\u1266\u1275" },
            { "field.dayperiod", "\u1321\u12ce\u1275/\u12a8\u1230\u12a0\u1275" },
            { "field.hour", "\u1230\u12d3\u1275" },
            { "field.minute", "\u12f0\u1242\u1243" },
            { "field.second", "\u1230\u12a8\u1295\u12f5" },
            { "field.zone", "\u12e8\u1230\u12d3\u1275 \u1230\u1245" },
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
            { "calendarname.islamic", "\u12e8\u12a5\u1235\u120b\u121b\u12ca \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d" },
            { "calendarname.buddhist", "\u12e8\u1261\u12f2\u1235\u1275 \u1240\u1295 \u12a0\u1246\u1323\u1320\u122d" },
            { "calendarname.gregorian", "\u12e8\u130d\u122a\u130e\u122a\u12eb\u1295 \u1240\u1295 \u12a0\u1246\u1323\u1320\u122d" },
            { "calendarname.gregory", "\u12e8\u130d\u122a\u130e\u122a\u12eb\u1295 \u1240\u1295 \u12a0\u1246\u1323\u1320\u122d" },
            { "calendarname.islamic-civil", "\u12e8\u12a5\u1235\u120b\u121d \u1205\u12dd\u1263\u12ca \u12e8\u1240\u1295 \u12a0\u1246\u1323\u1320\u122d" },
            { "calendarname.islamicc", "\u12e8\u12a5\u1235\u120b\u121d \u1205\u12dd\u1263\u12ca \u12e8\u1240\u1295 \u12a0\u1246\u1323\u1320\u122d" },
            { "calendarname.roc", "\u12e8\u121a\u1295\u1309 \u12e8\u1240\u1295 \u12a0\u1246\u1323\u1320\u122d" },
            { "calendarname.japanese", "\u12e8\u1303\u1353\u1295 \u12e8\u1240\u1295 \u12a0\u1246\u1323\u1320\u122d" },
            { "DefaultNumberingSystem", "latn" },
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
