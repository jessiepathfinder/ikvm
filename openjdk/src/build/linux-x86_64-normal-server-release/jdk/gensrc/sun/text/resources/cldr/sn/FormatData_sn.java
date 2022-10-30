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

package sun.text.resources.cldr.sn;

import java.util.ListResourceBundle;

public class FormatData_sn extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "Ndira",
                    "Kukadzi",
                    "Kurume",
                    "Kubvumbi",
                    "Chivabvu",
                    "Chikumi",
                    "Chikunguru",
                    "Nyamavhuvhu",
                    "Gunyana",
                    "Gumiguru",
                    "Mbudzi",
                    "Zvita",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "Ndi",
                    "Kuk",
                    "Kur",
                    "Kub",
                    "Chv",
                    "Chk",
                    "Chg",
                    "Nya",
                    "Gun",
                    "Gum",
                    "Mb",
                    "Zvi",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "N",
                    "K",
                    "K",
                    "K",
                    "C",
                    "C",
                    "C",
                    "N",
                    "G",
                    "G",
                    "M",
                    "Z",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "Svondo",
                    "Muvhuro",
                    "Chipiri",
                    "Chitatu",
                    "China",
                    "Chishanu",
                    "Mugovera",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "Svo",
                    "Muv",
                    "Chip",
                    "Chit",
                    "Chin",
                    "Chis",
                    "Mug",
                }
            },
            { "DayNarrows",
                new String[] {
                    "S",
                    "M",
                    "C",
                    "C",
                    "C",
                    "C",
                    "M",
                }
            },
            { "QuarterNames",
                new String[] {
                    "Kota 1",
                    "Kota 2",
                    "Kota 3",
                    "Kota 4",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "K1",
                    "K2",
                    "K3",
                    "K4",
                }
            },
            { "long.Eras",
                new String[] {
                    "Kristo asati auya",
                    "Kristo ashaya",
                }
            },
            { "Eras",
                new String[] {
                    "BC",
                    "AD",
                }
            },
            { "field.era", "Mukore" },
            { "field.year", "Gore" },
            { "field.month", "Mwedzi" },
            { "field.week", "Vhiki" },
            { "field.weekday", "Zuva revhiki" },
            { "field.dayperiod", "Zuva" },
            { "field.hour", "Awa" },
            { "field.minute", "Mineti" },
            { "field.second", "Sekondi" },
            { "field.zone", "Nguva" },
            { "TimePatterns",
                new String[] {
                    "h:mm:ss a zzzz",
                    "h:mm:ss a z",
                    "h:mm:ss a",
                    "h:mm a",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "dd/MM/yyyy",
                }
            },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
