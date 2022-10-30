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

package sun.text.resources.cldr.nl;

import java.util.ListResourceBundle;

public class FormatData_nl extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "januari",
                    "februari",
                    "maart",
                    "april",
                    "mei",
                    "juni",
                    "juli",
                    "augustus",
                    "september",
                    "oktober",
                    "november",
                    "december",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "jan.",
                    "feb.",
                    "mrt.",
                    "apr.",
                    "mei",
                    "jun.",
                    "jul.",
                    "aug.",
                    "sep.",
                    "okt.",
                    "nov.",
                    "dec.",
                    "",
                }
            },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "jan",
                    "feb",
                    "mrt",
                    "apr",
                    "",
                    "jun",
                    "jul",
                    "aug",
                    "sep",
                    "okt",
                    "nov",
                    "dec",
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
                    "zondag",
                    "maandag",
                    "dinsdag",
                    "woensdag",
                    "donderdag",
                    "vrijdag",
                    "zaterdag",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "zo",
                    "ma",
                    "di",
                    "wo",
                    "do",
                    "vr",
                    "za",
                }
            },
            { "DayNarrows",
                new String[] {
                    "Z",
                    "M",
                    "D",
                    "W",
                    "D",
                    "V",
                    "Z",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1e kwartaal",
                    "2e kwartaal",
                    "3e kwartaal",
                    "4e kwartaal",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "K1",
                    "K2",
                    "K3",
                    "K4",
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
            { "long.Eras",
                new String[] {
                    "Voor Christus",
                    "na Christus",
                }
            },
            { "Eras",
                new String[] {
                    "v. Chr.",
                    "n. Chr.",
                }
            },
            { "field.era", "Tijdperk" },
            { "field.year", "Jaar" },
            { "field.month", "Maand" },
            { "field.week", "week" },
            { "field.weekday", "Dag van de week" },
            { "field.dayperiod", "AM/PM" },
            { "field.hour", "Uur" },
            { "field.minute", "Minuut" },
            { "field.second", "Seconde" },
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
                    "EEEE d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "dd-MM-yy",
                }
            },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "dd-MM-yy G",
                }
            },
            { "buddhist.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "dd-MM-yy GGGG",
                }
            },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "dd-MM-yy GGGGG",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "dd-MM-yy G",
                }
            },
            { "java.time.roc.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "dd-MM-yy GGGGG",
                }
            },
            { "roc.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "dd-MM-yy G",
                }
            },
            { "islamic.MonthNames",
                new String[] {
                    "Moeharram",
                    "Safar",
                    "Rabi\u02bba al awal",
                    "Rabi\u02bba al thani",
                    "Joemad\u02bbal awal",
                    "Joemad\u02bbal thani",
                    "Rajab",
                    "Sja\u02bbaban",
                    "Ramadan",
                    "Sjawal",
                    "Doe al ka\u02bbaba",
                    "Doe al hizja",
                    "",
                }
            },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "Moeh.",
                    "Saf.",
                    "Rab. I",
                    "Rab. II",
                    "Joem. I",
                    "Joem. II",
                    "Raj.",
                    "Sja.",
                    "Ram.",
                    "Sjaw.",
                    "Doe al k.",
                    "Doe al h.",
                    "",
                }
            },
            { "islamic.Eras",
                new String[] {
                    "",
                    "Sa\u02bbna Hizjria",
                }
            },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "dd-MM-yy G",
                }
            },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "dd-MM-yy GGGG",
                }
            },
            { "calendarname.islamic-civil", "Islamitische kalender (cyclisch)" },
            { "calendarname.islamicc", "Islamitische kalender (cyclisch)" },
            { "calendarname.roc", "Kalender van de Chinese Republiek" },
            { "calendarname.japanese", "Japanse kalender" },
            { "calendarname.islamic", "Islamitische kalender" },
            { "calendarname.buddhist", "Boeddhistische kalender" },
            { "calendarname.gregorian", "Gregoriaanse kalender" },
            { "calendarname.gregory", "Gregoriaanse kalender" },
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
                    "\u00a4\u00a0#,##0.00;\u00a4\u00a0#,##0.00-",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
