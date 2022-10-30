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

package sun.util.resources.cldr.bg;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_bg extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] GMT = new String[] {
               "\u0427\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430 \u0413\u0440\u0438\u043d\u0443\u0438\u0447",
               "GMT",
               "Greenwich Summer Time",
               "GST",
               "Greenwich Time",
               "GT",
            };
        final String[] Moscow = new String[] {
               "\u041c\u043e\u0441\u043a\u0432\u0430 \u2013 \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "MST",
               "\u041c\u043e\u0441\u043a\u0432\u0430 \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "MST",
               "\u041c\u043e\u0441\u043a\u0432\u0430",
               "MT",
            };
        final String[] Omsk = new String[] {
               "\u041e\u043c\u0441\u043a",
               "OST",
               "\u041e\u043c\u0441\u043a \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "OST",
               "\u041e\u043c\u0441\u043a",
               "OT",
            };
        final String[] Hawaii_Aleutian = new String[] {
               "\u0425\u0430\u0432\u0430\u0439\u0441\u043a\u043e \u0430\u043b\u0435\u0443\u0442\u0441\u043a\u043e \u0432\u0440\u0435\u043c\u0435",
               "HAST",
               "\u0425\u0430\u0432\u0430\u0439\u0441\u043a\u043e \u0430\u043b\u0435\u0443\u0442\u0441\u043a\u043e \u043b\u044f\u0442\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "HADT",
               "\u0425\u0430\u0432\u0430\u0439\u0441\u043a\u043e \u0430\u043b\u0435\u0443\u0442\u0441\u043a\u043e \u0432\u0440\u0435\u043c\u0435",
               "HAT",
            };
        final String[] Sakhalin = new String[] {
               "\u0421\u0430\u0445\u0430\u043b\u0438\u043d",
               "SST",
               "\u0421\u0430\u0445\u0430\u043b\u0438\u043d \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "SST",
               "\u0421\u0430\u0445\u0430\u043b\u0438\u043d",
               "ST",
            };
        final String[] Yakutsk = new String[] {
               "\u042f\u043a\u0443\u0442\u0441\u043a",
               "YST",
               "\u042f\u043a\u0443\u0442\u0441\u043a \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "YST",
               "\u042f\u043a\u0443\u0442\u0441\u043a",
               "YT",
            };
        final String[] Kazakhstan_Eastern = new String[] {
               "\u041a\u0430\u0437\u0430\u0445\u0441\u0442\u0430\u043d \u2013 \u0438\u0437\u0442\u043e\u0447\u043d\u043e \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "EKT",
               "\u041a\u0430\u0437\u0430\u0445\u0441\u0442\u0430\u043d \u2013 \u0438\u0437\u0442\u043e\u0447\u043d\u043e \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "EKST",
               "\u041a\u0430\u0437\u0430\u0445\u0441\u0442\u0430\u043d \u2013 \u0438\u0437\u0442\u043e\u0447\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "EKT",
            };
        final String[] Japan = new String[] {
               "\u042f\u043f\u043e\u043d\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "JST",
               "\u042f\u043f\u043e\u043d\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430 - \u043b\u044f\u0442\u043d\u043e\u0442\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "JDT",
               "\u042f\u043f\u043e\u043d\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "JT",
            };
        final String[] Vladivostok = new String[] {
               "\u0412\u043b\u0430\u0434\u0438\u0432\u043e\u0441\u0442\u043e\u043a",
               "VST",
               "\u0412\u043b\u0430\u0434\u0438\u0432\u043e\u0441\u0442\u043e\u043a \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "VST",
               "\u0412\u043b\u0430\u0434\u0438\u0432\u043e\u0441\u0442\u043e\u043a",
               "VT",
            };
        final String[] Europe_Western = new String[] {
               "\u0417\u0430\u043f\u0430\u0434\u043d\u043e\u0435\u0432\u0440\u043e\u043f\u0435\u0439\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "WEST",
               "\u0417\u0430\u043f\u0430\u0434\u043d\u043e\u0435\u0432\u0440\u043e\u043f\u0435\u0439\u0441\u043a\u043e \u043b\u044f\u0442\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "WEST",
               "\u0417\u0430\u043f\u0430\u0434\u043d\u043e\u0435\u0432\u0440\u043e\u043f\u0435\u0439\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "WET",
            };
        final String[] Brasilia = new String[] {
               "\u0411\u0440\u0430\u0437\u0438\u043b\u0438\u044f",
               "BST",
               "\u0411\u0440\u0430\u0437\u0438\u043b\u0438\u044f \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "BST",
               "\u0411\u0440\u0430\u0437\u0438\u043b\u0438\u044f",
               "BT",
            };
        final String[] Hovd = new String[] {
               "\u0425\u043e\u0432\u0434",
               "HST",
               "\u0425\u043e\u0432\u0434 \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "HST",
               "\u0425\u043e\u0432\u0434",
               "HT",
            };
        final String[] Indonesia_Western = new String[] {
               "\u0418\u043d\u0434\u043e\u043d\u0435\u0437\u0438\u044f \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "WIT",
               "Western Indonesia Summer Time",
               "WIST",
               "Western Indonesia Time",
               "WIT",
            };
        final String[] Mongolia = new String[] {
               "\u0423\u043b\u0430\u043d \u0411\u0430\u0442\u043e\u0440",
               "UBST",
               "\u0423\u043b\u0430\u043d \u0411\u0430\u0442\u043e\u0440 \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "UBST",
               "\u041c\u043e\u043d\u0433\u043e\u043b\u0438\u044f",
               "UBT",
            };
        final String[] Indonesia_Central = new String[] {
               "\u0418\u043d\u0434\u043e\u043d\u0435\u0437\u0438\u044f \u2013 \u0446\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "CIT",
               "Central Indonesia Summer Time",
               "CIST",
               "Central Indonesia Time",
               "CIT",
            };
        final String[] America_Pacific = new String[] {
               "\u0422\u0438\u0445\u043e\u043e\u043a\u0435\u0430\u043d\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "PST",
               "\u0422\u0438\u0445\u043e\u043e\u043a\u0435\u0430\u043d\u0441\u043a\u0430 \u043b\u044f\u0442\u043d\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "PDT",
               "\u0422\u0438\u0445\u043e\u043e\u043a\u0435\u0430\u043d\u0441\u043a\u043e \u0432\u0440\u0435\u043c\u0435",
               "PT",
            };
        final String[] Argentina_Western = new String[] {
               "\u0410\u0440\u0436\u0435\u043d\u0442\u0438\u043d\u0430 \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "WAST",
               "\u0410\u0440\u0436\u0435\u043d\u0442\u0438\u043d\u0430 \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "WAST",
               "\u0410\u0440\u0436\u0435\u043d\u0442\u0438\u043d\u0430 \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "WAT",
            };
        final String[] Newfoundland = new String[] {
               "\u0427\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430 \u041d\u044e\u0444\u0430\u0443\u043d\u0434\u043b\u0435\u043d\u0434",
               "NST",
               "\u041b\u044f\u0442\u043d\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430 \u041d\u044e\u0444\u0430\u0443\u043d\u0434\u043b\u0435\u043d\u0434",
               "NDT",
               "\u041d\u044e\u0444\u0430\u0443\u043d\u0434\u043b\u0435\u043d\u0434",
               "NT",
            };
        final String[] Volgograd = new String[] {
               "\u0412\u043e\u043b\u0433\u043e\u0433\u0440\u0430\u0434",
               "VST",
               "\u0412\u043e\u043b\u0433\u043e\u0433\u0440\u0430\u0434 \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "VST",
               "\u0412\u043e\u043b\u0433\u043e\u0433\u0440\u0430\u0434",
               "VT",
            };
        final String[] America_Central = new String[] {
               "\u0410\u043c\u0435\u0440\u0438\u043a\u0430\u043d\u0441\u043a\u0430 \u0446\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "CST",
               "\u0410\u043c\u0435\u0440\u0438\u043a\u0430\u043d\u0441\u043a\u0430 \u0446\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u0430 \u043b\u044f\u0442\u043d\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "CDT",
               "\u0426\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "CT",
            };
        final String[] Argentina = new String[] {
               "\u0410\u0440\u0436\u0435\u043d\u0442\u0438\u043d\u0430",
               "AST",
               "\u0410\u0440\u0436\u0435\u043d\u0442\u0438\u043d\u0430 \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "AST",
               "\u0410\u0440\u0436\u0435\u043d\u0442\u0438\u043d\u0430",
               "AT",
            };
        final String[] Yekaterinburg = new String[] {
               "\u0415\u043a\u0430\u0442\u0435\u0440\u0438\u043d\u0431\u0443\u0440\u0433",
               "YST",
               "\u0415\u043a\u0430\u0442\u0435\u0440\u0438\u043d\u0431\u0443\u0440\u0433 \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "YST",
               "\u0415\u043a\u0430\u0442\u0435\u0440\u0438\u043d\u0431\u0443\u0440\u0433",
               "YT",
            };
        final String[] China = new String[] {
               "\u041a\u0438\u0442\u0430\u0439\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "CST",
               "China Daylight Time",
               "CDT",
               "China Time",
               "CT",
            };
        final String[] Lord_Howe = new String[] {
               "\u041b\u043e\u0440\u0434 \u0425\u0430\u0443 \u2013 \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "LHST",
               "\u041b\u043e\u0440\u0434 \u0425\u0430\u0443 \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "LHDT",
               "\u041b\u043e\u0440\u0434 \u0425\u0430\u0443",
               "LHT",
            };
        final String[] Macquarie = new String[] {
               "\u041c\u0430\u043a\u043a\u0443\u043e\u0440\u0438",
               "MIT",
               "Macquarie Island Summer Time",
               "MIST",
               "Macquarie Island Time",
               "MIT",
            };
        final String[] Australia_Eastern = new String[] {
               "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f \u2013 \u0438\u0437\u0442\u043e\u0447\u043d\u043e \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "AEST",
               "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f \u2013 \u0438\u0437\u0442\u043e\u0447\u043d\u043e \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "AEDT",
               "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f \u2013 \u0438\u0437\u0442\u043e\u0447\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "EAT",
            };
        final String[] Irkutsk = new String[] {
               "\u0418\u0440\u043a\u0443\u0442\u0441\u043a",
               "IST",
               "\u0418\u0440\u043a\u0443\u0442\u0441\u043a \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "IST",
               "\u0418\u0440\u043a\u0443\u0442\u0441\u043a",
               "IT",
            };
        final String[] Choibalsan = new String[] {
               "\u0427\u043e\u0439\u0431\u0430\u043b\u0441\u0430\u043d",
               "CST",
               "\u0427\u043e\u0439\u0431\u0430\u043b\u0441\u0430\u043d \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "CST",
               "\u0427\u043e\u0439\u0431\u0430\u043b\u0441\u0430\u043d",
               "CT",
            };
        final String[] Kazakhstan_Western = new String[] {
               "\u041a\u0430\u0437\u0430\u0445\u0441\u0442\u0430\u043d \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "WKT",
               "\u041a\u0430\u0437\u0430\u0445\u0441\u0442\u0430\u043d \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "WKST",
               "\u041a\u0430\u0437\u0430\u0445\u0441\u0442\u0430\u043d \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "WKT",
            };
        final String[] America_Eastern = new String[] {
               "\u0410\u043c\u0435\u0440\u0438\u043a\u0430\u043d\u0441\u043a\u0430 \u0438\u0437\u0442\u043e\u0447\u043d\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "EST",
               "\u0410\u043c\u0435\u0440\u0438\u043a\u0430\u043d\u0441\u043a\u0430 \u0438\u0437\u0442\u043e\u0447\u043d\u0430 \u043b\u044f\u0442\u043d\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "EDT",
               "\u0418\u0437\u0442\u043e\u0447\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "ET",
            };
        final String[] Israel = new String[] {
               "\u0427\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430 \u0418\u0437\u0440\u0430\u0435\u043b",
               "IST",
               "\u041b\u044f\u0442\u043d\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430 \u0418\u0437\u0440\u0430\u0435\u043b",
               "IDT",
               "\u0427\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430 \u0418\u0437\u0440\u0430\u0435\u043b",
               "IT",
            };
        final String[] Australia_Western = new String[] {
               "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "AWST",
               "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "AWDT",
               "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "WAT",
            };
        final String[] Australia_CentralWestern = new String[] {
               "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u0446\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u043e \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "ACWST",
               "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u0446\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u043e \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "ACWDT",
               "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f \u2013 \u0437\u0430\u043f\u0430\u0434\u043d\u043e \u0446\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "ACWT",
            };
        final String[] Krasnoyarsk = new String[] {
               "\u041a\u0440\u0430\u0441\u043d\u043e\u044f\u0440\u0441\u043a",
               "KST",
               "\u041a\u0440\u0430\u0441\u043d\u043e\u044f\u0440\u0441\u043a \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "KST",
               "\u041a\u0440\u0430\u0441\u043d\u043e\u044f\u0440\u0441\u043a",
               "KT",
            };
        final String[] Indonesia_Eastern = new String[] {
               "\u0418\u043d\u0434\u043e\u043d\u0435\u0437\u0438\u044f \u2013 \u0438\u0437\u0442\u043e\u0447\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "EIT",
               "Eastern Indonesia Summer Time",
               "EIST",
               "Eastern Indonesia Time",
               "EIT",
            };
        final String[] Noronha = new String[] {
               "\u0424\u0435\u0440\u043d\u0430\u043d\u0434\u043e \u0434\u0435 \u041d\u043e\u0440\u043e\u043d\u044f",
               "FNST",
               "\u0424\u0435\u0440\u043d\u0430\u043d\u0434\u043e \u0434\u0435 \u041d\u043e\u0440\u043e\u043d\u044f \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "FNST",
               "\u041d\u043e\u0440\u043e\u043d\u044f",
               "FNT",
            };
        final String[] Novosibirsk = new String[] {
               "\u041d\u043e\u0432\u043e\u0441\u0438\u0431\u0438\u0440\u0441\u043a",
               "NST",
               "\u041d\u043e\u0432\u043e\u0441\u0438\u0431\u0438\u0440\u0441\u043a \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "NST",
               "\u041d\u043e\u0432\u043e\u0441\u0438\u0431\u0438\u0440\u0441\u043a",
               "NT",
            };
        final String[] America_Mountain = new String[] {
               "\u0410\u043c\u0435\u0440\u0438\u043a\u0430\u043d\u0441\u043a\u0430 \u043f\u043b\u0430\u043d\u0438\u043d\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "MST",
               "\u0410\u043c\u0435\u0440\u0438\u043a\u0430\u043d\u0441\u043a\u0430 \u043f\u043b\u0430\u043d\u0438\u043d\u0441\u043a\u0430 \u043b\u044f\u0442\u043d\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "MDT",
               "\u041f\u043b\u0430\u043d\u0438\u043d\u0441\u043a\u043e \u0432\u0440\u0435\u043c\u0435",
               "MT",
            };
        final String[] Europe_Central = new String[] {
               "\u0426\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u043e\u0435\u0432\u0440\u043e\u043f\u0435\u0439\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "CEST",
               "\u0426\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u043e\u0435\u0432\u0440\u043e\u043f\u0435\u0439\u0441\u043a\u0430 \u043b\u044f\u0442\u043d\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "CEST",
               "\u0426\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u043e\u0435\u0432\u0440\u043e\u043f\u0435\u0439\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "CET",
            };
        final String[] Alaska = new String[] {
               "\u0427\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430 \u0410\u043b\u044f\u0441\u043a\u0430",
               "AKST",
               "\u041b\u044f\u0442\u043d\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430 \u0410\u043b\u044f\u0441\u043a\u0430",
               "AKDT",
               "\u0427\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430 \u0410\u043b\u044f\u0441\u043a\u0430",
               "AKT",
            };
        final String[] Australia_Central = new String[] {
               "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f \u2013 \u0446\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u043e \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "ACST",
               "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f \u2013 \u0446\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u043e \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "ACDT",
               "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f \u2013 \u0446\u0435\u043d\u0442\u0440\u0430\u043b\u043d\u043e \u0432\u0440\u0435\u043c\u0435",
               "CAT",
            };
        final String[] Europe_Eastern = new String[] {
               "\u0418\u0437\u0442\u043e\u0447\u043d\u043e\u0435\u0432\u0440\u043e\u043f\u0435\u0439\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "EEST",
               "\u0418\u0437\u0442\u043e\u0447\u043d\u043e\u0435\u0432\u0440\u043e\u043f\u0435\u0439\u0441\u043a\u0430 \u043b\u044f\u0442\u043d\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "EEST",
               "\u0418\u0437\u0442\u043e\u0447\u043d\u043e\u0435\u0432\u0440\u043e\u043f\u0435\u0439\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "EET",
            };
        final String[] Atlantic = new String[] {
               "\u0410\u0442\u043b\u0430\u043d\u0442\u0438\u0447\u0435\u0441\u043a\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "AST",
               "\u0410\u0442\u043b\u0430\u043d\u0442\u0438\u0447\u0435\u0441\u043a\u0430 \u043b\u044f\u0442\u043d\u0430 \u0447\u0430\u0441\u043e\u0432\u0430 \u0437\u043e\u043d\u0430",
               "ADT",
               "\u0410\u0442\u043b\u0430\u043d\u0442\u0438\u0447\u0435\u0441\u043a\u043e \u0432\u0440\u0435\u043c\u0435",
               "AT",
            };
        final String[] Magadan = new String[] {
               "\u041c\u0430\u0433\u0430\u0434\u0430\u043d",
               "MST",
               "\u041c\u0430\u0433\u0430\u0434\u0430\u043d \u2013 \u043b\u044f\u0442\u043d\u043e \u0447\u0430\u0441\u043e\u0432\u043e \u0432\u0440\u0435\u043c\u0435",
               "MST",
               "\u041c\u0430\u0433\u0430\u0434\u0430\u043d",
               "MT",
            };
        final Object[][] data = new Object[][] {
            { "Europe/Samara", Moscow },
            { "Europe/Sofia", Europe_Eastern },
            { "Europe/Monaco", Europe_Central },
            { "Atlantic/Bermuda", Atlantic },
            { "America/Yakutat", Alaska },
            { "America/Catamarca", Argentina },
            { "America/Dawson", America_Pacific },
            { "America/St_Vincent", Atlantic },
            { "Europe/Vienna", Europe_Central },
            { "America/Port-au-Prince", America_Eastern },
            { "America/New_York", America_Eastern },
            { "Europe/Volgograd", Volgograd },
            { "Atlantic/St_Helena", GMT },
            { "Europe/Mariehamn", Europe_Eastern },
            { "America/Antigua", Atlantic },
            { "Australia/Lord_Howe", Lord_Howe },
            { "Asia/Nicosia", Europe_Eastern },
            { "Europe/Lisbon", Europe_Western },
            { "Europe/Zurich", Europe_Central },
            { "America/Resolute", America_Central },
            { "America/Winnipeg", America_Central },
            { "America/Santarem", Brasilia },
            { "America/Danmarkshavn", GMT },
            { "Asia/Macau", China },
            { "Europe/Dublin", GMT },
            { "America/Anguilla", Atlantic },
            { "America/Regina", America_Central },
            { "Asia/Amman", Europe_Eastern },
            { "Asia/Vladivostok", Vladivostok },
            { "Europe/Brussels", Europe_Central },
            { "Europe/Zaporozhye", Europe_Eastern },
            { "Europe/Simferopol", Europe_Eastern },
            { "America/Argentina/Ushuaia", Argentina },
            { "America/North_Dakota/Center", America_Central },
            { "America/Tijuana", America_Pacific },
            { "Africa/Monrovia", GMT },
            { "Europe/Istanbul", Europe_Eastern },
            { "Asia/Qyzylorda", Kazakhstan_Eastern },
            { "America/Thule", Atlantic },
            { "Europe/Copenhagen", Europe_Central },
            { "America/Bahia_Banderas", America_Central },
            { "Europe/Amsterdam", Europe_Central },
            { "Asia/Hebron", Europe_Eastern },
            { "Australia/Broken_Hill", Australia_Central },
            { "America/Chihuahua", America_Mountain },
            { "America/Yellowknife", America_Mountain },
            { "PST8PDT", America_Pacific },
            { "Antarctica/Casey", Australia_Western },
            { "America/Cayman", America_Eastern },
            { "Europe/Stockholm", Europe_Central },
            { "Africa/Bamako", GMT },
            { "Europe/Berlin", Europe_Central },
            { "America/St_Johns", Newfoundland },
            { "Asia/Omsk", Omsk },
            { "Asia/Novosibirsk", Novosibirsk },
            { "Europe/Chisinau", Europe_Eastern },
            { "America/Argentina/Tucuman", Argentina },
            { "Asia/Sakhalin", Sakhalin },
            { "America/Curacao", Atlantic },
            { "Europe/Budapest", Europe_Central },
            { "Asia/Choibalsan", Choibalsan },
            { "Africa/Tunis", Europe_Central },
            { "America/Indiana/Winamac", America_Eastern },
            { "Europe/Vaduz", Europe_Central },
            { "Asia/Ulaanbaatar", Mongolia },
            { "Europe/Jersey", GMT },
            { "America/Thunder_Bay", America_Eastern },
            { "Europe/Prague", Europe_Central },
            { "America/Toronto", America_Eastern },
            { "America/Montserrat", Atlantic },
            { "Pacific/Honolulu", Hawaii_Aleutian },
            { "America/Merida", America_Central },
            { "America/Recife", Brasilia },
            { "Africa/Sao_Tome", GMT },
            { "America/Costa_Rica", America_Central },
            { "America/Indianapolis", America_Eastern },
            { "America/Fortaleza", Brasilia },
            { "America/Mexico_City", America_Central },
            { "Asia/Oral", Kazakhstan_Western },
            { "America/El_Salvador", America_Central },
            { "America/Tortola", Atlantic },
            { "Europe/Kaliningrad", GMT },
            { "Asia/Kashgar", China },
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
            { "America/Nome", Alaska },
            { "America/Moncton", Atlantic },
            { "Atlantic/Faeroe", Europe_Western },
            { "America/Maceio", Brasilia },
            { "Africa/Dakar", GMT },
            { "Europe/Podgorica", Europe_Central },
            { "America/Belize", America_Central },
            { "America/Vancouver", America_Pacific },
            { "Atlantic/Canary", Europe_Western },
            { "America/Rankin_Inlet", America_Central },
            { "Asia/Jerusalem", Israel },
            { "America/Indiana/Vincennes", America_Eastern },
            { "Europe/Oslo", Europe_Central },
            { "America/Guatemala", America_Central },
            { "Europe/Vatican", Europe_Central },
            { "America/Montreal", America_Eastern },
            { "Asia/Harbin", China },
            { "America/Glace_Bay", Atlantic },
            { "Europe/Tallinn", Europe_Eastern },
            { "America/Cambridge_Bay", America_Mountain },
            { "America/Ojinaga", America_Mountain },
            { "Australia/Brisbane", Australia_Eastern },
            { "Europe/Uzhgorod", Europe_Eastern },
            { "America/Barbados", Atlantic },
            { "America/Grenada", Atlantic },
            { "Asia/Urumqi", China },
            { "Arctic/Longyearbyen", Europe_Central },
            { "Asia/Gaza", Europe_Eastern },
            { "America/Louisville", America_Eastern },
            { "Europe/Paris", Europe_Central },
            { "America/Lower_Princes", Atlantic },
            { "Asia/Irkutsk", Irkutsk },
            { "Africa/Accra", GMT },
            { "Europe/Sarajevo", Europe_Central },
            { "America/Blanc-Sablon", Atlantic },
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
            { "Asia/Tokyo", Japan },
            { "Africa/Abidjan", GMT },
            { "Europe/Malta", Europe_Central },
            { "Europe/Madrid", Europe_Central },
            { "Atlantic/Reykjavik", GMT },
            { "Asia/Shanghai", China },
            { "America/Indiana/Vevay", America_Eastern },
            { "Australia/Hobart", Australia_Eastern },
            { "Asia/Magadan", Magadan },
            { "America/Argentina/Rio_Gallegos", Argentina },
            { "America/Indiana/Marengo", America_Eastern },
            { "Australia/Melbourne", Australia_Eastern },
            { "Asia/Pontianak", Indonesia_Western },
            { "Asia/Aqtobe", Kazakhstan_Western },
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
            { "America/Santo_Domingo", Atlantic },
            { "America/Los_Angeles", America_Pacific },
            { "America/Creston", America_Mountain },
            { "America/Goose_Bay", Atlantic },
            { "Africa/Nouakchott", GMT },
            { "America/Noronha", Noronha },
            { "Europe/Tirane", Europe_Central },
            { "America/Nipigon", America_Eastern },
            { "Asia/Chongqing", China },
            { "America/Dominica", Atlantic },
            { "Antarctica/Macquarie", Macquarie },
            { "Australia/Darwin", Australia_Central },
            { "MST7MDT", America_Mountain },
            { "Europe/Skopje", Europe_Central },
            { "Australia/Adelaide", Australia_Central },
            { "Africa/Ceuta", Europe_Central },
            { "Africa/El_Aaiun", Europe_Western },
            { "Europe/Andorra", Europe_Central },
            { "Asia/Krasnoyarsk", Krasnoyarsk },
            { "Africa/Casablanca", Europe_Western },
            { "America/St_Barthelemy", Atlantic },
            { "Pacific/Johnston", Hawaii_Aleutian },
            { "America/Argentina/Salta", Argentina },
            { "America/Kralendijk", Atlantic },
            { "Asia/Beirut", Europe_Eastern },
            { "Europe/Bratislava", Europe_Central },
            { "America/Guadeloupe", Atlantic },
            { "Asia/Kamchatka", Magadan },
            { "Asia/Aqtau", Kazakhstan_Western },
            { "Europe/Zagreb", Europe_Central },
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
