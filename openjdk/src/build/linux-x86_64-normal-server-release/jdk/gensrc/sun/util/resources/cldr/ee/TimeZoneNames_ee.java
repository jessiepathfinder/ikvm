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

package sun.util.resources.cldr.ee;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_ee extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Africa_Western = new String[] {
               "\u0194eto\u0256o\u0192e Afrika ga\u0192o\u0192o\u0256oanyime",
               "WAT",
               "\u0194eto\u0256o\u0192e Afrika dzome\u014b\u0254li ga\u0192o\u0192ome",
               "WAST",
               "\u0194eto\u0256o\u0192e Afrika ga\u0192o\u0192ome",
               "WAT",
            };
        final String[] Africa_Southern = new String[] {
               "Anyiehe Afrika ga\u0192o\u0192ome",
               "SAST",
               "South Africa Daylight Time",
               "SADT",
               "South Africa Time",
               "SAT",
            };
        final String[] America_Eastern = new String[] {
               "\u0194edze\u0192e Amerika ga\u0192o\u0192o\u0256oanyime",
               "EST",
               "\u0194edze\u0192e Amerika \u014bkekeme ga\u0192o\u0192ome",
               "EDT",
               "\u0194edze\u0192e Amerika ga\u0192o\u0192ome",
               "ET",
            };
        final String[] America_Mountain = new String[] {
               "Amerika Todziduk\u0254wo \u0192e ga\u0192o\u0192o\u0256oanyime",
               "MST",
               "Amerika Todziduk\u0254wo \u0192e \u014bkekme ga\u0192o\u0192ome",
               "MDT",
               "Amerika Todziduk\u0254wo \u0192e ga\u0192o\u0192ome",
               "MT",
            };
        final String[] Africa_Central = new String[] {
               "Titina Afrika ga\u0192o\u0192ome",
               "CAT",
               "Central Africa Summer Time",
               "CAST",
               "Central Africa Time",
               "CAT",
            };
        final String[] America_Pacific = new String[] {
               "Amerika Pasifik ga\u0192o\u0192o\u0256oanyime",
               "PST",
               "Amerika Pasifik \u014bkekeme ga\u0192o\u0192ome",
               "PDT",
               "Amerika Pasifik ga\u0192o\u0192ome",
               "PT",
            };
        final String[] Atlantic = new String[] {
               "Atlantic ga\u0192o\u0192o\u0256oanyime",
               "AST",
               "Atlantic \u014bkekeme ga\u0192o\u0192ome",
               "ADT",
               "Atlantic ga\u0192o\u0192ome",
               "AT",
            };
        final String[] America_Central = new String[] {
               "Titina Amerika ga\u0192o\u0192o\u0256oanyime",
               "CST",
               "Titina Amerika \u014bkekeme ga\u0192o\u0192ome",
               "CDT",
               "Titina Amerika ga\u0192o\u0192ome",
               "CT",
            };
        final String[] Africa_Eastern = new String[] {
               "\u0194edze\u0192e Afrika ga\u0192o\u0192ome",
               "EAT",
               "East Africa Summer Time",
               "EAST",
               "East Africa Time",
               "EAT",
            };
        final Object[][] data = new Object[][] {
            { "Africa/Douala", Africa_Western },
            { "America/Inuvik", America_Mountain },
            { "Atlantic/Bermuda", Atlantic },
            { "America/Jamaica", America_Eastern },
            { "America/Dawson", America_Pacific },
            { "America/St_Vincent", Atlantic },
            { "America/Port-au-Prince", America_Eastern },
            { "Indian/Comoro", Africa_Eastern },
            { "America/New_York", America_Eastern },
            { "Africa/Kampala", Africa_Eastern },
            { "Africa/Blantyre", Africa_Central },
            { "America/Indiana/Vevay", America_Eastern },
            { "Africa/Mogadishu", Africa_Eastern },
            { "America/Indiana/Marengo", America_Eastern },
            { "Africa/Malabo", Africa_Western },
            { "Indian/Antananarivo", Africa_Eastern },
            { "Africa/Gaborone", Africa_Central },
            { "America/Antigua", Atlantic },
            { "Africa/Mbabane", Africa_Southern },
            { "America/Phoenix", America_Mountain },
            { "America/Resolute", America_Central },
            { "America/Winnipeg", America_Central },
            { "America/Regina", America_Central },
            { "America/Anguilla", Atlantic },
            { "America/Cancun", America_Central },
            { "Africa/Khartoum", Africa_Eastern },
            { "Indian/Mayotte", Africa_Eastern },
            { "America/North_Dakota/Center", America_Central },
            { "Africa/Ndjamena", Africa_Western },
            { "America/Tijuana", America_Pacific },
            { "America/Dawson_Creek", America_Mountain },
            { "America/Thule", Atlantic },
            { "America/Bahia_Banderas", America_Central },
            { "America/Matamoros", America_Central },
            { "America/Puerto_Rico", Atlantic },
            { "America/Denver", America_Mountain },
            { "America/Chihuahua", America_Mountain },
            { "America/Coral_Harbour", America_Eastern },
            { "America/Yellowknife", America_Mountain },
            { "Africa/Windhoek", Africa_Western },
            { "PST8PDT", America_Pacific },
            { "America/Cayman", America_Eastern },
            { "Africa/Asmera", Africa_Eastern },
            { "Africa/Kinshasa", Africa_Western },
            { "America/Detroit", America_Eastern },
            { "Africa/Dar_es_Salaam", Africa_Eastern },
            { "America/Nassau", America_Eastern },
            { "America/Swift_Current", America_Central },
            { "America/Indiana/Tell_City", America_Central },
            { "America/Hermosillo", America_Mountain },
            { "America/Boise", America_Mountain },
            { "America/Whitehorse", America_Pacific },
            { "America/St_Kitts", Atlantic },
            { "America/Curacao", Atlantic },
            { "Africa/Maseru", Africa_Southern },
            { "America/Indiana/Winamac", America_Eastern },
            { "America/Pangnirtung", America_Eastern },
            { "Africa/Niamey", Africa_Western },
            { "America/Thunder_Bay", America_Eastern },
            { "Africa/Djibouti", Africa_Eastern },
            { "America/Santa_Isabel", America_Pacific },
            { "America/Toronto", America_Eastern },
            { "Africa/Harare", Africa_Central },
            { "America/Rainy_River", America_Central },
            { "America/Chicago", America_Central },
            { "America/Montserrat", Atlantic },
            { "America/Merida", America_Central },
            { "America/Menominee", America_Central },
            { "America/Mazatlan", America_Mountain },
            { "America/Indiana/Petersburg", America_Eastern },
            { "America/Iqaluit", America_Eastern },
            { "America/Costa_Rica", America_Central },
            { "America/Martinique", Atlantic },
            { "America/St_Lucia", Atlantic },
            { "America/Indianapolis", America_Eastern },
            { "America/Mexico_City", America_Central },
            { "America/El_Salvador", America_Central },
            { "America/Panama", America_Eastern },
            { "America/Aruba", Atlantic },
            { "Africa/Lusaka", Africa_Central },
            { "America/North_Dakota/New_Salem", America_Central },
            { "America/Tortola", Atlantic },
            { "Africa/Libreville", Africa_Western },
            { "America/Port_of_Spain", Atlantic },
            { "America/St_Thomas", Atlantic },
            { "America/Tegucigalpa", America_Central },
            { "America/Kentucky/Monticello", America_Eastern },
            { "CST6CDT", America_Central },
            { "America/Halifax", Atlantic },
            { "EST5EDT", America_Eastern },
            { "America/Managua", America_Central },
            { "America/North_Dakota/Beulah", America_Central },
            { "America/Shiprock", America_Mountain },
            { "Africa/Bujumbura", Africa_Central },
            { "America/Moncton", Atlantic },
            { "America/Belize", America_Central },
            { "America/Grand_Turk", America_Eastern },
            { "America/Vancouver", America_Pacific },
            { "America/Edmonton", America_Mountain },
            { "America/Rankin_Inlet", America_Central },
            { "Africa/Kigali", Africa_Central },
            { "America/Santo_Domingo", Atlantic },
            { "America/Los_Angeles", America_Pacific },
            { "America/Indiana/Vincennes", America_Eastern },
            { "America/Creston", America_Mountain },
            { "America/Goose_Bay", Atlantic },
            { "America/Guatemala", America_Central },
            { "America/Montreal", America_Eastern },
            { "America/Nipigon", America_Eastern },
            { "Africa/Johannesburg", Africa_Southern },
            { "America/Glace_Bay", Atlantic },
            { "America/Cambridge_Bay", America_Mountain },
            { "America/Dominica", Atlantic },
            { "America/Ojinaga", America_Mountain },
            { "America/Barbados", Atlantic },
            { "America/Grenada", Atlantic },
            { "MST7MDT", America_Mountain },
            { "Africa/Luanda", Africa_Western },
            { "Africa/Addis_Ababa", Africa_Eastern },
            { "Africa/Nairobi", Africa_Eastern },
            { "America/St_Barthelemy", Atlantic },
            { "America/Louisville", America_Eastern },
            { "America/Kralendijk", Atlantic },
            { "America/Lower_Princes", Atlantic },
            { "Africa/Brazzaville", Africa_Western },
            { "Africa/Lagos", Africa_Western },
            { "Africa/Porto-Novo", Africa_Western },
            { "America/Blanc-Sablon", Atlantic },
            { "Africa/Maputo", Africa_Central },
            { "Africa/Juba", Africa_Eastern },
            { "America/Metlakatla", America_Pacific },
            { "America/Guadeloupe", Atlantic },
            { "Africa/Bangui", Africa_Western },
            { "America/Marigot", Atlantic },
            { "Africa/Lubumbashi", Africa_Central },
            { "America/Indiana/Knox", America_Central },
            { "America/Monterrey", America_Central },
        };
        return data;
    }
}
