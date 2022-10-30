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

package sun.util.resources.cldr.kea;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_kea extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Africa_Western = new String[] {
               "Ora Padr\u00e3u di Afrika Osidental",
               "WAST",
               "Ora di Ver\u00e3o di Afrika Osidental",
               "WAST",
               "Ora di Afrika Osidental",
               "WAT",
            };
        final String[] Europe_Western = new String[] {
               "Ora Padr\u00e3u di Europa Osidental",
               "WEST",
               "Ora di Ver\u00e3u di Europa Osidental",
               "WEST",
               "Ora di Europa Osidental",
               "WET",
            };
        final String[] Africa_Southern = new String[] {
               "Ora di Sul di Afrika",
               "SAST",
               "South Africa Daylight Time",
               "SADT",
               "South Africa Time",
               "SAT",
            };
        final String[] Australia_Eastern = new String[] {
               "Ora Padr\u00e3u di Australia Oriental",
               "AEST",
               "Ora di Ver\u00e3u di Australia Oriental",
               "AEDT",
               "Ora di Australia Oriental",
               "EAT",
            };
        final String[] Australia_Western = new String[] {
               "Ora Padr\u00e3u di Australia Osidental",
               "AWST",
               "Ora di Ver\u00e3u di Australia Osidental",
               "AWDT",
               "Ora di Australia Osidental",
               "WAT",
            };
        final String[] Australia_CentralWestern = new String[] {
               "Ora Padr\u00e3u di Australia Sentru-Osidental",
               "ACWST",
               "Ora di Ver\u00e3u di Australia Sentru-Osidental",
               "ACWDT",
               "Ora di Autralia Sentru-Osidental",
               "ACWT",
            };
        final String[] Africa_Central = new String[] {
               "Ora di Afrika Sentral",
               "CAT",
               "Central Africa Summer Time",
               "CAST",
               "Central Africa Time",
               "CAT",
            };
        final String[] Europe_Central = new String[] {
               "Ora Padr\u00e3u di Europa Sentral",
               "CEST",
               "Ora di Ver\u00e3u di Europa Sentral",
               "CEST",
               "Ora di Europa Sentral",
               "CET",
            };
        final String[] Australia_Central = new String[] {
               "Ora Padr\u00e3u di Australia Sentral",
               "ACST",
               "Ora di Ver\u00e3u di Australia Sentral",
               "ACDT",
               "Ora di Australia Sentral",
               "CAT",
            };
        final String[] Europe_Eastern = new String[] {
               "Ora Padr\u00e3u di Europa Oriental",
               "EEST",
               "Ora di Ver\u00e3u di Europa Oriental",
               "EEST",
               "Ora di Europa Oriental",
               "EET",
            };
        final String[] Atlantic = new String[] {
               "Ora Padr\u00e3u di Atlantiku",
               "AST",
               "Ora di Ver\u00e3u di Atlantiku",
               "ADT",
               "Ora di Atlantiku",
               "AT",
            };
        final String[] Africa_Eastern = new String[] {
               "Ora di Afrika Oriental",
               "EAT",
               "East Africa Summer Time",
               "EAST",
               "East Africa Time",
               "EAT",
            };
        final Object[][] data = new Object[][] {
            { "Europe/Sofia", Europe_Eastern },
            { "Africa/Douala", Africa_Western },
            { "Europe/Monaco", Europe_Central },
            { "Atlantic/Bermuda", Atlantic },
            { "America/St_Vincent", Atlantic },
            { "Europe/Vienna", Europe_Central },
            { "Indian/Comoro", Africa_Eastern },
            { "Europe/Malta", Europe_Central },
            { "Europe/Madrid", Europe_Central },
            { "Africa/Kampala", Africa_Eastern },
            { "Africa/Blantyre", Africa_Central },
            { "Africa/Mogadishu", Africa_Eastern },
            { "Australia/Hobart", Australia_Eastern },
            { "Europe/Mariehamn", Europe_Eastern },
            { "Africa/Malabo", Africa_Western },
            { "Australia/Melbourne", Australia_Eastern },
            { "Indian/Antananarivo", Africa_Eastern },
            { "Africa/Gaborone", Africa_Central },
            { "America/Antigua", Atlantic },
            { "Africa/Mbabane", Africa_Southern },
            { "Australia/Sydney", Australia_Eastern },
            { "Asia/Nicosia", Europe_Eastern },
            { "Europe/Lisbon", Europe_Western },
            { "Europe/Luxembourg", Europe_Central },
            { "Europe/Zurich", Europe_Central },
            { "America/Anguilla", Atlantic },
            { "Australia/Currie", Australia_Eastern },
            { "Asia/Amman", Europe_Eastern },
            { "Europe/Brussels", Europe_Central },
            { "Europe/Zaporozhye", Europe_Eastern },
            { "Africa/Tripoli", Europe_Eastern },
            { "Africa/Khartoum", Africa_Eastern },
            { "Europe/Simferopol", Europe_Eastern },
            { "Europe/Rome", Europe_Central },
            { "Indian/Mayotte", Africa_Eastern },
            { "Africa/Ndjamena", Africa_Western },
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
            { "Africa/Windhoek", Africa_Western },
            { "Antarctica/Casey", Australia_Western },
            { "Europe/Stockholm", Europe_Central },
            { "Australia/Eucla", Australia_CentralWestern },
            { "Europe/Berlin", Europe_Central },
            { "Africa/Asmera", Africa_Eastern },
            { "Africa/Kinshasa", Africa_Western },
            { "Africa/Dar_es_Salaam", Africa_Eastern },
            { "Europe/Chisinau", Europe_Eastern },
            { "America/St_Kitts", Atlantic },
            { "Europe/Budapest", Europe_Central },
            { "America/Curacao", Atlantic },
            { "Africa/Tunis", Europe_Central },
            { "Africa/Maseru", Africa_Southern },
            { "Europe/San_Marino", Europe_Central },
            { "Europe/Vaduz", Europe_Central },
            { "Africa/Niamey", Africa_Western },
            { "Europe/Prague", Europe_Central },
            { "Africa/Djibouti", Africa_Eastern },
            { "Europe/Ljubljana", Europe_Central },
            { "Africa/Harare", Africa_Central },
            { "America/Montserrat", Atlantic },
            { "Africa/Algiers", Europe_Central },
            { "America/Martinique", Atlantic },
            { "America/St_Lucia", Atlantic },
            { "Europe/Gibraltar", Europe_Central },
            { "America/Aruba", Atlantic },
            { "Africa/Lusaka", Africa_Central },
            { "America/Tortola", Atlantic },
            { "Asia/Damascus", Europe_Eastern },
            { "Africa/Libreville", Africa_Western },
            { "America/Port_of_Spain", Atlantic },
            { "America/St_Thomas", Atlantic },
            { "Australia/Lindeman", Australia_Eastern },
            { "Europe/Minsk", Europe_Eastern },
            { "America/Halifax", Atlantic },
            { "Europe/Vilnius", Europe_Eastern },
            { "Africa/Bujumbura", Africa_Central },
            { "America/Moncton", Atlantic },
            { "Atlantic/Faeroe", Europe_Western },
            { "Australia/Perth", Australia_Western },
            { "Europe/Podgorica", Europe_Central },
            { "Europe/Riga", Europe_Eastern },
            { "Atlantic/Canary", Europe_Western },
            { "Africa/Kigali", Africa_Central },
            { "America/Santo_Domingo", Atlantic },
            { "America/Goose_Bay", Atlantic },
            { "Europe/Oslo", Europe_Central },
            { "Europe/Vatican", Europe_Central },
            { "Europe/Tirane", Europe_Central },
            { "Africa/Johannesburg", Africa_Southern },
            { "America/Glace_Bay", Atlantic },
            { "Europe/Tallinn", Europe_Eastern },
            { "America/Dominica", Atlantic },
            { "Australia/Brisbane", Australia_Eastern },
            { "Europe/Uzhgorod", Europe_Eastern },
            { "America/Barbados", Atlantic },
            { "America/Grenada", Atlantic },
            { "Australia/Darwin", Australia_Central },
            { "Europe/Skopje", Europe_Central },
            { "Australia/Adelaide", Australia_Central },
            { "Arctic/Longyearbyen", Europe_Central },
            { "Africa/Ceuta", Europe_Central },
            { "Africa/El_Aaiun", Europe_Western },
            { "Africa/Luanda", Africa_Western },
            { "Europe/Andorra", Europe_Central },
            { "Africa/Addis_Ababa", Africa_Eastern },
            { "Africa/Casablanca", Europe_Western },
            { "Africa/Nairobi", Africa_Eastern },
            { "America/St_Barthelemy", Atlantic },
            { "Asia/Gaza", Europe_Eastern },
            { "America/Kralendijk", Atlantic },
            { "Asia/Beirut", Europe_Eastern },
            { "Europe/Paris", Europe_Central },
            { "America/Lower_Princes", Atlantic },
            { "Africa/Brazzaville", Africa_Western },
            { "Africa/Lagos", Africa_Western },
            { "Africa/Porto-Novo", Africa_Western },
            { "Europe/Sarajevo", Europe_Central },
            { "America/Blanc-Sablon", Atlantic },
            { "Africa/Maputo", Africa_Central },
            { "Africa/Juba", Africa_Eastern },
            { "Europe/Bratislava", Europe_Central },
            { "America/Guadeloupe", Atlantic },
            { "Africa/Bangui", Africa_Western },
            { "America/Marigot", Atlantic },
            { "Europe/Zagreb", Europe_Central },
            { "Africa/Lubumbashi", Africa_Central },
            { "Europe/Warsaw", Europe_Central },
            { "Europe/Kiev", Europe_Eastern },
            { "Africa/Cairo", Europe_Eastern },
            { "Europe/Belgrade", Europe_Central },
            { "Atlantic/Madeira", Europe_Western },
        };
        return data;
    }
}
