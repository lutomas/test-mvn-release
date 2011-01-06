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

import java.util.Properties;

import org.tlu.test.mvn.release.SystemInfo;

/**
 * @author Tomas Lukosius (tomas.lukosius@opencredo.com)
 * 
 */
public class SystemInfoImpl implements SystemInfo {

    private static final String INFO_PROPERTIES = "info.properties";

    private static String VERSION = "version";

    private Properties properties;

    public SystemInfoImpl() {
        super();

        this.properties = Utils.load(INFO_PROPERTIES);
    }

    /**
     * @return
     * @see org.tlu.test.mvn.release.SystemInfo#getSystemVersion()
     */
    public String getSystemVersion() {
        return properties.getProperty(VERSION);
    }

}
