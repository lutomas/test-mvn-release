/* Copyright 2009-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tlu.test.mvn.release.impl;

import java.net.URL;
import java.util.Properties;

/**
 * @author Tomas Lukosius (tomas.lukosius@opencredo.com)
 */
public class Utils {
    public static Properties load(String propsName) {
        Properties props = new Properties();
        URL url = ClassLoader.getSystemResource(propsName);
        try {
            props.load(url.openStream());
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to load properties - " + propsName, e);
        }
        return props;
    }
}