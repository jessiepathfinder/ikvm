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

package sun.util.resources.cldr.he;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_he extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Africa_Western = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05de\u05e2\u05e8\u05d1 \u05d0\u05e4\u05e8\u05d9\u05e7\u05d4",
               "WAST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5, \u05de\u05e2\u05e8\u05d1 \u05d0\u05e4\u05e8\u05d9\u05e7\u05d4",
               "WAST",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e2\u05e8\u05d1 \u05d0\u05e4\u05e8\u05d9\u05e7\u05d4",
               "WAT",
            };
        final String[] GMT = new String[] {
               "\u05d6\u05de\u05df \u05d2\u05e8\u05d9\u05e0\u05d9\u05e5\u05f3",
               "GMT",
               "Greenwich Summer Time",
               "GST",
               "Greenwich Time",
               "GT",
            };
        final String[] Moscow = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05de\u05d5\u05e1\u05e7\u05d1\u05d4",
               "MST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05de\u05d5\u05e1\u05e7\u05d1\u05d4",
               "MST",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05d5\u05e1\u05e7\u05d1\u05d4",
               "MT",
            };
        final String[] Omsk = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d0\u05d5\u05de\u05e1\u05e7",
               "OST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d0\u05d5\u05de\u05e1\u05e7",
               "OST",
               "\u05e9\u05e2\u05d5\u05df \u05d0\u05d5\u05de\u05e1\u05e7",
               "OT",
            };
        final String[] Hawaii_Aleutian = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d4\u05d0\u05d9\u05d9\u05dd \u05d4\u05d0\u05dc\u05d0\u05d5\u05d8\u05d9\u05d9\u05dd \u05d4\u05d5\u05d5\u05d0\u05d9",
               "HAST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d4\u05d0\u05d9\u05d9\u05dd \u05d4\u05d0\u05dc\u05d0\u05d5\u05d8\u05d9\u05d9\u05dd \u05d4\u05d5\u05d5\u05d0\u05d9",
               "HADT",
               "\u05e9\u05e2\u05d5\u05df \u05d4\u05d0\u05d9\u05d9\u05dd \u05d4\u05d0\u05dc\u05d0\u05d5\u05d8\u05d9\u05d9\u05dd \u05d4\u05d5\u05d5\u05d0\u05d9",
               "HAT",
            };
        final String[] Sakhalin = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05e1\u05d7\u05dc\u05d9\u05df",
               "SST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05e1\u05d7\u05dc\u05d9\u05df",
               "SST",
               "\u05e9\u05e2\u05d5\u05df \u05e1\u05d7\u05dc\u05d9\u05df",
               "ST",
            };
        final String[] Yakutsk = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d9\u05e7\u05d5\u05d8\u05e1\u05e7",
               "YST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d9\u05e7\u05d5\u05d8\u05e1\u05e7",
               "YST",
               "\u05e9\u05e2\u05d5\u05df \u05d9\u05e7\u05d5\u05d8\u05e1\u05e7",
               "YT",
            };
        final String[] Kazakhstan_Eastern = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05de\u05d6\u05e8\u05d7 \u05e7\u05d6\u05d7\u05e1\u05d8\u05df",
               "EKT",
               "East Kazakhstan Summer Time",
               "EKST",
               "East Kazakhstan Time",
               "EKT",
            };
        final String[] Vladivostok = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d5\u05dc\u05d3\u05d9\u05d5\u05d5\u05e1\u05d8\u05d5\u05e7",
               "VST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d5\u05dc\u05d3\u05d9\u05d5\u05d5\u05e1\u05d8\u05d5\u05e7",
               "VST",
               "\u05e9\u05e2\u05d5\u05df \u05d5\u05dc\u05d3\u05d9\u05d5\u05d5\u05e1\u05d8\u05d5\u05e7",
               "VT",
            };
        final String[] Europe_Western = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05de\u05e2\u05e8\u05d1 \u05d0\u05d9\u05e8\u05d5\u05e4\u05d4",
               "WEST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05de\u05e2\u05e8\u05d1 \u05d0\u05d9\u05e8\u05d5\u05e4\u05d4",
               "WEST",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e2\u05e8\u05d1 \u05d0\u05d9\u05e8\u05d5\u05e4\u05d4",
               "WET",
            };
        final String[] Brasilia = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d1\u05e8\u05d6\u05d9\u05dc\u05d9\u05d4",
               "BST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d1\u05e8\u05d6\u05d9\u05dc\u05d9\u05d4",
               "BST",
               "\u05e9\u05e2\u05d5\u05df \u05d1\u05e8\u05d6\u05d9\u05dc\u05d9\u05d4",
               "BT",
            };
        final String[] Hovd = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d7\u05d5\u05d1\u05d3",
               "HST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d7\u05d5\u05d1\u05d3",
               "HST",
               "\u05e9\u05e2\u05d5\u05df \u05d7\u05d5\u05d1\u05d3",
               "HT",
            };
        final String[] Indonesia_Western = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e2\u05e8\u05d1 \u05d0\u05d9\u05e0\u05d3\u05d5\u05e0\u05d6\u05d9\u05d4",
               "WIT",
               "Western Indonesia Summer Time",
               "WIST",
               "Western Indonesia Time",
               "WIT",
            };
        final String[] Amazon = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d0\u05d6\u05d5\u05e8 \u05d4\u05d0\u05de\u05d6\u05d5\u05e0\u05e1",
               "AST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d0\u05d6\u05d5\u05e8 \u05d4\u05d0\u05de\u05d6\u05d5\u05e0\u05e1",
               "AST",
               "\u05e9\u05e2\u05d5\u05df \u05d0\u05d6\u05d5\u05e8 \u05d4\u05d0\u05de\u05d6\u05d5\u05e0\u05e1",
               "AT",
            };
        final String[] Mongolia = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d0\u05d5\u05dc\u05df \u05d1\u05d8\u05d5\u05e8",
               "UBST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d0\u05d5\u05dc\u05df \u05d1\u05d8\u05d5\u05e8",
               "UBST",
               "\u05e9\u05e2\u05d5\u05df \u05d0\u05d5\u05dc\u05df \u05d1\u05d8\u05d5\u05e8",
               "UBT",
            };
        final String[] Africa_Central = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e8\u05db\u05d6 \u05d0\u05e4\u05e8\u05d9\u05e7\u05d4",
               "CAT",
               "Central Africa Summer Time",
               "CAST",
               "Central Africa Time",
               "CAT",
            };
        final String[] Indonesia_Central = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e8\u05db\u05d6 \u05d0\u05d9\u05e0\u05d3\u05d5\u05e0\u05d6\u05d9\u05d4",
               "CIT",
               "Central Indonesia Summer Time",
               "CIST",
               "Central Indonesia Time",
               "CIT",
            };
        final String[] America_Pacific = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d4\u05d0\u05d5\u05e7\u05d9\u05d9\u05e0\u05d5\u05e1 \u05d4\u05e9\u05e7\u05d8",
               "PST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5, \u05de\u05e2\u05e8\u05d1 \u05d0\u05e8\u05d4\u05f4\u05d1 (\u05dc\u05d5\u05e1 \u05d0\u05e0\u05d2\u05f3\u05dc\u05e1)",
               "PDT",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e2\u05e8\u05d1 \u05d0\u05e8\u05d4\u05f4\u05d1 (\u05dc\u05d5\u05e1 \u05d0\u05e0\u05d2\u05f3\u05dc\u05e1)",
               "PT",
            };
        final String[] Argentina_Western = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05de\u05e2\u05e8\u05d1 \u05d0\u05e8\u05d2\u05e0\u05d8\u05d9\u05e0\u05d4",
               "WAST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05de\u05e2\u05e8\u05d1 \u05d0\u05e8\u05d2\u05e0\u05d8\u05d9\u05e0\u05d4",
               "WAST",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e2\u05e8\u05d1 \u05d0\u05e8\u05d2\u05e0\u05d8\u05d9\u05e0\u05d4",
               "WAT",
            };
        final String[] Newfoundland = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05e0\u05d9\u05d5\u05e4\u05d0\u05d5\u05e0\u05d3\u05dc\u05e0\u05d3",
               "NST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05e0\u05d9\u05d5\u05e4\u05d0\u05d5\u05e0\u05d3\u05dc\u05e0\u05d3",
               "NDT",
               "\u05e9\u05e2\u05d5\u05df \u05e0\u05d9\u05d5\u05e4\u05d0\u05d5\u05e0\u05d3\u05dc\u05e0\u05d3",
               "NT",
            };
        final String[] Volgograd = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d5\u05d5\u05dc\u05d2\u05d5\u05d2\u05e8\u05d3",
               "VST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d5\u05d5\u05dc\u05d2\u05d5\u05d2\u05e8\u05d3",
               "VST",
               "\u05e9\u05e2\u05d5\u05df \u05d5\u05d5\u05dc\u05d2\u05d5\u05d2\u05e8\u05d3",
               "VT",
            };
        final String[] America_Central = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05de\u05e8\u05db\u05d6 \u05d0\u05e8\u05d4\"\u05d1",
               "CST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5, \u05de\u05e8\u05db\u05d6 \u05d0\u05e8\u05d4\u05f4\u05d1",
               "CDT",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e8\u05db\u05d6 \u05d0\u05e8\u05d4\u05f4\u05d1 (\u05d0\u05de\u05e8\u05d9\u05e7\u05d4/\u05e9\u05d9\u05e7\u05d2\u05d5)",
               "CT",
            };
        final String[] Africa_Eastern = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05de\u05d6\u05e8\u05d7 \u05d0\u05e4\u05e8\u05d9\u05e7\u05d4",
               "EAT",
               "East Africa Summer Time",
               "EAST",
               "East Africa Time",
               "EAT",
            };
        final String[] Argentina = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d0\u05e8\u05d2\u05e0\u05d8\u05d9\u05e0\u05d4",
               "AST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d0\u05e8\u05d2\u05e0\u05d8\u05d9\u05e0\u05d4",
               "AST",
               "\u05e9\u05e2\u05d5\u05df \u05d0\u05e8\u05d2\u05e0\u05d8\u05d9\u05e0\u05d4",
               "AT",
            };
        final String[] Yekaterinburg = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d9\u05e7\u05d8\u05e8\u05d9\u05e0\u05d1\u05d5\u05e8\u05d2",
               "YST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d9\u05e7\u05d8\u05e8\u05d9\u05e0\u05d1\u05d5\u05e8\u05d2",
               "YST",
               "\u05e9\u05e2\u05d5\u05df \u05d9\u05e7\u05d8\u05e8\u05d9\u05e0\u05d1\u05d5\u05e8\u05d2",
               "YT",
            };
        final String[] Lord_Howe = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05e9\u05dc \u05d0\u05d9 \u05d4\u05dc\u05d5\u05e8\u05d3 \u05d4\u05d0\u05d5",
               "LHST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05e9\u05dc \u05d0\u05d9 \u05d4\u05dc\u05d5\u05e8\u05d3 \u05d4\u05d0\u05d5",
               "LHDT",
               "\u05e9\u05e2\u05d5\u05df \u05e9\u05dc \u05d0\u05d9 \u05d4\u05dc\u05d5\u05e8\u05d3 \u05d4\u05d0\u05d5",
               "LHT",
            };
        final String[] Africa_Southern = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05d3\u05e8\u05d5\u05dd \u05d0\u05e4\u05e8\u05d9\u05e7\u05d4",
               "SAST",
               "South Africa Daylight Time",
               "SADT",
               "South Africa Time",
               "SAT",
            };
        final String[] Macquarie = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e7\u05d5\u05d5\u05d0\u05e8\u05d9",
               "MIT",
               "Macquarie Island Summer Time",
               "MIST",
               "Macquarie Island Time",
               "MIT",
            };
        final String[] Australia_Eastern = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05de\u05d6\u05e8\u05d7 \u05d0\u05d5\u05e1\u05d8\u05e8\u05dc\u05d9\u05d4",
               "AEST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05de\u05d6\u05e8\u05d7 \u05d0\u05d5\u05e1\u05d8\u05e8\u05dc\u05d9\u05d4",
               "AEDT",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05d6\u05e8\u05d7 \u05d0\u05d5\u05e1\u05d8\u05e8\u05dc\u05d9\u05d4",
               "EAT",
            };
        final String[] Irkutsk = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d0\u05d9\u05e8\u05e7\u05d5\u05d8\u05e1\u05e7",
               "IST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d0\u05d9\u05e8\u05e7\u05d5\u05d8\u05e1\u05e7",
               "IST",
               "\u05e9\u05e2\u05d5\u05df \u05d0\u05d9\u05e8\u05e7\u05d5\u05d8\u05e1\u05e7",
               "IT",
            };
        final String[] Choibalsan = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05e6'\u05d5\u05d9\u05d1\u05dc\u05e1\u05df",
               "CST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05e6'\u05d5\u05d9\u05d1\u05dc\u05e1\u05df",
               "CST",
               "\u05e9\u05e2\u05d5\u05df \u05e6'\u05d5\u05d9\u05d1\u05dc\u05e1\u05df",
               "CT",
            };
        final String[] Kazakhstan_Western = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e2\u05e8\u05d1 \u05e7\u05d6\u05d7\u05e1\u05d8\u05df",
               "WKT",
               "West Kazakhstan Summer Time",
               "WKST",
               "West Kazakhstan Time",
               "WKT",
            };
        final String[] America_Eastern = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05e9\u05dc \u05d4\u05d7\u05d5\u05e3 \u05d4\u05de\u05d6\u05e8\u05d7\u05d9",
               "EST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05de\u05d6\u05e8\u05d7 \u05d0\u05e8\u05d4\u05f4\u05d1",
               "EDT",
               "\u05e9\u05e2\u05d5\u05df \u05d4\u05d7\u05d5\u05e3 \u05d4\u05de\u05d6\u05e8\u05d7\u05d9",
               "ET",
            };
        final String[] Israel = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d9\u05e9\u05e8\u05d0\u05dc",
               "IST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d9\u05e9\u05e8\u05d0\u05dc",
               "IDT",
               "\u05e9\u05e2\u05d5\u05df \u05d9\u05e9\u05e8\u05d0\u05dc",
               "IT",
            };
        final String[] Australia_Western = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05de\u05e2\u05e8\u05d1 \u05d0\u05d5\u05e1\u05d8\u05e8\u05dc\u05d9\u05d4",
               "AWST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05de\u05e2\u05e8\u05d1 \u05d0\u05d5\u05e1\u05d8\u05e8\u05dc\u05d9\u05d4",
               "AWDT",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e2\u05e8\u05d1 \u05d0\u05d5\u05e1\u05d8\u05e8\u05dc\u05d9\u05d4",
               "WAT",
            };
        final String[] Australia_CentralWestern = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05de\u05e8\u05db\u05d6 \u05de\u05e2\u05e8\u05d1 \u05d0\u05d5\u05e1\u05d8\u05e8\u05dc\u05d9\u05d4",
               "ACWST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05de\u05e8\u05db\u05d6 \u05de\u05e2\u05e8\u05d1 \u05d0\u05d5\u05e1\u05d8\u05e8\u05dc\u05d9\u05d4",
               "ACWDT",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e8\u05db\u05d6-\u05de\u05e2\u05e8\u05d1 \u05d0\u05d5\u05e1\u05d8\u05e8\u05dc\u05d9\u05d4",
               "ACWT",
            };
        final String[] Krasnoyarsk = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05e7\u05e8\u05e1\u05e0\u05d5\u05d9\u05d0\u05e8\u05e1\u05e7",
               "KST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05e7\u05e8\u05e1\u05e0\u05d5\u05d9\u05d0\u05e8\u05e1\u05e7",
               "KST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05e8\u05e1\u05e0\u05d5\u05d9\u05d0\u05e8\u05e1\u05e7",
               "KT",
            };
        final String[] Indonesia_Eastern = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05de\u05d6\u05e8\u05d7 \u05d0\u05d9\u05e0\u05d3\u05d5\u05e0\u05d6\u05d9\u05d4",
               "EIT",
               "Eastern Indonesia Summer Time",
               "EIST",
               "Eastern Indonesia Time",
               "EIT",
            };
        final String[] Noronha = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05e4\u05e8\u05e0\u05e0\u05d3\u05d5 \u05d3\u05d4 \u05e0\u05d5\u05e8\u05d5\u05e0\u05d9\u05d4",
               "FNST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05e4\u05e8\u05e0\u05e0\u05d3\u05d5 \u05d3\u05d4 \u05e0\u05d5\u05e8\u05d5\u05e0\u05d9\u05d4",
               "FNST",
               "\u05e9\u05e2\u05d5\u05df \u05e4\u05e8\u05e0\u05e0\u05d3\u05d5 \u05d3\u05d4 \u05e0\u05d5\u05e8\u05d5\u05e0\u05d9\u05d4",
               "FNT",
            };
        final String[] Novosibirsk = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05e0\u05d5\u05d1\u05d5\u05e1\u05d9\u05d1\u05d9\u05e8\u05e1\u05e7",
               "NST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05e0\u05d5\u05d1\u05d5\u05e1\u05d9\u05d1\u05d9\u05e8\u05e1\u05e7",
               "NST",
               "\u05e9\u05e2\u05d5\u05df \u05e0\u05d5\u05d1\u05d5\u05e1\u05d9\u05d1\u05d9\u05e8\u05e1\u05e7",
               "NT",
            };
        final String[] America_Mountain = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d0\u05d6\u05d5\u05e8 \u05d4\u05d4\u05e8\u05d9\u05dd",
               "MST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5, \u05d0\u05d6\u05d5\u05e8 \u05d4\u05d4\u05e8\u05d9\u05dd \u05d1\u05d0\u05e8\u05d4\u05f4\u05d1",
               "MDT",
               "\u05e9\u05e2\u05d5\u05df \u05d0\u05d6\u05d5\u05e8 \u05d4\u05d4\u05e8\u05d9\u05dd \u05d1\u05d0\u05e8\u05d4\u05f4\u05d1 (\u05d3\u05e0\u05d5\u05d5\u05e8)",
               "MT",
            };
        final String[] Europe_Central = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05de\u05e8\u05db\u05d6 \u05d0\u05d9\u05e8\u05d5\u05e4\u05d4",
               "CEST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05de\u05e8\u05db\u05d6 \u05d0\u05d9\u05e8\u05d5\u05e4\u05d4",
               "CEST",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e8\u05db\u05d6 \u05d0\u05d9\u05e8\u05d5\u05e4\u05d4",
               "CET",
            };
        final String[] Alaska = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05d0\u05dc\u05e1\u05e7\u05d4",
               "AKST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d0\u05dc\u05e1\u05e7\u05d4",
               "AKDT",
               "\u05e9\u05e2\u05d5\u05df \u05d0\u05dc\u05e1\u05e7\u05d4",
               "AKT",
            };
        final String[] Australia_Central = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05de\u05e8\u05db\u05d6 \u05d0\u05d5\u05e1\u05d8\u05e8\u05dc\u05d9\u05d4",
               "ACST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05de\u05e8\u05db\u05d6 \u05d0\u05d5\u05e1\u05d8\u05e8\u05dc\u05d9\u05d4",
               "ACDT",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05e8\u05db\u05d6 \u05d0\u05d5\u05e1\u05d8\u05e8\u05dc\u05d9\u05d4",
               "CAT",
            };
        final String[] Europe_Eastern = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05de\u05d6\u05e8\u05d7 \u05d0\u05d9\u05e8\u05d5\u05e4\u05d4",
               "EEST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05de\u05d6\u05e8\u05d7 \u05d0\u05d9\u05e8\u05d5\u05e4\u05d4",
               "EEST",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05d6\u05e8\u05d7 \u05d0\u05d9\u05e8\u05d5\u05e4\u05d4",
               "EET",
            };
        final String[] Atlantic = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05d0\u05d8\u05dc\u05e0\u05d8\u05d9 \u05ea\u05e7\u05e0\u05d9",
               "AST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05d0\u05d8\u05dc\u05e0\u05d8\u05d9",
               "ADT",
               "\u05e9\u05e2\u05d5\u05df \u05d0\u05d8\u05dc\u05e0\u05d8\u05d9",
               "AT",
            };
        final String[] Magadan = new String[] {
               "\u05e9\u05e2\u05d5\u05df \u05e8\u05d2\u05d9\u05dc \u05de\u05d2\u05d3\u05df",
               "MST",
               "\u05e9\u05e2\u05d5\u05df \u05e7\u05d9\u05e5 \u05de\u05d2\u05d3\u05df",
               "MST",
               "\u05e9\u05e2\u05d5\u05df \u05de\u05d2\u05d3\u05df",
               "MT",
            };
        final Object[][] data = new Object[][] {
            { "Europe/Samara", Moscow },
            { "Africa/Douala", Africa_Western },
            { "Europe/Sofia", Europe_Eastern },
            { "Europe/Monaco", Europe_Central },
            { "Atlantic/Bermuda", Atlantic },
            { "America/Yakutat", Alaska },
            { "America/Catamarca", Argentina },
            { "Europe/Vienna", Europe_Central },
            { "America/St_Vincent", Atlantic },
            { "America/Dawson", America_Pacific },
            { "America/Port-au-Prince", America_Eastern },
            { "America/New_York", America_Eastern },
            { "Africa/Kampala", Africa_Eastern },
            { "Africa/Blantyre", Africa_Central },
            { "Europe/Volgograd", Volgograd },
            { "Africa/Mogadishu", Africa_Eastern },
            { "Atlantic/St_Helena", GMT },
            { "Europe/Mariehamn", Europe_Eastern },
            { "Africa/Malabo", Africa_Western },
            { "Africa/Gaborone", Africa_Central },
            { "America/Antigua", Atlantic },
            { "Australia/Lord_Howe", Lord_Howe },
            { "Europe/Lisbon", Europe_Western },
            { "Asia/Nicosia", Europe_Eastern },
            { "Europe/Zurich", Europe_Central },
            { "America/Winnipeg", America_Central },
            { "America/Resolute", America_Central },
            { "America/Santarem", Brasilia },
            { "America/Danmarkshavn", GMT },
            { "Europe/Dublin", GMT },
            { "America/Regina", America_Central },
            { "America/Anguilla", Atlantic },
            { "Asia/Amman", Europe_Eastern },
            { "Asia/Vladivostok", Vladivostok },
            { "Europe/Brussels", Europe_Central },
            { "Europe/Zaporozhye", Europe_Eastern },
            { "Europe/Simferopol", Europe_Eastern },
            { "America/Argentina/Ushuaia", Argentina },
            { "Indian/Mayotte", Africa_Eastern },
            { "America/North_Dakota/Center", America_Central },
            { "America/Tijuana", America_Pacific },
            { "Africa/Ndjamena", Africa_Western },
            { "Africa/Monrovia", GMT },
            { "Asia/Qyzylorda", Kazakhstan_Eastern },
            { "Europe/Istanbul", Europe_Eastern },
            { "Europe/Copenhagen", Europe_Central },
            { "America/Thule", Atlantic },
            { "America/Bahia_Banderas", America_Central },
            { "Europe/Amsterdam", Europe_Central },
            { "Asia/Hebron", Europe_Eastern },
            { "Australia/Broken_Hill", Australia_Central },
            { "America/Chihuahua", America_Mountain },
            { "America/Yellowknife", America_Mountain },
            { "Africa/Windhoek", Africa_Western },
            { "PST8PDT", America_Pacific },
            { "Antarctica/Casey", Australia_Western },
            { "America/Cayman", America_Eastern },
            { "Europe/Stockholm", Europe_Central },
            { "Africa/Bamako", GMT },
            { "Europe/Berlin", Europe_Central },
            { "America/St_Johns", Newfoundland },
            { "Africa/Asmera", Africa_Eastern },
            { "Asia/Omsk", Omsk },
            { "Africa/Kinshasa", Africa_Western },
            { "Africa/Dar_es_Salaam", Africa_Eastern },
            { "Asia/Novosibirsk", Novosibirsk },
            { "Europe/Chisinau", Europe_Eastern },
            { "Asia/Sakhalin", Sakhalin },
            { "America/Argentina/Tucuman", Argentina },
            { "Europe/Budapest", Europe_Central },
            { "America/Curacao", Atlantic },
            { "Asia/Choibalsan", Choibalsan },
            { "Africa/Tunis", Europe_Central },
            { "Africa/Maseru", Africa_Southern },
            { "America/Indiana/Winamac", America_Eastern },
            { "Europe/Vaduz", Europe_Central },
            { "Asia/Ulaanbaatar", Mongolia },
            { "Europe/Jersey", GMT },
            { "Africa/Niamey", Africa_Western },
            { "America/Thunder_Bay", America_Eastern },
            { "Europe/Prague", Europe_Central },
            { "Africa/Djibouti", Africa_Eastern },
            { "America/Toronto", America_Eastern },
            { "Africa/Harare", Africa_Central },
            { "America/Montserrat", Atlantic },
            { "Pacific/Honolulu", Hawaii_Aleutian },
            { "America/Merida", America_Central },
            { "America/Recife", Brasilia },
            { "Africa/Sao_Tome", GMT },
            { "America/Porto_Velho", Amazon },
            { "America/Costa_Rica", America_Central },
            { "America/Indianapolis", America_Eastern },
            { "America/Fortaleza", Brasilia },
            { "America/Mexico_City", America_Central },
            { "Asia/Oral", Kazakhstan_Western },
            { "America/El_Salvador", America_Central },
            { "Africa/Lusaka", Africa_Central },
            { "America/Tortola", Atlantic },
            { "Europe/Kaliningrad", GMT },
            { "Asia/Damascus", Europe_Eastern },
            { "Africa/Ouagadougou", GMT },
            { "America/Port_of_Spain", Atlantic },
            { "America/Tegucigalpa", America_Central },
            { "Asia/Novokuznetsk", Novosibirsk },
            { "America/Kentucky/Monticello", America_Eastern },
            { "CST6CDT", America_Central },
            { "America/Halifax", Atlantic },
            { "Europe/Vilnius", Europe_Eastern },
            { "EST5EDT", America_Eastern },
            { "America/Managua", America_Central },
            { "America/North_Dakota/Beulah", America_Central },
            { "Africa/Bujumbura", Africa_Central },
            { "America/Nome", Alaska },
            { "America/Moncton", Atlantic },
            { "Atlantic/Faeroe", Europe_Western },
            { "America/Maceio", Brasilia },
            { "America/Rio_Branco", Amazon },
            { "Africa/Dakar", GMT },
            { "Europe/Podgorica", Europe_Central },
            { "America/Belize", America_Central },
            { "America/Vancouver", America_Pacific },
            { "America/Cuiaba", Amazon },
            { "Atlantic/Canary", Europe_Western },
            { "America/Rankin_Inlet", America_Central },
            { "Asia/Jerusalem", Israel },
            { "America/Indiana/Vincennes", America_Eastern },
            { "Europe/Oslo", Europe_Central },
            { "America/Guatemala", America_Central },
            { "Europe/Vatican", Europe_Central },
            { "America/Montreal", America_Eastern },
            { "Africa/Johannesburg", Africa_Southern },
            { "America/Glace_Bay", Atlantic },
            { "Europe/Tallinn", Europe_Eastern },
            { "America/Cambridge_Bay", America_Mountain },
            { "America/Ojinaga", America_Mountain },
            { "Australia/Brisbane", Australia_Eastern },
            { "Europe/Uzhgorod", Europe_Eastern },
            { "America/Barbados", Atlantic },
            { "America/Grenada", Atlantic },
            { "Arctic/Longyearbyen", Europe_Central },
            { "Africa/Nairobi", Africa_Eastern },
            { "Asia/Gaza", Europe_Eastern },
            { "America/Louisville", America_Eastern },
            { "Europe/Paris", Europe_Central },
            { "America/Lower_Princes", Atlantic },
            { "Africa/Lagos", Africa_Western },
            { "Asia/Irkutsk", Irkutsk },
            { "Africa/Porto-Novo", Africa_Western },
            { "Africa/Accra", GMT },
            { "Europe/Sarajevo", Europe_Central },
            { "America/Blanc-Sablon", Atlantic },
            { "Africa/Maputo", Africa_Central },
            { "Africa/Juba", Africa_Eastern },
            { "America/Metlakatla", America_Pacific },
            { "America/Marigot", Atlantic },
            { "America/Indiana/Knox", America_Central },
            { "Europe/Kiev", Europe_Eastern },
            { "Africa/Cairo", Europe_Eastern },
            { "Europe/Belgrade", Europe_Central },
            { "Europe/Isle_of_Man", GMT },
            { "Europe/Moscow", Moscow },
            { "America/Inuvik", America_Mountain },
            { "Africa/Bissau", GMT },
            { "America/Jamaica", America_Eastern },
            { "Africa/Abidjan", GMT },
            { "Indian/Comoro", Africa_Eastern },
            { "Europe/Malta", Europe_Central },
            { "Europe/Madrid", Europe_Central },
            { "Atlantic/Reykjavik", GMT },
            { "America/Manaus", Amazon },
            { "America/Indiana/Vevay", America_Eastern },
            { "Australia/Hobart", Australia_Eastern },
            { "Asia/Magadan", Magadan },
            { "America/Argentina/Rio_Gallegos", Argentina },
            { "America/Indiana/Marengo", America_Eastern },
            { "Australia/Melbourne", Australia_Eastern },
            { "Indian/Antananarivo", Africa_Eastern },
            { "Asia/Pontianak", Indonesia_Western },
            { "Asia/Aqtobe", Kazakhstan_Western },
            { "Africa/Mbabane", Africa_Southern },
            { "Australia/Sydney", Australia_Eastern },
            { "America/Phoenix", America_Mountain },
            { "Europe/Luxembourg", Europe_Central },
            { "Africa/Banjul", GMT },
            { "Asia/Makassar", Indonesia_Central },
            { "America/Anchorage", Alaska },
            { "Australia/Currie", Australia_Eastern },
            { "America/Argentina/La_Rioja", Argentina },
            { "America/Cancun", America_Central },
            { "Africa/Tripoli", Europe_Eastern },
            { "Africa/Khartoum", Africa_Eastern },
            { "America/Jujuy", Argentina },
            { "Europe/Rome", Europe_Central },
            { "America/Buenos_Aires", Argentina },
            { "America/Dawson_Creek", America_Mountain },
            { "Europe/Bucharest", Europe_Eastern },
            { "Asia/Anadyr", Magadan },
            { "Europe/Helsinki", Europe_Eastern },
            { "America/Matamoros", America_Central },
            { "America/Argentina/San_Juan", Argentina },
            { "Europe/Athens", Europe_Eastern },
            { "America/Puerto_Rico", Atlantic },
            { "America/Denver", America_Mountain },
            { "America/Coral_Harbour", America_Eastern },
            { "Australia/Eucla", Australia_CentralWestern },
            { "America/Cordoba", Argentina },
            { "America/Detroit", America_Eastern },
            { "America/Nassau", America_Eastern },
            { "America/Swift_Current", America_Central },
            { "America/Indiana/Tell_City", America_Central },
            { "America/Campo_Grande", Amazon },
            { "America/Hermosillo", America_Mountain },
            { "America/Boise", America_Mountain },
            { "America/Whitehorse", America_Pacific },
            { "America/St_Kitts", Atlantic },
            { "Asia/Jayapura", Indonesia_Eastern },
            { "Europe/Guernsey", GMT },
            { "Europe/San_Marino", Europe_Central },
            { "America/Pangnirtung", America_Eastern },
            { "America/Santa_Isabel", America_Pacific },
            { "Asia/Almaty", Kazakhstan_Eastern },
            { "Europe/Ljubljana", Europe_Central },
            { "America/Rainy_River", America_Central },
            { "America/Belem", Brasilia },
            { "America/Chicago", America_Central },
            { "America/Sao_Paulo", Brasilia },
            { "America/Menominee", America_Central },
            { "America/Boa_Vista", Amazon },
            { "America/Mazatlan", America_Mountain },
            { "America/Indiana/Petersburg", America_Eastern },
            { "America/Iqaluit", America_Eastern },
            { "Africa/Algiers", Europe_Central },
            { "America/Juneau", Alaska },
            { "America/Araguaina", Brasilia },
            { "America/Martinique", Atlantic },
            { "America/Mendoza", Argentina },
            { "America/St_Lucia", Atlantic },
            { "Africa/Conakry", GMT },
            { "Asia/Yakutsk", Yakutsk },
            { "America/Panama", America_Eastern },
            { "Europe/Gibraltar", Europe_Central },
            { "America/Aruba", Atlantic },
            { "America/North_Dakota/New_Salem", America_Central },
            { "America/Adak", Hawaii_Aleutian },
            { "Africa/Freetown", GMT },
            { "America/Argentina/San_Luis", Argentina_Western },
            { "Africa/Libreville", Africa_Western },
            { "America/St_Thomas", Atlantic },
            { "Australia/Lindeman", Australia_Eastern },
            { "Europe/Minsk", Europe_Eastern },
            { "Asia/Hovd", Hovd },
            { "America/Bahia", Brasilia },
            { "America/Shiprock", America_Mountain },
            { "Australia/Perth", Australia_Western },
            { "Asia/Yekaterinburg", Yekaterinburg },
            { "Europe/Riga", Europe_Eastern },
            { "America/Grand_Turk", America_Eastern },
            { "Asia/Jakarta", Indonesia_Western },
            { "America/Edmonton", America_Mountain },
            { "Africa/Kigali", Africa_Central },
            { "America/Santo_Domingo", Atlantic },
            { "America/Los_Angeles", America_Pacific },
            { "America/Creston", America_Mountain },
            { "America/Goose_Bay", Atlantic },
            { "Africa/Nouakchott", GMT },
            { "America/Noronha", Noronha },
            { "Europe/Tirane", Europe_Central },
            { "America/Nipigon", America_Eastern },
            { "America/Dominica", Atlantic },
            { "Antarctica/Macquarie", Macquarie },
            { "Australia/Darwin", Australia_Central },
            { "MST7MDT", America_Mountain },
            { "Europe/Skopje", Europe_Central },
            { "Australia/Adelaide", Australia_Central },
            { "Africa/Ceuta", Europe_Central },
            { "Africa/El_Aaiun", Europe_Western },
            { "Africa/Luanda", Africa_Western },
            { "Europe/Andorra", Europe_Central },
            { "Africa/Addis_Ababa", Africa_Eastern },
            { "Asia/Krasnoyarsk", Krasnoyarsk },
            { "Africa/Casablanca", Europe_Western },
            { "America/St_Barthelemy", Atlantic },
            { "Pacific/Johnston", Hawaii_Aleutian },
            { "America/Argentina/Salta", Argentina },
            { "America/Kralendijk", Atlantic },
            { "Asia/Beirut", Europe_Eastern },
            { "Africa/Brazzaville", Africa_Western },
            { "Europe/Bratislava", Europe_Central },
            { "America/Guadeloupe", Atlantic },
            { "Africa/Bangui", Africa_Western },
            { "Asia/Kamchatka", Magadan },
            { "Asia/Aqtau", Kazakhstan_Western },
            { "Europe/Zagreb", Europe_Central },
            { "America/Eirunepe", Amazon },
            { "Africa/Lubumbashi", Africa_Central },
            { "Europe/Warsaw", Europe_Central },
            { "Africa/Lome", GMT },
            { "America/Monterrey", America_Central },
            { "Europe/London", GMT },
            { "Atlantic/Madeira", Europe_Western },
            { "America/Sitka", Alaska },
        };
        return data;
    }
}
