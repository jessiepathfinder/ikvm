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

package sun.text.resources.cldr.ff;

import java.util.ListResourceBundle;

public class FormatData_ff extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "siilo",
                    "colte",
                    "mbooy",
                    "see\u0257to",
                    "duujal",
                    "korse",
                    "morso",
                    "juko",
                    "siilto",
                    "yarkomaa",
                    "jolal",
                    "bowte",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "sii",
                    "col",
                    "mbo",
                    "see",
                    "duu",
                    "kor",
                    "mor",
                    "juk",
                    "slt",
                    "yar",
                    "jol",
                    "bow",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "s",
                    "c",
                    "m",
                    "s",
                    "d",
                    "k",
                    "m",
                    "j",
                    "s",
                    "y",
                    "j",
                    "b",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "dewo",
                    "aa\u0253nde",
                    "mawbaare",
                    "njeslaare",
                    "naasaande",
                    "mawnde",
                    "hoore-biir",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "dew",
                    "aa\u0253",
                    "maw",
                    "nje",
                    "naa",
                    "mwd",
                    "hbi",
                }
            },
            { "DayNarrows",
                new String[] {
                    "d",
                    "a",
                    "m",
                    "n",
                    "n",
                    "m",
                    "h",
                }
            },
            { "QuarterNames",
                new String[] {
                    "Termes 1",
                    "Termes 2",
                    "Termes 3",
                    "Termes 4",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "T1",
                    "T2",
                    "T3",
                    "T4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "subaka",
                    "kikii\u0257e",
                }
            },
            { "long.Eras",
                new String[] {
                    "Hade Iisa",
                    "Caggal Iisa",
                }
            },
            { "Eras",
                new String[] {
                    "H-I",
                    "C-I",
                }
            },
            { "field.era", "Jamaanu" },
            { "field.year", "Hitaande" },
            { "field.month", "Lewru" },
            { "field.week", "Yontere" },
            { "field.weekday", "\u00d1al\u0257i yontere" },
            { "field.dayperiod", "Sahnga" },
            { "field.hour", "Waktu" },
            { "field.minute", "Ho\u01b4om" },
            { "field.second", "Majaango" },
            { "field.zone", "Diiwaan waktu" },
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
                    "EEEE d MMMM y",
                    "d MMMM y",
                    "d MMM, y",
                    "d/M/yyyy",
                }
            },
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
