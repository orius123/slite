package com.hp.score.lang.compiler.domain;
/*
 * Licensed to Hewlett-Packard Development Company, L.P. under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/

/*
 * Created by orius123 on 05/11/14.
 */
import java.io.Serializable;
import java.util.Map;

public class Operation {

    private final Map<String, Serializable> preOpActionData;
    private final Map<String, Serializable> postOpActionData;
    private final DoAction doAction;

    public Operation(Map<String, Serializable> preOpActionData, Map<String, Serializable> postOpActionData, DoAction doAction) {
        this.preOpActionData = preOpActionData;
        this.postOpActionData = postOpActionData;
        this.doAction = doAction;
    }

    public Map<String, Serializable> getPreOpActionData() {
        return preOpActionData;
    }

    public Map<String, Serializable> getPostOpActionData() {
        return postOpActionData;
    }

    public DoAction getDoAction() {
        return doAction;
    }
}
