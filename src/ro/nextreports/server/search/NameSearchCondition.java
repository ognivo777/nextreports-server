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
package ro.nextreports.server.search;

import ro.nextreports.server.dao.StorageDao;
import ro.nextreports.server.domain.Entity;
import ro.nextreports.server.service.StorageService;

/**
 * Created by IntelliJ IDEA.
 * User: mihai.panaitescu
 * Date: May 7, 2008
 * Time: 10:46:34 AM
 */
public class NameSearchCondition extends SearchCondition {

    private NameSearchEntry searchEntry;

    public NameSearchCondition(StorageDao storageDao, NameSearchEntry searchEntry) {
        set(storageDao);
        this.searchEntry = searchEntry;
    }

    @Override
    public int getStatus(StorageService storageService, Entity entity) {
        String entityName = entity.getName();
        String searchName = searchEntry.getName();        
        boolean foundByName = false;
        if (searchEntry.isIgnoredCase()) {
            entityName = entityName.toLowerCase();
            if (searchName != null) {
                searchName = searchName.toLowerCase();
            }
        }

        if (searchName != null) {
            if (entityName.contains(searchName)) {
                foundByName = true;
            }
        }
        return foundByName ? TRUE : FALSE;
    }
}
