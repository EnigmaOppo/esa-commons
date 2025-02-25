/*
 * Copyright 2021 OPPO ESA Stack Project
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
 */
package esa.commons.spi.extensionloader.inject;

import esa.commons.spi.factory.Inject;

public class ConstructorInjectCycleBean2 implements ConstructorInjectCycleBean {

    private ConstructorInjectCycleBean1 bean1;

    @Inject(name = "bean1")
    public ConstructorInjectCycleBean2(ConstructorInjectCycleBean1 bean1) {
        this.bean1 = bean1;
    }

    @Override
    public Object getInject() {
        return bean1;
    }
}
