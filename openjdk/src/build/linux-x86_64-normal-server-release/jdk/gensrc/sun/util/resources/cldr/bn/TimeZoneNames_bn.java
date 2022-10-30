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

package sun.util.resources.cldr.bn;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_bn extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Moscow = new String[] {
               "\u09ae\u09b8\u09cd\u0995\u09cb \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "MST",
               "\u09ae\u09b8\u09cd\u0995\u09cb \u0997\u09c3\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "MST",
               "\u09ae\u09b8\u09cd\u0995\u09cb \u09b8\u09ae\u09af\u09bc",
               "MT",
            };
        final String[] Omsk = new String[] {
               "\u0993\u09ae\u09b8\u09cd\u0995 \u09b8\u09ae\u09af\u09bc",
               "OST",
               "\u0993\u09ae\u09b8\u09cd\u0995 \u0997\u09c3\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "OST",
               "\u0993\u09ae\u09b8\u09cd\u0995 \u09b8\u09ae\u09af\u09bc",
               "OT",
            };
        final String[] Hawaii_Aleutian = new String[] {
               "Hawaii-Aleutian Standard Time",
               "HAST",
               "Hawaii-Aleutian Daylight Time",
               "HADT",
               "\u09b9\u09be\u0993\u09af\u09bc\u09be\u0987 \u0985\u09cd\u09af\u09be\u09b2\u09bf\u0989\u099f\u09bf\u09af\u09bc\u09be\u09a8 \u09b8\u09ae\u09af\u09bc",
               "HAT",
            };
        final String[] Sakhalin = new String[] {
               "\u09b8\u09be\u0996\u09be\u09b2\u09bf\u09a8 \u09b8\u09ae\u09af\u09bc",
               "SST",
               "\u09b8\u09be\u0996\u09be\u09b2\u09bf\u09a8 \u0997\u09c3\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "SST",
               "\u09b8\u09be\u0996\u09be\u09b2\u09bf\u09a8 \u09b8\u09ae\u09af\u09bc",
               "ST",
            };
        final String[] Yakutsk = new String[] {
               "\u09af\u09bc\u09be\u0995\u09c1\u09a4\u09b8\u09cd\u0995 \u09b8\u09ae\u09af\u09bc",
               "YST",
               "\u09af\u09bc\u09be\u0995\u09c1\u09a4\u09b8\u09cd\u0995 \u0997\u09cd\u09b0\u09c0\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "YST",
               "\u09af\u09bc\u09be\u0995\u09c1\u09a4\u09b8\u09cd\u0995 \u09b8\u09ae\u09af\u09bc",
               "YT",
            };
        final String[] Kazakhstan_Eastern = new String[] {
               "\u09aa\u09c2\u09b0\u09cd\u09ac \u0995\u099c\u09be\u0995\u09b8\u09cd\u09a4\u09be\u09a8 \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "EKT",
               "\u0995\u099c\u09be\u0995\u09b8\u09cd\u09a4\u09be\u09a8 \u09aa\u09c2\u09b0\u09cd\u09ac \u0997\u09c3\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "EKST",
               "\u09aa\u09c2\u09b0\u09cd\u09ac \u0995\u099c\u09be\u0995\u09b8\u09cd\u09a4\u09be\u09a8 \u09b8\u09ae\u09af\u09bc",
               "EKT",
            };
        final String[] Vladivostok = new String[] {
               "\u09ad\u09cd\u09b2\u09be\u09a6\u09bf\u09ad\u09cb\u09b8\u09cd\u099f\u0995 \u09b8\u09ae\u09af\u09bc",
               "VST",
               "\u09ad\u09cd\u09b2\u09be\u09a6\u09bf\u09ad\u09cb\u09b8\u09cd\u099f\u0995 \u0997\u09cd\u09b0\u09c0\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "VST",
               "\u09ad\u09cd\u09b2\u09be\u09a6\u09bf\u09ad\u09cb\u09b8\u09cd\u099f \u09b8\u09ae\u09af\u09bc",
               "VT",
            };
        final String[] Bangladesh = new String[] {
               "\u09ac\u09be\u0982\u09b2\u09be\u09a6\u09c7\u09b6 \u09b8\u09ae\u09af\u09bc",
               "BST",
               "Bangladesh Summer Time",
               "BST",
               "Bangladesh Time",
               "BT",
            };
        final String[] Brasilia = new String[] {
               "\u09ac\u09cd\u09b0\u09be\u09b8\u09bf\u09b2\u09bf\u09af\u09bc\u09be \u09b8\u09ae\u09af\u09bc",
               "BST",
               "\u09ac\u09cd\u09b0\u09be\u09b8\u09bf\u09b2\u09bf\u09af\u09bc\u09be \u0997\u09c3\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "BST",
               "\u09ac\u09cd\u09b0\u09be\u09b8\u09bf\u09b2\u09bf\u09af\u09bc\u09be \u09b8\u09ae\u09af\u09bc",
               "BT",
            };
        final String[] Hovd = new String[] {
               "\u09b9\u09cb\u09ad\u09cd\u09a1 \u09b8\u09ae\u09af\u09bc",
               "HST",
               "\u09b9\u09cb\u09ad\u09cd\u09a1 \u0997\u09c3\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "HST",
               "\u09b9\u09cb\u09ad\u09cd\u09a1 \u09b8\u09ae\u09af\u09bc",
               "HT",
            };
        final String[] Indonesia_Western = new String[] {
               "Western Indonesia Time",
               "WIT",
               "Western Indonesia Summer Time",
               "WIST",
               "\u0987\u09a8\u09cd\u09a6\u09cb\u09a8\u09c7\u09b6\u09bf\u09af\u09bc\u09be \u09aa\u09b6\u09cd\u099a\u09bf\u09ae\u09bf \u09b8\u09ae\u09af\u09bc",
               "WIT",
            };
        final String[] Amazon = new String[] {
               "Amazon Standard Time",
               "AST",
               "Amazon Summer Time",
               "AST",
               "\u0985\u09cd\u09af\u09be\u09ae\u09be\u099c\u09cb\u09a8 \u09b8\u09ae\u09af\u09bc",
               "AT",
            };
        final String[] Mongolia = new String[] {
               "\u0989\u09b2\u09be\u09a8 \u09ac\u09be\u09a4\u09cb\u09b0 \u09b8\u09ae\u09af\u09bc",
               "UBST",
               "\u0989\u09b2\u09be\u09a8 \u09ac\u09be\u09a4\u09cb\u09b0 \u0997\u09cd\u09b0\u09c0\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "UBST",
               "\u09ae\u0999\u09cd\u0997\u09cb\u09b2\u09c0\u09af\u09bc \u09b8\u09ae\u09af\u09bc",
               "UBT",
            };
        final String[] Indonesia_Central = new String[] {
               "Central Indonesia Time",
               "CIT",
               "Central Indonesia Summer Time",
               "CIST",
               "\u0987\u09a8\u09cd\u09a6\u09cb\u09a8\u09c7\u09b6\u09bf\u09af\u09bc\u09be \u0995\u09c7\u09a8\u09cd\u09a6\u09cd\u09b0\u09c0\u09af\u09bc \u09b8\u09ae\u09af\u09bc",
               "CIT",
            };
        final String[] America_Pacific = new String[] {
               "\u09aa\u09cd\u09b0\u09b6\u09be\u09a8\u09cd\u09a4 \u09ae\u09b9\u09be\u09b8\u09be\u0997\u09b0\u09c0\u09af\u09bc \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "PST",
               "\u09aa\u09cd\u09b0\u09b6\u09be\u09a8\u09cd\u09a4 \u09ae\u09b9\u09be\u09b8\u09be\u0997\u09b0\u09c0\u09af\u09bc \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09b8\u09ae\u09af\u09bc",
               "PDT",
               "\u09aa\u09cd\u09b0\u09b6\u09be\u09a8\u09cd\u09a4 \u09ae\u09b9\u09be\u09b8\u09be\u0997\u09b0\u09c0\u09af\u09bc \u09b8\u09ae\u09af\u09bc",
               "PT",
            };
        final String[] Argentina_Western = new String[] {
               "\u09aa\u09b6\u09cd\u099a\u09bf\u09ae\u09bf \u0986\u09b0\u09cd\u099c\u09c7\u09a8\u099f\u09bf\u09a8\u09be \u09b8\u09ae\u09af\u09bc",
               "WAST",
               "\u0986\u09b0\u09cd\u099c\u09c7\u09a8\u099f\u09bf\u09a8\u09be \u09aa\u09b6\u09cd\u099a\u09bf\u09ae\u09bf \u0997\u09c3\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "WAST",
               "\u0986\u09b0\u09cd\u099c\u09c7\u09a8\u099f\u09bf\u09a8\u09be \u09aa\u09b6\u09cd\u099a\u09bf\u09ae\u09bf \u09b8\u09ae\u09af\u09bc",
               "WAT",
            };
        final String[] Newfoundland = new String[] {
               "\u09a8\u09bf\u0989\u09ab\u09be\u0989\u09a8\u09cd\u09a1\u09b2\u09cd\u09af\u09be\u09a8\u09cd\u09a1 \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "NST",
               "\u09a8\u09bf\u0989\u09ab\u09be\u0989\u09a8\u09cd\u09a1\u09b2\u09cd\u09af\u09be\u09a8\u09cd\u09a1 \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09b8\u09ae\u09af\u09bc",
               "NDT",
               "\u09a8\u09bf\u0989\u09ab\u09be\u0989\u09a8\u09cd\u09a1\u09b2\u09cd\u09af\u09be\u09a8\u09cd\u09a1 \u09b8\u09ae\u09af\u09bc",
               "NT",
            };
        final String[] Volgograd = new String[] {
               "\u09ad\u09b2\u0997\u09cb\u0997\u09be\u09b0\u09cd\u09a1 \u09b8\u09ae\u09af\u09bc",
               "VST",
               "\u09ad\u09b2\u0997\u09cb\u0997\u09be\u09b0\u09cd\u09a1 \u0997\u09cd\u09b0\u09c0\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "VST",
               "\u09ad\u09b2\u0997\u09cb\u0997\u09be\u09b0\u09cd\u09a1 \u09b8\u09ae\u09af\u09bc",
               "VT",
            };
        final String[] America_Central = new String[] {
               "\u0995\u09c7\u09a8\u09cd\u09a6\u09cd\u09b0\u09c0\u09af\u09bc \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "CST",
               "\u0995\u09c7\u09a8\u09cd\u09a6\u09cd\u09b0\u09c0\u09af\u09bc \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09ae\u09b8\u09af\u09bc",
               "CDT",
               "\u0995\u09c7\u09a8\u09cd\u09a6\u09cd\u09b0\u09c0\u09af\u09bc \u09b8\u09ae\u09af\u09bc",
               "CT",
            };
        final String[] Argentina = new String[] {
               "\u0986\u09b0\u09cd\u099c\u09c7\u09a8\u099f\u09bf\u09a8\u09be \u09b8\u09ae\u09af\u09bc",
               "AST",
               "\u0986\u09b0\u09cd\u099c\u09c7\u09a8\u099f\u09bf\u09a8\u09be \u0997\u09c3\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "AST",
               "\u0986\u09b0\u09cd\u099c\u09c7\u09a8\u099f\u09bf\u09a8\u09be \u09b8\u09ae\u09af\u09bc",
               "AT",
            };
        final String[] Yekaterinburg = new String[] {
               "\u09af\u09bc\u09c7\u0995\u09be\u099f\u09c7\u09b0\u09bf\u09a8\u09ac\u09be\u09b0\u09cd\u0997 \u09b8\u09ae\u09af\u09bc",
               "YST",
               "\u09af\u09bc\u09c7\u0995\u09be\u099f\u09c7\u09b0\u09bf\u09a8\u09ac\u09be\u09b0\u09cd\u0997 \u0997\u09c3\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "YST",
               "\u09af\u09bc\u09c7\u0995\u09be\u099f\u09c7\u09b0\u09bf\u09a8\u09ac\u09be\u09b0\u09cd\u0997 \u09b8\u09ae\u09af\u09bc",
               "YT",
            };
        final String[] Lord_Howe = new String[] {
               "\u09b2\u09b0\u09cd\u09a1 \u09b9\u09be\u0993\u09af\u09bc\u09c7 \u09ae\u09be\u09a8\u0995 \u09ae\u09b8\u09af\u09bc",
               "LHST",
               "\u09b2\u09b0\u09cd\u09a1 \u09b9\u09be\u0993\u09af\u09bc\u09c7 \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09ae\u09b8\u09af\u09bc",
               "LHDT",
               "\u09b2\u09b0\u09cd\u09a1 \u09b9\u09be\u0993\u09af\u09bc\u09c7 \u09b8\u09ae\u09af\u09bc",
               "LHT",
            };
        final String[] Macquarie = new String[] {
               "Macquarie Island Time",
               "MIT",
               "Macquarie Island Summer Time",
               "MIST",
               "\u09ae\u09c7\u0995\u09c1\u09af\u09bc\u09be\u09b0\u09bf \u09b8\u09ae\u09af\u09bc",
               "MIT",
            };
        final String[] Australia_Eastern = new String[] {
               "\u0985\u09b8\u09cd\u099f\u09cd\u09b0\u09c7\u09b2\u09c0\u09af\u09bc \u09aa\u09c2\u09b0\u09cd\u09ac \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "AEST",
               "\u0985\u09b8\u09cd\u099f\u09cd\u09b0\u09c7\u09b2\u09c0\u09af\u09bc \u09aa\u09c2\u09b0\u09cd\u09ac \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09b8\u09ae\u09af\u09bc",
               "AEDT",
               "\u09aa\u09c2\u09b0\u09cd\u09ac \u0985\u09b8\u09cd\u099f\u09cd\u09b0\u09c7\u09b2\u09c0\u09af\u09bc \u09b8\u09ae\u09af\u09bc",
               "EAT",
            };
        final String[] Irkutsk = new String[] {
               "\u09af\u09bc\u09be\u0995\u09c1\u099f\u09b8\u09cd\u0995 \u09b8\u09ae\u09af\u09bc",
               "IST",
               "\u09af\u09bc\u09be\u0995\u09c1\u099f\u09b8\u09cd\u0995 \u0997\u09c3\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "IST",
               "\u09af\u09bc\u09be\u0995\u09c1\u099f\u09b8\u09cd\u0995 \u09b8\u09ae\u09af\u09bc",
               "IT",
            };
        final String[] Choibalsan = new String[] {
               "\u099a\u09bf\u09af\u09bc\u09cb\u09ac\u09be\u09b8\u09b2\u09be\u09a8 \u09b8\u09ae\u09af\u09bc",
               "CST",
               "\u099a\u09bf\u09af\u09bc\u09cb\u09ac\u09be\u09b8\u09b2\u09be\u09a8 \u0997\u09cd\u09b0\u09c0\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "CST",
               "\u099a\u09bf\u09af\u09bc\u09cb\u09ac\u09be\u09b8\u09b2\u09be\u09a8 \u09b8\u09ae\u09af\u09bc",
               "CT",
            };
        final String[] America_Eastern = new String[] {
               "\u09aa\u09c2\u09b0\u09cd\u09ac \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "EST",
               "\u09aa\u09c2\u09b0\u09cd\u09ac \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09b8\u09ae\u09af\u09bc",
               "EDT",
               "\u09aa\u09c2\u09b0\u09cd\u09ac\u09be\u099e\u09cd\u099a\u09b2\u09c0\u09af\u09bc \u09b8\u09ae\u09af\u09bc",
               "ET",
            };
        final String[] Kazakhstan_Western = new String[] {
               "\u09aa\u09b6\u09cd\u099a\u09bf\u09ae \u0995\u099c\u09be\u0995\u09b8\u09cd\u09a4\u09be\u09a8 \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "WKT",
               "\u0995\u099c\u09be\u0995\u09b8\u09cd\u09a4\u09be\u09a8 \u09aa\u09b6\u09cd\u099a\u09bf\u09ae \u0997\u09c3\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "WKST",
               "\u09aa\u09b6\u09cd\u099a\u09bf\u09ae \u0995\u099c\u09be\u0995\u09b8\u09cd\u09a4\u09be\u09a8 \u09b8\u09ae\u09af\u09bc",
               "WKT",
            };
        final String[] Australia_CentralWestern = new String[] {
               "\u0985\u09b8\u09cd\u099f\u09cd\u09b0\u09c7\u09b2\u09c0\u09af\u09bc \u0995\u09c7\u09a8\u09cd\u09a6\u09cd\u09b0\u09c0\u09af\u09bc \u09aa\u09b6\u09cd\u099a\u09bf\u09ae\u09bf \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "ACWST",
               "\u0985\u09b8\u09cd\u099f\u09cd\u09b0\u09c7\u09b2\u09c0\u09af\u09bc \u0995\u09c7\u09a8\u09cd\u09a6\u09cd\u09b0\u09c0\u09af\u09bc \u09aa\u09b6\u09cd\u099a\u09bf\u09ae\u09bf \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09b8\u09ae\u09af\u09bc",
               "ACWDT",
               "\u0985\u09b8\u09cd\u099f\u09cd\u09b0\u09c7\u09b2\u09c0\u09af\u09bc \u0995\u09c7\u09a8\u09cd\u09a6\u09cd\u09b0\u09c0\u09af\u09bc \u09aa\u09b6\u09cd\u099a\u09bf\u09ae\u09bf \u09b8\u09ae\u09af\u09bc",
               "ACWT",
            };
        final String[] Australia_Western = new String[] {
               "\u0985\u09b8\u09cd\u099f\u09cd\u09b0\u09c7\u09b2\u09bf\u09af\u09bc\u09be\u09a8 \u09aa\u09b6\u09cd\u099a\u09bf\u09ae\u09bf \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "AWST",
               "\u0985\u09b8\u09cd\u099f\u09cd\u09b0\u09c7\u09b2\u09c0\u09af\u09bc \u09aa\u09b6\u09cd\u099a\u09bf\u09ae\u09bf \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09b8\u09ae\u09af\u09bc",
               "AWDT",
               "\u09aa\u09b6\u09cd\u099a\u09bf\u09ae\u09bf \u0985\u09b8\u09cd\u099f\u09cd\u09b0\u09c7\u09b2\u09c0\u09af\u09bc \u09b8\u09ae\u09af\u09bc",
               "WAT",
            };
        final String[] Krasnoyarsk = new String[] {
               "\u0995\u09cd\u09b0\u09be\u09b8\u09a8\u09cb\u09af\u09bc\u09be\u09b0\u09cd\u09b8\u09cd\u0995\u09bf \u09b8\u09ae\u09af\u09bc",
               "KST",
               "\u0995\u09cd\u09b0\u09be\u09b8\u09a8\u09cb\u09af\u09bc\u09be\u09b0\u09cd\u09b8\u09cd\u0995\u09bf \u0997\u09cd\u09b0\u09c0\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "KST",
               "\u0995\u09cd\u09b0\u09be\u09b8\u09a8\u09cb\u09af\u09bc\u09be\u09b0\u09cd\u09b8\u09cd\u0995\u09bf \u09b8\u09ae\u09af\u09bc",
               "KT",
            };
        final String[] Indonesia_Eastern = new String[] {
               "Eastern Indonesia Time",
               "EIT",
               "Eastern Indonesia Summer Time",
               "EIST",
               "\u0987\u09a8\u09cd\u09a6\u09cb\u09a8\u09c7\u09b6\u09bf\u09af\u09bc\u09be \u09aa\u09c2\u09b0\u09cd\u09ac \u09b8\u09ae\u09af\u09bc",
               "EIT",
            };
        final String[] Noronha = new String[] {
               "\u09ab\u09be\u09b0\u09a8\u09cd\u09af\u09be\u09a8\u09cd\u09a1\u09cb \u09a1\u09c7 \u09a8\u09cb\u09b0\u09cb\u09a8\u09b9\u09be \u09b8\u09ae\u09af\u09bc",
               "FNST",
               "\u09ab\u09be\u09b0\u09a8\u09cd\u09af\u09be\u09a8\u09cd\u09a1\u09cb \u09a1\u09c7 \u09a8\u09cb\u09b0\u09cb\u09a8\u09b9\u09be \u0997\u09c3\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "FNST",
               "\u09a8\u09cb\u09b0\u09cb\u09a8\u09b9\u09be \u09b8\u09ae\u09af\u09bc",
               "FNT",
            };
        final String[] Novosibirsk = new String[] {
               "\u09a8\u09cb\u09ad\u09cb\u09b8\u09bf\u09ac\u09bf\u09af\u09bc\u09be\u09b0\u09cd\u0995\u09cd\u09b8 \u09b8\u09ae\u09af\u09bc",
               "NST",
               "\u09a8\u09cb\u09ad\u09cb\u09b8\u09bf\u09ac\u09bf\u09af\u09bc\u09be\u09b0\u09cd\u0995\u09cd\u09b8 \u0997\u09cd\u09b0\u09c0\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "NST",
               "\u09a8\u09cb\u09ad\u09cb\u09b8\u09bf\u09ac\u09bf\u09af\u09bc\u09be\u09b0\u09cd\u0995\u09cd\u09b8 \u09b8\u09ae\u09af\u09bc",
               "NT",
            };
        final String[] America_Mountain = new String[] {
               "\u09ae\u09be\u0989\u09a8\u099f\u09c7\u09a8 \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "MST",
               "\u09ae\u09be\u0989\u09a8\u099f\u09c7\u09a8 \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09b8\u09ae\u09af\u09bc",
               "MDT",
               "\u09ae\u09be\u0989\u09a8\u09cd\u099f\u09c7\u09a8 \u09b8\u09ae\u09af\u09bc",
               "MT",
            };
        final String[] India = new String[] {
               "India Standard Time",
               "IST",
               "India Daylight Time",
               "IDT",
               "India Time",
               "IT",
            };
        final String[] Alaska = new String[] {
               "\u0985\u09cd\u09af\u09be\u09b2\u09be\u09b8\u0995\u09be \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "AKST",
               "\u0986\u09b2\u09be\u09b8\u0995\u09be \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09b8\u09ae\u09af\u09bc",
               "AKDT",
               "\u0986\u09b2\u09be\u09b8\u09cd\u0995\u09be\u09b0 \u09b8\u09ae\u09af\u09bc",
               "AKT",
            };
        final String[] Australia_Central = new String[] {
               "\u0985\u09b8\u09cd\u099f\u09cd\u09b0\u09c7\u09b2\u09c0\u09af\u09bc \u0995\u09c7\u09a8\u09cd\u09a6\u09cd\u09b0\u09c0\u09af\u09bc \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "ACST",
               "\u0985\u09b8\u09cd\u099f\u09cd\u09b0\u09c7\u09b2\u09c0\u09af\u09bc \u0995\u09c7\u09a8\u09cd\u09a6\u09cd\u09b0\u09c0\u09af\u09bc \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09b8\u09ae\u09af\u09bc",
               "ACDT",
               "\u0995\u09c7\u09a8\u09cd\u09a6\u09cd\u09b0\u09c0\u09af\u09bc \u0985\u09b8\u09cd\u099f\u09cd\u09b0\u09c7\u09b2\u09c0\u09af\u09bc \u09b8\u09ae\u09af\u09bc",
               "CAT",
            };
        final String[] Atlantic = new String[] {
               "\u0985\u09a4\u09b2\u09be\u09a8\u09cd\u09a4\u09bf\u0995 \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc",
               "AST",
               "\u0985\u09a4\u09b2\u09be\u09a8\u09cd\u09a4\u09bf\u0995 \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09b8\u09ae\u09af\u09bc",
               "ADT",
               "\u0985\u09a4\u09b2\u09be\u09a8\u09cd\u09a4\u09bf\u0995 \u09b8\u09ae\u09af\u09bc",
               "AT",
            };
        final String[] Magadan = new String[] {
               "\u09ae\u09be\u0997\u09a6\u09a8 \u09b8\u09ae\u09af\u09bc",
               "MST",
               "\u09ae\u09be\u0997\u09be\u09a6\u09be\u09a8 \u0997\u09cd\u09b0\u09c0\u09b7\u09cd\u09ae\u0995\u09be\u09b2\u09c0\u09a8 \u09b8\u09ae\u09af\u09bc",
               "MST",
               "\u09ae\u09be\u0997\u09a6\u09a8 \u09b8\u09ae\u09af\u09bc",
               "MT",
            };
        final Object[][] data = new Object[][] {
            { "Europe/Samara", Moscow },
            { "Atlantic/Bermuda", Atlantic },
            { "America/Yakutat", Alaska },
            { "America/Catamarca", Argentina },
            { "America/Dawson", America_Pacific },
            { "America/St_Vincent", Atlantic },
            { "America/Port-au-Prince", America_Eastern },
            { "Asia/Colombo", India },
            { "America/New_York", America_Eastern },
            { "Europe/Volgograd", Volgograd },
            { "America/Antigua", Atlantic },
            { "Australia/Lord_Howe", Lord_Howe },
            { "America/Resolute", America_Central },
            { "America/Winnipeg", America_Central },
            { "America/Santarem", Brasilia },
            { "America/Anguilla", Atlantic },
            { "America/Regina", America_Central },
            { "Asia/Vladivostok", Vladivostok },
            { "America/Argentina/Ushuaia", Argentina },
            { "America/North_Dakota/Center", America_Central },
            { "America/Tijuana", America_Pacific },
            { "Asia/Qyzylorda", Kazakhstan_Eastern },
            { "America/Thule", Atlantic },
            { "America/Bahia_Banderas", America_Central },
            { "Australia/Broken_Hill", Australia_Central },
            { "America/Chihuahua", America_Mountain },
            { "America/Yellowknife", America_Mountain },
            { "Antarctica/Casey", Australia_Western },
            { "PST8PDT", America_Pacific },
            { "America/Cayman", America_Eastern },
            { "America/St_Johns", Newfoundland },
            { "Asia/Omsk", Omsk },
            { "Asia/Novosibirsk", Novosibirsk },
            { "America/Argentina/Tucuman", Argentina },
            { "Asia/Sakhalin", Sakhalin },
            { "America/Curacao", Atlantic },
            { "Asia/Choibalsan", Choibalsan },
            { "America/Indiana/Winamac", America_Eastern },
            { "Asia/Ulaanbaatar", Mongolia },
            { "America/Thunder_Bay", America_Eastern },
            { "America/Toronto", America_Eastern },
            { "America/Montserrat", Atlantic },
            { "Pacific/Honolulu", Hawaii_Aleutian },
            { "America/Merida", America_Central },
            { "America/Recife", Brasilia },
            { "America/Porto_Velho", Amazon },
            { "America/Costa_Rica", America_Central },
            { "America/Indianapolis", America_Eastern },
            { "America/Fortaleza", Brasilia },
            { "Asia/Oral", Kazakhstan_Western },
            { "America/Mexico_City", America_Central },
            { "America/El_Salvador", America_Central },
            { "America/Tortola", Atlantic },
            { "America/Port_of_Spain", Atlantic },
            { "America/Tegucigalpa", America_Central },
            { "Asia/Novokuznetsk", Novosibirsk },
            { "America/Kentucky/Monticello", America_Eastern },
            { "CST6CDT", America_Central },
            { "America/Halifax", Atlantic },
            { "America/North_Dakota/Beulah", America_Central },
            { "America/Managua", America_Central },
            { "EST5EDT", America_Eastern },
            { "America/Moncton", Atlantic },
            { "America/Nome", Alaska },
            { "America/Maceio", Brasilia },
            { "America/Rio_Branco", Amazon },
            { "America/Belize", America_Central },
            { "America/Cuiaba", Amazon },
            { "America/Vancouver", America_Pacific },
            { "America/Rankin_Inlet", America_Central },
            { "America/Indiana/Vincennes", America_Eastern },
            { "America/Guatemala", America_Central },
            { "America/Montreal", America_Eastern },
            { "America/Glace_Bay", Atlantic },
            { "America/Cambridge_Bay", America_Mountain },
            { "Australia/Brisbane", Australia_Eastern },
            { "America/Ojinaga", America_Mountain },
            { "America/Barbados", Atlantic },
            { "America/Grenada", Atlantic },
            { "America/Louisville", America_Eastern },
            { "America/Lower_Princes", Atlantic },
            { "Asia/Irkutsk", Irkutsk },
            { "America/Blanc-Sablon", Atlantic },
            { "America/Metlakatla", America_Pacific },
            { "America/Marigot", Atlantic },
            { "Asia/Dhaka", Bangladesh },
            { "America/Indiana/Knox", America_Central },
            { "Europe/Moscow", Moscow },
            { "America/Inuvik", America_Mountain },
            { "America/Jamaica", America_Eastern },
            { "America/Manaus", Amazon },
            { "America/Indiana/Vevay", America_Eastern },
            { "Australia/Hobart", Australia_Eastern },
            { "Asia/Magadan", Magadan },
            { "America/Indiana/Marengo", America_Eastern },
            { "America/Argentina/Rio_Gallegos", Argentina },
            { "Australia/Melbourne", Australia_Eastern },
            { "Asia/Pontianak", Indonesia_Western },
            { "Asia/Aqtobe", Kazakhstan_Western },
            { "Australia/Sydney", Australia_Eastern },
            { "America/Phoenix", America_Mountain },
            { "Asia/Makassar", Indonesia_Central },
            { "Australia/Currie", Australia_Eastern },
            { "America/Anchorage", Alaska },
            { "America/Argentina/La_Rioja", Argentina },
            { "America/Cancun", America_Central },
            { "America/Jujuy", Argentina },
            { "Asia/Calcutta", India },
            { "America/Buenos_Aires", Argentina },
            { "America/Dawson_Creek", America_Mountain },
            { "Asia/Anadyr", Magadan },
            { "America/Matamoros", America_Central },
            { "America/Argentina/San_Juan", Argentina },
            { "America/Puerto_Rico", Atlantic },
            { "America/Denver", America_Mountain },
            { "America/Coral_Harbour", America_Eastern },
            { "Australia/Eucla", Australia_CentralWestern },
            { "America/Cordoba", Argentina },
            { "America/Detroit", America_Eastern },
            { "America/Nassau", America_Eastern },
            { "America/Swift_Current", America_Central },
            { "America/Campo_Grande", Amazon },
            { "America/Indiana/Tell_City", America_Central },
            { "America/Hermosillo", America_Mountain },
            { "America/Whitehorse", America_Pacific },
            { "America/Boise", America_Mountain },
            { "America/St_Kitts", Atlantic },
            { "Asia/Jayapura", Indonesia_Eastern },
            { "America/Pangnirtung", America_Eastern },
            { "Asia/Almaty", Kazakhstan_Eastern },
            { "America/Santa_Isabel", America_Pacific },
            { "America/Rainy_River", America_Central },
            { "America/Belem", Brasilia },
            { "America/Chicago", America_Central },
            { "America/Sao_Paulo", Brasilia },
            { "America/Menominee", America_Central },
            { "America/Boa_Vista", Amazon },
            { "America/Mazatlan", America_Mountain },
            { "America/Indiana/Petersburg", America_Eastern },
            { "America/Iqaluit", America_Eastern },
            { "America/Juneau", Alaska },
            { "America/Araguaina", Brasilia },
            { "America/Martinique", Atlantic },
            { "America/Mendoza", Argentina },
            { "America/St_Lucia", Atlantic },
            { "Asia/Yakutsk", Yakutsk },
            { "America/Panama", America_Eastern },
            { "America/Aruba", Atlantic },
            { "America/North_Dakota/New_Salem", America_Central },
            { "America/Adak", Hawaii_Aleutian },
            { "America/Argentina/San_Luis", Argentina_Western },
            { "America/St_Thomas", Atlantic },
            { "Australia/Lindeman", Australia_Eastern },
            { "Asia/Hovd", Hovd },
            { "America/Bahia", Brasilia },
            { "America/Shiprock", America_Mountain },
            { "Australia/Perth", Australia_Western },
            { "Asia/Yekaterinburg", Yekaterinburg },
            { "America/Grand_Turk", America_Eastern },
            { "Asia/Jakarta", Indonesia_Western },
            { "America/Edmonton", America_Mountain },
            { "America/Santo_Domingo", Atlantic },
            { "America/Los_Angeles", America_Pacific },
            { "America/Creston", America_Mountain },
            { "America/Goose_Bay", Atlantic },
            { "America/Noronha", Noronha },
            { "America/Nipigon", America_Eastern },
            { "America/Dominica", Atlantic },
            { "Antarctica/Macquarie", Macquarie },
            { "Australia/Darwin", Australia_Central },
            { "MST7MDT", America_Mountain },
            { "Australia/Adelaide", Australia_Central },
            { "Asia/Krasnoyarsk", Krasnoyarsk },
            { "America/St_Barthelemy", Atlantic },
            { "Pacific/Johnston", Hawaii_Aleutian },
            { "America/Argentina/Salta", Argentina },
            { "America/Kralendijk", Atlantic },
            { "America/Guadeloupe", Atlantic },
            { "Asia/Kamchatka", Magadan },
            { "Asia/Aqtau", Kazakhstan_Western },
            { "America/Eirunepe", Amazon },
            { "America/Monterrey", America_Central },
            { "America/Sitka", Alaska },
        };
        return data;
    }
}
