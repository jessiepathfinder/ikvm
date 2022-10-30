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

package sun.util.resources.cldr.ar;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_ar extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Moscow = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0645\u0648\u0633\u0643\u0648 \u0627\u0644\u0631\u0633\u0645\u064a",
               "MST",
               "\u062a\u0648\u0642\u064a\u062a \u0645\u0648\u0633\u0643\u0648 \u0627\u0644\u0635\u064a\u0641\u064a",
               "MST",
               "\u062a\u0648\u0642\u064a\u062a \u0645\u0648\u0633\u0643\u0648",
               "MT",
            };
        final String[] Omsk = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0623\u0648\u0645\u0633\u0643",
               "OST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0623\u0648\u0645\u0633\u0643",
               "OST",
               "\u062a\u0648\u0642\u064a\u062a \u0623\u0648\u0645\u0633\u0643",
               "OT",
            };
        final String[] Hawaii_Aleutian = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0647\u0627\u0648\u0627\u064a \u0623\u0644\u064a\u0648\u062a\u064a\u0627\u0646",
               "HAST",
               "\u062a\u0648\u0642\u064a\u062a \u0647\u0627\u0648\u0627\u064a \u0623\u0644\u064a\u0648\u062a\u064a\u0627\u0646 \u0627\u0644\u0635\u064a\u0641\u064a",
               "HADT",
               "\u062a\u0648\u0642\u064a\u062a \u0647\u0627\u0648\u0627\u064a \u0623\u0644\u064a\u0648\u062a\u064a\u0627\u0646",
               "HAT",
            };
        final String[] Sakhalin = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0633\u0627\u062e\u0627\u0644\u064a\u0646",
               "SST",
               "\u062a\u0648\u0642\u064a\u062a \u0633\u0627\u062e\u0627\u0644\u064a\u0646 \u0627\u0644\u0635\u064a\u0641\u064a",
               "SST",
               "\u062a\u0648\u0642\u064a\u062a \u0633\u0627\u062e\u0627\u0644\u064a\u0646",
               "ST",
            };
        final String[] Yakutsk = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u064a\u0627\u0643\u0648\u062a\u0633\u0643",
               "YST",
               "\u062a\u0648\u0642\u064a\u062a \u064a\u0627\u0643\u0648\u062a\u0633\u0643 \u0627\u0644\u0635\u064a\u0641\u064a",
               "YST",
               "\u062a\u0648\u0642\u064a\u062a \u064a\u0627\u0643\u0648\u062a\u0633\u0643",
               "YT",
            };
        final String[] Kazakhstan_Eastern = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0631\u0633\u0645\u064a \u0644\u0634\u0631\u0642 \u0643\u0627\u0632\u0627\u062e\u0633\u062a\u0627\u0646",
               "EKT",
               "\u062a\u0648\u0642\u064a\u062a \u0643\u0627\u0632\u0627\u062e\u0633\u062a\u0627\u0646 \u0627\u0644\u0634\u0631\u0642\u064a \u0627\u0644\u0635\u064a\u0641\u064a",
               "EKST",
               "\u062a\u0648\u0642\u064a\u062a\u00b7\u0634\u0631\u0642\u00b7\u0643\u0627\u0632\u0627\u062e\u0633\u062a\u0627\u0646",
               "EKT",
            };
        final String[] Vladivostok = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0641\u0644\u0627\u062f\u064a\u0641\u0648\u0633\u062a\u0648\u0643",
               "VST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0641\u0644\u0627\u062f\u064a\u0641\u0648\u0633\u062a\u0648\u0643",
               "VST",
               "\u062a\u0648\u0642\u064a\u062a \u0641\u0644\u0627\u062f\u064a\u0641\u0648\u0633\u062a\u0648\u0643",
               "VT",
            };
        final String[] Brasilia = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0628\u0631\u0627\u0632\u064a\u0644\u064a\u0627",
               "BST",
               "\u062a\u0648\u0642\u064a\u062a \u0628\u0631\u0627\u0632\u064a\u0644\u064a\u0627 \u0627\u0644\u0635\u064a\u0641\u064a",
               "BST",
               "\u062a\u0648\u0642\u064a\u062a \u0628\u0631\u0627\u0632\u064a\u0644\u064a\u0627",
               "BT",
            };
        final String[] Hovd = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0647\u0648\u0641\u062f",
               "HST",
               "\u062a\u0648\u0642\u064a\u062a \u0647\u0648\u0641\u062f \u0627\u0644\u0635\u064a\u0641\u064a",
               "HST",
               "\u062a\u0648\u0642\u064a\u062a \u0647\u0648\u0641\u062f",
               "HT",
            };
        final String[] Indonesia_Western = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u063a\u0631\u0628\u064a \u0644\u0625\u0646\u062f\u0648\u0646\u064a\u0633\u064a\u0627",
               "WIT",
               "Western Indonesia Summer Time",
               "WIST",
               "Western Indonesia Time",
               "WIT",
            };
        final String[] Amazon = new String[] {
               "\u0627\u0644\u0623\u0645\u0627\u0632\u0648\u0646 \u0627\u0644\u0632\u0645\u0646",
               "AST",
               "\u0627\u0644\u0623\u0645\u0627\u0632\u0648\u0646 \u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a",
               "AST",
               "\u0627\u0644\u0623\u0645\u0627\u0632\u0648\u0646 \u0627\u0644\u0632\u0645\u0646",
               "AT",
            };
        final String[] Mongolia = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0623\u0648\u0644\u0627\u0646 \u0628\u0627\u062a\u0648\u0631",
               "UBST",
               "\u062a\u0648\u0642\u064a\u062a \u0623\u0648\u0644\u0627\u0646 \u0628\u0627\u062a\u0648\u0631 \u0627\u0644\u0635\u064a\u0641\u064a",
               "UBST",
               "\u062a\u0648\u0642\u064a\u062a \u0645\u0646\u063a\u0648\u0644\u064a\u0627",
               "UBT",
            };
        final String[] Indonesia_Central = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0625\u0646\u062f\u0648\u0646\u064a\u0633\u064a\u0627 \u0627\u0644\u0645\u0631\u0643\u0632\u064a",
               "CIT",
               "Central Indonesia Summer Time",
               "CIST",
               "Central Indonesia Time",
               "CIT",
            };
        final String[] America_Pacific = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0645\u062d\u064a\u0637 \u0627\u0644\u0647\u0627\u062f\u064a",
               "PST",
               "\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0645\u062d\u064a\u0637 \u0627\u0644\u0647\u0627\u062f\u064a \u0627\u0644\u0635\u064a\u0641\u064a",
               "PDT",
               "\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0645\u062d\u064a\u0637 \u0627\u0644\u0647\u0627\u062f\u064a",
               "PT",
            };
        final String[] Argentina_Western = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u063a\u0631\u0628 \u0627\u0644\u0623\u0631\u062c\u0646\u062a\u064a\u0646",
               "WAST",
               "\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0623\u0631\u062c\u0646\u062a\u064a\u0646 \u0627\u0644\u063a\u0631\u0628\u064a \u0627\u0644\u0635\u064a\u0641\u064a",
               "WAST",
               "\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0623\u0631\u062c\u0646\u062a\u064a\u0646 \u0627\u0644\u063a\u0631\u0628\u064a",
               "WAT",
            };
        final String[] Newfoundland = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0631\u0633\u0645\u064a \u0644\u0646\u06cc\u0648\u0641\u0627\u0648\u0646\u062f\u0644\u0627\u0646\u062f",
               "NST",
               "\u062a\u0648\u0642\u064a\u062a \u0646\u06cc\u0648\u0641\u0627\u0648\u0646\u062f\u0644\u0627\u0646\u062f \u0627\u0644\u0635\u064a\u0641\u064a",
               "NDT",
               "\u062a\u0648\u0642\u064a\u062a \u0646\u06cc\u0648\u0641\u0627\u0648\u0646\u062f\u0644\u0627\u0646\u062f",
               "NT",
            };
        final String[] Volgograd = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0641\u0648\u0644\u063a\u0648\u063a\u0631\u0627\u062f",
               "VST",
               "\u062a\u0648\u0642\u064a\u062a \u0641\u0648\u0644\u063a\u0648\u063a\u0631\u0627\u062f \u0627\u0644\u0635\u064a\u0641\u064a",
               "VST",
               "\u062a\u0648\u0642\u064a\u062a \u0641\u0648\u0644\u063a\u0648\u063a\u0631\u0627\u062f",
               "VT",
            };
        final String[] America_Central = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0631\u0633\u0645\u064a \u0627\u0644\u0645\u0631\u0643\u0632\u064a",
               "CST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0627\u0644\u0645\u0631\u0643\u0632\u064a",
               "CDT",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0645\u0631\u0643\u0632\u064a",
               "CT",
            };
        final String[] Argentina = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0623\u0631\u062c\u0646\u062a\u064a\u0646",
               "AST",
               "\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0623\u0631\u062c\u0646\u062a\u064a\u0646 \u0627\u0644\u0635\u064a\u0641\u064a",
               "AST",
               "\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0623\u0631\u062c\u0646\u062a\u064a\u0646",
               "AT",
            };
        final String[] Yekaterinburg = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u064a\u0643\u0627\u062a\u0631\u064a\u0646\u0628\u0648\u0631\u063a",
               "YST",
               "\u062a\u0648\u0642\u064a\u062a \u064a\u0643\u0627\u062a\u0631\u064a\u0646\u0628\u0648\u0631\u063a \u0627\u0644\u0635\u064a\u0641\u064a",
               "YST",
               "\u062a\u0648\u0642\u064a\u062a \u064a\u0643\u0627\u062a\u0631\u064a\u0646\u0628\u0648\u0631\u063a",
               "YT",
            };
        final String[] Lord_Howe = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0644\u0648\u0631\u062f \u0647\u0627\u0648 \u0627\u0644\u0631\u0633\u0645\u064a",
               "LHST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0644\u0644\u0648\u0631\u062f \u0647\u0627\u0648",
               "LHDT",
               "\u062a\u0648\u0642\u064a\u062a \u0644\u0648\u0631\u062f \u0647\u0627\u0648",
               "LHT",
            };
        final String[] Macquarie = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0645\u0627\u0643\u0648\u0627\u0631\u064a",
               "MIT",
               "Macquarie Island Summer Time",
               "MIST",
               "Macquarie Island Time",
               "MIT",
            };
        final String[] Australia_Eastern = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0631\u0633\u0645\u064a \u0627\u0644\u0634\u0631\u0642\u064a \u0644\u0623\u0633\u062a\u0631\u0627\u0644\u064a\u0627",
               "AEST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0627\u0644\u0634\u0631\u0642\u064a \u0644\u0623\u0633\u062a\u0631\u0627\u0644\u064a\u0627",
               "AEDT",
               "\u062a\u0648\u0642\u064a\u062a \u0634\u0631\u0642 \u0623\u0633\u062a\u0631\u0627\u0644\u064a\u0627",
               "EAT",
            };
        final String[] Irkutsk = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0625\u0631\u0643\u0648\u062a\u0633\u0643",
               "IST",
               "\u062a\u0648\u0642\u064a\u062a \u0625\u0631\u0643\u0648\u062a\u0633\u0643 \u0627\u0644\u0635\u064a\u0641\u064a",
               "IST",
               "\u062a\u0648\u0642\u064a\u062a \u0625\u0631\u0643\u0648\u062a\u0633\u0643",
               "IT",
            };
        final String[] Choibalsan = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0634\u0648\u064a\u0628\u0627\u0644\u0633\u0627\u0646",
               "CST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0644\u0634\u0648\u064a\u0628\u0627\u0644\u0633\u0627\u0646",
               "CST",
               "\u062a\u0648\u0642\u064a\u062a \u0634\u0648\u064a\u0628\u0627\u0644\u0633\u0627\u0646",
               "CT",
            };
        final String[] America_Eastern = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0631\u0633\u0645\u064a \u0627\u0644\u0634\u0631\u0642\u064a",
               "EST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0627\u0644\u0634\u0631\u0642\u064a",
               "EDT",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0634\u0631\u0642\u064a",
               "ET",
            };
        final String[] Kazakhstan_Western = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0631\u0633\u0645\u064a \u0644\u063a\u0631\u0628 \u0643\u0627\u0632\u0627\u062e\u0633\u062a\u0627\u0646",
               "WKT",
               "\u062a\u0648\u0642\u064a\u062a \u0643\u0627\u0632\u0627\u062e\u0633\u062a\u0627\u0646 \u0627\u0644\u063a\u0631\u0628\u064a \u0627\u0644\u0635\u064a\u0641\u064a",
               "WKST",
               "\u062a\u0648\u0642\u064a\u062a \u063a\u0631\u0628 \u0643\u0627\u0632\u0627\u062e\u0633\u062a\u0627\u0646",
               "WKT",
            };
        final String[] Australia_CentralWestern = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0631\u0633\u0645\u064a \u0627\u0644\u063a\u0631\u0628\u064a \u0627\u0644\u0645\u0631\u0643\u0632\u064a \u0628\u0623\u0633\u062a\u0631\u0627\u0644\u064a\u0627",
               "ACWST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0627\u0644\u063a\u0631\u0628\u064a \u0627\u0644\u0645\u0631\u0643\u0632\u064a \u0628\u0623\u0633\u062a\u0631\u0627\u0644\u064a\u0627",
               "ACWDT",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u063a\u0631\u0628\u064a \u0627\u0644\u0645\u0631\u0643\u0632\u064a \u0628\u0623\u0633\u062a\u0631\u0627\u0644\u064a\u0627",
               "ACWT",
            };
        final String[] Australia_Western = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0631\u0633\u0645\u064a \u0627\u0644\u063a\u0631\u0628\u064a \u0644\u0623\u0633\u062a\u0631\u0627\u0644\u064a\u0627",
               "AWST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0627\u0644\u063a\u0631\u0628\u064a \u0644\u0623\u0633\u062a\u0631\u0627\u0644\u064a\u0627",
               "AWDT",
               "\u062a\u0648\u0642\u064a\u062a \u063a\u0631\u0628 \u0623\u0633\u062a\u0631\u0627\u0644\u064a\u0627",
               "WAT",
            };
        final String[] Krasnoyarsk = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0643\u0631\u0627\u0633\u0646\u0648\u064a\u0627\u0631\u0633\u0643",
               "KST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0644\u0643\u0631\u0627\u0633\u0646\u0648\u064a\u0627\u0631\u0633\u0643",
               "KST",
               "\u062a\u0648\u0642\u064a\u062a \u0643\u0631\u0627\u0633\u0646\u0648\u064a\u0627\u0631\u0633\u0643",
               "KT",
            };
        final String[] Indonesia_Eastern = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0634\u0631\u0642\u064a \u0644\u0625\u0646\u062f\u0648\u0646\u064a\u0633\u064a\u0627",
               "EIT",
               "Eastern Indonesia Summer Time",
               "EIST",
               "Eastern Indonesia Time",
               "EIT",
            };
        final String[] Noronha = new String[] {
               "\u0641\u064a\u0631\u0646\u0627\u0646\u062f\u0648 \u062f\u064a \u0646\u0648\u0631\u0648\u0646\u0647\u0627",
               "FNST",
               "\u062a\u0648\u0642\u064a\u062a \u0641\u0631\u0646\u0627\u0646\u062f\u0648 \u062f\u064a \u0646\u0648\u0631\u0648\u0646\u0647\u0627 \u0627\u0644\u0635\u064a\u0641\u064a",
               "FNST",
               "\u062a\u0648\u0642\u064a\u062a \u0646\u0648\u0631\u0648\u0646\u0647\u0627",
               "FNT",
            };
        final String[] Novosibirsk = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0646\u0648\u0641\u0648\u0633\u064a\u0628\u064a\u0631\u0633\u0643",
               "NST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0644\u0646\u0648\u0641\u0648\u0633\u064a\u0628\u064a\u0631\u0633\u0643",
               "NST",
               "\u062a\u0648\u0642\u064a\u062a \u0646\u0648\u0641\u0648\u0633\u064a\u0628\u064a\u0631\u0633\u0643",
               "NT",
            };
        final String[] America_Mountain = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u062c\u0628\u0644\u064a \u0627\u0644\u0631\u0633\u0645\u064a",
               "MST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u062c\u0628\u0644\u064a \u0627\u0644\u0635\u064a\u0641\u064a",
               "MDT",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u062c\u0628\u0644\u064a",
               "MT",
            };
        final String[] Alaska = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0631\u0633\u0645\u064a \u0644\u0623\u0644\u0627\u0633\u0643\u0627",
               "AKST",
               "\u062a\u0648\u0642\u064a\u062a \u0623\u0644\u0627\u0633\u0643\u0627 \u0627\u0644\u0635\u064a\u0641\u064a",
               "AKDT",
               "\u062a\u0648\u0642\u064a\u062a \u0623\u0644\u0627\u0633\u0643\u0627",
               "AKT",
            };
        final String[] Australia_Central = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0631\u0633\u0645\u064a \u0627\u0644\u0645\u0631\u0643\u0632\u064a \u0628\u0623\u0633\u062a\u0631\u0627\u0644\u064a\u0627",
               "ACST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0627\u0644\u0645\u0631\u0643\u0632\u064a \u0628\u0623\u0633\u062a\u0631\u0627\u0644\u064a\u0627",
               "ACDT",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0645\u0631\u0643\u0632\u064a \u0627\u0644\u0623\u0633\u062a\u0631\u0627\u0644\u064a",
               "CAT",
            };
        final String[] Atlantic = new String[] {
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0631\u0633\u0645\u064a \u0627\u0644\u0623\u0637\u0644\u0633\u064a",
               "AST",
               "\u0627\u0644\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0635\u064a\u0641\u064a \u0627\u0644\u0623\u0637\u0644\u0633\u064a",
               "ADT",
               "\u062a\u0648\u0642\u064a\u062a \u0627\u0644\u0623\u0637\u0644\u0633\u064a",
               "AT",
            };
        final String[] Magadan = new String[] {
               "\u062a\u0648\u0642\u064a\u062a \u0645\u0627\u063a\u0627\u062f\u0627\u0646",
               "MST",
               "\u062a\u0648\u0642\u064a\u062a \u0645\u0627\u063a\u0627\u062f\u0627\u0646 \u0627\u0644\u0635\u064a\u0641\u064a",
               "MST",
               "\u062a\u0648\u0642\u064a\u062a \u0645\u0627\u063a\u0627\u062f\u0627\u0646",
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
