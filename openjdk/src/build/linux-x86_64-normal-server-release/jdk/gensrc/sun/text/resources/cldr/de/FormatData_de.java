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

package sun.text.resources.cldr.de;

import java.util.ListResourceBundle;

public class FormatData_de extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "Januar",
                    "Februar",
                    "M\u00e4rz",
                    "April",
                    "Mai",
                    "Juni",
                    "Juli",
                    "August",
                    "September",
                    "Oktober",
                    "November",
                    "Dezember",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "Jan",
                    "Feb",
                    "M\u00e4r",
                    "Apr",
                    "Mai",
                    "Jun",
                    "Jul",
                    "Aug",
                    "Sep",
                    "Okt",
                    "Nov",
                    "Dez",
                    "",
                }
            },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "Jan",
                    "Feb",
                    "M\u00e4r",
                    "Apr",
                    "Mai",
                    "Jun",
                    "Jul",
                    "Aug",
                    "Sep",
                    "Okt",
                    "Nov",
                    "Dez",
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
                    "Sonntag",
                    "Montag",
                    "Dienstag",
                    "Mittwoch",
                    "Donnerstag",
                    "Freitag",
                    "Samstag",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "So.",
                    "Mo.",
                    "Di.",
                    "Mi.",
                    "Do.",
                    "Fr.",
                    "Sa.",
                }
            },
            { "standalone.DayAbbreviations",
                new String[] {
                    "So",
                    "Mo",
                    "Di",
                    "Mi",
                    "Do",
                    "Fr",
                    "Sa",
                }
            },
            { "DayNarrows",
                new String[] {
                    "S",
                    "M",
                    "D",
                    "M",
                    "D",
                    "F",
                    "S",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1. Quartal",
                    "2. Quartal",
                    "3. Quartal",
                    "4. Quartal",
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
                    "vorm.",
                    "nachm.",
                }
            },
            { "long.Eras",
                new String[] {
                    "v. Chr.",
                    "n. Chr.",
                }
            },
            { "Eras",
                new String[] {
                    "v. Chr.",
                    "n. Chr.",
                }
            },
            { "field.era", "Epoche" },
            { "field.year", "Jahr" },
            { "field.month", "Monat" },
            { "field.week", "Woche" },
            { "field.weekday", "Wochentag" },
            { "field.dayperiod", "Tagesh\u00e4lfte" },
            { "field.hour", "Stunde" },
            { "field.minute", "Minute" },
            { "field.second", "Sekunde" },
            { "field.zone", "Zone" },
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
                    "EEEE, d. MMMM y",
                    "d. MMMM y",
                    "dd.MM.yyyy",
                    "dd.MM.yy",
                }
            },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "EEEE d. MMMM y G",
                    "d. MMMM y G",
                    "d. MMM y G",
                    "d.M.yyyy",
                }
            },
            { "buddhist.DatePatterns",
                new String[] {
                    "EEEE d. MMMM y GGGG",
                    "d. MMMM y GGGG",
                    "d. MMM y GGGG",
                    "d.M.yyyy",
                }
            },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE d. MMMM y G",
                    "d. MMMM y G",
                    "d. MMM y G",
                    "d.M.y GGGGG",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE d. MMMM y GGGG",
                    "d. MMMM y GGGG",
                    "d. MMM y GGGG",
                    "d.M.y G",
                }
            },
            { "java.time.roc.DatePatterns",
                new String[] {
                    "EEEE d. MMMM y G",
                    "d. MMMM y G",
                    "d. MMM y G",
                    "d.M.y GGGGG",
                }
            },
            { "roc.DatePatterns",
                new String[] {
                    "EEEE d. MMMM y GGGG",
                    "d. MMMM y GGGG",
                    "d. MMM y GGGG",
                    "d.M.y G",
                }
            },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE d. MMMM y G",
                    "d. MMMM y G",
                    "d. MMM y G",
                    "d.M.y G",
                }
            },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE d. MMMM y GGGG",
                    "d. MMMM y GGGG",
                    "d. MMM y GGGG",
                    "d.M.y GGGG",
                }
            },
            { "calendarname.islamic", "Islamischer Kalender" },
            { "calendarname.buddhist", "Buddhistischer Kalender" },
            { "calendarname.gregorian", "Gregorianischer Kalender" },
            { "calendarname.gregory", "Gregorianischer Kalender" },
            { "calendarname.islamic-civil", "B\u00fcrgerlicher islamischer Kalender" },
            { "calendarname.islamicc", "B\u00fcrgerlicher islamischer Kalender" },
            { "calendarname.roc", "Kalender der Republik China" },
            { "calendarname.japanese", "Japanischer Kalender" },
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
