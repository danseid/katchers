/*
 * Copyright 2012 Daniel Seidler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package spec.matchers

/**
 * @author Daniel Seidler
 * @since 2012/11/20
 */
class IntMatcher(target: Int): Matcher{

    // greater than: target > value
    fun gt(value: Int) {
        greaterThan(value)
    }

    // greater than or equal: target > value
    fun gte(value: Int) {
        greaterOrEqualThan(value)
    }

    // less than: target > value
    fun lt(value: Int) {
        lessThan(value)
    }

    // less than or equal: target > value
    fun lte(value: Int) {
        lessOrEqualThan(value)
    }

    fun greaterThan(value: Int) {

    }

    fun lessThan(value: Int) {

    }

    fun greaterOrEqualThan(value: Int) {

    }

    fun lessOrEqualThan(value: Int) {

    }

}