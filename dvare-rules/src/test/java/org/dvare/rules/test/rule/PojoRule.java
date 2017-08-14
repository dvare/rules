/*The MIT License (MIT)

Copyright (c) 2016 Muhammad Hammad

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Sogiftware.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.*/


package org.dvare.rules.test.rule;

import org.apache.log4j.Logger;
import org.dvare.annotations.*;

@Rule(name = "pojoRule", priority = 0)
public class PojoRule {
    private static Logger logger = Logger.getLogger(PojoRule.class);
    private Integer age;

    @Condition(type = ConditionType.CODE)
    public Boolean condition() {

        return age > 20 && age < 30;
    }

    @Before
    public void beforeAction() {
        logger.info("Before RuleBinding Running");
    }

    @Success
    public void success() {
        logger.info("RuleBinding Successfully Run");
    }

    @Fail
    public void fail() {
        logger.error("RuleBinding Failed");
    }

    @After
    public void afterAction() {
        logger.info("After RuleBinding Running");

    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
