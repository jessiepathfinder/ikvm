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

package sun.util.resources.cldr.to;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_to extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Tahiti = new String[] {
               "houa fakatahisi",
               "TT",
               "Tahiti Summer Time",
               "TST",
               "Tahiti Time",
               "TT",
            };
        final String[] Wallis = new String[] {
               "houa faka\u02bbuvea mo futuna",
               "WFT",
               "Wallis and Futuna Summer Time",
               "WFST",
               "Wallis and Futuna Time",
               "WFT",
            };
        final String[] Fiji = new String[] {
               "houa fakafisi fakas\u012bpinga",
               "FST",
               "houa fakafisi fakamaama",
               "FST",
               "houa fakafisi",
               "FT",
            };
        final String[] Niue = new String[] {
               "houa fakaniu\u0113",
               "NT",
               "Niue Summer Time",
               "NST",
               "Niue Time",
               "NT",
            };
        final String[] Tonga = new String[] {
               "houa fakatonga fakas\u012bpinga",
               "TST",
               "houa fakatonga lotoh\u0113",
               "TST",
               "houa fakatonga",
               "TT",
            };
        final String[] New_Zealand = new String[] {
               "houa fakanu\u02bbusila fakas\u012bpinga",
               "NZST",
               "houa fakanu\u02bbusila fakamaama",
               "NZDT",
               "houa fakanu\u02bbusila",
               "NZT",
            };
        final String[] Hawaii_Aleutian = new String[] {
               "houa fakahaua\u02bbi fakas\u012bpinga",
               "HAST",
               "houa fakahaua\u02bbi fakamaama",
               "HADT",
               "houa fakahaua\u02bbi",
               "HAT",
            };
        final String[] Samoa = new String[] {
               "houa fakaha\u02bbamoa",
               "SST",
               "Samoa Daylight Time",
               "SDT",
               "Samoa Time",
               "ST",
            };
        final String[] Tuvalu = new String[] {
               "houa fakat\u016bvalu",
               "TT",
               "Tuvalu Summer Time",
               "TST",
               "Tuvalu Time",
               "TT",
            };
        final String[] Tokelau = new String[] {
               "houa fakatokelau",
               "TT",
               "Tokelau Summer Time",
               "TST",
               "Tokelau Time",
               "TT",
            };
        final Object[][] data = new Object[][] {
            { "Pacific/Niue", Niue },
            { "Pacific/Tahiti", Tahiti },
            { "Pacific/Funafuti", Tuvalu },
            { "Pacific/Pago_Pago", Samoa },
            { "Pacific/Tongatapu", Tonga },
            { "Pacific/Apia", Samoa },
            { "Pacific/Fiji", Fiji },
            { "America/Adak", Hawaii_Aleutian },
            { "Pacific/Honolulu", Hawaii_Aleutian },
            { "Pacific/Auckland", New_Zealand },
            { "Pacific/Fakaofo", Tokelau },
            { "Antarctica/McMurdo", New_Zealand },
            { "Pacific/Wallis", Wallis },
            { "Pacific/Johnston", Hawaii_Aleutian },
            { "Pacific/Midway", Samoa },
        };
        return data;
    }
}
