/*******************************************************************************
 * Copyright 2013-2018 QaProSoft (http://www.qaprosoft.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.qaprosoft.carina.core.foundation.report.testrail.core;

/**
 * Created by Patotsky on 14.01.2015.
 */
public enum TestStatus {


    PASSED(1), BLOCKED(2), UNTESTED(3), RETEST(4), FAILED(5);


    int i;

    TestStatus(int i) {
        this.i = i;

    }

    public int getNumber() {
        return i;
    }
}
