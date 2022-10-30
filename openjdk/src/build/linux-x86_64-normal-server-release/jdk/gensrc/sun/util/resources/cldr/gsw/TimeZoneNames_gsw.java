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

package sun.util.resources.cldr.gsw;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_gsw extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Africa_Western = new String[] {
               "Weschtafrikanischi Schtandardziit",
               "WAST",
               "Weschtafrikanischi Summerziit",
               "WAST",
               "Weschtafrikanischi Ziit",
               "WAT",
            };
        final String[] Moscow = new String[] {
               "Moskauer Schtandardziit",
               "MST",
               "Moskauer Summerziit",
               "MST",
               "Moskauer Ziit",
               "MT",
            };
        final String[] Europe_Western = new String[] {
               "Weschteurop\u00e4ischi Schtandardziit",
               "WEZ",
               "Weschteurop\u00e4ischi Summerziit",
               "WESZ",
               "Weschteurop\u00e4ischi Ziit",
               "WEZ",
            };
        final String[] Africa_Southern = new String[] {
               "S\u00fc\u00fcdafrikanischi ziit",
               "SAST",
               "South Africa Daylight Time",
               "SADT",
               "South Africa Time",
               "SAT",
            };
        final String[] Afghanistan = new String[] {
               "Afghanischtan-Ziit",
               "AT",
               "Afghanistan Summer Time",
               "AST",
               "Afghanistan Time",
               "AT",
            };
        final String[] Amazon = new String[] {
               "Amazonas-Schtandardziit",
               "AST",
               "Amazonas-Summerziit",
               "AST",
               "Amazonas-Ziit",
               "AT",
            };
        final String[] Africa_Central = new String[] {
               "Zentralafrikanischi Ziit",
               "CAT",
               "Central Africa Summer Time",
               "CAST",
               "Central Africa Time",
               "CAT",
            };
        final String[] Europe_Central = new String[] {
               "Mitteleurop\u00e4ischi Schtandardziit",
               "MEZ",
               "Mitteleurop\u00e4ischi Summerziit",
               "MESZ",
               "Mitteleurop\u00e4ischi Ziit",
               "MEZ",
            };
        final String[] Alaska = new String[] {
               "Alaska-Schtandardziit",
               "AKST",
               "Alaska-Summerziit",
               "AKDT",
               "Alaska-Ziit",
               "AKT",
            };
        final String[] Europe_Eastern = new String[] {
               "Oschteurop\u00e4ischi Schtandardziit",
               "OEZ",
               "Oschteurop\u00e4ischi Summerziit",
               "OESZ",
               "Oschteurop\u00e4ischi Ziit",
               "OEZ",
            };
        final String[] Africa_Eastern = new String[] {
               "Oschtafrikanischi Ziit",
               "EAT",
               "East Africa Summer Time",
               "EAST",
               "East Africa Time",
               "EAT",
            };
        final Object[][] data = new Object[][] {
            { "Europe/Samara", Moscow },
            { "Europe/Sofia", Europe_Eastern },
            { "Africa/Douala", Africa_Western },
            { "Europe/Monaco", Europe_Central },
            { "America/Yakutat", Alaska },
            { "Europe/Vienna", Europe_Central },
            { "Indian/Comoro", Africa_Eastern },
            { "Europe/Malta", Europe_Central },
            { "Europe/Madrid", Europe_Central },
            { "Africa/Kampala", Africa_Eastern },
            { "Africa/Blantyre", Africa_Central },
            { "America/Manaus", Amazon },
            { "Africa/Mogadishu", Africa_Eastern },
            { "Asia/Kabul", Afghanistan },
            { "Europe/Mariehamn", Europe_Eastern },
            { "Africa/Malabo", Africa_Western },
            { "Indian/Antananarivo", Africa_Eastern },
            { "Africa/Gaborone", Africa_Central },
            { "Africa/Mbabane", Africa_Southern },
            { "Asia/Nicosia", Europe_Eastern },
            { "Europe/Lisbon", Europe_Western },
            { "Europe/Luxembourg", Europe_Central },
            { "Europe/Zurich", Europe_Central },
            { "America/Anchorage", Alaska },
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
            { "Europe/Copenhagen", Europe_Central },
            { "Europe/Bucharest", Europe_Eastern },
            { "Europe/Helsinki", Europe_Eastern },
            { "Europe/Amsterdam", Europe_Central },
            { "Europe/Athens", Europe_Eastern },
            { "Asia/Hebron", Europe_Eastern },
            { "Africa/Windhoek", Africa_Western },
            { "Europe/Stockholm", Europe_Central },
            { "Europe/Berlin", Europe_Central },
            { "Africa/Asmera", Africa_Eastern },
            { "Africa/Kinshasa", Africa_Western },
            { "Africa/Dar_es_Salaam", Africa_Eastern },
            { "America/Campo_Grande", Amazon },
            { "Europe/Chisinau", Europe_Eastern },
            { "Europe/Budapest", Europe_Central },
            { "Africa/Tunis", Europe_Central },
            { "Africa/Maseru", Africa_Southern },
            { "Europe/San_Marino", Europe_Central },
            { "Europe/Vaduz", Europe_Central },
            { "Africa/Niamey", Africa_Western },
            { "Africa/Djibouti", Africa_Eastern },
            { "Europe/Prague", Europe_Central },
            { "Europe/Ljubljana", Europe_Central },
            { "Africa/Harare", Africa_Central },
            { "America/Boa_Vista", Amazon },
            { "Africa/Algiers", Europe_Central },
            { "America/Juneau", Alaska },
            { "America/Porto_Velho", Amazon },
            { "Europe/Gibraltar", Europe_Central },
            { "Africa/Lusaka", Africa_Central },
            { "Asia/Damascus", Europe_Eastern },
            { "Africa/Libreville", Africa_Western },
            { "Europe/Minsk", Europe_Eastern },
            { "Europe/Vilnius", Europe_Eastern },
            { "America/Nome", Alaska },
            { "Africa/Bujumbura", Africa_Central },
            { "Atlantic/Faeroe", Europe_Western },
            { "America/Rio_Branco", Amazon },
            { "Europe/Podgorica", Europe_Central },
            { "Europe/Riga", Europe_Eastern },
            { "America/Cuiaba", Amazon },
            { "Atlantic/Canary", Europe_Western },
            { "Africa/Kigali", Africa_Central },
            { "Europe/Oslo", Europe_Central },
            { "Europe/Vatican", Europe_Central },
            { "Europe/Tirane", Europe_Central },
            { "Africa/Johannesburg", Africa_Southern },
            { "Europe/Tallinn", Europe_Eastern },
            { "Europe/Uzhgorod", Europe_Eastern },
            { "Europe/Skopje", Europe_Central },
            { "Arctic/Longyearbyen", Europe_Central },
            { "Africa/Ceuta", Europe_Central },
            { "Africa/El_Aaiun", Europe_Western },
            { "Africa/Luanda", Africa_Western },
            { "Europe/Andorra", Europe_Central },
            { "Africa/Addis_Ababa", Africa_Eastern },
            { "Africa/Casablanca", Europe_Western },
            { "Africa/Nairobi", Africa_Eastern },
            { "Asia/Gaza", Europe_Eastern },
            { "Asia/Beirut", Europe_Eastern },
            { "Europe/Paris", Europe_Central },
            { "Africa/Brazzaville", Africa_Western },
            { "Africa/Lagos", Africa_Western },
            { "Africa/Porto-Novo", Africa_Western },
            { "Europe/Sarajevo", Europe_Central },
            { "Africa/Maputo", Africa_Central },
            { "Africa/Juba", Africa_Eastern },
            { "Europe/Bratislava", Europe_Central },
            { "Africa/Bangui", Africa_Western },
            { "Europe/Zagreb", Europe_Central },
            { "America/Eirunepe", Amazon },
            { "Africa/Lubumbashi", Africa_Central },
            { "Europe/Warsaw", Europe_Central },
            { "Europe/Kiev", Europe_Eastern },
            { "Africa/Cairo", Europe_Eastern },
            { "Europe/Belgrade", Europe_Central },
            { "Atlantic/Madeira", Europe_Western },
            { "America/Sitka", Alaska },
            { "Europe/Moscow", Moscow },
        };
        return data;
    }
}
