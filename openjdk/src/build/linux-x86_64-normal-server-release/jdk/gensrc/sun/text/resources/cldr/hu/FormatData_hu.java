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

package sun.text.resources.cldr.hu;

import java.util.ListResourceBundle;

public class FormatData_hu extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "janu\u00e1r",
                    "febru\u00e1r",
                    "m\u00e1rcius",
                    "\u00e1prilis",
                    "m\u00e1jus",
                    "j\u00fanius",
                    "j\u00falius",
                    "augusztus",
                    "szeptember",
                    "okt\u00f3ber",
                    "november",
                    "december",
                    "",
                }
            },
            { "standalone.MonthNames",
                new String[] {
                    "janu\u00e1r",
                    "febru\u00e1r",
                    "m\u00e1rcius",
                    "\u00e1prilis",
                    "m\u00e1jus",
                    "j\u00fanius",
                    "j\u00falius",
                    "augusztus",
                    "szeptember",
                    "okt\u00f3ber",
                    "november",
                    "december",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "jan.",
                    "febr.",
                    "m\u00e1rc.",
                    "\u00e1pr.",
                    "m\u00e1j.",
                    "j\u00fan.",
                    "j\u00fal.",
                    "aug.",
                    "szept.",
                    "okt.",
                    "nov.",
                    "dec.",
                    "",
                }
            },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "jan.",
                    "febr.",
                    "m\u00e1rc.",
                    "\u00e1pr.",
                    "m\u00e1j.",
                    "j\u00fan.",
                    "j\u00fal.",
                    "aug.",
                    "szept.",
                    "okt.",
                    "nov.",
                    "dec.",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "J",
                    "F",
                    "M",
                    "\u00c1",
                    "M",
                    "J",
                    "J",
                    "\u00c1",
                    "Sz",
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
                    "\u00c1",
                    "M",
                    "J",
                    "J",
                    "A",
                    "Sz",
                    "O",
                    "N",
                    "D",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "vas\u00e1rnap",
                    "h\u00e9tf\u0151",
                    "kedd",
                    "szerda",
                    "cs\u00fct\u00f6rt\u00f6k",
                    "p\u00e9ntek",
                    "szombat",
                }
            },
            { "standalone.DayNames",
                new String[] {
                    "vas\u00e1rnap",
                    "h\u00e9tf\u0151",
                    "kedd",
                    "szerda",
                    "cs\u00fct\u00f6rt\u00f6k",
                    "p\u00e9ntek",
                    "szombat",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "V",
                    "H",
                    "K",
                    "Sze",
                    "Cs",
                    "P",
                    "Szo",
                }
            },
            { "standalone.DayAbbreviations",
                new String[] {
                    "V",
                    "H",
                    "K",
                    "Sze",
                    "Cs",
                    "P",
                    "Szo",
                }
            },
            { "DayNarrows",
                new String[] {
                    "V",
                    "H",
                    "K",
                    "Sz",
                    "Cs",
                    "P",
                    "Sz",
                }
            },
            { "standalone.DayNarrows",
                new String[] {
                    "V",
                    "H",
                    "K",
                    "Sz",
                    "Cs",
                    "P",
                    "Sz",
                }
            },
            { "QuarterNames",
                new String[] {
                    "I. negyed\u00e9v",
                    "II. negyed\u00e9v",
                    "III. negyed\u00e9v",
                    "IV. negyed\u00e9v",
                }
            },
            { "standalone.QuarterNames",
                new String[] {
                    "1. negyed\u00e9v",
                    "2. negyed\u00e9v",
                    "3. negyed\u00e9v",
                    "4. negyed\u00e9v",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "N1",
                    "N2",
                    "N3",
                    "N4",
                }
            },
            { "standalone.QuarterAbbreviations",
                new String[] {
                    "N1",
                    "N2",
                    "N3",
                    "N4",
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
                    "de.",
                    "du.",
                }
            },
            { "narrow.AmPmMarkers",
                new String[] {
                    "de.",
                    "du.",
                }
            },
            { "long.Eras",
                new String[] {
                    "id\u0151sz\u00e1m\u00edt\u00e1sunk el\u0151tt",
                    "id\u0151sz\u00e1m\u00edt\u00e1sunk szerint",
                }
            },
            { "Eras",
                new String[] {
                    "i. e.",
                    "i. sz.",
                }
            },
            { "narrow.Eras",
                new String[] {
                    "ie.",
                    "isz.",
                }
            },
            { "field.era", "\u00e9ra" },
            { "field.year", "\u00e9v" },
            { "field.month", "h\u00f3nap" },
            { "field.week", "h\u00e9t" },
            { "field.weekday", "h\u00e9t napja" },
            { "field.dayperiod", "napszak" },
            { "field.hour", "\u00f3ra" },
            { "field.minute", "perc" },
            { "field.second", "m\u00e1sodperc" },
            { "field.zone", "z\u00f3na" },
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
                    "y. MMMM d., EEEE",
                    "y. MMMM d.",
                    "yyyy.MM.dd.",
                    "yyyy.MM.dd.",
                }
            },
            { "buddhist.Eras",
                new String[] {
                    "BC",
                    "BK",
                }
            },
            { "roc.Eras",
                new String[] {
                    "R.O.C. el\u0151tt",
                    "",
                }
            },
            { "islamic.MonthNames",
                new String[] {
                    "Moharrem",
                    "Safar",
                    "R\u00e9bi el avvel",
                    "R\u00e9bi el accher",
                    "Dsem\u00e1di el avvel",
                    "Dsem\u00e1di el accher",
                    "Redseb",
                    "Sab\u00e1n",
                    "Ramad\u00e1n",
                    "Sevv\u00e1l",
                    "Ds\u00fcl kade",
                    "Ds\u00fcl hedse",
                    "",
                }
            },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "Muh.",
                    "Saf.",
                    "Rab. I",
                    "Rab. II",
                    "Jum. I",
                    "Jum. II",
                    "Raj.",
                    "Sha.",
                    "Ram.",
                    "Shaw.",
                    "Ds\u00fcl-Q.",
                    "Ds\u00fcl-H.",
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
            { "islamic.Eras",
                new String[] {
                    "",
                    "MF",
                }
            },
            { "islamic.DatePatterns",
                new String[] {
                    "y. MMMM d., EEEE",
                    "y. MMMM d.",
                    "yyyy.MM.dd.",
                    "yyyy.MM.dd.",
                }
            },
            { "calendarname.islamic-civil", "iszl\u00e1m civil napt\u00e1r" },
            { "calendarname.islamicc", "iszl\u00e1m civil napt\u00e1r" },
            { "calendarname.roc", "K\u00ednai k\u00f6zt\u00e1rsas\u00e1gi napt\u00e1r" },
            { "calendarname.japanese", "jap\u00e1n napt\u00e1r" },
            { "calendarname.islamic", "iszl\u00e1m napt\u00e1r" },
            { "calendarname.buddhist", "buddhista napt\u00e1r" },
            { "calendarname.gregorian", "Gergely-napt\u00e1r" },
            { "calendarname.gregory", "Gergely-napt\u00e1r" },
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
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
