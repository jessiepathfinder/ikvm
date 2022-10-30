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

package sun.util.resources.cldr.en;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_en_AU extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Lord_Howe = new String[] {
               "Lord Howe Standard Time",
               "LHST",
               "Lord Howe Daylight Time",
               "LHDT",
               "Lord Howe Time",
               "LHT",
            };
        final String[] New_Zealand = new String[] {
               "New Zealand Standard Time",
               "NZST",
               "New Zealand Daylight Time",
               "NZDT",
               "New Zealand Time",
               "NZT",
            };
        final String[] Europe_Western = new String[] {
               "Western European Standard Time",
               "\u2205\u2205\u2205",
               "Western European Summer Time",
               "\u2205\u2205\u2205",
               "Western European Time",
               "\u2205\u2205\u2205",
            };
        final String[] Australia_Eastern = new String[] {
               "Australian Eastern Standard Time",
               "AEST",
               "Australian Eastern Daylight Time",
               "AEDT",
               "Eastern Australia Time",
               "AET",
            };
        final String[] Australia_CentralWestern = new String[] {
               "Australian Central Western Standard Time",
               "ACWST",
               "Australian Central Western Daylight Time",
               "ACWDT",
               "Australian Central Western Time",
               "ACWT",
            };
        final String[] Australia_Western = new String[] {
               "Australian Western Standard Time",
               "AWST",
               "Australian Western Daylight Time",
               "AWDT",
               "Western Australia Time",
               "AWT",
            };
        final String[] Europe_Central = new String[] {
               "Central European Standard Time",
               "\u2205\u2205\u2205",
               "Central European Summer Time",
               "\u2205\u2205\u2205",
               "Central European Time",
               "\u2205\u2205\u2205",
            };
        final String[] Australia_Central = new String[] {
               "Australian Central Standard Time",
               "ACST",
               "Australian Central Daylight Time",
               "ACDT",
               "Central Australia Time",
               "ACT",
            };
        final String[] Europe_Eastern = new String[] {
               "Eastern European Standard Time",
               "\u2205\u2205\u2205",
               "Eastern European Summer Time",
               "\u2205\u2205\u2205",
               "Eastern European Time",
               "\u2205\u2205\u2205",
            };
        final String[] Atlantic = new String[] {
               "Atlantic Standard Time",
               "\u2205\u2205\u2205",
               "Atlantic Daylight Time",
               "\u2205\u2205\u2205",
               "Atlantic Time",
               "\u2205\u2205\u2205",
            };
        final Object[][] data = new Object[][] {
            { "Europe/Sofia", Europe_Eastern },
            { "Europe/Monaco", Europe_Central },
            { "Atlantic/Bermuda", Atlantic },
            { "America/St_Vincent", Atlantic },
            { "Europe/Vienna", Europe_Central },
            { "Europe/Malta", Europe_Central },
            { "Europe/Madrid", Europe_Central },
            { "Australia/Hobart", Australia_Eastern },
            { "Europe/Mariehamn", Europe_Eastern },
            { "Australia/Melbourne", Australia_Eastern },
            { "America/Antigua", Atlantic },
            { "Australia/Sydney", Australia_Eastern },
            { "Australia/Lord_Howe", Lord_Howe },
            { "Asia/Nicosia", Europe_Eastern },
            { "Europe/Lisbon", Europe_Western },
            { "Europe/Luxembourg", Europe_Central },
            { "Europe/Zurich", Europe_Central },
            { "Australia/Currie", Australia_Eastern },
            { "America/Anguilla", Atlantic },
            { "Asia/Amman", Europe_Eastern },
            { "Europe/Brussels", Europe_Central },
            { "Europe/Zaporozhye", Europe_Eastern },
            { "Africa/Tripoli", Europe_Eastern },
            { "Europe/Simferopol", Europe_Eastern },
            { "Antarctica/McMurdo", New_Zealand },
            { "Europe/Rome", Europe_Central },
            { "Europe/Istanbul", Europe_Eastern },
            { "America/Thule", Atlantic },
            { "Europe/Copenhagen", Europe_Central },
            { "Europe/Bucharest", Europe_Eastern },
            { "Europe/Helsinki", Europe_Eastern },
            { "Europe/Amsterdam", Europe_Central },
            { "Europe/Athens", Europe_Eastern },
            { "America/Puerto_Rico", Atlantic },
            { "Asia/Hebron", Europe_Eastern },
            { "Australia/Broken_Hill", Australia_Central },
            { "Antarctica/Casey", Australia_Western },
            { "Australia/Eucla", Australia_CentralWestern },
            { "Europe/Stockholm", Europe_Central },
            { "Europe/Berlin", Europe_Central },
            { "Europe/Chisinau", Europe_Eastern },
            { "America/St_Kitts", Atlantic },
            { "America/Curacao", Atlantic },
            { "Europe/Budapest", Europe_Central },
            { "Africa/Tunis", Europe_Central },
            { "Europe/San_Marino", Europe_Central },
            { "Europe/Vaduz", Europe_Central },
            { "Europe/Prague", Europe_Central },
            { "Europe/Ljubljana", Europe_Central },
            { "America/Montserrat", Atlantic },
            { "Africa/Algiers", Europe_Central },
            { "America/Martinique", Atlantic },
            { "America/St_Lucia", Atlantic },
            { "Europe/Gibraltar", Europe_Central },
            { "America/Aruba", Atlantic },
            { "America/Tortola", Atlantic },
            { "Asia/Damascus", Europe_Eastern },
            { "America/Port_of_Spain", Atlantic },
            { "America/St_Thomas", Atlantic },
            { "Australia/Lindeman", Australia_Eastern },
            { "Europe/Minsk", Europe_Eastern },
            { "Europe/Vilnius", Europe_Eastern },
            { "America/Halifax", Atlantic },
            { "America/Moncton", Atlantic },
            { "Atlantic/Faeroe", Europe_Western },
            { "Australia/Perth", Australia_Western },
            { "Europe/Podgorica", Europe_Central },
            { "Europe/Riga", Europe_Eastern },
            { "Atlantic/Canary", Europe_Western },
            { "America/Santo_Domingo", Atlantic },
            { "America/Goose_Bay", Atlantic },
            { "Europe/Oslo", Europe_Central },
            { "Europe/Vatican", Europe_Central },
            { "Europe/Tirane", Europe_Central },
            { "America/Glace_Bay", Atlantic },
            { "Europe/Tallinn", Europe_Eastern },
            { "America/Dominica", Atlantic },
            { "Australia/Brisbane", Australia_Eastern },
            { "America/Barbados", Atlantic },
            { "Europe/Uzhgorod", Europe_Eastern },
            { "America/Grenada", Atlantic },
            { "Australia/Darwin", Australia_Central },
            { "Europe/Skopje", Europe_Central },
            { "Australia/Adelaide", Australia_Central },
            { "Arctic/Longyearbyen", Europe_Central },
            { "Africa/Ceuta", Europe_Central },
            { "Africa/El_Aaiun", Europe_Western },
            { "Europe/Andorra", Europe_Central },
            { "Pacific/Auckland", New_Zealand },
            { "Africa/Casablanca", Europe_Western },
            { "America/St_Barthelemy", Atlantic },
            { "Asia/Gaza", Europe_Eastern },
            { "America/Kralendijk", Atlantic },
            { "Asia/Beirut", Europe_Eastern },
            { "Europe/Paris", Europe_Central },
            { "America/Lower_Princes", Atlantic },
            { "Europe/Sarajevo", Europe_Central },
            { "America/Blanc-Sablon", Atlantic },
            { "Europe/Bratislava", Europe_Central },
            { "America/Guadeloupe", Atlantic },
            { "America/Marigot", Atlantic },
            { "Europe/Zagreb", Europe_Central },
            { "Europe/Warsaw", Europe_Central },
            { "Europe/Kiev", Europe_Eastern },
            { "Africa/Cairo", Europe_Eastern },
            { "Europe/Belgrade", Europe_Central },
            { "Atlantic/Madeira", Europe_Western },
        };
        return data;
    }
}
