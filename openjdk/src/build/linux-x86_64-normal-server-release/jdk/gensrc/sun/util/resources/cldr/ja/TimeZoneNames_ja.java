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

package sun.util.resources.cldr.ja;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_ja extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Falkland = new String[] {
               "\u30d5\u30a9\u30fc\u30af\u30e9\u30f3\u30c9\u8af8\u5cf6\u6a19\u6e96\u6642",
               "FIST",
               "\u30d5\u30a9\u30fc\u30af\u30e9\u30f3\u30c9\u8af8\u5cf6\u590f\u6642\u9593",
               "FIST",
               "\u30d5\u30a9\u30fc\u30af\u30e9\u30f3\u30c9\u8af8\u5cf6\u6642\u9593",
               "FIT",
            };
        final String[] Iran = new String[] {
               "\u30a4\u30e9\u30f3\u6a19\u6e96\u6642",
               "IST",
               "\u30a4\u30e9\u30f3\u590f\u6642\u9593",
               "IDT",
               "\u30a4\u30e9\u30f3\u6642\u9593",
               "IT",
            };
        final String[] Cape_Verde = new String[] {
               "\u30ab\u30fc\u30dc\u30d9\u30eb\u30c7\u6a19\u6e96\u6642",
               "CVST",
               "\u30ab\u30fc\u30dc\u30d9\u30eb\u30c7\u590f\u6642\u9593",
               "CVST",
               "\u30ab\u30fc\u30dc\u30d9\u30eb\u30c7\u6642\u9593",
               "CVT",
            };
        final String[] GMT = new String[] {
               "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642",
               "GMT",
               "Greenwich Summer Time",
               "GST",
               "Greenwich Time",
               "GT",
            };
        final String[] Omsk = new String[] {
               "\u30aa\u30e0\u30b9\u30af\u6a19\u6e96\u6642",
               "OST",
               "\u30aa\u30e0\u30b9\u30af\u590f\u6642\u9593",
               "OST",
               "\u30aa\u30e0\u30b9\u30af\u6642\u9593",
               "OT",
            };
        final String[] Hawaii_Aleutian = new String[] {
               "\u30cf\u30ef\u30a4\u2212\u30a2\u30ea\u30e5\u30fc\u30b7\u30e3\u30f3\u6a19\u6e96\u6642",
               "HAST",
               "\u30cf\u30ef\u30a4\u2212\u30a2\u30ea\u30e5\u30fc\u30b7\u30e3\u30f3\u590f\u6642\u9593",
               "HADT",
               "\u30cf\u30ef\u30a4 \u30a2\u30ea\u30e5\u30fc\u30b7\u30e3\u30f3\u6642\u9593",
               "HAT",
            };
        final String[] Sakhalin = new String[] {
               "\u30b5\u30cf\u30ea\u30f3\u6a19\u6e96\u6642",
               "SST",
               "\u30b5\u30cf\u30ea\u30f3\u590f\u6642\u9593",
               "SST",
               "\u30b5\u30cf\u30ea\u30f3\u6642\u9593",
               "ST",
            };
        final String[] Yakutsk = new String[] {
               "\u30e4\u30af\u30fc\u30c4\u30af\u6a19\u6e96\u6642",
               "YST",
               "\u30e4\u30af\u30fc\u30c4\u30af\u590f\u6642\u9593",
               "YST",
               "\u30e4\u30af\u30fc\u30c4\u30af\u6642\u9593",
               "YT",
            };
        final String[] Paraguay = new String[] {
               "\u30d1\u30e9\u30b0\u30a2\u30a4\u6a19\u6e96\u6642",
               "PST",
               "\u30d1\u30e9\u30b0\u30a2\u30a4\u590f\u6642\u9593",
               "PST",
               "\u30d1\u30e9\u30b0\u30a2\u30a4\u6642\u9593",
               "PT",
            };
        final String[] Maldives = new String[] {
               "\u30e2\u30eb\u30c7\u30a3\u30d6\u6a19\u6e96\u6642",
               "MT",
               "Maldives Summer Time",
               "MST",
               "Maldives Time",
               "MT",
            };
        final String[] Japan = new String[] {
               "\u65e5\u672c\u6a19\u6e96\u6642",
               "JST",
               "\u65e5\u672c\u590f\u6642\u9593",
               "JDT",
               "\u65e5\u672c\u6642\u9593",
               "JT",
            };
        final String[] Vladivostok = new String[] {
               "\u30a6\u30e9\u30b8\u30aa\u30b9\u30c8\u30af\u6a19\u6e96\u6642",
               "VST",
               "\u30a6\u30e9\u30b8\u30aa\u30b9\u30c8\u30af\u590f\u6642\u9593",
               "VST",
               "\u30a6\u30e9\u30b8\u30aa\u30b9\u30c8\u30af\u6642\u9593",
               "VT",
            };
        final String[] Europe_Western = new String[] {
               "\u897f\u30e8\u30fc\u30ed\u30c3\u30d1\u6a19\u6e96\u6642",
               "WEST",
               "\u897f\u30e8\u30fc\u30ed\u30c3\u30d1\u590f\u6642\u9593",
               "WEST",
               "\u897f\u30e8\u30fc\u30ed\u30c3\u30d1\u6642\u9593",
               "WET",
            };
        final String[] Bangladesh = new String[] {
               "\u30d0\u30f3\u30b0\u30e9\u30c7\u30b7\u30e5\u6a19\u6e96\u6642",
               "BST",
               "\u30d0\u30f3\u30b0\u30e9\u30c7\u30b7\u30e5\u590f\u6642\u9593",
               "BST",
               "\u30d0\u30f3\u30b0\u30e9\u30c7\u30b7\u30e5\u6642\u9593",
               "BT",
            };
        final String[] East_Timor = new String[] {
               "\u6771\u30c6\u30a3\u30e2\u30fc\u30eb\u6a19\u6e96\u6642",
               "ETT",
               "East Timor Summer Time",
               "ETST",
               "East Timor Time",
               "ETT",
            };
        final String[] Greenland_Western = new String[] {
               "\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9\u897f\u90e8\u6a19\u6e96\u6642",
               "WGST",
               "\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9\u897f\u90e8\u590f\u6642\u9593",
               "WGST",
               "\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9\u897f\u90e8\u6642\u9593",
               "WGT",
            };
        final String[] Colombia = new String[] {
               "\u30b3\u30ed\u30f3\u30d3\u30a2\u6a19\u6e96\u6642",
               "CST",
               "\u30b3\u30ed\u30f3\u30d3\u30a2\u590f\u6642\u9593",
               "CST",
               "\u30b3\u30ed\u30f3\u30d3\u30a2\u6642\u9593",
               "CT",
            };
        final String[] Suriname = new String[] {
               "\u30b9\u30ea\u30ca\u30e0\u6a19\u6e96\u6642",
               "ST",
               "Suriname Summer Time",
               "SST",
               "Suriname Time",
               "ST",
            };
        final String[] Gulf = new String[] {
               "\u6e7e\u5cb8\u6642\u9593",
               "GST",
               "Gulf Daylight Time",
               "GDT",
               "Gulf Time",
               "GT",
            };
        final String[] Hovd = new String[] {
               "\u30db\u30d6\u30c8\u6a19\u6e96\u6642",
               "HST",
               "\u30db\u30d6\u30c8\u590f\u6642\u9593",
               "HST",
               "\u30db\u30d6\u30c8\u6642\u9593",
               "HT",
            };
        final String[] Amazon = new String[] {
               "\u30a2\u30de\u30be\u30f3\u6a19\u6e96\u6642",
               "AST",
               "\u30a2\u30de\u30be\u30f3\u590f\u6642\u9593",
               "AST",
               "\u30a2\u30de\u30be\u30f3\u6642\u9593",
               "AT",
            };
        final String[] Mongolia = new String[] {
               "\u30a6\u30e9\u30f3\u30d0\u30fc\u30c8\u30eb\u6a19\u6e96\u6642",
               "UBST",
               "\u30a6\u30e9\u30f3\u30d0\u30fc\u30c8\u30eb\u590f\u6642\u9593",
               "UBST",
               "\u30a6\u30e9\u30f3\u30d0\u30fc\u30c8\u30eb\u6642\u9593",
               "UBT",
            };
        final String[] America_Pacific = new String[] {
               "\u30a2\u30e1\u30ea\u30ab\u592a\u5e73\u6d0b\u6a19\u6e96\u6642",
               "PST",
               "\u30a2\u30e1\u30ea\u30ab\u592a\u5e73\u6d0b\u590f\u6642\u9593",
               "PDT",
               "\u30a2\u30e1\u30ea\u30ab\u592a\u5e73\u6d0b\u6642\u9593",
               "PT",
            };
        final String[] Argentina_Western = new String[] {
               "\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3\u897f\u90e8\u6a19\u6e96\u6642",
               "WAST",
               "\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3\u897f\u90e8\u590f\u6642\u9593",
               "WAST",
               "\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3\u897f\u90e8\u6642\u9593",
               "WAT",
            };
        final String[] French_Guiana = new String[] {
               "\u4ecf\u9818\u30ae\u30a2\u30ca\u6a19\u6e96\u6642",
               "FGT",
               "French Guiana Summer Time",
               "FGST",
               "French Guiana Time",
               "FGT",
            };
        final String[] Greenland_Eastern = new String[] {
               "\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9\u6771\u90e8\u6a19\u6e96\u6642",
               "EGST",
               "\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9\u6771\u90e8\u590f\u6642\u9593",
               "EGST",
               "\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9\u6771\u90e8\u6642\u9593",
               "EGT",
            };
        final String[] Christmas = new String[] {
               "\u30af\u30ea\u30b9\u30de\u30b9\u5cf6\u6a19\u6e96\u6642",
               "CIT",
               "Christmas Island Summer Time",
               "CIST",
               "Christmas Island Time",
               "CIT",
            };
        final String[] Volgograd = new String[] {
               "\u30dc\u30eb\u30b4\u30b0\u30e9\u30fc\u30c9\u6a19\u6e96\u6642",
               "VST",
               "\u30dc\u30eb\u30b4\u30b0\u30e9\u30fc\u30c9\u590f\u6642\u9593",
               "VST",
               "\u30dc\u30eb\u30b4\u30b0\u30e9\u30fc\u30c9\u6642\u9593",
               "VT",
            };
        final String[] Korea = new String[] {
               "\u97d3\u56fd\u6a19\u6e96\u6642",
               "KST",
               "\u97d3\u56fd\u590f\u6642\u9593",
               "KDT",
               "\u97d3\u56fd\u6642\u9593",
               "KT",
            };
        final String[] Argentina = new String[] {
               "\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3\u6a19\u6e96\u6642",
               "AST",
               "\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3\u590f\u6642\u9593",
               "AST",
               "\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3\u6642\u9593",
               "AT",
            };
        final String[] Lord_Howe = new String[] {
               "\u30ed\u30fc\u30c9\u30cf\u30a6\u6a19\u6e96\u6642",
               "LHST",
               "\u30ed\u30fc\u30c9\u30cf\u30a6\u590f\u6642\u9593",
               "LHDT",
               "\u30ed\u30fc\u30c9\u30cf\u30a6\u6642\u9593",
               "LHT",
            };
        final String[] Syowa = new String[] {
               "\u662d\u548c\u57fa\u5730\u6642\u9593",
               "ST",
               "Syowa Summer Time",
               "SST",
               "Syowa Time",
               "ST",
            };
        final String[] Arabian = new String[] {
               "\u30a2\u30e9\u30d6\u6a19\u6e96\u6642",
               "AST",
               "\u30a2\u30e9\u30d6\u590f\u6642\u9593",
               "ADT",
               "\u30a2\u30e9\u30d6\u6642\u9593",
               "AT",
            };
        final String[] Australia_Eastern = new String[] {
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u6771\u90e8\u6a19\u6e96\u6642",
               "AEST",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u6771\u90e8\u590f\u6642\u9593",
               "AEDT",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u6771\u90e8\u6642\u9593",
               "EAT",
            };
        final String[] Irkutsk = new String[] {
               "\u30a4\u30eb\u30af\u30fc\u30c4\u30af\u6a19\u6e96\u6642",
               "IST",
               "\u30a4\u30eb\u30af\u30fc\u30c4\u30af\u590f\u6642\u9593",
               "IST",
               "\u30a4\u30eb\u30af\u30fc\u30c4\u30af\u6642\u9593",
               "IT",
            };
        final String[] Mauritius = new String[] {
               "\u30e2\u30fc\u30ea\u30b7\u30e3\u30b9\u6a19\u6e96\u6642",
               "MST",
               "\u30e2\u30fc\u30ea\u30b7\u30e3\u30b9\u590f\u6642\u9593",
               "MST",
               "\u30e2\u30fc\u30ea\u30b7\u30e3\u30b9\u6642\u9593",
               "MT",
            };
        final String[] Indian_Ocean = new String[] {
               "\u82f1\u9818\u30a4\u30f3\u30c9\u6d0b\u5730\u57df\u6a19\u6e96\u6642",
               "IOT",
               "Indian Ocean Summer Time",
               "IOST",
               "Indian Ocean Time",
               "IOT",
            };
        final String[] Choibalsan = new String[] {
               "\u30c1\u30e7\u30a4\u30d0\u30eb\u30b5\u30f3\u6a19\u6e96\u6642",
               "CST",
               "\u30c1\u30e7\u30a4\u30d0\u30eb\u30b5\u30f3\u590f\u6642\u9593",
               "CST",
               "\u30c1\u30e7\u30a4\u30d0\u30eb\u30b5\u30f3\u6642\u9593",
               "CT",
            };
        final String[] America_Eastern = new String[] {
               "\u30a2\u30e1\u30ea\u30ab\u6771\u90e8\u6a19\u6e96\u6642",
               "EST",
               "\u30a2\u30e1\u30ea\u30ab\u6771\u90e8\u590f\u6642\u9593",
               "EDT",
               "\u30a2\u30e1\u30ea\u30ab\u6771\u90e8\u6642\u9593",
               "ET",
            };
        final String[] Australia_CentralWestern = new String[] {
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u4e2d\u897f\u90e8\u6a19\u6e96\u6642",
               "ACWST",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u4e2d\u897f\u90e8\u590f\u6642\u9593",
               "ACWDT",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u4e2d\u897f\u90e8\u6642\u9593",
               "ACWT",
            };
        final String[] Australia_Western = new String[] {
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u897f\u90e8\u6a19\u6e96\u6642",
               "AWST",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u897f\u90e8\u590f\u6642\u9593",
               "AWDT",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u897f\u90e8\u6642\u9593",
               "WAT",
            };
        final String[] Krasnoyarsk = new String[] {
               "\u30af\u30e9\u30b9\u30ce\u30e4\u30eb\u30b9\u30af\u6a19\u6e96\u6642",
               "KST",
               "\u30af\u30e9\u30b9\u30ce\u30e4\u30eb\u30b9\u30af\u590f\u6642\u9593",
               "KST",
               "\u30af\u30e9\u30b9\u30ce\u30e4\u30eb\u30b9\u30af\u6642\u9593",
               "KT",
            };
        final String[] Indonesia_Eastern = new String[] {
               "\u30a4\u30f3\u30c9\u30cd\u30b7\u30a2\u6771\u90e8\u6642\u9593",
               "EIT",
               "Eastern Indonesia Summer Time",
               "EIST",
               "Eastern Indonesia Time",
               "EIT",
            };
        final String[] Venezuela = new String[] {
               "\u30d9\u30cd\u30ba\u30a8\u30e9\u6a19\u6e96\u6642",
               "VT",
               "Venezuela Summer Time",
               "VST",
               "Venezuela Time",
               "VT",
            };
        final String[] Bhutan = new String[] {
               "\u30d6\u30fc\u30bf\u30f3\u6a19\u6e96\u6642",
               "BT",
               "Bhutan Summer Time",
               "BST",
               "Bhutan Time",
               "BT",
            };
        final String[] Noronha = new String[] {
               "\u30d5\u30a7\u30eb\u30ca\u30f3\u30c9 \u30c9 \u30ce\u30ed\u30fc\u30cb\u30e3\u6a19\u6e96\u6642",
               "FNST",
               "\u30d5\u30a7\u30eb\u30ca\u30f3\u30c9 \u30c9 \u30ce\u30ed\u30fc\u30cb\u30e3\u590f\u6642\u9593",
               "FNST",
               "\u30d5\u30a7\u30eb\u30ca\u30f3\u30c9 \u30c9 \u30ce\u30ed\u30fc\u30cb\u30e3\u6642\u9593",
               "FNT",
            };
        final String[] Novosibirsk = new String[] {
               "\u30ce\u30dc\u30b7\u30d3\u30eb\u30b9\u30af\u6a19\u6e96\u6642",
               "NST",
               "\u30ce\u30dc\u30b7\u30d3\u30eb\u30b9\u30af\u590f\u6642\u9593",
               "NST",
               "\u30ce\u30dc\u30b7\u30d3\u30eb\u30b9\u30af\u6642\u9593",
               "NT",
            };
        final String[] America_Mountain = new String[] {
               "\u30a2\u30e1\u30ea\u30ab\u5c71\u5730\u6a19\u6e96\u6642",
               "MST",
               "\u30a2\u30e1\u30ea\u30ab\u5c71\u5730\u590f\u6642\u9593",
               "MDT",
               "\u30a2\u30e1\u30ea\u30ab\u5c71\u5730\u6642\u9593",
               "MT",
            };
        final String[] Norfolk = new String[] {
               "\u30ce\u30fc\u30d5\u30a9\u30fc\u30af\u8af8\u5cf6\u6642\u9593",
               "NIT",
               "Norfolk Islands Summer Time",
               "NIST",
               "Norfolk Islands Time",
               "NIT",
            };
        final String[] Vostok = new String[] {
               "\u30dc\u30b9\u30c8\u30fc\u30af\u57fa\u5730\u6642\u9593",
               "VT",
               "Vostok Summer Time",
               "VST",
               "Vostok Time",
               "VT",
            };
        final String[] Alaska = new String[] {
               "\u30a2\u30e9\u30b9\u30ab\u6a19\u6e96\u6642",
               "AKST",
               "\u30a2\u30e9\u30b9\u30ab\u590f\u6642\u9593",
               "AKDT",
               "\u30a2\u30e9\u30b9\u30ab\u6642\u9593",
               "AKT",
            };
        final String[] Armenia = new String[] {
               "\u30a2\u30eb\u30e1\u30cb\u30a2\u6a19\u6e96\u6642",
               "AST",
               "\u30a2\u30eb\u30e1\u30cb\u30a2\u590f\u6642\u9593",
               "AST",
               "\u30a2\u30eb\u30e1\u30cb\u30a2\u6642\u9593",
               "AT",
            };
        final String[] Australia_Central = new String[] {
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u4e2d\u90e8\u6a19\u6e96\u6642",
               "ACST",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u4e2d\u90e8\u590f\u6642\u9593",
               "ACDT",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u4e2d\u90e8\u6642\u9593",
               "CAT",
            };
        final String[] Azores = new String[] {
               "\u30a2\u30be\u30ec\u30b9\u6a19\u6e96\u6642",
               "AST",
               "\u30a2\u30be\u30ec\u30b9\u590f\u6642\u9593",
               "AST",
               "\u30a2\u30be\u30ec\u30b9\u6642\u9593",
               "AT",
            };
        final String[] Reunion = new String[] {
               "\u30ec\u30e6\u30cb\u30aa\u30f3\u6a19\u6e96\u6642",
               "RT",
               "Reunion Summer Time",
               "RST",
               "Reunion Time",
               "RT",
            };
        final String[] Indochina = new String[] {
               "\u30a4\u30f3\u30c9\u30b7\u30ca\u6a19\u6e96\u6642",
               "IT",
               "Indochina Summer Time",
               "IST",
               "Indochina Time",
               "IT",
            };
        final String[] Ecuador = new String[] {
               "\u30a8\u30af\u30a2\u30c9\u30eb\u6a19\u6e96\u6642",
               "ET",
               "Ecuador Summer Time",
               "EST",
               "Ecuador Time",
               "ET",
            };
        final String[] Magadan = new String[] {
               "\u30de\u30ac\u30c0\u30f3\u6a19\u6e96\u6642",
               "MST",
               "\u30de\u30ac\u30c0\u30f3\u590f\u6642\u9593",
               "MST",
               "\u30de\u30ac\u30c0\u30f3\u6642\u9593",
               "MT",
            };
        final String[] Davis = new String[] {
               "\u30c7\u30fc\u30d3\u30b9\u57fa\u5730\u6642\u9593",
               "DT",
               "Davis Summer Time",
               "DST",
               "Davis Time",
               "DT",
            };
        final String[] Cuba = new String[] {
               "\u30ad\u30e5\u30fc\u30d0\u6a19\u6e96\u6642",
               "CST",
               "\u30ad\u30e5\u30fc\u30d0\u590f\u6642\u9593",
               "CDT",
               "\u30ad\u30e5\u30fc\u30d0\u6642\u9593",
               "CT",
            };
        final String[] Africa_Western = new String[] {
               "\u897f\u30a2\u30d5\u30ea\u30ab\u6a19\u6e96\u6642",
               "WAST",
               "\u897f\u30a2\u30d5\u30ea\u30ab\u590f\u6642\u9593",
               "WAST",
               "\u897f\u30a2\u30d5\u30ea\u30ab\u6642\u9593",
               "WAT",
            };
        final String[] Moscow = new String[] {
               "\u30e2\u30b9\u30af\u30ef\u6a19\u6e96\u6642",
               "MST",
               "\u30e2\u30b9\u30af\u30ef\u590f\u6642\u9593",
               "MST",
               "\u30e2\u30b9\u30af\u30ef\u6642\u9593",
               "MT",
            };
        final String[] Kazakhstan_Eastern = new String[] {
               "\u30ab\u30b6\u30d5\u30b9\u30bf\u30f3\u6771\u90e8\u6642\u9593",
               "EKT",
               "East Kazakhstan Summer Time",
               "EKST",
               "East Kazakhstan Time",
               "EKT",
            };
        final String[] Hong_Kong = new String[] {
               "\u9999\u6e2f\u6a19\u6e96\u6642",
               "HKST",
               "\u9999\u6e2f\u590f\u6642\u9593",
               "HKST",
               "\u9999\u6e2f\u6642\u9593",
               "HKT",
            };
        final String[] Brasilia = new String[] {
               "\u30d6\u30e9\u30b8\u30ea\u30a2\u6a19\u6e96\u6642",
               "BST",
               "\u30d6\u30e9\u30b8\u30ea\u30a2\u590f\u6642\u9593",
               "BST",
               "\u30d6\u30e9\u30b8\u30ea\u30a2\u6642\u9593",
               "BT",
            };
        final String[] Cocos = new String[] {
               "\u30b3\u30b3\u30b9\u8af8\u5cf6\u6a19\u6e96\u6642",
               "CIT",
               "Cocos Islands Summer Time",
               "CIST",
               "Cocos Islands Time",
               "CIT",
            };
        final String[] Afghanistan = new String[] {
               "\u30a2\u30d5\u30ac\u30cb\u30b9\u30bf\u30f3\u6a19\u6e96\u6642",
               "AT",
               "Afghanistan Summer Time",
               "AST",
               "Afghanistan Time",
               "AT",
            };
        final String[] Indonesia_Western = new String[] {
               "\u30a4\u30f3\u30c9\u30cd\u30b7\u30a2\u897f\u90e8\u6642\u9593",
               "WIT",
               "Western Indonesia Summer Time",
               "WIST",
               "Western Indonesia Time",
               "WIT",
            };
        final String[] Brunei = new String[] {
               "\u30d6\u30eb\u30cd\u30a4\u30fb\u30c0\u30eb\u30b5\u30e9\u30fc\u30e0\u6a19\u6e96\u6642",
               "BDT",
               "Brunei Darussalam Summer Time",
               "BDST",
               "Brunei Darussalam Time",
               "BDT",
            };
        final String[] Seychelles = new String[] {
               "\u30bb\u30fc\u30b7\u30a7\u30eb\u6a19\u6e96\u6642",
               "ST",
               "Seychelles Summer Time",
               "SST",
               "Seychelles Time",
               "ST",
            };
        final String[] Africa_Central = new String[] {
               "\u4e2d\u592e\u30a2\u30d5\u30ea\u30ab\u6642\u9593",
               "CAT",
               "Central Africa Summer Time",
               "CAST",
               "Central Africa Time",
               "CAT",
            };
        final String[] South_Georgia = new String[] {
               "\u30b5\u30a6\u30b9\u30b8\u30e7\u30fc\u30b8\u30a2\u6a19\u6e96\u6642",
               "SGT",
               "South Georgia Summer Time",
               "SGST",
               "South Georgia Time",
               "SGT",
            };
        final String[] Indonesia_Central = new String[] {
               "\u30a4\u30f3\u30c9\u30cd\u30b7\u30a2\u4e2d\u90e8\u6642\u9593",
               "CIT",
               "Central Indonesia Summer Time",
               "CIST",
               "Central Indonesia Time",
               "CIT",
            };
        final String[] Georgia = new String[] {
               "\u30b0\u30eb\u30b8\u30a2\u6a19\u6e96\u6642",
               "GST",
               "\u30b0\u30eb\u30b8\u30a2\u590f\u6642\u9593",
               "GST",
               "\u30b0\u30eb\u30b8\u30a2\u6642\u9593",
               "GT",
            };
        final String[] Bolivia = new String[] {
               "\u30dc\u30ea\u30d3\u30a2\u6a19\u6e96\u6642",
               "BT",
               "Bolivia Summer Time",
               "BST",
               "Bolivia Time",
               "BT",
            };
        final String[] Peru = new String[] {
               "\u30da\u30eb\u30fc\u6a19\u6e96\u6642",
               "PST",
               "\u30da\u30eb\u30fc\u590f\u6642\u9593",
               "PST",
               "\u30da\u30eb\u30fc\u6642\u9593",
               "PT",
            };
        final String[] Chamorro = new String[] {
               "\u30c1\u30e3\u30e2\u30ed\u6642\u9593",
               "CST",
               "Chamorro Daylight Time",
               "CDT",
               "Chamorro Time",
               "CT",
            };
        final String[] Newfoundland = new String[] {
               "\u30cb\u30e5\u30fc\u30d5\u30a1\u30f3\u30c9\u30e9\u30f3\u30c9\u5cf6\u6a19\u6e96\u6642",
               "NST",
               "\u30cb\u30e5\u30fc\u30d5\u30a1\u30f3\u30c9\u30e9\u30f3\u30c9\u5cf6\u590f\u6642\u9593",
               "NDT",
               "\u30cb\u30e5\u30fc\u30d5\u30a1\u30f3\u30c9\u30e9\u30f3\u30c9\u5cf6\u6642\u9593",
               "NT",
            };
        final String[] America_Central = new String[] {
               "\u30a2\u30e1\u30ea\u30ab\u4e2d\u90e8\u6a19\u6e96\u6642",
               "CST",
               "\u30a2\u30e1\u30ea\u30ab\u4e2d\u90e8\u590f\u6642\u9593",
               "CDT",
               "\u30a2\u30e1\u30ea\u30ab\u4e2d\u90e8\u6642\u9593",
               "CT",
            };
        final String[] Africa_Eastern = new String[] {
               "\u6771\u30a2\u30d5\u30ea\u30ab\u6642\u9593",
               "EAT",
               "East Africa Summer Time",
               "EAST",
               "East Africa Time",
               "EAT",
            };
        final String[] Azerbaijan = new String[] {
               "\u30a2\u30bc\u30eb\u30d0\u30a4\u30b8\u30e3\u30f3\u6a19\u6e96\u6642",
               "AST",
               "\u30a2\u30bc\u30eb\u30d0\u30a4\u30b8\u30e3\u30f3\u590f\u6642\u9593",
               "AST",
               "\u30a2\u30bc\u30eb\u30d0\u30a4\u30b8\u30e3\u30f3\u6642\u9593",
               "AT",
            };
        final String[] Guyana = new String[] {
               "\u30ae\u30a2\u30ca\u6a19\u6e96\u6642",
               "GT",
               "Guyana Summer Time",
               "GST",
               "Guyana Time",
               "GT",
            };
        final String[] Yekaterinburg = new String[] {
               "\u30a8\u30ab\u30c6\u30ea\u30f3\u30d6\u30eb\u30b0\u6a19\u6e96\u6642",
               "YST",
               "\u30a8\u30ab\u30c6\u30ea\u30f3\u30d6\u30eb\u30b0\u590f\u6642\u9593",
               "YST",
               "\u30a8\u30ab\u30c6\u30ea\u30f3\u30d6\u30eb\u30b0\u6642\u9593",
               "YT",
            };
        final String[] China = new String[] {
               "\u4e2d\u56fd\u6a19\u6e96\u6642",
               "CST",
               "\u4e2d\u56fd\u590f\u6642\u9593",
               "CDT",
               "\u4e2d\u56fd\u6642\u9593",
               "CT",
            };
        final String[] Africa_Southern = new String[] {
               "\u5357\u30a2\u30d5\u30ea\u30ab\u6642\u9593",
               "SAST",
               "South Africa Daylight Time",
               "SADT",
               "South Africa Time",
               "SAT",
            };
        final String[] Macquarie = new String[] {
               "\u30de\u30c3\u30b3\u30fc\u30ea\u30fc\u6642\u9593",
               "MIT",
               "Macquarie Island Summer Time",
               "MIST",
               "Macquarie Island Time",
               "MIT",
            };
        final String[] French_Southern = new String[] {
               "\u30d5\u30e9\u30f3\u30b9\u9818\u5357\u65b9\u30fb\u5357\u6975\u5730\u57df\u6a19\u6e96\u6642",
               "FSAT",
               "French Southern and Antarctic Summer Time",
               "FSAST",
               "French Southern and Antarctic Time",
               "FSAT",
            };
        final String[] Chile = new String[] {
               "\u30c1\u30ea\u6a19\u6e96\u6642",
               "CST",
               "\u30c1\u30ea\u590f\u6642\u9593",
               "CST",
               "\u30c1\u30ea\u6642\u9593",
               "CT",
            };
        final String[] Kazakhstan_Western = new String[] {
               "\u30ab\u30b6\u30d5\u30b9\u30bf\u30f3\u897f\u90e8\u6642\u9593",
               "WKT",
               "West Kazakhstan Summer Time",
               "WKST",
               "West Kazakhstan Time",
               "WKT",
            };
        final String[] Israel = new String[] {
               "\u30a4\u30b9\u30e9\u30a8\u30eb\u6a19\u6e96\u6642",
               "IST",
               "\u30a4\u30b9\u30e9\u30a8\u30eb\u590f\u6642\u9593",
               "IDT",
               "\u30a4\u30b9\u30e9\u30a8\u30eb\u6642\u9593",
               "IT",
            };
        final String[] Mawson = new String[] {
               "\u30e2\u30fc\u30bd\u30f3\u57fa\u5730\u6642\u9593",
               "MT",
               "Mawson Summer Time",
               "MST",
               "Mawson Time",
               "MT",
            };
        final String[] Rothera = new String[] {
               "\u30ed\u30bc\u30e9\u7814\u7a76\u57fa\u5730\u6642\u9593",
               "RT",
               "Rothera Summer Time",
               "RST",
               "Rothera Time",
               "RT",
            };
        final String[] Europe_Central = new String[] {
               "\u4e2d\u592e\u30e8\u30fc\u30ed\u30c3\u30d1\u6a19\u6e96\u6642",
               "CEST",
               "\u4e2d\u592e\u30e8\u30fc\u30ed\u30c3\u30d1\u590f\u6642\u9593",
               "CEST",
               "\u4e2d\u592e\u30e8\u30fc\u30ed\u30c3\u30d1\u6642\u9593",
               "CET",
            };
        final String[] India = new String[] {
               "\u30a4\u30f3\u30c9\u6a19\u6e96\u6642",
               "IST",
               "India Daylight Time",
               "IDT",
               "India Time",
               "IT",
            };
        final String[] DumontDUrville = new String[] {
               "\u30c7\u30e5\u30e2\u30f3\u30fb\u30c7\u30e5\u30eb\u30f4\u30a3\u30eb\u57fa\u5730\u6642\u9593",
               "DT",
               "Dumont-d\u2019Urville Summer Time",
               "DST",
               "Dumont-d\u2019Urville Time",
               "DT",
            };
        final String[] Europe_Eastern = new String[] {
               "\u6771\u30e8\u30fc\u30ed\u30c3\u30d1\u6a19\u6e96\u6642",
               "EEST",
               "\u6771\u30e8\u30fc\u30ed\u30c3\u30d1\u590f\u6642\u9593",
               "EEST",
               "\u6771\u30e8\u30fc\u30ed\u30c3\u30d1\u6642\u9593",
               "EET",
            };
        final String[] Atlantic = new String[] {
               "\u5927\u897f\u6d0b\u6a19\u6e96\u6642",
               "AST",
               "\u5927\u897f\u6d0b\u590f\u6642\u9593",
               "ADT",
               "\u5927\u897f\u6d0b\u6642\u9593",
               "AT",
            };
        final String[] Uruguay = new String[] {
               "\u30a6\u30eb\u30b0\u30a2\u30a4\u6a19\u6e96\u6642",
               "UST",
               "\u30a6\u30eb\u30b0\u30a2\u30a4\u590f\u6642\u9593",
               "UST",
               "\u30a6\u30eb\u30b0\u30a2\u30a4\u6642\u9593",
               "UT",
            };
        final Object[][] data = new Object[][] {
            { "Europe/Sofia", Europe_Eastern },
            { "Africa/Douala", Africa_Western },
            { "America/Catamarca", Argentina },
            { "America/Dawson", America_Pacific },
            { "Asia/Yerevan", Armenia },
            { "Asia/Bangkok", Indochina },
            { "America/Bogota", Colombia },
            { "Asia/Colombo", India },
            { "Africa/Kampala", Africa_Eastern },
            { "Africa/Blantyre", Africa_Central },
            { "Europe/Volgograd", Volgograd },
            { "Atlantic/St_Helena", GMT },
            { "Europe/Mariehamn", Europe_Eastern },
            { "Africa/Malabo", Africa_Western },
            { "Asia/Nicosia", Europe_Eastern },
            { "America/Resolute", America_Central },
            { "America/Danmarkshavn", GMT },
            { "America/Anguilla", Atlantic },
            { "America/Regina", America_Central },
            { "Asia/Amman", Europe_Eastern },
            { "Europe/Brussels", Europe_Central },
            { "Europe/Simferopol", Europe_Eastern },
            { "America/Argentina/Ushuaia", Argentina },
            { "America/North_Dakota/Center", America_Central },
            { "Indian/Kerguelen", French_Southern },
            { "Europe/Istanbul", Europe_Eastern },
            { "America/Bahia_Banderas", America_Central },
            { "Asia/Hebron", Europe_Eastern },
            { "Australia/Broken_Hill", Australia_Central },
            { "PST8PDT", America_Pacific },
            { "Antarctica/Casey", Australia_Western },
            { "Europe/Stockholm", Europe_Central },
            { "Africa/Bamako", GMT },
            { "America/St_Johns", Newfoundland },
            { "Africa/Asmera", Africa_Eastern },
            { "Africa/Dar_es_Salaam", Africa_Eastern },
            { "Asia/Novosibirsk", Novosibirsk },
            { "America/Argentina/Tucuman", Argentina },
            { "Asia/Sakhalin", Sakhalin },
            { "America/Curacao", Atlantic },
            { "Europe/Budapest", Europe_Central },
            { "Africa/Tunis", Europe_Central },
            { "Pacific/Guam", Chamorro },
            { "Africa/Maseru", Africa_Southern },
            { "America/Asuncion", Paraguay },
            { "America/Indiana/Winamac", America_Eastern },
            { "Europe/Vaduz", Europe_Central },
            { "Asia/Ulaanbaatar", Mongolia },
            { "Asia/Vientiane", Indochina },
            { "Africa/Niamey", Africa_Western },
            { "America/Thunder_Bay", America_Eastern },
            { "Asia/Brunei", Brunei },
            { "Africa/Djibouti", Africa_Eastern },
            { "Asia/Tbilisi", Georgia },
            { "America/Merida", America_Central },
            { "America/Recife", Brasilia },
            { "Indian/Reunion", Reunion },
            { "Asia/Oral", Kazakhstan_Western },
            { "Africa/Lusaka", Africa_Central },
            { "America/Tortola", Atlantic },
            { "Africa/Ouagadougou", GMT },
            { "America/Tegucigalpa", America_Central },
            { "Asia/Novokuznetsk", Novosibirsk },
            { "Europe/Vilnius", Europe_Eastern },
            { "America/Moncton", Atlantic },
            { "America/Maceio", Brasilia },
            { "Africa/Dakar", GMT },
            { "America/Belize", America_Central },
            { "America/Cuiaba", Amazon },
            { "Atlantic/Canary", Europe_Western },
            { "America/Rankin_Inlet", America_Central },
            { "Asia/Jerusalem", Israel },
            { "Antarctica/Rothera", Rothera },
            { "Indian/Cocos", Cocos },
            { "America/Glace_Bay", Atlantic },
            { "Atlantic/Cape_Verde", Cape_Verde },
            { "America/Cambridge_Bay", America_Mountain },
            { "Indian/Mauritius", Mauritius },
            { "Australia/Brisbane", Australia_Eastern },
            { "America/Grenada", Atlantic },
            { "Arctic/Longyearbyen", Europe_Central },
            { "Antarctica/Vostok", Vostok },
            { "Antarctica/DumontDUrville", DumontDUrville },
            { "Africa/Nairobi", Africa_Eastern },
            { "Pacific/Norfolk", Norfolk },
            { "Europe/Paris", Europe_Central },
            { "Asia/Irkutsk", Irkutsk },
            { "America/Caracas", Venezuela },
            { "Europe/Sarajevo", Europe_Central },
            { "Africa/Maputo", Africa_Central },
            { "America/Metlakatla", America_Pacific },
            { "Atlantic/South_Georgia", South_Georgia },
            { "Asia/Baghdad", Arabian },
            { "Pacific/Saipan", Chamorro },
            { "Asia/Dhaka", Bangladesh },
            { "Africa/Cairo", Europe_Eastern },
            { "Europe/Belgrade", Europe_Central },
            { "Europe/Moscow", Moscow },
            { "America/Inuvik", America_Mountain },
            { "Africa/Bissau", GMT },
            { "Indian/Comoro", Africa_Eastern },
            { "America/Manaus", Amazon },
            { "Asia/Shanghai", China },
            { "America/Indiana/Vevay", America_Eastern },
            { "Australia/Hobart", Australia_Eastern },
            { "Asia/Dili", East_Timor },
            { "America/Indiana/Marengo", America_Eastern },
            { "Asia/Aqtobe", Kazakhstan_Western },
            { "Australia/Sydney", Australia_Eastern },
            { "Indian/Chagos", Indian_Ocean },
            { "America/Phoenix", America_Mountain },
            { "Europe/Luxembourg", Europe_Central },
            { "Asia/Makassar", Indonesia_Central },
            { "Asia/Phnom_Penh", Indochina },
            { "Australia/Currie", Australia_Eastern },
            { "America/Cancun", America_Central },
            { "Asia/Baku", Azerbaijan },
            { "Asia/Seoul", Korea },
            { "Europe/Rome", Europe_Central },
            { "Atlantic/Stanley", Falkland },
            { "America/Lima", Peru },
            { "America/Dawson_Creek", America_Mountain },
            { "Europe/Helsinki", Europe_Eastern },
            { "Asia/Anadyr", Magadan },
            { "America/Matamoros", America_Central },
            { "America/Argentina/San_Juan", Argentina },
            { "America/Denver", America_Mountain },
            { "America/Coral_Harbour", America_Eastern },
            { "Australia/Eucla", Australia_CentralWestern },
            { "America/Cordoba", Argentina },
            { "America/Detroit", America_Eastern },
            { "America/Campo_Grande", Amazon },
            { "America/Indiana/Tell_City", America_Central },
            { "America/Hermosillo", America_Mountain },
            { "America/Boise", America_Mountain },
            { "America/Whitehorse", America_Pacific },
            { "America/St_Kitts", Atlantic },
            { "Europe/Guernsey", GMT },
            { "America/Pangnirtung", America_Eastern },
            { "Asia/Tehran", Iran },
            { "America/Santa_Isabel", America_Pacific },
            { "Asia/Almaty", Kazakhstan_Eastern },
            { "America/Chicago", America_Central },
            { "America/Boa_Vista", Amazon },
            { "America/Mazatlan", America_Mountain },
            { "America/Indiana/Petersburg", America_Eastern },
            { "America/Iqaluit", America_Eastern },
            { "Africa/Algiers", Europe_Central },
            { "America/Araguaina", Brasilia },
            { "America/St_Lucia", Atlantic },
            { "Asia/Yakutsk", Yakutsk },
            { "Indian/Mahe", Seychelles },
            { "America/Panama", America_Eastern },
            { "Asia/Hong_Kong", Hong_Kong },
            { "America/Scoresbysund", Greenland_Eastern },
            { "Europe/Gibraltar", Europe_Central },
            { "America/Aruba", Atlantic },
            { "Asia/Muscat", Gulf },
            { "Africa/Freetown", GMT },
            { "America/Argentina/San_Luis", Argentina_Western },
            { "America/Paramaribo", Suriname },
            { "Australia/Lindeman", Australia_Eastern },
            { "Asia/Hovd", Hovd },
            { "America/Bahia", Brasilia },
            { "Australia/Perth", Australia_Western },
            { "America/Edmonton", America_Mountain },
            { "Antarctica/Syowa", Syowa },
            { "America/Los_Angeles", America_Pacific },
            { "America/Creston", America_Mountain },
            { "Africa/Nouakchott", GMT },
            { "America/Noronha", Noronha },
            { "America/La_Paz", Bolivia },
            { "America/Dominica", Atlantic },
            { "Asia/Saigon", Indochina },
            { "Antarctica/Macquarie", Macquarie },
            { "MST7MDT", America_Mountain },
            { "Africa/Ceuta", Europe_Central },
            { "Africa/El_Aaiun", Europe_Western },
            { "Africa/Luanda", Africa_Western },
            { "Europe/Andorra", Europe_Central },
            { "Africa/Addis_Ababa", Africa_Eastern },
            { "America/St_Barthelemy", Atlantic },
            { "America/Argentina/Salta", Argentina },
            { "America/Kralendijk", Atlantic },
            { "Asia/Beirut", Europe_Eastern },
            { "Africa/Brazzaville", Africa_Western },
            { "America/Guadeloupe", Atlantic },
            { "Africa/Bangui", Africa_Western },
            { "Asia/Kamchatka", Magadan },
            { "Asia/Aqtau", Kazakhstan_Western },
            { "America/Eirunepe", Amazon },
            { "Africa/Lubumbashi", Africa_Central },
            { "Antarctica/Palmer", Chile },
            { "America/Monterrey", America_Central },
            { "Europe/London", GMT },
            { "Europe/Samara", Moscow },
            { "Europe/Monaco", Europe_Central },
            { "Atlantic/Bermuda", Atlantic },
            { "Indian/Christmas", Christmas },
            { "America/Yakutat", Alaska },
            { "America/St_Vincent", Atlantic },
            { "Europe/Vienna", Europe_Central },
            { "America/Port-au-Prince", America_Eastern },
            { "America/New_York", America_Eastern },
            { "Africa/Mogadishu", Africa_Eastern },
            { "Asia/Qatar", Arabian },
            { "Africa/Gaborone", Africa_Central },
            { "America/Antigua", Atlantic },
            { "Australia/Lord_Howe", Lord_Howe },
            { "Europe/Lisbon", Europe_Western },
            { "America/Montevideo", Uruguay },
            { "Europe/Zurich", Europe_Central },
            { "America/Winnipeg", America_Central },
            { "America/Guyana", Guyana },
            { "America/Santarem", Brasilia },
            { "Asia/Macau", China },
            { "Europe/Dublin", GMT },
            { "Asia/Vladivostok", Vladivostok },
            { "Europe/Zaporozhye", Europe_Eastern },
            { "Indian/Mayotte", Africa_Eastern },
            { "Africa/Ndjamena", Africa_Western },
            { "America/Tijuana", America_Pacific },
            { "Africa/Monrovia", GMT },
            { "Asia/Qyzylorda", Kazakhstan_Eastern },
            { "America/Thule", Atlantic },
            { "Europe/Copenhagen", Europe_Central },
            { "Asia/Thimphu", Bhutan },
            { "Europe/Amsterdam", Europe_Central },
            { "America/Chihuahua", America_Mountain },
            { "America/Yellowknife", America_Mountain },
            { "Africa/Windhoek", Africa_Western },
            { "America/Cayman", America_Eastern },
            { "Antarctica/Davis", Davis },
            { "Europe/Berlin", Europe_Central },
            { "Africa/Kinshasa", Africa_Western },
            { "Asia/Omsk", Omsk },
            { "Europe/Chisinau", Europe_Eastern },
            { "Asia/Choibalsan", Choibalsan },
            { "Europe/Jersey", GMT },
            { "Europe/Prague", Europe_Central },
            { "Africa/Harare", Africa_Central },
            { "America/Toronto", America_Eastern },
            { "America/Montserrat", Atlantic },
            { "Pacific/Honolulu", Hawaii_Aleutian },
            { "Africa/Sao_Tome", GMT },
            { "Asia/Pyongyang", Korea },
            { "America/Porto_Velho", Amazon },
            { "America/Costa_Rica", America_Central },
            { "America/Indianapolis", America_Eastern },
            { "America/Fortaleza", Brasilia },
            { "America/Mexico_City", America_Central },
            { "America/El_Salvador", America_Central },
            { "Asia/Kashgar", China },
            { "Europe/Kaliningrad", GMT },
            { "Asia/Damascus", Europe_Eastern },
            { "America/Port_of_Spain", Atlantic },
            { "America/Kentucky/Monticello", America_Eastern },
            { "CST6CDT", America_Central },
            { "America/Halifax", Atlantic },
            { "America/North_Dakota/Beulah", America_Central },
            { "America/Managua", America_Central },
            { "EST5EDT", America_Eastern },
            { "America/Nome", Alaska },
            { "Africa/Bujumbura", Africa_Central },
            { "Atlantic/Faeroe", Europe_Western },
            { "America/Rio_Branco", Amazon },
            { "Europe/Podgorica", Europe_Central },
            { "America/Santiago", Chile },
            { "America/Vancouver", America_Pacific },
            { "Asia/Bahrain", Arabian },
            { "America/Indiana/Vincennes", America_Eastern },
            { "America/Guatemala", America_Central },
            { "Europe/Oslo", Europe_Central },
            { "America/Montreal", America_Eastern },
            { "Europe/Vatican", Europe_Central },
            { "Asia/Dubai", Gulf },
            { "Asia/Harbin", China },
            { "Africa/Johannesburg", Africa_Southern },
            { "Europe/Tallinn", Europe_Eastern },
            { "America/Ojinaga", America_Mountain },
            { "America/Barbados", Atlantic },
            { "Europe/Uzhgorod", Europe_Eastern },
            { "Asia/Urumqi", China },
            { "America/Louisville", America_Eastern },
            { "Asia/Gaza", Europe_Eastern },
            { "Atlantic/Azores", Azores },
            { "America/Lower_Princes", Atlantic },
            { "Asia/Kuwait", Arabian },
            { "Africa/Lagos", Africa_Western },
            { "Africa/Porto-Novo", Africa_Western },
            { "Africa/Accra", GMT },
            { "America/Blanc-Sablon", Atlantic },
            { "Africa/Juba", Africa_Eastern },
            { "America/Marigot", Atlantic },
            { "America/Indiana/Knox", America_Central },
            { "Europe/Kiev", Europe_Eastern },
            { "Europe/Isle_of_Man", GMT },
            { "America/Jamaica", America_Eastern },
            { "Asia/Tokyo", Japan },
            { "Indian/Maldives", Maldives },
            { "Africa/Abidjan", GMT },
            { "Europe/Malta", Europe_Central },
            { "Europe/Madrid", Europe_Central },
            { "Atlantic/Reykjavik", GMT },
            { "Asia/Magadan", Magadan },
            { "Asia/Kabul", Afghanistan },
            { "America/Argentina/Rio_Gallegos", Argentina },
            { "Australia/Melbourne", Australia_Eastern },
            { "Indian/Antananarivo", Africa_Eastern },
            { "Asia/Pontianak", Indonesia_Western },
            { "Africa/Mbabane", Africa_Southern },
            { "Africa/Banjul", GMT },
            { "America/Anchorage", Alaska },
            { "America/Argentina/La_Rioja", Argentina },
            { "Africa/Tripoli", Europe_Eastern },
            { "Africa/Khartoum", Africa_Eastern },
            { "America/Jujuy", Argentina },
            { "Asia/Calcutta", India },
            { "America/Buenos_Aires", Argentina },
            { "Europe/Bucharest", Europe_Eastern },
            { "Europe/Athens", Europe_Eastern },
            { "America/Puerto_Rico", Atlantic },
            { "America/Nassau", America_Eastern },
            { "America/Swift_Current", America_Central },
            { "America/Havana", Cuba },
            { "Asia/Jayapura", Indonesia_Eastern },
            { "Europe/San_Marino", Europe_Central },
            { "Europe/Ljubljana", Europe_Central },
            { "America/Rainy_River", America_Central },
            { "America/Belem", Brasilia },
            { "America/Sao_Paulo", Brasilia },
            { "America/Menominee", America_Central },
            { "America/Juneau", Alaska },
            { "America/Martinique", Atlantic },
            { "America/Mendoza", Argentina },
            { "Africa/Conakry", GMT },
            { "America/North_Dakota/New_Salem", America_Central },
            { "America/Adak", Hawaii_Aleutian },
            { "America/Godthab", Greenland_Western },
            { "Africa/Libreville", Africa_Western },
            { "America/St_Thomas", Atlantic },
            { "Europe/Minsk", Europe_Eastern },
            { "America/Shiprock", America_Mountain },
            { "Asia/Yekaterinburg", Yekaterinburg },
            { "Europe/Riga", Europe_Eastern },
            { "America/Guayaquil", Ecuador },
            { "America/Grand_Turk", America_Eastern },
            { "Asia/Jakarta", Indonesia_Western },
            { "Africa/Kigali", Africa_Central },
            { "America/Santo_Domingo", Atlantic },
            { "Antarctica/Mawson", Mawson },
            { "America/Goose_Bay", Atlantic },
            { "Europe/Tirane", Europe_Central },
            { "America/Nipigon", America_Eastern },
            { "Asia/Chongqing", China },
            { "America/Cayenne", French_Guiana },
            { "Australia/Darwin", Australia_Central },
            { "Europe/Skopje", Europe_Central },
            { "Australia/Adelaide", Australia_Central },
            { "Asia/Riyadh", Arabian },
            { "Asia/Aden", Arabian },
            { "Asia/Krasnoyarsk", Krasnoyarsk },
            { "Africa/Casablanca", Europe_Western },
            { "Pacific/Johnston", Hawaii_Aleutian },
            { "Europe/Bratislava", Europe_Central },
            { "Europe/Zagreb", Europe_Central },
            { "Europe/Warsaw", Europe_Central },
            { "Africa/Lome", GMT },
            { "Atlantic/Madeira", Europe_Western },
            { "America/Sitka", Alaska },
        };
        return data;
    }
}
