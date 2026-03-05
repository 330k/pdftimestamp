/* modified by 330k */

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fsij.pdftimestamp;

import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

public class URLCreator {
    /**
     * Cloudflare Workersをプロキシとして使う文字列を付加してURLオブジェクトを生成する
     * @param baseUrlStr ベースとなるURL文字列
     * @return 生成されたURLオブジェクト
     */
    public static URL createURL(String baseUrlStr) throws MalformedURLException {
        //String fullUrlStr = "https://generic-proxy.330k.workers.dev/?x-url=" + baseUrlStr;
        String fullUrlStr = baseUrlStr;
        try{
            return new URI(fullUrlStr).toURL();
        }catch(URISyntaxException e){
            return null;
        }
    }
}
