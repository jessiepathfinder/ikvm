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

package sun.text.resources.cldr.ca;

import java.util.ListResourceBundle;

public class FormatData_ca extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "de gener",
                    "de febrer",
                    "de mar\u00e7",
                    "d\u2019abril",
                    "de maig",
                    "de juny",
                    "de juliol",
                    "d\u2019agost",
                    "de setembre",
                    "d\u2019octubre",
                    "de novembre",
                    "de desembre",
                    "",
                }
            },
            { "standalone.MonthNames",
                new String[] {
                    "gener",
                    "febrer",
                    "mar\u00e7",
                    "abril",
                    "maig",
                    "juny",
                    "juliol",
                    "agost",
                    "setembre",
                    "octubre",
                    "novembre",
                    "desembre",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "de gen.",
                    "de febr.",
                    "de mar\u00e7",
                    "d\u2019abr.",
                    "de maig",
                    "de juny",
                    "de jul.",
                    "d\u2019ag.",
                    "de set.",
                    "d\u2019oct.",
                    "de nov.",
                    "de des.",
                    "",
                }
            },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "gen.",
                    "febr.",
                    "mar\u00e7",
                    "abr.",
                    "maig",
                    "juny",
                    "jul.",
                    "ag.",
                    "set.",
                    "oct.",
                    "nov.",
                    "des.",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "G",
                    "F",
                    "M",
                    "A",
                    "M",
                    "J",
                    "G",
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
                    "g",
                    "f",
                    "m",
                    "a",
                    "m",
                    "j",
                    "j",
                    "a",
                    "s",
                    "o",
                    "n",
                    "d",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "diumenge",
                    "dilluns",
                    "dimarts",
                    "dimecres",
                    "dijous",
                    "divendres",
                    "dissabte",
                }
            },
            { "standalone.DayNames",
                new String[] {
                    "Diumenge",
                    "Dilluns",
                    "Dimarts",
                    "Dimecres",
                    "Dijous",
                    "Divendres",
                    "Dissabte",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "dg.",
                    "dl.",
                    "dt.",
                    "dc.",
                    "dj.",
                    "dv.",
                    "ds.",
                }
            },
            { "standalone.DayAbbreviations",
                new String[] {
                    "dg",
                    "dl",
                    "dt",
                    "dc",
                    "dj",
                    "dv",
                    "ds",
                }
            },
            { "DayNarrows",
                new String[] {
                    "G",
                    "l",
                    "T",
                    "C",
                    "J",
                    "V",
                    "S",
                }
            },
            { "standalone.DayNarrows",
                new String[] {
                    "g",
                    "l",
                    "t",
                    "c",
                    "j",
                    "v",
                    "s",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1r trimestre",
                    "2n trimestre",
                    "3r trimestre",
                    "4t trimestre",
                }
            },
            { "standalone.QuarterNames",
                new String[] {
                    "1r trimestre",
                    "2n trimestre",
                    "3r trimestre",
                    "4t trimestre",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "1T",
                    "2T",
                    "3T",
                    "4T",
                }
            },
            { "standalone.QuarterAbbreviations",
                new String[] {
                    "1T",
                    "2T",
                    "3T",
                    "4T",
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
                    "a.m.",
                    "p.m.",
                }
            },
            { "Eras",
                new String[] {
                    "aC",
                    "dC",
                }
            },
            { "field.era", "era" },
            { "field.year", "any" },
            { "field.month", "mes" },
            { "field.week", "setmana" },
            { "field.weekday", "dia de la setmana" },
            { "field.dayperiod", "a.m./p.m." },
            { "field.hour", "hora" },
            { "field.minute", "minut" },
            { "field.second", "segon" },
            { "field.zone", "zona" },
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
                    "EEEE d MMMM 'de' y",
                    "d MMMM 'de' y",
                    "dd/MM/yyyy",
                    "dd/MM/yy",
                }
            },
            { "calendarname.islamic", "calendari musulm\u00e0" },
            { "calendarname.buddhist", "calendari budista" },
            { "calendarname.gregorian", "calendari gregori\u00e0" },
            { "calendarname.gregory", "calendari gregori\u00e0" },
            { "calendarname.islamic-civil", "calendari civil isl\u00e0mic" },
            { "calendarname.islamicc", "calendari civil isl\u00e0mic" },
            { "calendarname.roc", "calendari de la Rep\u00fablica de Xina" },
            { "calendarname.japanese", "calendari japon\u00e8s" },
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
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
