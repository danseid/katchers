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
package org.katchers

/**
 * @author Daniel Seidler
 * @since 2012/11/20
 */
class IntBeMatcher(target: Int): AnyBeMatcher<Int>(target){

    inline fun gt(value: Int) = greaterThan(value)
    inline fun gte(value: Int) = greaterOrEqualThan(value)
    inline fun lt(value: Int) = lessThan(value)
    inline fun lte(value: Int) = lessOrEqualThan(value)

    fun greaterThan(value: Int) {
        when {
            target == value -> fail("$target > $value", "$target == $value")
            target < value ->  fail("$target > $value", "$target < $value")
            else -> return
        }
    }

    fun greaterOrEqualThan(value: Int) = if(target < value) fail("$target >= $value", "$target < $value")

    fun lessThan(value: Int) {
        when {
            target == value -> fail("$target < $value", "$target == $value")
            target > value ->  fail("$target < $value", "$target > $value")
            else -> return
        }
    }

    fun lessOrEqualThan(value: Int)  = if(target > value) fail("$target <= $value", "$target > $value")

}

class IntNotBeMatcher(target: Int): AnyNotBeMatcher<Int>(target){

    inline fun gt(value: Int) = greaterThan(value)
    inline fun gte(value: Int) = greaterOrEqualThan(value)
    inline fun lt(value: Int) = lessThan(value)
    inline fun lte(value: Int) = lessOrEqualThan(value)

    fun greaterThan(value: Int) = if(target > value) fail("!($target > $value)", "$target > $value")

    fun greaterOrEqualThan(value: Int) {
        when {
            target == value -> fail("!($target >= $value)", "$target == $value")
            target > value ->  fail("!($target >= $value)", "$target > $value")
            else -> return
        }
    }

    fun lessThan(value: Int) = if(target < value) fail("!($target < $value)", "$target < $value")

    fun lessOrEqualThan(value: Int) {
        when {
            target == value -> fail("!($target <= $value)", "$target == $value")
            target < value ->  fail("!($target <= $value)", "$target < $value")
            else -> return
        }
    }
}