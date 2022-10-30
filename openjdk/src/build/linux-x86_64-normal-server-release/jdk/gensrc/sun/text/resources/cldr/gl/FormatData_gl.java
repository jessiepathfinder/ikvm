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

package sun.text.resources.cldr.gl;

import java.util.ListResourceBundle;

public class FormatData_gl extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "Xaneiro",
                    "Febreiro",
                    "Marzo",
                    "Abril",
                    "Maio",
                    "Xu\u00f1o",
                    "Xullo",
                    "Agosto",
                    "Setembro",
                    "Outubro",
                    "Novembro",
                    "Decembro",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "Xan",
                    "Feb",
                    "Mar",
                    "Abr",
                    "Mai",
                    "Xu\u00f1",
                    "Xul",
                    "Ago",
                    "Set",
                    "Out",
                    "Nov",
                    "Dec",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "X",
                    "F",
                    "M",
                    "A",
                    "M",
                    "X",
                    "X",
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
                    "Domingo",
                    "Luns",
                    "Martes",
                    "M\u00e9rcores",
                    "Xoves",
                    "Venres",
                    "S\u00e1bado",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "Dom",
                    "Lun",
                    "Mar",
                    "M\u00e9r",
                    "Xov",
                    "Ven",
                    "S\u00e1b",
                }
            },
            { "DayNarrows",
                new String[] {
                    "D",
                    "L",
                    "M",
                    "M",
                    "X",
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
            { "QuarterAbbreviations",
                new String[] {
                    "T1",
                    "T2",
                    "T3",
                    "T4",
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
                    "a.m.",
                    "p.m.",
                }
            },
            { "narrow.AmPmMarkers",
                new String[] {
                    "a",
                    "p",
                }
            },
            { "long.Eras",
                new String[] {
                    "antes de Cristo",
                    "despois de Cristo",
                }
            },
            { "Eras",
                new String[] {
                    "a.C.",
                    "d.C.",
                }
            },
            { "field.era", "Era" },
            { "field.year", "Ano" },
            { "field.month", "Mes" },
            { "field.week", "Semana" },
            { "field.weekday", "D\u00eda da semana" },
            { "field.dayperiod", "a.m./p.m." },
            { "field.hour", "Hora" },
            { "field.minute", "Minuto" },
            { "field.second", "Segundo" },
            { "field.zone", "Fuso horario" },
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
                    "EEEE dd MMMM y",
                    "dd MMMM y",
                    "d MMM, y",
                    "dd/MM/yy",
                }
            },
            { "calendarname.islamic", "calendario isl\u00e1mico" },
            { "calendarname.buddhist", "calendario budista" },
            { "calendarname.gregorian", "calendario gregoriano" },
            { "calendarname.gregory", "calendario gregoriano" },
            { "calendarname.islamic-civil", "calendario isl\u00e1mico civil" },
            { "calendarname.islamicc", "calendario isl\u00e1mico civil" },
            { "calendarname.roc", "Calendario Minguo" },
            { "calendarname.japanese", "calendario xapon\u00e9s" },
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
                    "#,##0.00\u00a0\u00a4",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
