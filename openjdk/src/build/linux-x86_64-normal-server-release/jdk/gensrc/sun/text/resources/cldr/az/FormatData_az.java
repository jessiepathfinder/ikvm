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

package sun.text.resources.cldr.az;

import java.util.ListResourceBundle;

public class FormatData_az extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "Yanvar",
                    "Fevral",
                    "Mart",
                    "Aprel",
                    "May",
                    "\u0130yun",
                    "\u0130yul",
                    "Avqust",
                    "Sentyabr",
                    "Oktyabr",
                    "Noyabr",
                    "Dekabr",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "yan",
                    "fev",
                    "mar",
                    "apr",
                    "may",
                    "iyn",
                    "iyl",
                    "avq",
                    "sen",
                    "okt",
                    "noy",
                    "dek",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "bazar",
                    "bazar ert\u0259si",
                    "\u00e7\u0259r\u015f\u0259nb\u0259 ax\u015fam\u0131",
                    "\u00e7\u0259r\u015f\u0259nb\u0259",
                    "c\u00fcm\u0259 ax\u015fam\u0131",
                    "c\u00fcm\u0259",
                    "\u015f\u0259nb\u0259",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "B.",
                    "B.E.",
                    "\u00c7.A.",
                    "\u00c7.",
                    "C.A.",
                    "C",
                    "\u015e.",
                }
            },
            { "DayNarrows",
                new String[] {
                    "7",
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1-ci kvartal",
                    "2-ci kvartal",
                    "3-c\u00fc kvartal",
                    "4-c\u00fc kvartal",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "1-ci kv.",
                    "2-ci kv.",
                    "3-c\u00fc kv.",
                    "4-c\u00fc kv.",
                }
            },
            { "long.Eras",
                new String[] {
                    "eram\u0131zdan \u0259vv\u0259l",
                    "bizim eram\u0131z\u0131n",
                }
            },
            { "Eras",
                new String[] {
                    "e.\u0259.",
                    "b.e.",
                }
            },
            { "field.era", "era" },
            { "field.year", "il" },
            { "field.month", "ay" },
            { "field.week", "h\u0259ft\u0259" },
            { "field.weekday", "h\u0259ft\u0259 g\u00fcn\u00fc" },
            { "field.hour", "saat" },
            { "field.minute", "d\u0259qiq\u0259" },
            { "field.second", "saniy\u0259" },
            { "field.zone", "zona" },
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
                    "EEEE, d, MMMM, y",
                    "d MMMM , y",
                    "d MMM, y",
                    "yyyy-MM-dd",
                }
            },
            { "calendarname.islamic", "M\u00fcs\u0259lman t\u0259qvimi" },
            { "calendarname.buddhist", "Budist t\u0259qvimi" },
            { "calendarname.gregorian", "Qreqoriy t\u0259qvimi" },
            { "calendarname.gregory", "Qreqoriy t\u0259qvimi" },
            { "calendarname.islamic-civil", "Ivrit t\u0259qvimi" },
            { "calendarname.islamicc", "Ivrit t\u0259qvimi" },
            { "calendarname.roc", "\u00c7in respublikas\u0131 t\u0259qvimi" },
            { "calendarname.japanese", "Yapon t\u0259qvimi" },
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
                    "\u00a4\u00a0#,##0.00",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
