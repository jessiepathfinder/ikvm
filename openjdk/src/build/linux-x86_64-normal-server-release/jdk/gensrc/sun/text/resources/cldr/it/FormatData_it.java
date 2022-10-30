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

package sun.text.resources.cldr.it;

import java.util.ListResourceBundle;

public class FormatData_it extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "gennaio",
                    "febbraio",
                    "marzo",
                    "aprile",
                    "maggio",
                    "giugno",
                    "luglio",
                    "agosto",
                    "settembre",
                    "ottobre",
                    "novembre",
                    "dicembre",
                    "",
                }
            },
            { "standalone.MonthNames",
                new String[] {
                    "Gennaio",
                    "Febbraio",
                    "Marzo",
                    "Aprile",
                    "Maggio",
                    "Giugno",
                    "Luglio",
                    "Agosto",
                    "Settembre",
                    "Ottobre",
                    "Novembre",
                    "Dicembre",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "gen",
                    "feb",
                    "mar",
                    "apr",
                    "mag",
                    "giu",
                    "lug",
                    "ago",
                    "set",
                    "ott",
                    "nov",
                    "dic",
                    "",
                }
            },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "",
                    "feb",
                    "mar",
                    "apr",
                    "mag",
                    "giu",
                    "lug",
                    "ago",
                    "set",
                    "ott",
                    "nov",
                    "dic",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "",
                    "F",
                    "M",
                    "A",
                    "M",
                    "G",
                    "L",
                    "A",
                    "S",
                    "O",
                    "N",
                    "D",
                    "",
                }
            },
            { "standalone.MonthNarrows",
                new String[] {
                    "G",
                    "F",
                    "M",
                    "A",
                    "M",
                    "G",
                    "L",
                    "A",
                    "S",
                    "O",
                    "N",
                    "D",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "domenica",
                    "luned\u00ec",
                    "marted\u00ec",
                    "mercoled\u00ec",
                    "gioved\u00ec",
                    "venerd\u00ec",
                    "sabato",
                }
            },
            { "standalone.DayNames",
                new String[] {
                    "Domenica",
                    "Luned\u00ec",
                    "Marted\u00ec",
                    "Mercoled\u00ec",
                    "Gioved\u00ec",
                    "Venerd\u00ec",
                    "Sabato",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "dom",
                    "lun",
                    "mar",
                    "mer",
                    "gio",
                    "ven",
                    "sab",
                }
            },
            { "DayNarrows",
                new String[] {
                    "D",
                    "L",
                    "M",
                    "M",
                    "G",
                    "V",
                    "S",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1o trimestre",
                    "2o trimestre",
                    "3o trimestre",
                    "4o trimestre",
                }
            },
            { "standalone.QuarterNames",
                new String[] {
                    "1\u00ba trimestre",
                    "2\u00ba trimestre",
                    "3\u00ba trimestre",
                    "4\u00ba trimestre",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "T1",
                    "T2",
                    "T3",
                    "T4",
                }
            },
            { "standalone.QuarterAbbreviations",
                new String[] {
                    "T1",
                    "",
                    "",
                    "",
                }
            },
            { "QuarterNarrows",
                new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "m.",
                    "p.",
                }
            },
            { "long.Eras",
                new String[] {
                    "a.C.",
                    "d.C",
                }
            },
            { "Eras",
                new String[] {
                    "aC",
                    "dC",
                }
            },
            { "field.era", "era" },
            { "field.year", "anno" },
            { "field.month", "mese" },
            { "field.week", "settimana" },
            { "field.weekday", "giorno della settimana" },
            { "field.dayperiod", "periodo del giorno" },
            { "field.hour", "ora" },
            { "field.minute", "minuto" },
            { "field.second", "secondo" },
            { "field.zone", "zona" },
            { "TimePatterns",
                new String[] {
                    "HH:mm:ss zzzz",
                    "HH:mm:ss z",
                    "HH:mm:ss",
                    "HH:mm",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE d MMMM y",
                    "dd MMMM y",
                    "dd/MMM/y",
                    "dd/MM/yy",
                }
            },
            { "buddhist.Eras",
                new String[] {
                    "BC",
                    "EB",
                }
            },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "dd MMMM y G",
                    "dd/MMM/y G",
                    "dd/MM/y G",
                }
            },
            { "buddhist.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "dd MMMM y GGGG",
                    "dd/MMM/y GGGG",
                    "dd/MM/y GGGG",
                }
            },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "dd MMMM y G",
                    "dd/MMM/y G",
                    "dd/MM/y G",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "dd MMMM y GGGG",
                    "dd/MMM/y GGGG",
                    "dd/MM/y GGGG",
                }
            },
            { "java.time.roc.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "dd MMMM y G",
                    "dd/MMM/y G",
                    "dd/MM/y G",
                }
            },
            { "roc.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "dd MMMM y GGGG",
                    "dd/MMM/y GGGG",
                    "dd/MM/y GGGG",
                }
            },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "dd MMMM y G",
                    "dd/MMM/y G",
                    "dd/MM/y G",
                }
            },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "dd MMMM y GGGG",
                    "dd/MMM/y GGGG",
                    "dd/MM/y GGGG",
                }
            },
            { "calendarname.islamic", "calendario islamico" },
            { "calendarname.buddhist", "calendario buddista" },
            { "calendarname.gregorian", "calendario gregoriano" },
            { "calendarname.gregory", "calendario gregoriano" },
            { "calendarname.islamic-civil", "calendario civile islamico" },
            { "calendarname.islamicc", "calendario civile islamico" },
            { "calendarname.roc", "Calendario Minguo" },
            { "calendarname.japanese", "calendario giapponese" },
            { "DefaultNumberingSystem", "latn" },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4\u00a0#,##0.00",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
