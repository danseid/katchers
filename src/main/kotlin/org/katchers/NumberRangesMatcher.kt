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
 * @since 2012/11/22
 * NumberRangesMatcher use the "in" syntax of Kotlin
 */

fun range(r: IntRange) = NumberIntRange(r)
fun range(r: LongRange) = NumberLongRange(r)
fun range(r: FloatRange) = NumberFloatRange(r)
fun range(r: DoubleRange) = NumberDoubleRange(r)

trait NumberRange {
    open val start: Number;
    open val end: Number;
    fun inRange(n: Number): Boolean = n.compare(start) >= 0 && n.compare(end) <= 0
    fun contains(n: NumberBeMatcher): Boolean {
        if(!inRange(n.target))   {
            fail("${n.target} should be in ($start, $end)", "${n.target} is not in ($start, $end)")
            return false
        }
        else return true
    }
    fun contains(n: NumberNotBeMatcher): Boolean {
        if(inRange(n.target))   {
            fail("${n.target} should not be in ($start, $end)", "${n.target} is in ($start, $end)")
            return false
        }
        else return true
    }
}

class NumberIntRange(val r: IntRange): NumberRange{
    override val start = r.start;
    override val end = r.end;
}

class NumberLongRange(val r: LongRange): NumberRange{
    override val start = r.start;
    override val end = r.end;
}

class NumberFloatRange(val r: FloatRange): NumberRange{
    override val start = r.start;
    override val end = r.end;
}

class NumberDoubleRange(val r: DoubleRange): NumberRange{
    override val start = r.start;
    override val end = r.end;
}
