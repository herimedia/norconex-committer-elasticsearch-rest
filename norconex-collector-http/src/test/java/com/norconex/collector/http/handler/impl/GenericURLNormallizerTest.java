/* Copyright 2010-2013 Norconex Inc.
 * 
 * This file is part of Norconex HTTP Collector.
 * 
 * Norconex HTTP Collector is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Norconex HTTP Collector is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Norconex HTTP Collector. If not, 
 * see <http://www.gnu.org/licenses/>.
 */
package com.norconex.collector.http.handler.impl;

import java.io.IOException;

import org.apache.commons.configuration.ConfigurationException;
import org.junit.Test;

import com.norconex.collector.http.handler.impl.GenericURLNormalizer.Normalization;
import com.norconex.commons.lang.config.ConfigurationUtil;

public class GenericURLNormallizerTest {

    @Test
    public void testWriteRead() throws ConfigurationException, IOException {
        GenericURLNormalizer n = new GenericURLNormalizer();
        n.setNormalizations(
                Normalization.lowerCaseSchemeHost,
                Normalization.addTrailingSlash,
                Normalization.decodeUnreservedCharacters,
                Normalization.removeDotSegments,
                Normalization.removeDuplicateSlashes,
                Normalization.removeSessionIds);
        n.setReplaces(
                n.new Replace("\\.htm", ".html"),
                n.new Replace("&debug=true"));
        System.out.println("Writing/Reading this: " + n);
        ConfigurationUtil.assertWriteRead(n);
    }

}