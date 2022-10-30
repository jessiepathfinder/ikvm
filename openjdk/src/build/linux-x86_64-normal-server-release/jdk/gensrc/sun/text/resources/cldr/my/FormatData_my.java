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

package sun.text.resources.cldr.my;

import java.util.ListResourceBundle;

public class FormatData_my extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u1007\u1014\u103a\u1014\u101d\u102b\u101b\u102e",
                    "\u1016\u1031\u1016\u1031\u102c\u103a\u101d\u102b\u101b\u102e",
                    "\u1019\u1010\u103a",
                    "\u1027\u1015\u103c\u102e",
                    "\u1019\u1031",
                    "\u1007\u103d\u1014\u103a",
                    "\u1007\u1030\u101c\u102d\u102f\u1004\u103a",
                    "\u1029\u1002\u102f\u1010\u103a",
                    "\u1005\u1000\u103a\u1010\u1004\u103a\u1018\u102c",
                    "\u1021\u1031\u102c\u1000\u103a\u1010\u102d\u102f\u1018\u102c",
                    "\u1014\u102d\u102f\u101d\u1004\u103a\u1018\u102c",
                    "\u1012\u102e\u1007\u1004\u103a\u1018\u102c",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "\u1007\u1014\u103a",
                    "\u1016\u1031",
                    "\u1019\u1010\u103a",
                    "\u1027",
                    "\u1019\u1031",
                    "\u1007\u103d\u1014\u103a",
                    "\u1007\u1030",
                    "\u1029",
                    "\u1005\u1000\u103a",
                    "\u1021\u1031\u102c\u1000\u103a",
                    "\u1014\u102d\u102f",
                    "\u1012\u102e",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "\u1007",
                    "\u1016",
                    "\u1019",
                    "\u1027",
                    "\u1019",
                    "\u1007",
                    "\u1007",
                    "\u1029",
                    "\u1005",
                    "\u1021",
                    "\u1014",
                    "\u1012",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u1010\u1014\u1004\u103a\u1039\u1002\u1014\u103d\u1031",
                    "\u1010\u1014\u1004\u103a\u1039\u101c\u102c",
                    "\u1021\u1004\u103a\u1039\u1002\u102b",
                    "\u1017\u102f\u1012\u1039\u1013\u101f\u1030\u1038",
                    "\u1000\u103c\u102c\u101e\u1015\u1010\u1031\u1038",
                    "\u101e\u1031\u102c\u1000\u103c\u102c",
                    "\u1005\u1014\u1031",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u1014\u103d\u1031",
                    "\u101c\u102c",
                    "\u1002\u102b",
                    "\u101f\u1030\u1038",
                    "\u1010\u1031\u1038",
                    "\u1000\u103c\u102c",
                    "\u1014\u1031",
                }
            },
            { "DayNarrows",
                new String[] {
                    "\u1010",
                    "\u1010",
                    "\u1021",
                    "\u1017",
                    "\u1000",
                    "\u101e",
                    "\u1005",
                }
            },
            { "QuarterNames",
                new String[] {
                    "\u1015\u1011\u1019 \u101e\u102f\u1036\u1038\u101c\u1015\u1010\u103a",
                    "\u1012\u102f\u1010\u102d\u101a \u101e\u102f\u1036\u1038\u101c\u1015\u1010\u103a",
                    "\u1010\u1010\u102d\u101a \u101e\u102f\u1036\u1038\u101c\u1015\u1010\u103a",
                    "\u1005\u1010\u102f\u1010\u1039\u1011 \u101e\u102f\u1036\u1038\u101c\u1015\u1010\u103a",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "\u1015-\u1005\u102d\u1010\u103a",
                    "\u1012\u102f-\u1005\u102d\u1010\u103a",
                    "\u1010-\u1005\u102d\u1010\u103a",
                    "\u1005-\u1005\u102d\u1010\u103a",
                }
            },
            { "QuarterNarrows",
                new String[] {
                    "\u1015",
                    "\u1012\u102f",
                    "\u1010",
                    "\u1005",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "\u1014\u1036\u1014\u1000\u103a",
                    "\u100a\u1014\u1031",
                }
            },
            { "long.Eras",
                new String[] {
                    "\u1001\u101b\u1005\u103a\u1010\u1031\u102c\u103a \u1019\u1015\u1031\u102b\u103a\u1019\u102e\u1000\u102c\u101c",
                    "\u1001\u101b\u1005\u103a\u1010\u1031\u102c\u103a \u1015\u1031\u102b\u103a\u1011\u103d\u1014\u103a\u1038\u1015\u103c\u102e\u1038\u1000\u102c\u101c",
                }
            },
            { "Eras",
                new String[] {
                    "\u1018\u102e\u1005\u102e",
                    "\u1021\u1031\u1012\u102e",
                }
            },
            { "field.era", "\u1001\u1031\u1010\u103a" },
            { "field.year", "\u1014\u103e\u1005\u103a" },
            { "field.month", "\u101c" },
            { "field.week", "\u1015\u1010\u103a" },
            { "field.weekday", "\u1014\u1031\u1037" },
            { "field.hour", "\u1014\u102c\u101b\u102e" },
            { "field.minute", "\u1019\u102d\u1014\u1005\u103a" },
            { "field.second", "\u1005\u1000\u1039\u1000\u1014\u1037\u103a" },
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
                    "EEEE, y MMMM dd",
                    "y MMMM d",
                    "y MMM d",
                    "yy/MM/dd",
                }
            },
            { "calendarname.islamic", "\u1021\u1005\u1039\u1005\u101c\u102c\u1019\u103a \u1015\u103c\u1000\u1039\u1001\u1012\u102d\u1014\u103a" },
            { "calendarname.buddhist", "\u1017\u102f\u1012\u1039\u1013 \u1015\u103c\u1000\u1039\u1001\u1012\u102d\u1014\u103a" },
            { "calendarname.japanese", "\u1002\u103b\u1015\u1014\u103a \u1015\u103c\u1000\u1039\u1001\u1012\u102d\u1014\u103a" },
            { "calendarname.gregorian", "\u1014\u102d\u102f\u1004\u103a\u1004\u1036\u1010\u1000\u102c\u101e\u102f\u1036\u1038 \u1015\u103c\u1000\u1039\u1001\u1012\u102d\u1014\u103a" },
            { "calendarname.gregory", "\u1014\u102d\u102f\u1004\u103a\u1004\u1036\u1010\u1000\u102c\u101e\u102f\u1036\u1038 \u1015\u103c\u1000\u1039\u1001\u1012\u102d\u1014\u103a" },
            { "DefaultNumberingSystem", "mymr" },
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
            { "mymr.NumberElements",
                new String[] {
                    ".",
                    ",",
                    "\u104a",
                    "%",
                    "\u1040",
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
