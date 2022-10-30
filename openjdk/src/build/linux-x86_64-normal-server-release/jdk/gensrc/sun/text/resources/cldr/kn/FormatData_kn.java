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

package sun.text.resources.cldr.kn;

import java.util.ListResourceBundle;

public class FormatData_kn extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u0c9c\u0ca8\u0cb5\u0cb0\u0cc0",
                    "\u0cab\u0cc6\u0cac\u0ccd\u0cb0\u0cb5\u0cb0\u0cc0",
                    "\u0cae\u0cbe\u0cb0\u0ccd\u0c9a\u0ccd",
                    "\u0c8e\u0caa\u0ccd\u0cb0\u0cbf\u0cb2\u0ccd",
                    "\u0cae\u0cc6",
                    "\u0c9c\u0cc2\u0ca8\u0ccd",
                    "\u0c9c\u0cc1\u0cb2\u0cc8",
                    "\u0c86\u0c97\u0cb8\u0ccd\u0c9f\u0ccd",
                    "\u0cb8\u0caa\u0ccd\u0c9f\u0cc6\u0c82\u0cac\u0cb0\u0ccd",
                    "\u0c85\u0c95\u0ccd\u0c9f\u0ccb\u0cac\u0cb0\u0ccd",
                    "\u0ca8\u0cb5\u0cc6\u0c82\u0cac\u0cb0\u0ccd",
                    "\u0ca1\u0cbf\u0cb8\u0cc6\u0c82\u0cac\u0cb0\u0ccd",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "\u0c9c",
                    "\u0cab\u0cc6",
                    "\u0cae\u0cbe",
                    "\u0c8e",
                    "\u0cae\u0cc7",
                    "\u0c9c\u0cc2",
                    "\u0c9c\u0cc1",
                    "\u0c86",
                    "\u0cb8\u0cc6",
                    "\u0c85",
                    "\u0ca8",
                    "\u0ca1\u0cbf",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u0cb0\u0cb5\u0cbf\u0cb5\u0cbe\u0cb0",
                    "\u0cb8\u0ccb\u0cae\u0cb5\u0cbe\u0cb0",
                    "\u0cae\u0c82\u0c97\u0cb3\u0cb5\u0cbe\u0cb0",
                    "\u0cac\u0cc1\u0ca7\u0cb5\u0cbe\u0cb0",
                    "\u0c97\u0cc1\u0cb0\u0cc1\u0cb5\u0cbe\u0cb0",
                    "\u0cb6\u0cc1\u0c95\u0ccd\u0cb0\u0cb5\u0cbe\u0cb0",
                    "\u0cb6\u0ca8\u0cbf\u0cb5\u0cbe\u0cb0",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u0cb0.",
                    "\u0cb8\u0ccb.",
                    "\u0cae\u0c82.",
                    "\u0cac\u0cc1.",
                    "\u0c97\u0cc1.",
                    "\u0cb6\u0cc1.",
                    "\u0cb6\u0ca8\u0cbf.",
                }
            },
            { "DayNarrows",
                new String[] {
                    "\u0cb0",
                    "\u0cb8\u0ccb",
                    "\u0cae\u0c82",
                    "\u0cac\u0cc1",
                    "\u0c97\u0cc1",
                    "\u0cb6\u0cc1",
                    "\u0cb6",
                }
            },
            { "QuarterNames",
                new String[] {
                    "\u0c92\u0c82\u0ca6\u0cc1 1",
                    "\u0c8e\u0cb0\u0ca1\u0cc1 2",
                    "\u0cae\u0cc2\u0cb0\u0cc1 3",
                    "\u0ca8\u0cbe\u0cb2\u0cc3\u0c95 4",
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
            { "narrow.AmPmMarkers",
                new String[] {
                    "\u0caa\u0cc2\u0cb0\u0ccd\u0cb5\u0cbe\u0cb9\u0ccd\u0ca8",
                    "\u0c85\u0caa.",
                }
            },
            { "long.Eras",
                new String[] {
                    "\u0c88\u0cb8\u0caa\u0cc2\u0cb5\u0cef.",
                    "\u0c95\u0ccd\u0cb0\u0cbf\u0cb8\u0ccd\u0ca4 \u0cb6\u0c95",
                }
            },
            { "Eras",
                new String[] {
                    "\u0c95\u0ccd\u0cb0\u0cbf.\u0caa\u0cc2",
                    "\u0c9c\u0cbe\u0cb9\u0cc0",
                }
            },
            { "field.era", "\u0caf\u0cc1\u0c97" },
            { "field.year", "\u0cb5\u0cb0\u0ccd\u0cb7" },
            { "field.month", "\u0ca4\u0cbf\u0c82\u0c97\u0cb3\u0cc1" },
            { "field.week", "\u0cb5\u0cbe\u0cb0" },
            { "field.weekday", "\u0cb5\u0cbe\u0cb0\u0ca6 \u0ca6\u0cbf\u0ca8" },
            { "field.dayperiod", "\u0caa\u0cc2\u0cb0\u0ccd\u0cb5\u0cbe\u0cb9\u0ccd\u0ca8/\u0c85\u0caa\u0cb0\u0cbe\u0cb9\u0ccd\u0ca8" },
            { "field.hour", "\u0c97\u0c82\u0c9f\u0cc6" },
            { "field.minute", "\u0ca8\u0cbf\u0cae\u0cbf\u0cb7" },
            { "field.second", "\u0cb8\u0cc6\u0c95\u0cc6\u0c82\u0ca1\u0ccd" },
            { "field.zone", "\u0cb8\u0cae\u0caf \u0cb5\u0cb2\u0caf:" },
            { "TimePatterns",
                new String[] {
                    "hh:mm:ss a zzzz",
                    "hh:mm:ss a z",
                    "hh:mm:ss a",
                    "hh:mm a",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "d-M-yy",
                }
            },
            { "calendarname.islamic-civil", "\u0c87\u0cb8\u0ccd\u0cb2\u0cbe\u0cae\u0cbf\u0c95\u0ccd\u200c\u200c-\u0ca8\u0cbe\u0c97\u0cb0\u0cbf\u0c95 \u0c95\u0ccd\u0caf\u0cbe\u0cb2\u0cc6\u0c82\u0ca1\u0cb0\u0ccd\u200c" },
            { "calendarname.islamicc", "\u0c87\u0cb8\u0ccd\u0cb2\u0cbe\u0cae\u0cbf\u0c95\u0ccd\u200c\u200c-\u0ca8\u0cbe\u0c97\u0cb0\u0cbf\u0c95 \u0c95\u0ccd\u0caf\u0cbe\u0cb2\u0cc6\u0c82\u0ca1\u0cb0\u0ccd\u200c" },
            { "calendarname.roc", "\u0cae\u0cbf\u0c82\u0c97\u0ccd\u0cb5\u0ccb \u0c95\u0ccd\u0caf\u0cbe\u0cb2\u0cc6\u0c82\u0ca1\u0cb0\u0ccd\u200c" },
            { "calendarname.japanese", "\u0c9c\u0caa\u0cbe\u0ca8\u0cbf \u0c95\u0ccd\u0caf\u0cbe\u0cb2\u0cc6\u0c82\u0ca1\u0cb0\u0ccd\u200c" },
            { "calendarname.islamic", "\u0c87\u0cb8\u0ccd\u0cb2\u0cbe\u0cae\u0cbf\u0c95\u0ccd\u200c \u0c95\u0ccd\u0caf\u0cbe\u0cb2\u0cc6\u0c82\u0ca1\u0cb0\u0ccd\u200c" },
            { "calendarname.buddhist", "\u0cac\u0ccc\u0ca6\u0ccd\u0ca7 \u0c95\u0ccd\u0caf\u0cbe\u0cb2\u0cc6\u0c82\u0ca1\u0cb0\u0ccd\u200c" },
            { "calendarname.gregorian", "\u0c97\u0ccd\u0cb0\u0cc6\u0c97\u0cca\u0cb0\u0cbf\u0caf\u0ca8\u0ccd\u200c \u0c95\u0ccd\u0caf\u0cbe\u0cb2\u0cc6\u0c82\u0ca1\u0cb0\u0ccd\u200c" },
            { "calendarname.gregory", "\u0c97\u0ccd\u0cb0\u0cc6\u0c97\u0cca\u0cb0\u0cbf\u0caf\u0ca8\u0ccd\u200c \u0c95\u0ccd\u0caf\u0cbe\u0cb2\u0cc6\u0c82\u0ca1\u0cb0\u0ccd\u200c" },
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
                    "\u0caa\u0cc2\u0cb0\u0ccd\u0cb5",
                    "\u2030",
                    "\u221e",
                    "\u0cb8\u0c82\u0c96\u0ccd\u0caf\u0cc6\u0caf\u0cb2\u0ccd\u0cb2",
                }
            },
            { "NumberPatterns",
                new String[] {
                    "#,##,##0.###",
                    "\u00a4\u00a0#,##,##0.00",
                    "#,##,##0%",
                }
            },
        };
        return data;
    }
}
