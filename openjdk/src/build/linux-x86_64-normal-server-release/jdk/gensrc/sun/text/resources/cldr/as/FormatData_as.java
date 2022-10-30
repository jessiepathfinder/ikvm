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

package sun.text.resources.cldr.as;

import java.util.ListResourceBundle;

public class FormatData_as extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u099c\u09be\u09a8\u09c1\u09f1\u09be\u09f0\u09c0",
                    "\u09ab\u09c7\u09ac\u09cd\u09f0\u09c1\u09f1\u09be\u09f0\u09c0",
                    "\u09ae\u09be\u09f0\u09cd\u099a",
                    "\u098f\u09aa\u09cd\u09f0\u09bf\u09b2",
                    "\u09ae\u09c7",
                    "\u099c\u09c1\u09a8",
                    "\u099c\u09c1\u09b2\u09be\u0987",
                    "\u0986\u0997\u09b7\u09cd\u099f",
                    "\u099b\u09c7\u09aa\u09cd\u09a4\u09c7\u09ae\u09cd\u09ac\u09f0",
                    "\u0985\u0995\u09cd\u099f\u09cb\u09ac\u09f0",
                    "\u09a8\u09f1\u09c7\u09ae\u09cd\u09ac\u09f0",
                    "\u09a1\u09bf\u099a\u09c7\u09ae\u09cd\u09ac\u09f0",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "\u099c\u09be\u09a8\u09c1",
                    "\u09ab\u09c7\u09ac\u09cd\u09f0\u09c1",
                    "\u09ae\u09be\u09f0\u09cd\u099a",
                    "\u098f\u09aa\u09cd\u09f0\u09bf\u09b2",
                    "\u09ae\u09c7",
                    "\u099c\u09c1\u09a8",
                    "\u099c\u09c1\u09b2\u09be\u0987",
                    "\u0986\u0997",
                    "\u09b8\u09c7\u09aa\u09cd\u099f",
                    "\u0985\u0995\u09cd\u099f\u09cb",
                    "\u09a8\u09ad\u09c7",
                    "\u09a1\u09bf\u09b8\u09c7",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u09a6\u09c7\u0993\u09ac\u09be\u09f0",
                    "\u09b8\u09cb\u09ae\u09ac\u09be\u09f0",
                    "\u09ae\u0999\u09cd\u0997\u09b2\u09ac\u09be\u09f0",
                    "\u09ac\u09c1\u09a7\u09ac\u09be\u09f0",
                    "\u09ac\u09c3\u09b9\u09b7\u09cd\u09aa\u09a4\u09bf\u09ac\u09be\u09f0",
                    "\u09b6\u09c1\u0995\u09cd\u09f0\u09ac\u09be\u09f0",
                    "\u09b6\u09a8\u09bf\u09ac\u09be\u09f0",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u09f0\u09ac\u09bf",
                    "\u09b8\u09cb\u09ae",
                    "\u09ae\u0999\u09cd\u0997\u09b2",
                    "\u09ac\u09c1\u09a7",
                    "\u09ac\u09c3\u09b9\u09b7\u09cd\u09aa\u09a4\u09bf",
                    "\u09b6\u09c1\u0995\u09cd\u09f0",
                    "\u09b6\u09a8\u09bf",
                }
            },
            { "QuarterNames",
                new String[] {
                    "\u09aa\u09cd\u09f0\u09a5\u09ae \u09aa\u09cd\u09f0\u09b9\u09f0",
                    "\u09a6\u09cd\u09ac\u09bf\u09a4\u09c0\u09af\u09bc \u09aa\u09cd\u09f0\u09b9\u09f0",
                    "\u09a4\u09c3\u09a4\u09c0\u09af\u09bc \u09aa\u09cd\u09f0\u09b9\u09f0",
                    "\u099a\u09a4\u09c1\u09f0\u09cd\u09a5 \u09aa\u09cd\u09f0\u09b9\u09f0",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "\u09aa\u09c2\u09f0\u09cd\u09ac\u09be\u09b9\u09cd\u09a3",
                    "\u0985\u09aa\u09f0\u09be\u09b9\u09cd\u09a3",
                }
            },
            { "field.era", "\u09af\u09c1\u0997" },
            { "field.year", "\u09ac\u099b\u09f0" },
            { "field.month", "\u09ae\u09be\u09b9" },
            { "field.week", "\u09b8\u09aa\u09cd\u09a4\u09be\u09b9" },
            { "field.hour", "\u0998\u09a3\u09cd\u099f\u09be" },
            { "field.minute", "\u09ae\u09bf\u09a8\u09bf\u099f" },
            { "field.second", "\u099b\u09c7\u0995\u09c7\u09a3\u09cd\u09a1" },
            { "field.zone", "\u0995\u09cd\u09b7\u09c7\u09a4\u09cd\u09f0" },
            { "calendarname.japanese", "\u099c\u09be\u09aa\u09be\u09a8\u09c0 \u09aa\u099e\u09cd\u099c\u09bf\u0995\u09be" },
            { "calendarname.roc", "\u099a\u09c0\u09a8\u09be \u0997\u09a3\u09f0\u09be\u099c\u09cd\u09af\u09f0 \u09aa\u099e\u09cd\u099c\u09bf\u0995\u09be" },
            { "calendarname.gregorian", "\u0997\u09cd\u09f0\u09bf\u0997\u09cb\u09f0\u09c0\u09af\u09bc \u09aa\u099e\u09cd\u099c\u09bf\u0995\u09be" },
            { "calendarname.gregory", "\u0997\u09cd\u09f0\u09bf\u0997\u09cb\u09f0\u09c0\u09af\u09bc \u09aa\u099e\u09cd\u099c\u09bf\u0995\u09be" },
            { "calendarname.islamic-civil", "\u0987\u099a\u09b2\u09be\u09ae\u09c0-\u09a8\u09be\u0997\u09f0\u09bf\u0995\u09f0 \u09aa\u099e\u09cd\u099c\u09bf\u0995\u09be" },
            { "calendarname.islamicc", "\u0987\u099a\u09b2\u09be\u09ae\u09c0-\u09a8\u09be\u0997\u09f0\u09bf\u0995\u09f0 \u09aa\u099e\u09cd\u099c\u09bf\u0995\u09be" },
            { "calendarname.islamic", "\u0987\u099a\u09b2\u09be\u09ae\u09c0 \u09aa\u099e\u09cd\u099c\u09bf\u0995\u09be" },
            { "calendarname.buddhist", "\u09ac\u09cc\u09a6\u09cd\u09a7 \u09aa\u099e\u09cd\u099c\u09bf\u0995\u09be" },
            { "DefaultNumberingSystem", "latn" },
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
