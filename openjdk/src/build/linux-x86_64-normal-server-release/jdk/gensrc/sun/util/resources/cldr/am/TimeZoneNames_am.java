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

package sun.util.resources.cldr.am;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_am extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Moscow = new String[] {
               "\u12e8\u121e\u1235\u12ae \u1218\u12f0\u1260\u129b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "MST",
               "\u12e8\u121e\u1235\u12ae \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "MST",
               "\u12e8\u121e\u1235\u12ae \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "MT",
            };
        final String[] Omsk = new String[] {
               "\u12e8\u12a6\u121d\u1235\u12ad \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "OST",
               "\u12e8\u12a6\u121d\u1235\u12ad \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "OST",
               "\u12e8\u12a6\u121d\u1235\u12ad \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "OT",
            };
        final String[] Hawaii_Aleutian = new String[] {
               "\u12e8\u1203\u12cb\u12ed \u12a0\u120c\u12a1\u1275 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "HAST",
               "\u12e8\u1203\u12cb\u12ed \u12a0\u120c\u12a1\u1275 \u12e8\u1240\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "HADT",
               "\u12e8\u1203\u12cb\u12ed \u12a0\u120c\u12a1\u1275 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "HAT",
            };
        final String[] Sakhalin = new String[] {
               "\u12e8\u1233\u12ad\u1203\u120a\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "SST",
               "\u12e8\u1233\u12ad\u1203\u120a\u1295 \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "SST",
               "\u12e8\u1233\u12ad\u1203\u120a\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "ST",
            };
        final String[] Yakutsk = new String[] {
               "\u12eb\u12a9\u1275\u1235\u12ad \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "YST",
               "\u12e8\u12eb\u12a9\u1275\u1235\u12ad \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "YST",
               "\u12eb\u12a9\u1275\u1235\u12ad \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "YT",
            };
        final String[] Kazakhstan_Eastern = new String[] {
               "\u12e8\u121d\u12d5\u122b\u1265 \u12ab\u12db\u12aa\u1235\u1273\u1295 \u1218\u12f0\u1260\u129b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "EKT",
               "\u12e8\u12ab\u12db\u12aa\u1235\u1273\u1295 \u121d\u12d5\u122b\u1263\u12ca \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "EKST",
               "\u12e8\u121d\u12d5\u122b\u1265 \u12ab\u12db\u12aa\u1235\u1273\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "EKT",
            };
        final String[] Vladivostok = new String[] {
               "\u12e8\u126a\u120b\u12f2\u126e\u1235\u1276\u12ad \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "VST",
               "\u12e8\u126d\u120b\u12f2\u126e\u1235\u1276\u12ad \u12e8\u1260\u130b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "VST",
               "\u12e8\u126d\u120b\u12f2\u126e\u1235\u1276\u12ad \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "VT",
            };
        final String[] Brasilia = new String[] {
               "\u12e8\u1265\u122b\u12da\u120b\u12ca \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "BST",
               "\u12e8\u1265\u122b\u12da\u120b \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "BST",
               "\u12e8\u1265\u122b\u12da\u120b\u12ca \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "BT",
            };
        final String[] Hovd = new String[] {
               "\u12e8\u1206\u126d\u12f5 \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "HST",
               "\u12e8\u1206\u126d\u12f5 \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "HST",
               "\u12e8\u1206\u126d\u12f5 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "HT",
            };
        final String[] Indonesia_Western = new String[] {
               "\u12e8\u12a2\u1295\u12f6\u1294\u12e5\u12eb \u121d\u1235\u122b\u1243\u12ca \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "WIT",
               "Western Indonesia Summer Time",
               "WIST",
               "Western Indonesia Time",
               "WIT",
            };
        final String[] Amazon = new String[] {
               "\u12e8\u12a0\u121b\u12de\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AST",
               "\u12e8\u12a0\u121b\u12de\u1295 \u12e8\u1240\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AST",
               "\u12e8\u12a0\u121b\u12de\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AT",
            };
        final String[] Mongolia = new String[] {
               "\u12e8\u12a1\u120b\u1295 \u1263\u1276\u122d \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "UBST",
               "\u12e8\u12a1\u120b\u1295 \u1263\u1276\u122d \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "UBST",
               "\u12e8\u121e\u1295\u130e\u120d\u12eb \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "UBT",
            };
        final String[] Indonesia_Central = new String[] {
               "\u12e8\u12a2\u1295\u12f6\u1294\u12e5\u12eb \u1218\u12ab\u12a8\u1208\u129b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "CIT",
               "Central Indonesia Summer Time",
               "CIST",
               "Central Indonesia Time",
               "CIT",
            };
        final String[] America_Pacific = new String[] {
               "\u12e8\u1353\u1235\u134a\u12ad \u1218\u12f0\u1260\u129b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "PST",
               "\u12e8\u1353\u1235\u134a\u12ad \u12e8\u1240\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "PDT",
               "\u12e8\u1353\u1235\u134a\u12ad \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "PT",
            };
        final String[] Argentina_Western = new String[] {
               "\u12e8\u121d\u1235\u122b\u1243\u12ca \u12a0\u122d\u1300\u1295\u1272\u1293 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "WAST",
               "\u12e8\u12a0\u122d\u1300\u1295\u1272\u1293 \u121d\u1235\u122b\u1243\u12ca \u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "WAST",
               "\u12e8\u12a0\u122d\u1300\u1295\u1272\u1293 \u121d\u1235\u122b\u1243\u12ca \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "WAT",
            };
        final String[] Newfoundland = new String[] {
               "\u12e8\u1292\u12cd\u134b\u12cd\u1295\u12f5\u120b\u1295\u12f5 \u1218\u12f0\u1260\u129b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "NST",
               "\u12e8\u1292\u12cd\u134b\u12cd\u1295\u12f5\u120b\u1295\u12f5 \u12e8\u1240\u1295 \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "NDT",
               "\u12e8\u1292\u12cd\u134b\u12cd\u1295\u12f5\u120b\u1295\u12f5 \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "NT",
            };
        final String[] Volgograd = new String[] {
               "\u12e8\u126e\u120d\u130e\u122b\u12f5 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "VST",
               "\u12e8\u126b\u120d\u130e\u122b\u12f5 \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "VST",
               "\u12e8\u126e\u120d\u130e\u122b\u12f5 \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "VT",
            };
        final String[] America_Central = new String[] {
               "\u12e8\u1218\u12ab\u12a8\u120b\u12ca \u1218\u12f0\u1260\u129b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "CST",
               "\u12e8\u1218\u12ab\u12a8\u120b\u12ca \u12e8\u1240\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "CDT",
               "\u1218\u12ab\u12a8\u1208\u129b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "CT",
            };
        final String[] Argentina = new String[] {
               "\u12e8\u12a0\u122d\u1300\u1295\u1272\u1293 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AST",
               "\u12e8\u12a0\u122d\u1300\u1295\u1272\u1293 \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AST",
               "\u12e8\u12a0\u122d\u1300\u1295\u1272\u1293 \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AT",
            };
        final String[] Yekaterinburg = new String[] {
               "\u12e8\u12e8\u12ab\u1270\u122a\u1295\u1260\u122d\u130d \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "YST",
               "\u12e8\u12e8\u12ab\u1270\u122a\u1295\u1260\u122d\u130d \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "YST",
               "\u12e8\u12e8\u12ab\u1270\u122a\u1295\u1260\u122d\u130d \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "YT",
            };
        final String[] Lord_Howe = new String[] {
               "\u12e8\u120e\u122d\u12f5 \u1206\u12cc \u1218\u12f0\u1260\u129b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "LHST",
               "\u12e8\u120e\u122d\u12f5 \u1206\u12cc \u12e8\u1240\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "LHDT",
               "\u12e8\u120e\u122d\u12f5 \u1206\u12cc \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "LHT",
            };
        final String[] Macquarie = new String[] {
               "\u12e8\u121b\u12b3\u122a \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "MIT",
               "Macquarie Island Summer Time",
               "MIST",
               "Macquarie Island Time",
               "MIT",
            };
        final String[] Australia_Eastern = new String[] {
               "\u12e8\u12a0\u12cd\u1235\u1275\u122b\u120a\u12eb \u121d\u12d5\u122b\u1263\u12ca \u1218\u12f0\u1260\u129b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AEST",
               "\u12e8\u12a0\u12cd\u1235\u1275\u122b\u120a\u12eb \u121d\u12d5\u122b\u1263\u12ca \u12e8\u1240\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AEDT",
               "\u12e8\u121d\u12d5\u122b\u1263\u12ca \u12a0\u12cd\u1235\u1275\u122b\u120a\u12eb \u12e8\u1230\u12a0\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "EAT",
            };
        final String[] Irkutsk = new String[] {
               "\u12e8\u12a2\u122d\u12a9\u1275\u1235\u12ad \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "IST",
               "\u12a2\u122d\u12a9\u1275\u1235\u12ad \u12e8\u1260\u130b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "IST",
               "\u12e8\u12a2\u122d\u12a9\u1275\u1235\u12ad \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "IT",
            };
        final String[] Choibalsan = new String[] {
               "\u12e8\u127e\u12ed\u1263\u120d\u1233\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "CST",
               "\u12e8\u127e\u12ed\u1263\u120d\u1233\u1295 \u12e8\u1260\u130b \u12e8\u1230\u12a0\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "CST",
               "\u12e8\u127e\u12ed\u1263\u120d\u1233 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "CT",
            };
        final String[] America_Eastern = new String[] {
               "\u12e8\u121d\u12d5\u122b\u1263\u12ca \u1218\u12f0\u1260\u129b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "EST",
               "\u12e8\u121d\u12d5\u122b\u1263\u12ca \u12e8\u1240\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "EDT",
               "\u12e8\u121d\u12d5\u122b\u1263\u12ca \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "ET",
            };
        final String[] Kazakhstan_Western = new String[] {
               "\u12e8\u121d\u1235\u122b\u1245 \u12ab\u12db\u12aa\u1235\u1273\u1295 \u1218\u12f0\u1260\u129b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "WKT",
               "\u12e8\u12ab\u12db\u12aa\u1235\u1273\u1295 \u121d\u1235\u122b\u1243\u12ca \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "WKST",
               "\u12e8\u121d\u1235\u122b\u1245 \u12ab\u12db\u12aa\u1235\u1273\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "WKT",
            };
        final String[] Australia_CentralWestern = new String[] {
               "\u12e8\u12a0\u12cd\u1235\u1275\u122b\u120a\u12eb \u1218\u12ab\u12a8\u1208\u129b \u121d\u1235\u122b\u1243\u12ca \u1218\u12f0\u1260\u129b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "ACWST",
               "\u12e8\u12a0\u12cd\u1235\u1275\u122b\u120a\u12eb \u1218\u12ab\u12a8\u1208\u129b\u12cd \u121d\u1235\u122b\u1245 \u12e8\u1240\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "ACWDT",
               "\u12e8\u12a0\u12cd\u1235\u1275\u122b\u120a\u12eb \u1218\u12ab\u12a8\u1208\u129b \u121d\u1235\u122b\u1243\u12ca \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "ACWT",
            };
        final String[] Australia_Western = new String[] {
               "\u12e8\u12a0\u12cd\u1235\u1275\u122b\u120a\u12eb \u121d\u1235\u122b\u1243\u12ca \u1218\u12f0\u1260\u129b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AWST",
               "\u12e8\u12a0\u12cd\u1235\u1275\u122b\u120a\u12eb \u121d\u1235\u122b\u1243\u12ca \u12e8\u1240\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AWDT",
               "\u12e8\u121d\u1235\u122b\u1243\u12ca \u12a0\u12cd\u1235\u1275\u122b\u120a\u12eb \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "WAT",
            };
        final String[] Krasnoyarsk = new String[] {
               "\u12e8\u12ad\u122b\u1235\u1296\u12ed\u12a0\u122d\u1235\u12ad \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "KST",
               "\u12e8\u12ad\u122b\u1235\u1296\u12eb\u122d\u1235\u12ad \u12e8\u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "KST",
               "\u12e8\u12ad\u122b\u1235\u1296\u12eb\u122d\u1235\u12ad \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "KT",
            };
        final String[] Indonesia_Eastern = new String[] {
               "\u12e8\u12a2\u1295\u12f6\u1294\u12e5\u12eb \u121d\u12d5\u122b\u1263\u12ca \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "EIT",
               "Eastern Indonesia Summer Time",
               "EIST",
               "Eastern Indonesia Time",
               "EIT",
            };
        final String[] Noronha = new String[] {
               "\u12e8\u1348\u122d\u1293\u1295\u12f6 \u12f2 \u1296\u122e\u1295\u127b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "FNST",
               "\u12e8\u1348\u122d\u1293\u1295\u12f6 \u12f2 \u1296\u122e\u1295\u1203 \u12e8\u1260\u130b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "FNST",
               "\u12e8\u1296\u122e\u1295\u1203 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "FNT",
            };
        final String[] Novosibirsk = new String[] {
               "\u12e8\u1296\u126e\u1232\u1262\u122d\u1235\u12ad \u12e8\u1230\u12a0\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "NST",
               "\u12e8\u1296\u126e\u1232\u1265\u122a\u1235\u12ad \u12e8\u1260\u130b \u1230\u12a0\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "NST",
               "\u12e8\u1296\u126e\u1232\u1265\u122a\u1235\u12ad \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "NT",
            };
        final String[] America_Mountain = new String[] {
               "\u12e8\u1270\u122b\u122b \u1218\u12f0\u1260\u129b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "MST",
               "\u12e8\u1270\u122b\u122b \u12e8\u1240\u1295\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "MDT",
               "\u12e8\u1270\u122b\u122b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "MT",
            };
        final String[] Alaska = new String[] {
               "\u12e8\u12a0\u120b\u1235\u12ab \u1218\u12f0\u1260\u129b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AKST",
               "\u12e8\u12a0\u120b\u1235\u12ab \u12e8\u1240\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AKDT",
               "\u12e8\u12a0\u120b\u1235\u12ab \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AKT",
            };
        final String[] Australia_Central = new String[] {
               "\u12e8\u12a0\u12cd\u1235\u1275\u122b\u120a\u12eb \u1218\u12ab\u12a8\u1208\u129b \u1218\u12f0\u1260\u129b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "ACST",
               "\u12e8\u12a0\u12cd\u1235\u1275\u122b\u120a\u12eb \u1218\u12ab\u12a8\u1208\u129b \u12e8\u1240\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "ACDT",
               "\u12e8\u1218\u12ab\u12a8\u1208\u129b\u12cd \u12a0\u12cd\u1235\u1275\u122b\u120a\u12eb \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "CAT",
            };
        final String[] Atlantic = new String[] {
               "\u12e8\u12a0\u1275\u120b\u1295\u1272\u12ad \u1218\u12f0\u1260\u129b \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AST",
               "\u12e8\u12a0\u1275\u120b\u1295\u1272\u12ad \u12e8\u1240\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "ADT",
               "\u12e8\u12a0\u1275\u120b\u1295\u1272\u12ad \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "AT",
            };
        final String[] Magadan = new String[] {
               "\u12e8\u121b\u130b\u12f3\u1295 \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "MST",
               "\u12e8\u121b\u130b\u12f3\u1295 \u1260\u130b \u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
               "MST",
               "\u12e8\u121b\u130b\u12f3\u1295 \u12e8\u1230\u12d3\u1275 \u12a0\u1246\u1323\u1320\u122d",
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
            { "America/New_York", America_Eastern },
            { "Europe/Volgograd", Volgograd },
            { "America/Antigua", Atlantic },
            { "Australia/Lord_Howe", Lord_Howe },
            { "America/Resolute", America_Central },
            { "America/Winnipeg", America_Central },
            { "America/Santarem", Brasilia },
            { "America/Regina", America_Central },
            { "America/Anguilla", Atlantic },
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
            { "America/Campo_Grande", Amazon },
            { "America/Indiana/Tell_City", America_Central },
            { "America/Swift_Current", America_Central },
            { "America/Nassau", America_Eastern },
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
