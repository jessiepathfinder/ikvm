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

package sun.text.resources.cldr.sl;

import java.util.ListResourceBundle;

public class FormatData_sl extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "januar",
                    "februar",
                    "marec",
                    "april",
                    "maj",
                    "junij",
                    "julij",
                    "avgust",
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
                    "mar.",
                    "apr.",
                    "maj",
                    "jun.",
                    "jul.",
                    "avg.",
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
                    "mar",
                    "apr",
                    "maj",
                    "jun",
                    "jul",
                    "avg",
                    "sep",
                    "okt",
                    "nov",
                    "dec",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "j",
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
                    "nedelja",
                    "ponedeljek",
                    "torek",
                    "sreda",
                    "\u010detrtek",
                    "petek",
                    "sobota",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "ned.",
                    "pon.",
                    "tor.",
                    "sre.",
                    "\u010det.",
                    "pet.",
                    "sob.",
                }
            },
            { "standalone.DayAbbreviations",
                new String[] {
                    "ned",
                    "pon",
                    "tor",
                    "sre",
                    "\u010det",
                    "pet",
                    "sob",
                }
            },
            { "DayNarrows",
                new String[] {
                    "n",
                    "p",
                    "t",
                    "s",
                    "\u010d",
                    "p",
                    "s",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1. \u010detrtletje",
                    "2. \u010detrtletje",
                    "3. \u010detrtletje",
                    "4. \u010detrtletje",
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
                    "dop.",
                    "pop.",
                }
            },
            { "long.Eras",
                new String[] {
                    "pred na\u0161im \u0161tetjem",
                    "na\u0161e \u0161tetje",
                }
            },
            { "Eras",
                new String[] {
                    "pr. n. \u0161t.",
                    "po Kr.",
                }
            },
            { "field.era", "Doba" },
            { "field.year", "Leto" },
            { "field.month", "Mesec" },
            { "field.week", "Teden" },
            { "field.weekday", "Dan v tednu" },
            { "field.dayperiod", "\u010cas dneva" },
            { "field.hour", "Ura" },
            { "field.minute", "Minuta" },
            { "field.second", "Sekunda" },
            { "field.zone", "Obmo\u010dje" },
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
                    "EEEE, dd. MMMM y",
                    "dd. MMMM y",
                    "d. MMM yyyy",
                    "d. MM. yy",
                }
            },
            { "calendarname.islamic", "islamski koledar" },
            { "calendarname.buddhist", "budisti\u010dni koledar" },
            { "calendarname.gregorian", "gregorijanski koledar" },
            { "calendarname.gregory", "gregorijanski koledar" },
            { "calendarname.islamic-civil", "islamski civilni koledar" },
            { "calendarname.islamicc", "islamski civilni koledar" },
            { "calendarname.roc", "kitajski dr\u017eavni koledar" },
            { "calendarname.japanese", "japonski koledar" },
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
                    "e",
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
