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

package sun.text.resources.cldr.be;

import java.util.ListResourceBundle;

public class FormatData_be extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u0441\u0442\u0443\u0434\u0437\u0435\u043d\u044c",
                    "\u043b\u044e\u0442\u044b",
                    "\u0441\u0430\u043a\u0430\u0432\u0456\u043a",
                    "\u043a\u0440\u0430\u0441\u0430\u0432\u0456\u043a",
                    "\u043c\u0430\u0439",
                    "\u0447\u044d\u0440\u0432\u0435\u043d\u044c",
                    "\u043b\u0456\u043f\u0435\u043d\u044c",
                    "\u0436\u043d\u0456\u0432\u0435\u043d\u044c",
                    "\u0432\u0435\u0440\u0430\u0441\u0435\u043d\u044c",
                    "\u043a\u0430\u0441\u0442\u0440\u044b\u0447\u043d\u0456\u043a",
                    "\u043b\u0456\u0441\u0442\u0430\u043f\u0430\u0434",
                    "\u0441\u043d\u0435\u0436\u0430\u043d\u044c",
                    "",
                }
            },
            { "standalone.MonthNames",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "\u0442\u0440\u0430\u0432\u0435\u043d\u044c",
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
                    "\u0441\u0442\u0443",
                    "\u043b\u044e\u0442",
                    "\u0441\u0430\u043a",
                    "\u043a\u0440\u0430",
                    "\u043c\u0430\u0439",
                    "\u0447\u044d\u0440",
                    "\u043b\u0456\u043f",
                    "\u0436\u043d\u0456",
                    "\u0432\u0435\u0440",
                    "\u043a\u0430\u0441",
                    "\u043b\u0456\u0441",
                    "\u0441\u043d\u0435",
                    "",
                }
            },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "\u0442\u0440\u0430",
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
            { "MonthNarrows",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "\u0442",
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
            { "standalone.MonthNarrows",
                new String[] {
                    "\u0441",
                    "\u043b",
                    "\u0441",
                    "\u043a",
                    "\u043c",
                    "\u0447",
                    "\u043b",
                    "\u0436",
                    "\u0432",
                    "\u043a",
                    "\u043b",
                    "\u0441",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u043d\u044f\u0434\u0437\u0435\u043b\u044f",
                    "\u043f\u0430\u043d\u044f\u0434\u0437\u0435\u043b\u0430\u043a",
                    "\u0430\u045e\u0442\u043e\u0440\u0430\u043a",
                    "\u0441\u0435\u0440\u0430\u0434\u0430",
                    "\u0447\u0430\u0446\u0432\u0435\u0440",
                    "\u043f\u044f\u0442\u043d\u0456\u0446\u0430",
                    "\u0441\u0443\u0431\u043e\u0442\u0430",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u043d\u0434",
                    "\u043f\u043d",
                    "\u0430\u045e",
                    "\u0441\u0440",
                    "\u0447\u0446",
                    "\u043f\u0442",
                    "\u0441\u0431",
                }
            },
            { "DayNarrows",
                new String[] {
                    "\u043d",
                    "\u043f",
                    "\u0430",
                    "\u0441",
                    "\u0447",
                    "\u043f",
                    "\u0441",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1-\u0448\u044b \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
                    "2-\u0433\u0456 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
                    "3-\u0446\u0456 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
                    "4-\u0442\u044b \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "1-\u0448\u044b \u043a\u0432.",
                    "2-\u0433\u0456 \u043a\u0432.",
                    "3-\u0446\u0456 \u043a\u0432.",
                    "4-\u0442\u044b \u043a\u0432.",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "\u0434\u0430 \u043f\u0430\u043b\u0443\u0434\u043d\u044f",
                    "\u043f\u0430\u0441\u043b\u044f \u043f\u0430\u043b\u0443\u0434\u043d\u044f",
                }
            },
            { "Eras",
                new String[] {
                    "\u0434\u0430 \u043d.\u044d.",
                    "\u043d.\u044d.",
                }
            },
            { "field.era", "\u044d\u0440\u0430" },
            { "field.year", "\u0433\u043e\u0434" },
            { "field.month", "\u043c\u0435\u0441\u044f\u0446" },
            { "field.week", "\u0442\u044b\u0434\u0437\u0435\u043d\u044c" },
            { "field.weekday", "\u0434\u0437\u0435\u043d\u044c \u0442\u044b\u0434\u043d\u044f" },
            { "field.dayperiod", "\u0414\u041f/\u041f\u041f" },
            { "field.hour", "\u0433\u0430\u0434\u0437\u0456\u043d\u0430" },
            { "field.minute", "\u0445\u0432\u0456\u043b\u0456\u043d\u0430" },
            { "field.second", "\u0441\u0435\u043a\u0443\u043d\u0434\u0430" },
            { "field.zone", "Zone" },
            { "TimePatterns",
                new String[] {
                    "HH.mm.ss zzzz",
                    "HH.mm.ss z",
                    "HH.mm.ss",
                    "HH.mm",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y",
                    "d MMMM y",
                    "d.M.yyyy",
                    "d.M.yy",
                }
            },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "d.M.yy",
                }
            },
            { "buddhist.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "d.M.yy",
                }
            },
            { "calendarname.islamic", "\u043c\u0443\u0441\u0443\u043b\u044c\u043c\u0430\u043d\u0441\u043a\u0456 \u043a\u0430\u043b\u044f\u043d\u0434\u0430\u0440" },
            { "calendarname.buddhist", "\u0431\u0443\u0434\u044b\u0441\u0446\u043a\u0456 \u043a\u0430\u043b\u044f\u043d\u0434\u0430\u0440" },
            { "calendarname.japanese", "\u044f\u043f\u043e\u043d\u0441\u043a\u0456 \u043a\u0430\u043b\u044f\u043d\u0434\u0430\u0440" },
            { "calendarname.gregorian", "\u0433\u0440\u044d\u0433\u0430\u0440\u044b\u044f\u043d\u0441\u043a\u0456 \u043a\u0430\u043b\u044f\u043d\u0434\u0430\u0440" },
            { "calendarname.gregory", "\u0433\u0440\u044d\u0433\u0430\u0440\u044b\u044f\u043d\u0441\u043a\u0456 \u043a\u0430\u043b\u044f\u043d\u0434\u0430\u0440" },
            { "calendarname.islamic-civil", "\u043c\u0443\u0441\u0443\u043b\u044c\u043c\u0430\u043d\u0441\u043a\u0456 \u0441\u0432\u0435\u0446\u043a\u0456 \u043a\u0430\u043b\u044f\u043d\u0434\u0430\u0440" },
            { "calendarname.islamicc", "\u043c\u0443\u0441\u0443\u043b\u044c\u043c\u0430\u043d\u0441\u043a\u0456 \u0441\u0432\u0435\u0446\u043a\u0456 \u043a\u0430\u043b\u044f\u043d\u0434\u0430\u0440" },
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
                    "\u00a4#,##0.00",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
