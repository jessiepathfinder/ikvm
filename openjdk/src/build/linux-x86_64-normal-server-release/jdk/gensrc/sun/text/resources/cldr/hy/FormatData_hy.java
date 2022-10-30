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

package sun.text.resources.cldr.hy;

import java.util.ListResourceBundle;

public class FormatData_hy extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u0540\u0578\u0582\u0576\u057e\u0561\u0580",
                    "\u0553\u0565\u057f\u0580\u057e\u0561\u0580",
                    "\u0544\u0561\u0580\u057f",
                    "\u0531\u057a\u0580\u056b\u056c",
                    "\u0544\u0561\u0575\u056b\u057d",
                    "\u0540\u0578\u0582\u0576\u056b\u057d",
                    "\u0540\u0578\u0582\u056c\u056b\u057d",
                    "\u0555\u0563\u0578\u057d\u057f\u0578\u057d",
                    "\u054d\u0565\u057a\u057f\u0565\u0574\u0562\u0565\u0580",
                    "\u0540\u0578\u056f\u057f\u0565\u0574\u0562\u0565\u0580",
                    "\u0546\u0578\u0575\u0565\u0574\u0562\u0565\u0580",
                    "\u0534\u0565\u056f\u057f\u0565\u0574\u0562\u0565\u0580",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "\u0540\u0576\u057e",
                    "\u0553\u057f\u057e",
                    "\u0544\u0580\u057f",
                    "\u0531\u057a\u0580",
                    "\u0544\u0575\u057d",
                    "\u0540\u0576\u057d",
                    "\u0540\u056c\u057d",
                    "\u0555\u0563\u057d",
                    "\u054d\u0565\u057a",
                    "\u0540\u0578\u056f",
                    "\u0546\u0578\u0575",
                    "\u0534\u0565\u056f",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u053f\u056b\u0580\u0561\u056f\u056b",
                    "\u0535\u0580\u056f\u0578\u0582\u0577\u0561\u0562\u0569\u056b",
                    "\u0535\u0580\u0565\u0584\u0577\u0561\u0562\u0569\u056b",
                    "\u0549\u0578\u0580\u0565\u0584\u0577\u0561\u0562\u0569\u056b",
                    "\u0540\u056b\u0576\u0563\u0577\u0561\u0562\u0569\u056b",
                    "\u0548\u0582\u0580\u0562\u0561\u0569",
                    "\u0547\u0561\u0562\u0561\u0569",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u053f\u056b\u0580",
                    "\u0535\u0580\u056f",
                    "\u0535\u0580\u0584",
                    "\u0549\u0578\u0580",
                    "\u0540\u0576\u0563",
                    "\u0548\u0582\u0580",
                    "\u0547\u0561\u0562",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "\u0531\u057c\u2024",
                    "\u053f\u0565\u2024",
                }
            },
            { "Eras",
                new String[] {
                    "\u0544\u2024\u0539\u2024\u0531\u2024",
                    "\u0544\u2024\u0539\u2024",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE, MMMM d, y",
                    "MMMM dd, y",
                    "MMM d, y",
                    "MM/dd/yy",
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
                    "#0.###",
                    "#0.00\u00a0\u00a4",
                    "#0%",
                }
            },
        };
        return data;
    }
}
