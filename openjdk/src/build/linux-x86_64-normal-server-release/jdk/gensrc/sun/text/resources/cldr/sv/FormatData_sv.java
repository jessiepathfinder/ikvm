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

package sun.text.resources.cldr.sv;

import java.util.ListResourceBundle;

public class FormatData_sv extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "januari",
                    "februari",
                    "mars",
                    "april",
                    "maj",
                    "juni",
                    "juli",
                    "augusti",
                    "september",
                    "oktober",
                    "november",
                    "december",
                    "",
                }
            },
            { "standalone.MonthNames",
                new String[] {
                    "januari",
                    "februari",
                    "mars",
                    "april",
                    "maj",
                    "juni",
                    "juli",
                    "augusti",
                    "september",
                    "oktober",
                    "",
                    "",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "jan",
                    "feb",
                    "mar",
                    "apr",
                    "maj",
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
            { "standalone.MonthAbbreviations",
                new String[] {
                    "jan",
                    "feb",
                    "mar",
                    "apr",
                    "maj",
                    "jun",
                    "jul",
                    "aug",
                    "sep",
                    "okt",
                    "nov",
                    "",
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
            { "standalone.MonthNarrows",
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
                    "s\u00f6ndag",
                    "m\u00e5ndag",
                    "tisdag",
                    "onsdag",
                    "torsdag",
                    "fredag",
                    "l\u00f6rdag",
                }
            },
            { "standalone.DayNames",
                new String[] {
                    "s\u00f6ndag",
                    "m\u00e5ndag",
                    "tisdag",
                    "onsdag",
                    "torsdag",
                    "fredag",
                    "l\u00f6rdag",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "s\u00f6n",
                    "m\u00e5n",
                    "tis",
                    "ons",
                    "tors",
                    "fre",
                    "l\u00f6r",
                }
            },
            { "standalone.DayAbbreviations",
                new String[] {
                    "s\u00f6n",
                    "m\u00e5n",
                    "tis",
                    "ons",
                    "tor",
                    "fre",
                    "l\u00f6r",
                }
            },
            { "DayNarrows",
                new String[] {
                    "S",
                    "M",
                    "T",
                    "O",
                    "T",
                    "F",
                    "L",
                }
            },
            { "standalone.DayNarrows",
                new String[] {
                    "S",
                    "M",
                    "T",
                    "O",
                    "T",
                    "F",
                    "L",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1:a kvartalet",
                    "2:a kvartalet",
                    "3:e kvartalet",
                    "4:e kvartalet",
                }
            },
            { "standalone.QuarterNames",
                new String[] {
                    "1:a kvartalet",
                    "2:a kvartalet",
                    "3:e kvartalet",
                    "4:e kvartalet",
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
            { "standalone.QuarterAbbreviations",
                new String[] {
                    "K1",
                    "K2",
                    "K3",
                    "K4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "fm",
                    "em",
                }
            },
            { "narrow.AmPmMarkers",
                new String[] {
                    "f",
                    "e",
                }
            },
            { "long.Eras",
                new String[] {
                    "f\u00f6re Kristus",
                    "efter Kristus",
                }
            },
            { "Eras",
                new String[] {
                    "f.Kr.",
                    "e.Kr.",
                }
            },
            { "narrow.Eras",
                new String[] {
                    "f.Kr.",
                    "e.Kr.",
                }
            },
            { "field.era", "era" },
            { "field.year", "\u00e5r" },
            { "field.month", "m\u00e5nad" },
            { "field.week", "vecka" },
            { "field.weekday", "veckodag" },
            { "field.dayperiod", "fm/em" },
            { "field.hour", "timme" },
            { "field.minute", "minut" },
            { "field.second", "sekund" },
            { "field.zone", "tidszon" },
            { "TimePatterns",
                new String[] {
                    "'kl'. HH:mm:ss zzzz",
                    "HH:mm:ss z",
                    "HH:mm:ss",
                    "HH:mm",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE'en' 'den' d:'e' MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "yyyy-MM-dd",
                }
            },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "G yyyy-MM-dd",
                }
            },
            { "buddhist.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "GGGG yyyy-MM-dd",
                }
            },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "G y-MM-dd",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "GGGG y-MM-dd",
                }
            },
            { "roc.Eras",
                new String[] {
                    "f\u00f6re R.K.",
                    "R.K.",
                }
            },
            { "java.time.roc.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "G y-MM-dd",
                }
            },
            { "roc.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "GGGG y-MM-dd",
                }
            },
            { "islamic.MonthNames",
                new String[] {
                    "muharram",
                    "safar",
                    "rabi\u2019 al-awwal",
                    "rabi\u2019 al-akhir",
                    "jumada-l-ula",
                    "jumada-l-akhira",
                    "rajab",
                    "sha\u2019ban",
                    "ramadan",
                    "shawwal",
                    "dhu-l-ga\u2019da",
                    "dhu-l-hijja",
                    "",
                }
            },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "G y-MM-dd",
                }
            },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "GGGG y-MM-dd",
                }
            },
            { "calendarname.islamic-civil", "islamisk civil kalender" },
            { "calendarname.islamicc", "islamisk civil kalender" },
            { "calendarname.roc", "kinesiska republikens kalender" },
            { "calendarname.japanese", "japansk kalender" },
            { "calendarname.islamic", "islamisk kalender" },
            { "calendarname.buddhist", "buddistisk kalender" },
            { "calendarname.gregorian", "gregoriansk kalender" },
            { "calendarname.gregory", "gregoriansk kalender" },
            { "DefaultNumberingSystem", "latn" },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    "\u00a0",
                    ";",
                    "%",
                    "0",
                    "#",
                    "\u2212",
                    "\u00d710^",
                    "\u2030",
                    "\u221e",
                    "\u00a4\u00a4\u00a4",
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
