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

package sun.text.resources.cldr.ne;

import java.util.ListResourceBundle;

public class FormatData_ne extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNarrows",
                new String[] {
                    "\u0967",
                    "\u0968",
                    "\u0969",
                    "\u096a",
                    "\u096b",
                    "\u096c",
                    "\u096d",
                    "\u096e",
                    "\u096f",
                    "\u0967\u0966",
                    "\u0967\u0967",
                    "\u0967\u0968",
                    "",
                }
            },
            { "DayNarrows",
                new String[] {
                    "\u0967",
                    "\u0968",
                    "\u0969",
                    "\u096a",
                    "\u096b",
                    "\u096c",
                    "\u096d",
                }
            },
            { "QuarterNarrows",
                new String[] {
                    "\u0967",
                    "\u0968",
                    "\u0969",
                    "\u096a",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "\u092a\u0942\u0930\u094d\u0935 \u092e\u0927\u094d\u092f\u093e\u0928\u094d\u0939",
                    "\u0909\u0924\u094d\u0924\u0930 \u092e\u0927\u094d\u092f\u093e\u0928\u094d\u0939",
                }
            },
            { "Eras",
                new String[] {
                    "\u0908\u0938\u093e \u092a\u0942\u0930\u094d\u0935",
                    "\u0938\u0928\u094d",
                }
            },
            { "field.era", "\u0915\u093e\u0932" },
            { "field.year", "\u092c\u0930\u094d\u0937" },
            { "field.month", "\u092e\u0939\u093f\u0928\u093e" },
            { "field.week", "\u0939\u092a\u094d\u0924\u093e" },
            { "field.weekday", "\u0939\u092a\u094d\u0924\u093e\u0915\u094b \u092c\u093e\u0930" },
            { "field.dayperiod", "\u092a\u0942\u0930\u094d\u0935 \u092e\u0927\u094d\u092f\u093e\u0928\u094d\u0939/\u0909\u0924\u094d\u0924\u0930 \u092e\u0927\u094d\u092f\u093e\u0928\u094d\u0939" },
            { "field.hour", "\u0918\u0923\u094d\u091f\u093e" },
            { "field.minute", "\u092e\u093f\u0928\u0947\u091f" },
            { "field.second", "\u0926\u094b\u0938\u094d\u0930\u094b" },
            { "field.zone", "\u0915\u094d\u0937\u0947\u0924\u094d\u0930" },
            { "calendarname.islamic", "\u0907\u0938\u094d\u0932\u093e\u092e\u0940 \u092a\u093e\u0924\u094d\u0930\u094b" },
            { "calendarname.roc", "\u091a\u093f\u0928\u093f\u0901\u092f\u093e \u0917\u0923\u0924\u0928\u094d\u0924\u094d\u0930 \u092a\u093e\u0924\u094d\u0930\u094b" },
            { "calendarname.buddhist", "\u092c\u0941\u0926\u094d\u0927\u093f\u0937\u094d\u091f \u092a\u093e\u0924\u094d\u0930\u094b" },
            { "calendarname.japanese", "\u091c\u093e\u092a\u093e\u0928\u0940 \u092a\u093e\u0924\u094d\u0930\u094b" },
            { "calendarname.gregorian", "\u0917\u094d\u0930\u0947\u0917\u094b\u0930\u093f\u092f\u0928 \u092a\u093e\u0924\u094d\u0930\u094b" },
            { "calendarname.gregory", "\u0917\u094d\u0930\u0947\u0917\u094b\u0930\u093f\u092f\u0928 \u092a\u093e\u0924\u094d\u0930\u094b" },
            { "calendarname.islamic-civil", "\u0907\u0938\u094d\u0932\u093e\u092e\u0940 \u0928\u093e\u0917\u0930\u093f\u0915 \u092a\u093e\u0924\u094d\u0930\u094b" },
            { "calendarname.islamicc", "\u0907\u0938\u094d\u0932\u093e\u092e\u0940 \u0928\u093e\u0917\u0930\u093f\u0915 \u092a\u093e\u0924\u094d\u0930\u094b" },
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
