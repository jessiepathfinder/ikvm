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

package sun.text.resources.cldr.zh;

import java.util.ListResourceBundle;

public class FormatData_zh_Hans_MO extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u4e00\u6708",
                    "\u4e8c\u6708",
                    "\u4e09\u6708",
                    "\u56db\u6708",
                    "\u4e94\u6708",
                    "\u516d\u6708",
                    "\u4e03\u6708",
                    "\u516b\u6708",
                    "\u4e5d\u6708",
                    "\u5341\u6708",
                    "\u5341\u4e00\u6708",
                    "\u5341\u4e8c\u6708",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "1\u6708",
                    "2\u6708",
                    "3\u6708",
                    "4\u6708",
                    "5\u6708",
                    "6\u6708",
                    "7\u6708",
                    "8\u6708",
                    "9\u6708",
                    "10\u6708",
                    "11\u6708",
                    "12\u6708",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "",
                }
            },
            { "QuarterNames",
                new String[] {
                    "\u7b2c\u4e00\u5b63\u5ea6",
                    "\u7b2c\u4e8c\u5b63\u5ea6",
                    "\u7b2c\u4e09\u5b63\u5ea6",
                    "\u7b2c\u56db\u5b63\u5ea6",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "1\u5b63\u5ea6",
                    "2\u5b63\u5ea6",
                    "3\u5b63\u5ea6",
                    "4\u5b63\u5ea6",
                }
            },
            { "standalone.QuarterAbbreviations",
                new String[] {
                    "1\u5b63\u5ea6",
                    "2\u5b63\u5ea6",
                    "3\u5b63\u5ea6",
                    "4\u5b63\u5ea6",
                }
            },
            { "field.era", "\u7eaa\u5143" },
            { "field.weekday", "\u661f\u671f" },
            { "field.zone", "\u65f6\u533a" },
            { "TimePatterns",
                new String[] {
                    "zzzzah:mm:ss",
                    "zah:mm:ss",
                    "ah:mm:ss",
                    "ah:mm",
                }
            },
            { "DatePatterns",
                new String[] {
                    "y\u5e74M\u6708d\u65e5EEEE",
                    "y\u5e74M\u6708d\u65e5",
                    "y\u5e74M\u6708d\u65e5",
                    "d/M/yy",
                }
            },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "Gy\u5e74M\u6708d\u65e5EEEE",
                    "Gy\u5e74M\u6708d\u65e5",
                    "Gy\u5e74M\u6708d\u65e5",
                    "Gd/M/yy",
                }
            },
            { "buddhist.DatePatterns",
                new String[] {
                    "GGGGy\u5e74M\u6708d\u65e5EEEE",
                    "GGGGy\u5e74M\u6708d\u65e5",
                    "GGGGy\u5e74M\u6708d\u65e5",
                    "GGGGd/M/yy",
                }
            },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "Gy\u5e74M\u6708d\u65e5EEEE",
                    "Gy\u5e74M\u6708d\u65e5",
                    "Gy\u5e74M\u6708d\u65e5",
                    "Gd/M/yy",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "GGGGy\u5e74M\u6708d\u65e5EEEE",
                    "GGGGy\u5e74M\u6708d\u65e5",
                    "GGGGy\u5e74M\u6708d\u65e5",
                    "GGGGd/M/yy",
                }
            },
            { "java.time.roc.DatePatterns",
                new String[] {
                    "Gy\u5e74M\u6708d\u65e5EEEE",
                    "Gy\u5e74M\u6708d\u65e5",
                    "Gy\u5e74M\u6708d\u65e5",
                    "Gd/M/yy",
                }
            },
            { "roc.DatePatterns",
                new String[] {
                    "GGGGy\u5e74M\u6708d\u65e5EEEE",
                    "GGGGy\u5e74M\u6708d\u65e5",
                    "GGGGy\u5e74M\u6708d\u65e5",
                    "GGGGd/M/yy",
                }
            },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "Gy\u5e74M\u6708d\u65e5EEEE",
                    "Gy\u5e74M\u6708d\u65e5",
                    "Gy\u5e74M\u6708d\u65e5",
                    "Gd/M/yy",
                }
            },
            { "islamic.DatePatterns",
                new String[] {
                    "GGGGy\u5e74M\u6708d\u65e5EEEE",
                    "GGGGy\u5e74M\u6708d\u65e5",
                    "GGGGy\u5e74M\u6708d\u65e5",
                    "GGGGd/M/yy",
                }
            },
        };
        return data;
    }
}
