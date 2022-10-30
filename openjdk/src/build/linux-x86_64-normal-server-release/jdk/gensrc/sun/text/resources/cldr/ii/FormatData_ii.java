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

package sun.text.resources.cldr.ii;

import java.util.ListResourceBundle;

public class FormatData_ii extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\ua2cd\ua1aa",
                    "\ua44d\ua1aa",
                    "\ua315\ua1aa",
                    "\ua1d6\ua1aa",
                    "\ua26c\ua1aa",
                    "\ua0d8\ua1aa",
                    "\ua3c3\ua1aa",
                    "\ua246\ua1aa",
                    "\ua22c\ua1aa",
                    "\ua2b0\ua1aa",
                    "\ua2b0\ua2aa\ua1aa",
                    "\ua2b0\ua44b\ua1aa",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\ua46d\ua18f\ua44d",
                    "\ua18f\ua282\ua2cd",
                    "\ua18f\ua282\ua44d",
                    "\ua18f\ua282\ua315",
                    "\ua18f\ua282\ua1d6",
                    "\ua18f\ua282\ua26c",
                    "\ua18f\ua282\ua0d8",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\ua46d\ua18f",
                    "\ua18f\ua2cd",
                    "\ua18f\ua44d",
                    "\ua18f\ua315",
                    "\ua18f\ua1d6",
                    "\ua18f\ua26c",
                    "\ua18f\ua0d8",
                }
            },
            { "DayNarrows",
                new String[] {
                    "\ua18f",
                    "\ua2cd",
                    "\ua44d",
                    "\ua315",
                    "\ua1d6",
                    "\ua26c",
                    "\ua0d8",
                }
            },
            { "QuarterNames",
                new String[] {
                    "\ua0c5\ua44c",
                    "\ua0c5\ua3b8",
                    "\ua0c5\ua375",
                    "\ua0c5\ua2c6",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "\ua3b8\ua111",
                    "\ua06f\ua2d2",
                }
            },
            { "Eras",
                new String[] {
                    "\ua0c5\ua2ca\ua0bf",
                    "\ua0c5\ua2ca\ua282",
                }
            },
            { "field.era", "\ua0c5\ua2ca" },
            { "field.year", "\ua20e" },
            { "field.month", "\ua1aa" },
            { "field.week", "\ua46d\ua18f" },
            { "field.weekday", "\ua18f\ua44d" },
            { "field.dayperiod", "\ua3b8\ua111/\ua06f\ua2d2" },
            { "field.hour", "\ua12e\ua209" },
            { "field.minute", "\ua0cf" },
            { "field.second", "\ua1d9" },
            { "field.zone", "\ua0c5\ua137\ua12e\ua209" },
            { "calendarname.gregorian", "\ua109\ua27b\ua0c5\ua44d" },
            { "calendarname.gregory", "\ua109\ua27b\ua0c5\ua44d" },
            { "calendarname.islamic", "\ua473\ua326\ua1c2\ua44d\ua256" },
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
        };
        return data;
    }
}
