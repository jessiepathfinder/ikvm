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

package sun.util.resources.cldr.be;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_be extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] GMT = new String[] {
               "\u0413\u0440\u044b\u043d\u0432\u0456\u0447\u0441\u043a\u0456 \u0447\u0430\u0441",
               "GMT",
               "Greenwich Summer Time",
               "GST",
               "Greenwich Time",
               "GT",
            };
        final String[] Europe_Western = new String[] {
               "\u0417\u0430\u0445\u043e\u0434\u043d\u0435\u044d\u045e\u0440\u0430\u043f\u0435\u0439\u0441\u043a\u0456 \u0447\u0430\u0441",
               "WEST",
               "\u0417\u0430\u0445\u043e\u0434\u043d\u0435\u044d\u045e\u0440\u0430\u043f\u0435\u0439\u0441\u043a\u0456 \u043b\u0435\u0442\u043d\u0456 \u0447\u0430\u0441",
               "WEST",
               "\u0417\u0430\u0445\u043e\u0434\u043d\u0435\u044d\u045e\u0440\u0430\u043f\u0435\u0439\u0441\u043a\u0456 \u0447\u0430\u0441",
               "WET",
            };
        final String[] America_Pacific = new String[] {
               "\u0426\u0456\u0445\u0430\u0430\u043a\u0456\u044f\u043d\u0441\u043a\u0456 \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u044b \u0447\u0430\u0441",
               "PST",
               "\u0426\u0456\u0445\u0430\u0430\u043a\u0456\u044f\u043d\u0441\u043a\u0456 \u043b\u0435\u0442\u043d\u0456 \u0447\u0430\u0441",
               "PDT",
               "\u0426\u0456\u0445\u0430\u0430\u043a\u0456\u044f\u043d\u0441\u043a\u0456 \u0447\u0430\u0441",
               "PT",
            };
        final String[] America_Central = new String[] {
               "\u041f\u0430\u045e\u043d\u043e\u0447\u043d\u0430\u0430\u043c\u044d\u0440\u044b\u043a\u0430\u043d\u0441\u043a\u0456 \u0446\u044d\u043d\u0442\u0440\u0430\u043b\u044c\u043d\u044b \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u044b \u0447\u0430\u0441",
               "CST",
               "\u041f\u0430\u045e\u043d\u043e\u0447\u043d\u0430\u0430\u043c\u044d\u0440\u044b\u043a\u0430\u043d\u0441\u043a\u0456 \u0446\u044d\u043d\u0442\u0440\u0430\u043b\u044c\u043d\u044b \u043b\u0435\u0442\u043d\u0456 \u0447\u0430\u0441",
               "CDT",
               "\u041f\u0430\u045e\u043d\u043e\u0447\u043d\u0430\u0430\u043c\u044d\u0440\u044b\u043a\u0430\u043d\u0441\u043a\u0456 \u0446\u044d\u043d\u0442\u0440\u0430\u043b\u044c\u043d\u044b \u0447\u0430\u0441",
               "CT",
            };
        final String[] America_Eastern = new String[] {
               "\u041f\u0430\u045e\u043d\u043e\u0447\u043d\u0430\u0430\u043c\u044d\u0440\u044b\u043a\u0430\u043d\u0441\u043a\u0456 \u0443\u0441\u0445\u043e\u0434\u043d\u0456 \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u044b \u0447\u0430\u0441",
               "EST",
               "\u041f\u0430\u045e\u043d\u043e\u0447\u043d\u0430\u0430\u043c\u044d\u0440\u044b\u043a\u0430\u043d\u0441\u043a\u0456 \u0443\u0441\u0445\u043e\u0434\u043d\u0456 \u043b\u0435\u0442\u043d\u0456 \u0447\u0430\u0441",
               "EDT",
               "\u041f\u0430\u045e\u043d\u043e\u0447\u043d\u0430\u0430\u043c\u044d\u0440\u044b\u043a\u0430\u043d\u0441\u043a\u0456 \u0443\u0441\u0445\u043e\u0434\u043d\u0456 \u0447\u0430\u0441",
               "ET",
            };
        final String[] America_Mountain = new String[] {
               "\u041f\u0430\u045e\u043d\u043e\u0447\u043d\u0430\u0430\u043c\u044d\u0440\u044b\u043a\u0430\u043d\u0441\u043a\u0456 \u0433\u043e\u0440\u043d\u044b \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u044b \u0447\u0430\u0441",
               "MST",
               "\u041f\u0430\u045e\u043d\u043e\u0447\u043d\u0430\u0430\u043c\u044d\u0440\u044b\u043a\u0430\u043d\u0441\u043a\u0456 \u0433\u043e\u0440\u043d\u044b \u043b\u0435\u0442\u043d\u0456 \u0447\u0430\u0441",
               "MDT",
               "\u041f\u0430\u045e\u043d\u043e\u0447\u043d\u0430\u0430\u043c\u044d\u0440\u044b\u043a\u0430\u043d\u0441\u043a\u0456 \u0433\u043e\u0440\u043d\u044b \u0447\u0430\u0441",
               "MT",
            };
        final String[] Europe_Central = new String[] {
               "\u0426\u044d\u043d\u0442\u0440\u0430\u043b\u044c\u043d\u0430\u044d\u045e\u0440\u0430\u043f\u0435\u0439\u0441\u043a\u0456 \u0447\u0430\u0441",
               "CEST",
               "\u0426\u044d\u043d\u0442\u0440\u0430\u043b\u044c\u043d\u0430\u044d\u045e\u0440\u0430\u043f\u0435\u0439\u0441\u043a\u0456 \u043b\u0435\u0442\u043d\u0456 \u0447\u0430\u0441",
               "CEST",
               "\u0426\u044d\u043d\u0442\u0440\u0430\u043b\u044c\u043d\u0430\u044d\u045e\u0440\u0430\u043f\u0435\u0439\u0441\u043a\u0456 \u0447\u0430\u0441",
               "CET",
            };
        final String[] Europe_Eastern = new String[] {
               "\u0423\u0441\u0445\u043e\u0434\u043d\u0435\u044d\u045e\u0440\u0430\u043f\u0435\u0439\u0441\u043a\u0456 \u0447\u0430\u0441",
               "EEST",
               "\u0423\u0441\u0445\u043e\u0434\u043d\u0435\u044d\u045e\u0440\u0430\u043f\u0435\u0439\u0441\u043a\u0456 \u043b\u0435\u0442\u043d\u0456 \u0447\u0430\u0441",
               "EEST",
               "\u0423\u0441\u0445\u043e\u0434\u043d\u0435\u044d\u045e\u0440\u0430\u043f\u0435\u0439\u0441\u043a\u0456 \u0447\u0430\u0441",
               "EET",
            };
        final String[] Atlantic = new String[] {
               "\u0410\u0442\u043b\u044f\u043d\u0442\u044b\u0447\u043d\u044b \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u044b \u0447\u0430\u0441",
               "AST",
               "\u0410\u0442\u043b\u044f\u043d\u0442\u044b\u0447\u043d\u044b \u043b\u0435\u0442\u043d\u0456 \u0447\u0430\u0441",
               "ADT",
               "\u0410\u0442\u043b\u044f\u043d\u0442\u044b\u0447\u043d\u044b \u0447\u0430\u0441",
               "AT",
            };
        final Object[][] data = new Object[][] {
            { "Europe/Sofia", Europe_Eastern },
            { "Europe/Monaco", Europe_Central },
            { "Atlantic/Bermuda", Atlantic },
            { "America/Dawson", America_Pacific },
            { "America/St_Vincent", Atlantic },
            { "Europe/Vienna", Europe_Central },
            { "America/Port-au-Prince", America_Eastern },
            { "America/New_York", America_Eastern },
            { "Atlantic/St_Helena", GMT },
            { "Europe/Mariehamn", Europe_Eastern },
            { "America/Antigua", Atlantic },
            { "Asia/Nicosia", Europe_Eastern },
            { "Europe/Lisbon", Europe_Western },
            { "Europe/Zurich", Europe_Central },
            { "America/Resolute", America_Central },
            { "America/Winnipeg", America_Central },
            { "America/Danmarkshavn", GMT },
            { "Europe/Dublin", GMT },
            { "America/Anguilla", Atlantic },
            { "America/Regina", America_Central },
            { "Asia/Amman", Europe_Eastern },
            { "Europe/Brussels", Europe_Central },
            { "Europe/Zaporozhye", Europe_Eastern },
            { "Europe/Simferopol", Europe_Eastern },
            { "America/North_Dakota/Center", America_Central },
            { "America/Tijuana", America_Pacific },
            { "Africa/Monrovia", GMT },
            { "Europe/Istanbul", Europe_Eastern },
            { "America/Thule", Atlantic },
            { "Europe/Copenhagen", Europe_Central },
            { "America/Bahia_Banderas", America_Central },
            { "Europe/Amsterdam", Europe_Central },
            { "Asia/Hebron", Europe_Eastern },
            { "America/Chihuahua", America_Mountain },
            { "America/Yellowknife", America_Mountain },
            { "PST8PDT", America_Pacific },
            { "Europe/Stockholm", Europe_Central },
            { "America/Cayman", America_Eastern },
            { "Africa/Bamako", GMT },
            { "Europe/Berlin", Europe_Central },
            { "Europe/Chisinau", Europe_Eastern },
            { "America/Curacao", Atlantic },
            { "Europe/Budapest", Europe_Central },
            { "Africa/Tunis", Europe_Central },
            { "America/Indiana/Winamac", America_Eastern },
            { "Europe/Vaduz", Europe_Central },
            { "Europe/Jersey", GMT },
            { "America/Thunder_Bay", America_Eastern },
            { "Europe/Prague", Europe_Central },
            { "America/Toronto", America_Eastern },
            { "America/Montserrat", Atlantic },
            { "America/Merida", America_Central },
            { "Africa/Sao_Tome", GMT },
            { "America/Costa_Rica", America_Central },
            { "America/Indianapolis", America_Eastern },
            { "America/Mexico_City", America_Central },
            { "America/El_Salvador", America_Central },
            { "America/Tortola", Atlantic },
            { "Europe/Kaliningrad", GMT },
            { "Africa/Ouagadougou", GMT },
            { "Asia/Damascus", Europe_Eastern },
            { "America/Port_of_Spain", Atlantic },
            { "America/Tegucigalpa", America_Central },
            { "America/Kentucky/Monticello", America_Eastern },
            { "CST6CDT", America_Central },
            { "Europe/Vilnius", Europe_Eastern },
            { "America/Halifax", Atlantic },
            { "America/North_Dakota/Beulah", America_Central },
            { "America/Managua", America_Central },
            { "EST5EDT", America_Eastern },
            { "America/Moncton", Atlantic },
            { "Atlantic/Faeroe", Europe_Western },
            { "Africa/Dakar", GMT },
            { "Europe/Podgorica", Europe_Central },
            { "America/Belize", America_Central },
            { "America/Vancouver", America_Pacific },
            { "Atlantic/Canary", Europe_Western },
            { "America/Rankin_Inlet", America_Central },
            { "America/Indiana/Vincennes", America_Eastern },
            { "America/Guatemala", America_Central },
            { "Europe/Oslo", Europe_Central },
            { "America/Montreal", America_Eastern },
            { "Europe/Vatican", Europe_Central },
            { "America/Glace_Bay", Atlantic },
            { "Europe/Tallinn", Europe_Eastern },
            { "America/Cambridge_Bay", America_Mountain },
            { "America/Ojinaga", America_Mountain },
            { "America/Barbados", Atlantic },
            { "Europe/Uzhgorod", Europe_Eastern },
            { "America/Grenada", Atlantic },
            { "Arctic/Longyearbyen", Europe_Central },
            { "America/Louisville", America_Eastern },
            { "Asia/Gaza", Europe_Eastern },
            { "Europe/Paris", Europe_Central },
            { "America/Lower_Princes", Atlantic },
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
            { "America/Inuvik", America_Mountain },
            { "Africa/Bissau", GMT },
            { "America/Jamaica", America_Eastern },
            { "Africa/Abidjan", GMT },
            { "Europe/Malta", Europe_Central },
            { "Atlantic/Reykjavik", GMT },
            { "Europe/Madrid", Europe_Central },
            { "America/Indiana/Vevay", America_Eastern },
            { "America/Indiana/Marengo", America_Eastern },
            { "America/Phoenix", America_Mountain },
            { "Europe/Luxembourg", Europe_Central },
            { "Africa/Banjul", GMT },
            { "America/Cancun", America_Central },
            { "Africa/Tripoli", Europe_Eastern },
            { "Europe/Rome", Europe_Central },
            { "America/Dawson_Creek", America_Mountain },
            { "Europe/Bucharest", Europe_Eastern },
            { "Europe/Helsinki", Europe_Eastern },
            { "America/Matamoros", America_Central },
            { "America/Puerto_Rico", Atlantic },
            { "Europe/Athens", Europe_Eastern },
            { "America/Denver", America_Mountain },
            { "America/Coral_Harbour", America_Eastern },
            { "America/Detroit", America_Eastern },
            { "America/Indiana/Tell_City", America_Central },
            { "America/Swift_Current", America_Central },
            { "America/Nassau", America_Eastern },
            { "America/Hermosillo", America_Mountain },
            { "America/Whitehorse", America_Pacific },
            { "America/Boise", America_Mountain },
            { "America/St_Kitts", Atlantic },
            { "Europe/Guernsey", GMT },
            { "Europe/San_Marino", Europe_Central },
            { "America/Pangnirtung", America_Eastern },
            { "America/Santa_Isabel", America_Pacific },
            { "Europe/Ljubljana", Europe_Central },
            { "America/Rainy_River", America_Central },
            { "America/Chicago", America_Central },
            { "America/Menominee", America_Central },
            { "America/Mazatlan", America_Mountain },
            { "America/Indiana/Petersburg", America_Eastern },
            { "Africa/Algiers", Europe_Central },
            { "America/Iqaluit", America_Eastern },
            { "America/St_Lucia", Atlantic },
            { "America/Martinique", Atlantic },
            { "Africa/Conakry", GMT },
            { "America/Panama", America_Eastern },
            { "Europe/Gibraltar", Europe_Central },
            { "America/Aruba", Atlantic },
            { "America/North_Dakota/New_Salem", America_Central },
            { "Africa/Freetown", GMT },
            { "America/St_Thomas", Atlantic },
            { "Europe/Minsk", Europe_Eastern },
            { "America/Shiprock", America_Mountain },
            { "Europe/Riga", Europe_Eastern },
            { "America/Grand_Turk", America_Eastern },
            { "America/Edmonton", America_Mountain },
            { "America/Los_Angeles", America_Pacific },
            { "America/Santo_Domingo", Atlantic },
            { "America/Creston", America_Mountain },
            { "America/Goose_Bay", Atlantic },
            { "Africa/Nouakchott", GMT },
            { "Europe/Tirane", Europe_Central },
            { "America/Nipigon", America_Eastern },
            { "America/Dominica", Atlantic },
            { "MST7MDT", America_Mountain },
            { "Africa/El_Aaiun", Europe_Western },
            { "Africa/Ceuta", Europe_Central },
            { "Europe/Skopje", Europe_Central },
            { "Europe/Andorra", Europe_Central },
            { "America/St_Barthelemy", Atlantic },
            { "Africa/Casablanca", Europe_Western },
            { "America/Kralendijk", Atlantic },
            { "Asia/Beirut", Europe_Eastern },
            { "America/Guadeloupe", Atlantic },
            { "Europe/Bratislava", Europe_Central },
            { "Europe/Zagreb", Europe_Central },
            { "Europe/Warsaw", Europe_Central },
            { "Africa/Lome", GMT },
            { "America/Monterrey", America_Central },
            { "Europe/London", GMT },
            { "Atlantic/Madeira", Europe_Western },
        };
        return data;
    }
}
