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

import sun.util.resources.OpenListResourceBundle;

public class CurrencyNames_be extends OpenListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "BYB", "\u0420\u0443\u0431" },
            { "JPY", "\u00a5" },
            { "RUB", "\u0440\u0430\u0441. \u0440\u0443\u0431." },
            { "USD", "$" },
            { "aud", "\u0430\u045e\u0441\u0442\u0440\u0430\u043b\u0456\u0439\u0441\u043a\u0456 \u0434\u0430\u043b\u044f\u0440" },
            { "brl", "\u0431\u0440\u0430\u0437\u0456\u043b\u044c\u0441\u043a\u0456 \u0440\u044d\u0430\u043b" },
            { "byr", "\u0431\u0435\u043b\u0430\u0440\u0443\u0441\u043a\u0456 \u0440\u0443\u0431\u0435\u043b\u044c" },
            { "cny", "\u043a\u0456\u0442\u0430\u0439\u0441\u043a\u0456 \u044e\u0430\u043d\u044c" },
            { "ern", "\u044d\u0440\u044b\u0442\u0440\u044d\u0439\u0441\u043a\u0430\u044f \u043d\u0430\u043a\u0444\u0430" },
            { "eur", "\u0435\u045e\u0440\u0430" },
            { "gbp", "\u0430\u043d\u0433\u043b\u0456\u0439\u0441\u043a\u0456 \u0444\u0443\u043d\u0442" },
            { "inr", "\u0456\u043d\u0434\u044b\u0439\u0441\u043a\u0430\u044f \u0440\u0443\u043f\u0456\u044f" },
            { "jpy", "\u044f\u043f\u043e\u043d\u0441\u043a\u0430\u044f \u0456\u0435\u043d\u0430" },
            { "nok", "\u043d\u0430\u0440\u0432\u044d\u0441\u043a\u0430\u044f \u043a\u0440\u043e\u043d\u0430" },
            { "rub", "\u0440\u0443\u0441\u043a\u0456 \u0440\u0443\u0431\u0435\u043b\u044c" },
            { "usd", "\u0434\u043e\u043b\u0430\u0440 \u0417\u0428\u0410" },
            { "xxx", "\u043d\u0435\u0432\u044f\u0434\u043e\u043c\u0430\u044f \u0430\u0431\u043e \u043d\u0435\u0434\u0430\u043f\u0443\u0448\u0447\u0430\u043b\u044c\u043d\u0430\u044f \u0432\u0430\u043b\u044e\u0442\u0430" },
        };
        return data;
    }
}
