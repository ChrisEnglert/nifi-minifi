/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.minifi.bootstrap.util.schema;

import org.apache.nifi.minifi.bootstrap.util.schema.common.BaseSchema;

import java.util.Map;

import static org.apache.nifi.minifi.bootstrap.util.schema.common.CommonPropertyKeys.PROVENANCE_REPO_KEY;

public class ProvenanceRepositorySchema extends BaseSchema {


    public static final String PROVENANCE_REPO_ROLLOVER_TIME_KEY = "provenance rollover time";

    private String provenanceRepoRolloverTime = "1 min";

    public ProvenanceRepositorySchema(){
    }

    public ProvenanceRepositorySchema(Map map) {
        provenanceRepoRolloverTime = getOptionalKeyAsType(map, PROVENANCE_REPO_ROLLOVER_TIME_KEY, String.class, PROVENANCE_REPO_KEY, "1 min");
    }

    public String getProvenanceRepoRolloverTimeKey() {
        return provenanceRepoRolloverTime;
    }
}