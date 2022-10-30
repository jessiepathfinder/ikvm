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

package sun.text.resources.cldr.lu;

import java.util.ListResourceBundle;

public class FormatData_lu extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "Ciongo",
                    "L\u00f9ishi",
                    "Lus\u00f2lo",
                    "M\u00f9uy\u00e0",
                    "Lum\u00f9ng\u00f9l\u00f9",
                    "Lufuimi",
                    "Kab\u00e0l\u00e0sh\u00ecp\u00f9",
                    "L\u00f9sh\u00eck\u00e0",
                    "Lutongolo",
                    "Lung\u00f9di",
                    "Kasw\u00e8k\u00e8s\u00e8",
                    "Cisw\u00e0",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "Cio",
                    "Lui",
                    "Lus",
                    "Muu",
                    "Lum",
                    "Luf",
                    "Kab",
                    "Lush",
                    "Lut",
                    "Lun",
                    "Kas",
                    "Cis",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "C",
                    "L",
                    "L",
                    "M",
                    "L",
                    "L",
                    "K",
                    "L",
                    "L",
                    "L",
                    "K",
                    "C",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "Lumingu",
                    "Nkodya",
                    "Nd\u00e0ay\u00e0",
                    "Ndang\u00f9",
                    "Nj\u00f2wa",
                    "Ng\u00f2vya",
                    "Lubingu",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "Lum",
                    "Nko",
                    "Ndy",
                    "Ndg",
                    "Njw",
                    "Ngv",
                    "Lub",
                }
            },
            { "DayNarrows",
                new String[] {
                    "L",
                    "N",
                    "N",
                    "N",
                    "N",
                    "N",
                    "L",
                }
            },
            { "QuarterNames",
                new String[] {
                    "Mueji 1",
                    "Mueji 2",
                    "Mueji 3",
                    "Mueji 4",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "M1",
                    "M2",
                    "M3",
                    "M4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "Dinda",
                    "Dilolo",
                }
            },
            { "long.Eras",
                new String[] {
                    "Kumpala kwa Yezu Kli",
                    "Kunyima kwa Yezu Kli",
                }
            },
            { "Eras",
                new String[] {
                    "kmp. Y.K.",
                    "kny. Y. K.",
                }
            },
            { "field.era", "Tshipungu" },
            { "field.year", "Tshidimu" },
            { "field.month", "Ngondo" },
            { "field.week", "Lubingu" },
            { "field.weekday", "Dituku dia lubingu" },
            { "field.dayperiod", "Mutantshi wa diba" },
            { "field.hour", "Diba" },
            { "field.minute", "Kasunsu" },
            { "field.second", "Kasunsukusu" },
            { "field.zone", "Nzeepu" },
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
                    "d MMM y",
                    "d/M/yyyy",
                }
            },
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
                    "#,##0.00\u00a4",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
