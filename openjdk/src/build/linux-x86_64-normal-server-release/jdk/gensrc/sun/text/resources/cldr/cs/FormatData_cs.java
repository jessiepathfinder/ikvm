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

package sun.text.resources.cldr.cs;

import java.util.ListResourceBundle;

public class FormatData_cs extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "ledna",
                    "\u00fanora",
                    "b\u0159ezna",
                    "dubna",
                    "kv\u011btna",
                    "\u010dervna",
                    "\u010dervence",
                    "srpna",
                    "z\u00e1\u0159\u00ed",
                    "\u0159\u00edjna",
                    "listopadu",
                    "prosince",
                    "",
                }
            },
            { "standalone.MonthNames",
                new String[] {
                    "leden",
                    "\u00fanor",
                    "b\u0159ezen",
                    "duben",
                    "kv\u011bten",
                    "\u010derven",
                    "\u010dervenec",
                    "srpen",
                    "z\u00e1\u0159\u00ed",
                    "\u0159\u00edjen",
                    "listopad",
                    "prosinec",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "Led",
                    "\u00dano",
                    "B\u0159e",
                    "Dub",
                    "Kv\u011b",
                    "\u010cer",
                    "\u010cvc",
                    "Srp",
                    "Z\u00e1\u0159",
                    "\u0158\u00edj",
                    "Lis",
                    "Pro",
                    "",
                }
            },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "1.",
                    "2.",
                    "3.",
                    "4.",
                    "5.",
                    "6.",
                    "7.",
                    "8.",
                    "9.",
                    "10.",
                    "11.",
                    "12.",
                    "",
                }
            },
            { "MonthNarrows",
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
            { "standalone.MonthNarrows",
                new String[] {
                    "l",
                    "\u00fa",
                    "b",
                    "d",
                    "k",
                    "\u010d",
                    "\u010d",
                    "s",
                    "z",
                    "\u0159",
                    "l",
                    "p",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "ned\u011ble",
                    "pond\u011bl\u00ed",
                    "\u00fater\u00fd",
                    "st\u0159eda",
                    "\u010dtvrtek",
                    "p\u00e1tek",
                    "sobota",
                }
            },
            { "standalone.DayNames",
                new String[] {
                    "ned\u011ble",
                    "pond\u011bl\u00ed",
                    "\u00fater\u00fd",
                    "st\u0159eda",
                    "\u010dtvrtek",
                    "p\u00e1tek",
                    "sobota",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "ne",
                    "po",
                    "\u00fat",
                    "st",
                    "\u010dt",
                    "p\u00e1",
                    "so",
                }
            },
            { "standalone.DayAbbreviations",
                new String[] {
                    "ne",
                    "po",
                    "\u00fat",
                    "st",
                    "\u010dt",
                    "p\u00e1",
                    "so",
                }
            },
            { "DayNarrows",
                new String[] {
                    "N",
                    "P",
                    "\u00da",
                    "S",
                    "\u010c",
                    "P",
                    "S",
                }
            },
            { "standalone.DayNarrows",
                new String[] {
                    "N",
                    "P",
                    "\u00da",
                    "S",
                    "\u010c",
                    "P",
                    "S",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1. \u010dtvrtlet\u00ed",
                    "2. \u010dtvrtlet\u00ed",
                    "3. \u010dtvrtlet\u00ed",
                    "4. \u010dtvrtlet\u00ed",
                }
            },
            { "standalone.QuarterNames",
                new String[] {
                    "1. \u010dtvrtlet\u00ed",
                    "2. \u010dtvrtlet\u00ed",
                    "3. \u010dtvrtlet\u00ed",
                    "4. \u010dtvrtlet\u00ed",
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
                    "dop.",
                    "odp.",
                }
            },
            { "long.Eras",
                new String[] {
                    "p\u0159. n. l.",
                    "n. l.",
                }
            },
            { "Eras",
                new String[] {
                    "p\u0159. n. l.",
                    "n. l.",
                }
            },
            { "narrow.Eras",
                new String[] {
                    "p\u0159.n.l.",
                    "n. l.",
                }
            },
            { "field.era", "Letopo\u010det" },
            { "field.year", "Rok" },
            { "field.month", "M\u011bs\u00edc" },
            { "field.week", "T\u00fdden" },
            { "field.weekday", "Den v t\u00fddnu" },
            { "field.dayperiod", "AM/PM" },
            { "field.hour", "Hodina" },
            { "field.minute", "Minuta" },
            { "field.second", "Sekunda" },
            { "field.zone", "\u010casov\u00e9 p\u00e1smo" },
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
                    "EEEE, d. MMMM y",
                    "d. MMMM y",
                    "d. M. yyyy",
                    "dd.MM.yy",
                }
            },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "EEEE, d. MMMM y G",
                    "d. MMMM y G",
                    "d. M. y G",
                    "dd.MM.yy GGGGG",
                }
            },
            { "buddhist.DatePatterns",
                new String[] {
                    "EEEE, d. MMMM y GGGG",
                    "d. MMMM y GGGG",
                    "d. M. y GGGG",
                    "dd.MM.yy G",
                }
            },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE d. MMMM y G",
                    "d. MMMM y G",
                    "d. M. y G",
                    "dd.MM.yy GGGGG",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE d. MMMM y GGGG",
                    "d. MMMM y GGGG",
                    "d. M. y GGGG",
                    "dd.MM.yy G",
                }
            },
            { "roc.Eras",
                new String[] {
                    "P\u0159ed R. O. C.",
                    "",
                }
            },
            { "java.time.roc.DatePatterns",
                new String[] {
                    "EEEE, d. MMMM y G",
                    "d. MMMM y G",
                    "d. M. y G",
                    "dd.MM.yy GGGGG",
                }
            },
            { "roc.DatePatterns",
                new String[] {
                    "EEEE, d. MMMM y GGGG",
                    "d. MMMM y GGGG",
                    "d. M. y GGGG",
                    "dd.MM.yy G",
                }
            },
            { "calendarname.islamic-civil", "Muslimsk\u00fd ob\u010dansk\u00fd kalend\u00e1\u0159" },
            { "calendarname.islamicc", "Muslimsk\u00fd ob\u010dansk\u00fd kalend\u00e1\u0159" },
            { "calendarname.roc", "Kalend\u00e1\u0159 \u010c\u00ednsk\u00e9 republiky" },
            { "calendarname.japanese", "Japonsk\u00fd kalend\u00e1\u0159" },
            { "calendarname.islamic", "Muslimsk\u00fd kalend\u00e1\u0159" },
            { "calendarname.buddhist", "Buddhistick\u00fd kalend\u00e1\u0159" },
            { "calendarname.gregorian", "Gregori\u00e1nsk\u00fd kalend\u00e1\u0159" },
            { "calendarname.gregory", "Gregori\u00e1nsk\u00fd kalend\u00e1\u0159" },
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
                    "#,##0.00\u00a0\u00a4",
                    "#,##0\u00a0%",
                }
            },
        };
        return data;
    }
}
