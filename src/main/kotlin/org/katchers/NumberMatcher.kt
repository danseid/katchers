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
 * @since 2012/11/21
 */


class NumberBeMatcher(target: Number): AnyBeMatcher<Number>(target){
     fun gt(value: Number) = greaterThan(value)
     fun gte(value: Number) = greaterOrEqualThan(value)
     fun lt(value: Number) = lessThan(value)
     fun lte(value: Number) = lessOrEqualThan(value)

     fun greaterThan(value: Number) {
        when {
            target == value -> fail("$target > $value", "$target == $value")
            target compare value < 0 ->  fail("$target > $value", "$target < $value")
            else -> return
        }
    }

     fun greaterOrEqualThan(value: Number) = if(target compare value < 0) fail("$target >= $value", "$target < $value")

     fun lessThan(value: Number) {
        when {
            target == value -> fail("$target < $value", "$target == $value")
            target compare value > 0  ->  fail("$target < $value", "$target > $value")
            else -> return
        }
    }

     fun lessOrEqualThan(value: Number) = if(target compare value > 0) fail("$target <= $value", "$target > $value")

     fun inRange(r: IntRange) {
      if (target !in r) fail("$target should be in [${r.start},${r.end}]", "$target is not in [${r.start},${r.end}]")
    }

}

class NumberNotBeMatcher(target: Number): AnyNotBeMatcher<Number>(target){

     fun gt(value: Number) = greaterThan(value)
     fun gte(value: Number) = greaterOrEqualThan(value)
     fun lt(value: Number) = lessThan(value)
     fun lte(value: Number) = lessOrEqualThan(value)

     fun greaterThan(value: Number) = if(target compare value > 0)
        fail("!($target > $value)", "$target > $value")

     fun greaterOrEqualThan(value: Number) {
        when {
            target == value -> fail("!($target >= $value)", "$target == $value")
            target compare value > 0 ->  fail("!($target >= $value)", "$target > $value")
            else -> return
        }
    }

     fun lessThan(value: Number) = if(target compare value < 0) fail("!($target < $value)", "$target < $value")

     fun lessOrEqualThan(value: Number) {
        when {
            target == value -> fail("!($target <= $value)", "$target == $value")
            target compare value < 0 ->  fail("!($target <= $value)", "$target < $value")
            else -> return
        }
    }
}

/**
 * compares Number with another Number. This function is using Double.compareTo function
 */

fun Number.compare(that: Number): Int {
    fun compare(d: Double, n: Number): Int {
        return when(n){
            is Double -> d.compareTo(n)
            is Float  -> d.compareTo(n)
            is Long   -> d.compareTo(n)
            is Int    -> d.compareTo(n)
            is Short  -> d.compareTo(n)
            is Byte   -> d.compareTo(n)
            else      -> throw ClassCastException()
        }
    }

    return when(this){ // casting toDouble because of http://youtrack.jetbrains.com/issue/KT-3078
        is Int  -> compare(this.toDouble(), that)
        is Double -> compare(this, that)
        is Long   -> compare(this.toDouble(), that)
        is Float  -> compare(this.toDouble(), that)
        is Short  -> compare(this.toDouble(), that)
        is Byte   -> compare(this.toDouble(), that)
        else      -> throw ClassCastException()
    }
}






