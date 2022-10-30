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

package sun.text.resources.cldr.is;

import java.util.ListResourceBundle;

public class FormatData_is extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "jan\u00faar",
                    "febr\u00faar",
                    "mars",
                    "apr\u00edl",
                    "ma\u00ed",
                    "j\u00fan\u00ed",
                    "j\u00fal\u00ed",
                    "\u00e1g\u00fast",
                    "september",
                    "okt\u00f3ber",
                    "n\u00f3vember",
                    "desember",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "jan",
                    "feb",
                    "mar",
                    "apr",
                    "ma\u00ed",
                    "j\u00fan",
                    "j\u00fal",
                    "\u00e1g\u00fa",
                    "sep",
                    "okt",
                    "n\u00f3v",
                    "des",
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
                    "\u00c1",
                    "L",
                    "O",
                    "N",
                    "D",
                    "",
                }
            },
            { "standalone.MonthNarrows",
                new String[] {
                    "j",
                    "f",
                    "m",
                    "a",
                    "m",
                    "j",
                    "j",
                    "\u00e1",
                    "s",
                    "o",
                    "n",
                    "d",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "sunnudagur",
                    "m\u00e1nudagur",
                    "\u00feri\u00f0judagur",
                    "mi\u00f0vikudagur",
                    "fimmtudagur",
                    "f\u00f6studagur",
                    "laugardagur",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "sun",
                    "m\u00e1n",
                    "\u00feri",
                    "mi\u00f0",
                    "fim",
                    "f\u00f6s",
                    "lau",
                }
            },
            { "DayNarrows",
                new String[] {
                    "S",
                    "M",
                    "\u00de",
                    "M",
                    "F",
                    "F",
                    "L",
                }
            },
            { "standalone.DayNarrows",
                new String[] {
                    "s",
                    "m",
                    "\u00fe",
                    "m",
                    "f",
                    "f",
                    "l",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1st fj\u00f3r\u00f0ungur",
                    "2nd fj\u00f3r\u00f0ungur",
                    "3rd fj\u00f3r\u00f0ungur",
                    "4th fj\u00f3r\u00f0ungur",
                }
            },
            { "standalone.QuarterNames",
                new String[] {
                    "1. fj\u00f3r\u00f0ungur",
                    "2. fj\u00f3r\u00f0ungur",
                    "3. fj\u00f3r\u00f0ungur",
                    "4. fj\u00f3r\u00f0ungur",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "F1",
                    "F2",
                    "F3",
                    "F4",
                }
            },
            { "standalone.QuarterAbbreviations",
                new String[] {
                    "1F",
                    "2F",
                    "3F",
                    "4F",
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
                    "f.h.",
                    "e.h.",
                }
            },
            { "Eras",
                new String[] {
                    "fyrir Krist",
                    "eftir Krist",
                }
            },
            { "narrow.Eras",
                new String[] {
                    "f.k.",
                    "e.k.",
                }
            },
            { "field.era", "t\u00edmabil" },
            { "field.year", "\u00e1r" },
            { "field.month", "m\u00e1nu\u00f0ur" },
            { "field.week", "vika" },
            { "field.weekday", "vikudagur" },
            { "field.dayperiod", "f.h./e.h." },
            { "field.hour", "klukkustund" },
            { "field.minute", "m\u00edn\u00fata" },
            { "field.second", "sek\u00fanda" },
            { "field.zone", "sv\u00e6\u00f0i" },
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
                    "d.M.yyyy",
                    "d.M.yyyy",
                }
            },
            { "calendarname.islamic", "\u00cdslamskt dagatal" },
            { "calendarname.buddhist", "B\u00fadd\u00edskt dagatal" },
            { "calendarname.gregorian", "Gregor\u00edskt dagatal" },
            { "calendarname.gregory", "Gregor\u00edskt dagatal" },
            { "calendarname.islamic-civil", "\u00cdslamskt borgaradagatal" },
            { "calendarname.islamicc", "\u00cdslamskt borgaradagatal" },
            { "calendarname.roc", "k\u00ednverskt dagatal" },
            { "calendarname.japanese", "Japanskt dagatal" },
            { "DefaultNumberingSystem", "latn" },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "0",
                    "#",
                    "\u2212",
                    "\u00d710^",
                    "\u2030",
                    "\u221e",
                    "EiTa",
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
