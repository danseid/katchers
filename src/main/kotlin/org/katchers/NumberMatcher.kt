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


class NumberBeMatcher(target: jet.Number): AnyBeMatcher<Number>(target){

    inline fun gt(value: Number) = greaterThan(value)
    inline fun gte(value: Number) = greaterOrEqualThan(value)
    inline fun lt(value: Number) = lessThan(value)
    inline fun lte(value: Number) = lessOrEqualThan(value)

    fun greaterThan(value: jet.Number) {

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

    fun inRange(val r: IntRange) {
      if (target !in r) fail("$target should be in [${r.start},${r.end}]", "$target is not in [${r.start},${r.end}]")
    }

}

class NumberNotBeMatcher(target: Number): AnyNotBeMatcher<Number>(target){

    inline fun gt(value: Number) = greaterThan(value)
    inline fun gte(value: Number) = greaterOrEqualThan(value)
    inline fun lt(value: Number) = lessThan(value)
    inline fun lte(value: Number) = lessOrEqualThan(value)

    fun greaterThan(value: Number) = if(target compare value > 0) fail("!($target > $value)", "$target > $value")

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

fun Number.compare(that: Number): Int {
    when(this){
        is Int -> {
            val it = this as Int
            when(that){
                is Double -> return (it.compareTo(that as Double))
                is Float -> return (it.compareTo(that as Float))
                is Long -> return (it.compareTo(that as Long))
                is Int -> return (it.compareTo(that as Int))
                is Short -> return (it.compareTo(that as Short))
                is Byte -> return (it.compareTo(that as Byte))
                else -> throw ClassCastException()
            }
        }
        is Double -> {
            val it = this as Double
            when(that){
                is Double -> return (it.compareTo(that as Double))
                is Float -> return (it.compareTo(that as Float))
                is Long -> return (it.compareTo(that as Long))
                is Int -> return (it.compareTo(that as Int))
                is Short -> return (it.compareTo(that as Short))
                is Byte -> return (it.compareTo(that as Byte))
                else -> throw ClassCastException()
            }
        }
        is Long -> {
            val it = this as Long
            when(that){
                is Double -> return (it.compareTo(that as Double))
                is Float -> return (it.compareTo(that as Float))
                is Long -> return (it.compareTo(that as Long))
                is Int -> return (it.compareTo(that as Int))
                is Short -> return (it.compareTo(that as Short))
                is Byte -> return (it.compareTo(that as Byte))
                else -> throw ClassCastException()
            }
        }
        is Float -> {
            val it = this as Float
            when(that){
                is Double -> return (it.compareTo(that as Double))
                is Float -> return (it.compareTo(that as Float))
                is Long -> return (it.compareTo(that as Long))
                is Int -> return (it.compareTo(that as Int))
                is Short -> return (it.compareTo(that as Short))
                is Byte -> return (it.compareTo(that as Byte))
                else -> throw ClassCastException()
            }
        }
        is Short -> {
            val it = this as Short
            when(that){
                is Double -> return (it.compareTo(that as Double))
                is Float -> return (it.compareTo(that as Float))
                is Long -> return (it.compareTo(that as Long))
                is Int -> return (it.compareTo(that as Int))
                is Short -> return (it.compareTo(that as Short))
                is Byte -> return (it.compareTo(that as Byte))
                else -> throw ClassCastException()
            }
        }
        is Byte -> {
            val it = this as Byte
            when(that){
                is Double -> return (it.compareTo(that as Double))
                is Float -> return (it.compareTo(that as Float))
                is Long -> return (it.compareTo(that as Long))
                is Int -> return (it.compareTo(that as Int))
                is Short -> return (it.compareTo(that as Short))
                is Byte -> return (it.compareTo(that as Byte))
                else -> throw ClassCastException()
            }
        }
        else -> throw ClassCastException()
    }
}






