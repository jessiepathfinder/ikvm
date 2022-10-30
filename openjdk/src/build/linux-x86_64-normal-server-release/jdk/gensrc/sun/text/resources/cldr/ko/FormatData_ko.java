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

package sun.text.resources.cldr.ko;

import java.util.ListResourceBundle;

public class FormatData_ko extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "1\uc6d4",
                    "2\uc6d4",
                    "3\uc6d4",
                    "4\uc6d4",
                    "5\uc6d4",
                    "6\uc6d4",
                    "7\uc6d4",
                    "8\uc6d4",
                    "9\uc6d4",
                    "10\uc6d4",
                    "11\uc6d4",
                    "12\uc6d4",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "1\uc6d4",
                    "2\uc6d4",
                    "3\uc6d4",
                    "4\uc6d4",
                    "5\uc6d4",
                    "6\uc6d4",
                    "7\uc6d4",
                    "8\uc6d4",
                    "9\uc6d4",
                    "10\uc6d4",
                    "11\uc6d4",
                    "12\uc6d4",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\uc77c\uc694\uc77c",
                    "\uc6d4\uc694\uc77c",
                    "\ud654\uc694\uc77c",
                    "\uc218\uc694\uc77c",
                    "\ubaa9\uc694\uc77c",
                    "\uae08\uc694\uc77c",
                    "\ud1a0\uc694\uc77c",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\uc77c",
                    "\uc6d4",
                    "\ud654",
                    "\uc218",
                    "\ubaa9",
                    "\uae08",
                    "\ud1a0",
                }
            },
            { "DayNarrows",
                new String[] {
                    "\uc77c",
                    "\uc6d4",
                    "\ud654",
                    "\uc218",
                    "\ubaa9",
                    "\uae08",
                    "\ud1a0",
                }
            },
            { "QuarterNames",
                new String[] {
                    "\uc81c 1/4\ubd84\uae30",
                    "\uc81c 2/4\ubd84\uae30",
                    "\uc81c 3/4\ubd84\uae30",
                    "\uc81c 4/4\ubd84\uae30",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "1\ubd84\uae30",
                    "2\ubd84\uae30",
                    "3\ubd84\uae30",
                    "4\ubd84\uae30",
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
                    "\uc624\uc804",
                    "\uc624\ud6c4",
                }
            },
            { "long.Eras",
                new String[] {
                    "\uc11c\ub825\uae30\uc6d0\uc804",
                    "\uc11c\ub825\uae30\uc6d0",
                }
            },
            { "Eras",
                new String[] {
                    "\uae30\uc6d0\uc804",
                    "\uc11c\uae30",
                }
            },
            { "field.era", "\uc5f0\ud638" },
            { "field.year", "\ub144" },
            { "field.month", "\uc6d4" },
            { "field.week", "\uc8fc" },
            { "field.weekday", "\uc694\uc77c" },
            { "field.dayperiod", "\uc624\uc804/\uc624\ud6c4" },
            { "field.hour", "\uc2dc" },
            { "field.minute", "\ubd84" },
            { "field.second", "\ucd08" },
            { "field.zone", "\uc2dc\uac04\ub300" },
            { "TimePatterns",
                new String[] {
                    "a h\uc2dc m\ubd84 s\ucd08 zzzz",
                    "a h\uc2dc m\ubd84 s\ucd08 z",
                    "a h:mm:ss",
                    "a h:mm",
                }
            },
            { "DatePatterns",
                new String[] {
                    "y\ub144 M\uc6d4 d\uc77c EEEE",
                    "y\ub144 M\uc6d4 d\uc77c",
                    "yyyy. M. d.",
                    "yy. M. d.",
                }
            },
            { "DateTimePatterns",
                new String[] {
                    "{1} {0}",
                }
            },
            { "buddhist.Eras",
                new String[] {
                    "BC",
                    "\ubd88\uae30",
                }
            },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "G y\ub144 M\uc6d4 d\uc77c EEEE",
                    "G y\ub144 M\uc6d4 d\uc77c",
                    "G y. M. d",
                    "G y. M. d",
                }
            },
            { "buddhist.DatePatterns",
                new String[] {
                    "GGGG y\ub144 M\uc6d4 d\uc77c EEEE",
                    "GGGG y\ub144 M\uc6d4 d\uc77c",
                    "GGGG y. M. d",
                    "GGGG y. M. d",
                }
            },
            { "japanese.Eras",
                new String[] {
                    "\uc11c\uae30",
                    "\uba54\uc774\uc9c0",
                    "\ub2e4\uc774\uc1fc",
                    "\uc1fc\uc640",
                    "\ud5e4\uc774\uc138\uc774",
                }
            },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "G y\ub144 M\uc6d4 d\uc77c EEEE",
                    "G y\ub144 M\uc6d4 d\uc77c",
                    "G y. M. d",
                    "G y. M. d",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "GGGG y\ub144 M\uc6d4 d\uc77c EEEE",
                    "GGGG y\ub144 M\uc6d4 d\uc77c",
                    "GGGG y. M. d",
                    "GGGG y. M. d",
                }
            },
            { "roc.Eras",
                new String[] {
                    "\uc911\ud654\ubbfc\uad6d\uc804",
                    "\uc911\ud654\ubbfc\uad6d",
                }
            },
            { "java.time.roc.DatePatterns",
                new String[] {
                    "G y\ub144 M\uc6d4 d\uc77c EEEE",
                    "G y\ub144 M\uc6d4 d\uc77c",
                    "G y. M. d",
                    "G y. M. d",
                }
            },
            { "roc.DatePatterns",
                new String[] {
                    "GGGG y\ub144 M\uc6d4 d\uc77c EEEE",
                    "GGGG y\ub144 M\uc6d4 d\uc77c",
                    "GGGG y. M. d",
                    "GGGG y. M. d",
                }
            },
            { "calendarname.islamic-civil", "\uc774\uc2ac\ub78c \uc0c1\uc6a9\ub825" },
            { "calendarname.islamicc", "\uc774\uc2ac\ub78c \uc0c1\uc6a9\ub825" },
            { "calendarname.roc", "\ub300\ub9cc\ub825" },
            { "calendarname.japanese", "\uc77c\ubcf8\ub825" },
            { "calendarname.islamic", "\uc774\uc2ac\ub78c\ub825" },
            { "calendarname.buddhist", "\ubd88\uad50\ub825" },
            { "calendarname.gregorian", "\ud0dc\uc591\ub825" },
            { "calendarname.gregory", "\ud0dc\uc591\ub825" },
            { "DefaultNumberingSystem", "latn" },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
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
                    "\u00a4#,##0.00",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
