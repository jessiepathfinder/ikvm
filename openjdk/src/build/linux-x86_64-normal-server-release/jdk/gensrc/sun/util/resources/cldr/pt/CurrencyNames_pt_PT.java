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

package sun.util.resources.cldr.pt;

import sun.util.resources.OpenListResourceBundle;

public class CurrencyNames_pt_PT extends OpenListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "BRL", "BR$" },
            { "aed", "Dirham dos Emirados \u00c1rabes Unidos" },
            { "afa", "Afeghani (1927-2002)" },
            { "afn", "Afgani afeg\u00e3o" },
            { "ang", "Florim das Antilhas Holandesas" },
            { "awg", "Florim de Aruba" },
            { "bad", "Dinar da B\u00f3snia-Herzeg\u00f3vina" },
            { "bam", "Marco b\u00f3snio-herzeg\u00f3vino convers\u00edvel" },
            { "bec", "Franco belga (convert\u00edvel)" },
            { "byb", "Rublo novo bielorusso (1994-1999)" },
            { "cad", "D\u00f3lar canadiano" },
            { "cyp", "Libra de Chipre" },
            { "czk", "Coroa da Rep\u00fablica Checa" },
            { "ecv", "Unidad de Valor Constante (UVC) do Equador" },
            { "gmd", "Dalasi da G\u00e2mbia" },
            { "gnf", "Franco Guineense" },
            { "gtq", "Quetzal da Guatemala" },
            { "hnl", "Lempira das Honduras" },
            { "kwd", "Dinar do Koweit" },
            { "kyd", "D\u00f3lar das Ilhas Caim\u00e3o" },
            { "mkd", "Dinar Maced\u00f3nio" },
            { "mwk", "Cuacha do Malawi" },
            { "mxp", "Peso Plata mexicano (1861-1992)" },
            { "mxv", "Unidad de Inversion (UDI) mexicana" },
            { "nic", "C\u00f3rdoba nicaraguano" },
            { "nio", "C\u00f3rdoba Ouro nicaraguano" },
            { "pln", "Zloti polaco" },
            { "qar", "Rial do Catar" },
            { "sgd", "D\u00f3lar de Singapura" },
            { "thb", "Baht da Tail\u00e2ndia" },
            { "tzs", "Xelim de Tanz\u00e2nia" },
            { "usd", "D\u00f3lar dos Estados Unidos" },
            { "wst", "Tala de Samoa Ocidental" },
            { "xxx", "Moeda Desconhecida" },
        };
        return data;
    }
}
