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

package sun.util.resources.cldr.chr;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_chr extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] GMT = new String[] {
               "\u13a2\u13e4 \u13a2\u13f3\u13cd\u13d7 \u13a2\u13f3\u13e9\u13aa\u13d7",
               "GMT",
               "Greenwich Summer Time",
               "GST",
               "Greenwich Time",
               "GT",
            };
        final String[] America_Eastern = new String[] {
               "\u13a7\u13b8\u13ac\u13a2\u13d7\u13e2 \u13f0\u13b5\u13ca \u13d7\u13d9\u13b3\u13a9 \u13a2\u13f3\u13e9\u13aa\u13d7",
               "EST",
               "\u13a7\u13b8\u13ac\u13a2\u13d7\u13e2 \u13a2\u13a6 \u13a2\u13f3\u13e9\u13aa\u13d7",
               "EDT",
               "\u13a7\u13b8\u13ac\u13a2\u13d7\u13e2 \u13a2\u13f3\u13e9\u13aa\u13d7",
               "ET",
            };
        final String[] America_Mountain = new String[] {
               "\u13a3\u13d3\u13b8 \u13f0\u13b5\u13ca \u13d7\u13d9\u13b3\u13a9 \u13a2\u13f3\u13e9\u13aa\u13d7",
               "MST",
               "\u13a3\u13d3\u13b8 \u13a2\u13a6 \u13a2\u13f3\u13e9\u13aa\u13d7",
               "MDT",
               "\u13a3\u13d3\u13b8 \u13a2\u13f3\u13e9\u13aa\u13d7",
               "MT",
            };
        final String[] America_Pacific = new String[] {
               "\u13ed\u13d5\u13b5\u13ac \u13f0\u13b5\u13ca \u13d7\u13d9\u13b3\u13a9 \u13a2\u13f3\u13e9\u13aa\u13d7",
               "PST",
               "\u13ed\u13d5\u13b5\u13ac \u13a2\u13a6 \u13a2\u13f3\u13e9\u13aa\u13d7",
               "PDT",
               "\u13ed\u13d5\u13b5\u13ac \u13a2\u13f3\u13e9\u13aa\u13d7",
               "PT",
            };
        final String[] America_Central = new String[] {
               "\u13a0\u13f0\u13b5 \u13f0\u13b5\u13ca \u13d7\u13d9\u13b3\u13a9 \u13a2\u13f3\u13e9\u13aa\u13d7",
               "CST",
               "\u13a0\u13f0\u13b5 \u13a2\u13a6 \u13a2\u13f3\u13e9\u13aa\u13d7",
               "CDT",
               "\u13a0\u13f0\u13b5 \u13a2\u13f3\u13e9\u13aa\u13d7",
               "CT",
            };
        final Object[][] data = new Object[][] {
            { "America/Inuvik", America_Mountain },
            { "Africa/Bissau", GMT },
            { "America/Jamaica", America_Eastern },
            { "America/Dawson", America_Pacific },
            { "Africa/Abidjan", GMT },
            { "America/Port-au-Prince", America_Eastern },
            { "America/New_York", America_Eastern },
            { "Atlantic/Reykjavik", GMT },
            { "America/Indiana/Vevay", America_Eastern },
            { "Atlantic/St_Helena", GMT },
            { "America/Indiana/Marengo", America_Eastern },
            { "America/Phoenix", America_Mountain },
            { "Africa/Banjul", GMT },
            { "America/Resolute", America_Central },
            { "America/Winnipeg", America_Central },
            { "America/Danmarkshavn", GMT },
            { "Europe/Dublin", GMT },
            { "America/Regina", America_Central },
            { "America/Cancun", America_Central },
            { "America/North_Dakota/Center", America_Central },
            { "America/Tijuana", America_Pacific },
            { "Africa/Monrovia", GMT },
            { "America/Dawson_Creek", America_Mountain },
            { "America/Bahia_Banderas", America_Central },
            { "America/Matamoros", America_Central },
            { "America/Denver", America_Mountain },
            { "America/Chihuahua", America_Mountain },
            { "America/Coral_Harbour", America_Eastern },
            { "America/Yellowknife", America_Mountain },
            { "PST8PDT", America_Pacific },
            { "America/Cayman", America_Eastern },
            { "Africa/Bamako", GMT },
            { "America/Detroit", America_Eastern },
            { "America/Indiana/Tell_City", America_Central },
            { "America/Swift_Current", America_Central },
            { "America/Nassau", America_Eastern },
            { "America/Hermosillo", America_Mountain },
            { "America/Whitehorse", America_Pacific },
            { "America/Boise", America_Mountain },
            { "Europe/Guernsey", GMT },
            { "America/Indiana/Winamac", America_Eastern },
            { "America/Pangnirtung", America_Eastern },
            { "Europe/Jersey", GMT },
            { "America/Thunder_Bay", America_Eastern },
            { "America/Santa_Isabel", America_Pacific },
            { "America/Toronto", America_Eastern },
            { "America/Rainy_River", America_Central },
            { "America/Chicago", America_Central },
            { "America/Merida", America_Central },
            { "America/Menominee", America_Central },
            { "America/Mazatlan", America_Mountain },
            { "Africa/Sao_Tome", GMT },
            { "America/Indiana/Petersburg", America_Eastern },
            { "America/Iqaluit", America_Eastern },
            { "America/Costa_Rica", America_Central },
            { "Africa/Conakry", GMT },
            { "America/Indianapolis", America_Eastern },
            { "America/Mexico_City", America_Central },
            { "America/Panama", America_Eastern },
            { "America/El_Salvador", America_Central },
            { "America/North_Dakota/New_Salem", America_Central },
            { "Africa/Freetown", GMT },
            { "Europe/Kaliningrad", GMT },
            { "Africa/Ouagadougou", GMT },
            { "America/Tegucigalpa", America_Central },
            { "America/Kentucky/Monticello", America_Eastern },
            { "CST6CDT", America_Central },
            { "America/North_Dakota/Beulah", America_Central },
            { "America/Managua", America_Central },
            { "EST5EDT", America_Eastern },
            { "America/Shiprock", America_Mountain },
            { "Africa/Dakar", GMT },
            { "America/Belize", America_Central },
            { "America/Grand_Turk", America_Eastern },
            { "America/Vancouver", America_Pacific },
            { "America/Edmonton", America_Mountain },
            { "America/Rankin_Inlet", America_Central },
            { "America/Los_Angeles", America_Pacific },
            { "America/Indiana/Vincennes", America_Eastern },
            { "America/Creston", America_Mountain },
            { "America/Guatemala", America_Central },
            { "Africa/Nouakchott", GMT },
            { "America/Montreal", America_Eastern },
            { "America/Nipigon", America_Eastern },
            { "America/Cambridge_Bay", America_Mountain },
            { "America/Ojinaga", America_Mountain },
            { "MST7MDT", America_Mountain },
            { "America/Louisville", America_Eastern },
            { "Africa/Accra", GMT },
            { "America/Metlakatla", America_Pacific },
            { "America/Indiana/Knox", America_Central },
            { "Africa/Lome", GMT },
            { "America/Monterrey", America_Central },
            { "Europe/London", GMT },
            { "Europe/Isle_of_Man", GMT },
        };
        return data;
    }
}
