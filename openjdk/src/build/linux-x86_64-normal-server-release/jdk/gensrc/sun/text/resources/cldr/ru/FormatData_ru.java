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

package sun.text.resources.cldr.ru;

import java.util.ListResourceBundle;

public class FormatData_ru extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u044f\u043d\u0432\u0430\u0440\u044f",
                    "\u0444\u0435\u0432\u0440\u0430\u043b\u044f",
                    "\u043c\u0430\u0440\u0442\u0430",
                    "\u0430\u043f\u0440\u0435\u043b\u044f",
                    "\u043c\u0430\u044f",
                    "\u0438\u044e\u043d\u044f",
                    "\u0438\u044e\u043b\u044f",
                    "\u0430\u0432\u0433\u0443\u0441\u0442\u0430",
                    "\u0441\u0435\u043d\u0442\u044f\u0431\u0440\u044f",
                    "\u043e\u043a\u0442\u044f\u0431\u0440\u044f",
                    "\u043d\u043e\u044f\u0431\u0440\u044f",
                    "\u0434\u0435\u043a\u0430\u0431\u0440\u044f",
                    "",
                }
            },
            { "standalone.MonthNames",
                new String[] {
                    "\u042f\u043d\u0432\u0430\u0440\u044c",
                    "\u0424\u0435\u0432\u0440\u0430\u043b\u044c",
                    "\u041c\u0430\u0440\u0442",
                    "\u0410\u043f\u0440\u0435\u043b\u044c",
                    "\u041c\u0430\u0439",
                    "\u0418\u044e\u043d\u044c",
                    "\u0418\u044e\u043b\u044c",
                    "\u0410\u0432\u0433\u0443\u0441\u0442",
                    "\u0421\u0435\u043d\u0442\u044f\u0431\u0440\u044c",
                    "\u041e\u043a\u0442\u044f\u0431\u0440\u044c",
                    "\u041d\u043e\u044f\u0431\u0440\u044c",
                    "\u0414\u0435\u043a\u0430\u0431\u0440\u044c",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "\u044f\u043d\u0432.",
                    "\u0444\u0435\u0432\u0440.",
                    "\u043c\u0430\u0440\u0442\u0430",
                    "\u0430\u043f\u0440.",
                    "\u043c\u0430\u044f",
                    "\u0438\u044e\u043d\u044f",
                    "\u0438\u044e\u043b\u044f",
                    "\u0430\u0432\u0433.",
                    "\u0441\u0435\u043d\u0442.",
                    "\u043e\u043a\u0442.",
                    "\u043d\u043e\u044f\u0431.",
                    "\u0434\u0435\u043a.",
                    "",
                }
            },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "\u042f\u043d\u0432.",
                    "\u0424\u0435\u0432\u0440.",
                    "\u041c\u0430\u0440\u0442",
                    "\u0410\u043f\u0440.",
                    "\u041c\u0430\u0439",
                    "\u0418\u044e\u043d\u044c",
                    "\u0418\u044e\u043b\u044c",
                    "\u0410\u0432\u0433.",
                    "\u0421\u0435\u043d\u0442.",
                    "\u041e\u043a\u0442.",
                    "\u041d\u043e\u044f\u0431.",
                    "\u0414\u0435\u043a.",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "\u042f",
                    "\u0424",
                    "\u041c",
                    "\u0410",
                    "\u041c",
                    "\u0418",
                    "\u0418",
                    "\u0410",
                    "\u0421",
                    "\u041e",
                    "\u041d",
                    "\u0414",
                    "",
                }
            },
            { "standalone.MonthNarrows",
                new String[] {
                    "\u042f",
                    "\u0424",
                    "\u041c",
                    "\u0410",
                    "\u041c",
                    "\u0418",
                    "\u0418",
                    "\u0410",
                    "\u0421",
                    "\u041e",
                    "\u041d",
                    "\u0414",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u0432\u043e\u0441\u043a\u0440\u0435\u0441\u0435\u043d\u044c\u0435",
                    "\u043f\u043e\u043d\u0435\u0434\u0435\u043b\u044c\u043d\u0438\u043a",
                    "\u0432\u0442\u043e\u0440\u043d\u0438\u043a",
                    "\u0441\u0440\u0435\u0434\u0430",
                    "\u0447\u0435\u0442\u0432\u0435\u0440\u0433",
                    "\u043f\u044f\u0442\u043d\u0438\u0446\u0430",
                    "\u0441\u0443\u0431\u0431\u043e\u0442\u0430",
                }
            },
            { "standalone.DayNames",
                new String[] {
                    "\u0412\u043e\u0441\u043a\u0440\u0435\u0441\u0435\u043d\u044c\u0435",
                    "\u041f\u043e\u043d\u0435\u0434\u0435\u043b\u044c\u043d\u0438\u043a",
                    "\u0412\u0442\u043e\u0440\u043d\u0438\u043a",
                    "\u0421\u0440\u0435\u0434\u0430",
                    "\u0427\u0435\u0442\u0432\u0435\u0440\u0433",
                    "\u041f\u044f\u0442\u043d\u0438\u0446\u0430",
                    "\u0421\u0443\u0431\u0431\u043e\u0442\u0430",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u0432\u0441",
                    "\u043f\u043d",
                    "\u0432\u0442",
                    "\u0441\u0440",
                    "\u0447\u0442",
                    "\u043f\u0442",
                    "\u0441\u0431",
                }
            },
            { "standalone.DayAbbreviations",
                new String[] {
                    "\u0412\u0441",
                    "\u041f\u043d",
                    "\u0412\u0442",
                    "\u0421\u0440",
                    "\u0427\u0442",
                    "\u041f\u0442",
                    "\u0421\u0431",
                }
            },
            { "DayNarrows",
                new String[] {
                    "\u0412",
                    "\u041f\u043d",
                    "\u0412\u0442",
                    "\u0421",
                    "\u0427",
                    "\u041f",
                    "\u0421",
                }
            },
            { "standalone.DayNarrows",
                new String[] {
                    "\u0412",
                    "\u041f",
                    "\u0412",
                    "\u0421",
                    "\u0427",
                    "\u041f",
                    "\u0421",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1-\u0439 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
                    "2-\u0439 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
                    "3-\u0439 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
                    "4-\u0439 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "1-\u0439 \u043a\u0432.",
                    "2-\u0439 \u043a\u0432.",
                    "3-\u0439 \u043a\u0432.",
                    "4-\u0439 \u043a\u0432.",
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
                    "\u0434\u043e \u043f\u043e\u043b\u0443\u0434\u043d\u044f",
                    "\u043f\u043e\u0441\u043b\u0435 \u043f\u043e\u043b\u0443\u0434\u043d\u044f",
                }
            },
            { "narrow.AmPmMarkers",
                new String[] {
                    "\u0434\u043f",
                    "\u043f\u043f",
                }
            },
            { "long.Eras",
                new String[] {
                    "\u0434\u043e \u043d.\u044d.",
                    "\u043d.\u044d.",
                }
            },
            { "Eras",
                new String[] {
                    "\u0434\u043e \u043d.\u044d.",
                    "\u043d.\u044d.",
                }
            },
            { "narrow.Eras",
                new String[] {
                    "\u0434\u043e \u043d.\u044d.",
                    "\u043d.\u044d.",
                }
            },
            { "field.era", "\u042d\u0440\u0430" },
            { "field.year", "\u0413\u043e\u0434" },
            { "field.month", "\u041c\u0435\u0441\u044f\u0446" },
            { "field.week", "\u041d\u0435\u0434\u0435\u043b\u044f" },
            { "field.weekday", "\u0414\u0435\u043d\u044c \u043d\u0435\u0434\u0435\u043b\u0438" },
            { "field.dayperiod", "\u0414\u041f/\u041f\u041f" },
            { "field.hour", "\u0427\u0430\u0441" },
            { "field.minute", "\u041c\u0438\u043d\u0443\u0442\u0430" },
            { "field.second", "\u0421\u0435\u043a\u0443\u043d\u0434\u0430" },
            { "field.zone", "\u0427\u0430\u0441\u043e\u0432\u043e\u0439 \u043f\u043e\u044f\u0441" },
            { "TimePatterns",
                new String[] {
                    "H:mm:ss zzzz",
                    "H:mm:ss z",
                    "H:mm:ss",
                    "H:mm",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y\u00a0'\u0433'.",
                    "d MMMM y\u00a0'\u0433'.",
                    "dd.MM.yyyy",
                    "dd.MM.yy",
                }
            },
            { "DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                }
            },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y\u00a0'\u0433'. G",
                    "d MMMM y\u00a0'\u0433'. G",
                    "dd.MM.yyyy G",
                    "dd.MM.yy G",
                }
            },
            { "buddhist.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y\u00a0'\u0433'. GGGG",
                    "d MMMM y\u00a0'\u0433'. GGGG",
                    "dd.MM.yyyy GGGG",
                    "dd.MM.yy GGGG",
                }
            },
            { "japanese.Eras",
                new String[] {
                    "\u043d.\u044d.",
                    "\u042d\u043f\u043e\u0445\u0430 \u041c\u044d\u0439\u0434\u0437\u0438",
                    "\u042d\u043f\u043e\u0445\u0430 \u0422\u0430\u0439\u0441\u044c\u043e",
                    "\u0421\u044c\u043e\u0432\u0430",
                    "\u042d\u043f\u043e\u0445\u0430 \u0425\u044d\u0439\u0441\u044d\u0439",
                }
            },
            { "japanese.narrow.Eras",
                new String[] {
                    "\u043d.\u044d.",
                    "\u041c\u044d\u0439\u0434\u0437\u0438",
                    "\u0422\u0430\u0439\u0441\u044c\u043e",
                    "\u0421\u044c\u043e\u0432\u0430",
                    "\u0425\u044d\u0439\u0441\u044d\u0439",
                }
            },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y\u00a0'\u0433'. G",
                    "d MMMM y\u00a0'\u0433'. G",
                    "dd.MM.yyyy G",
                    "dd.MM.yy G",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y\u00a0'\u0433'. GGGG",
                    "d MMMM y\u00a0'\u0433'. GGGG",
                    "dd.MM.yyyy GGGG",
                    "dd.MM.yy GGGG",
                }
            },
            { "java.time.roc.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y\u00a0'\u0433'. G",
                    "d MMMM y\u00a0'\u0433'. G",
                    "dd.MM.yyyy G",
                    "dd.MM.yy G",
                }
            },
            { "roc.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y\u00a0'\u0433'. GGGG",
                    "d MMMM y\u00a0'\u0433'. GGGG",
                    "dd.MM.yyyy GGGG",
                    "dd.MM.yy GGGG",
                }
            },
            { "islamic.MonthNames",
                new String[] {
                    "\u041c\u0443\u0445\u0430\u0440\u0440\u0430\u043c",
                    "\u0421\u0430\u0444\u0430\u0440",
                    "\u0420\u0430\u0431\u0438-\u0443\u043b\u044c-\u0430\u0432\u0432\u0430\u043b\u044c",
                    "\u0420\u0430\u0431\u0438-\u0443\u043b\u044c-\u0430\u0445\u0438\u0440",
                    "\u0414\u0436\u0443\u043c\u0430\u0434-\u0443\u043b\u044c-\u0430\u0432\u0432\u0430\u043b\u044c",
                    "\u0414\u0436\u0443\u043c\u0430\u0434-\u0443\u043b\u044c-\u0430\u0445\u0438\u0440",
                    "\u0420\u0430\u0434\u0436\u0430\u0431",
                    "\u0428\u0430\u0430\u0431\u0430\u043d",
                    "\u0420\u0430\u043c\u0430\u0434\u0430\u043d",
                    "\u0428\u0430\u0432\u0432\u0430\u043b\u044c",
                    "\u0417\u0443\u043b\u044c-\u041a\u0430\u0430\u0434\u0430",
                    "\u0417\u0443\u043b\u044c-\u0425\u0438\u0434\u0436\u0436\u0430",
                    "",
                }
            },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "\u041c\u0443\u0445\u0430\u0440\u0440\u0430\u043c",
                    "\u0421\u0430\u0444\u0430\u0440",
                    "\u0420\u0430\u0431\u0438-\u0443\u043b\u044c-\u0430\u0432\u0432\u0430\u043b\u044c",
                    "\u0420\u0430\u0431\u0438-\u0443\u043b\u044c-\u0430\u0445\u0438\u0440",
                    "\u0414\u0436\u0443\u043c\u0430\u0434-\u0443\u043b\u044c-\u0430\u0432\u0432\u0430\u043b\u044c",
                    "\u0414\u0436\u0443\u043c\u0430\u0434-\u0443\u043b\u044c-\u0430\u0445\u0438\u0440",
                    "\u0420\u0430\u0434\u0436\u0430\u0431",
                    "\u0428\u0430\u0430\u0431\u0430\u043d",
                    "\u0420\u0430\u043c\u0430\u0434\u0430\u043d",
                    "\u0428\u0430\u0432\u0432\u0430\u043b\u044c",
                    "\u0417\u0443\u043b\u044c-\u041a\u0430\u0430\u0434\u0430",
                    "\u0417\u0443\u043b\u044c-\u0425\u0438\u0434\u0436\u0436\u0430",
                    "",
                }
            },
            { "islamic.MonthNarrows",
                new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "",
                }
            },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y\u00a0'\u0433'. G",
                    "d MMMM y\u00a0'\u0433'. G",
                    "dd.MM.yyyy G",
                    "dd.MM.yy G",
                }
            },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y\u00a0'\u0433'. GGGG",
                    "d MMMM y\u00a0'\u0433'. GGGG",
                    "dd.MM.yyyy GGGG",
                    "dd.MM.yy GGGG",
                }
            },
            { "calendarname.islamic-civil", "\u0418\u0441\u043b\u0430\u043c\u0441\u043a\u0438\u0439 \u0433\u0440\u0430\u0436\u0434\u0430\u043d\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "calendarname.islamicc", "\u0418\u0441\u043b\u0430\u043c\u0441\u043a\u0438\u0439 \u0433\u0440\u0430\u0436\u0434\u0430\u043d\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "calendarname.roc", "\u041a\u0438\u0442\u0430\u0439\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "calendarname.japanese", "\u042f\u043f\u043e\u043d\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "calendarname.islamic", "\u0418\u0441\u043b\u0430\u043c\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "calendarname.buddhist", "\u0411\u0443\u0434\u0434\u0438\u0439\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "calendarname.gregorian", "\u0413\u0440\u0438\u0433\u043e\u0440\u0438\u0430\u043d\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "calendarname.gregory", "\u0413\u0440\u0438\u0433\u043e\u0440\u0438\u0430\u043d\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
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
                    "\u043d\u0435 \u0447\u0438\u0441\u043b\u043e",
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
