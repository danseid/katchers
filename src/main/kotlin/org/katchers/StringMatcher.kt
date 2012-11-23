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

class StringHaveMatcher(override val target: String): Matcher<String>{
    inline fun length(expected: Int) = target.length() should be equal expected
}

class StringNotHaveMatcher(override val target: String): Matcher<String>{
    inline fun length(expected: Int) = target.length() should !be equal expected
}

class StringStartMatcher(override val target: String): Matcher<String>{
    inline fun with(expected: String) = if(!target.startsWith(expected)) fail("$target should start with $expected", "$target starts with ${target.charAt(0)}")
}

class StringNotStartMatcher(override val target: String): Matcher<String>{
    inline fun with(expected: String) = if(target.startsWith(expected)) fail("$target should not start with $expected", "$target starts with $expected")
}

class StringEndMatcher(override val target: String): Matcher<String>{
    inline fun with(expected: String) = if(!target.endsWith(expected)) fail("$target should end with $expected", "$target ends with ${target.charAt(target.length - 1)}")
}

class StringNotEndMatcher(override val target: String): Matcher<String>{
    inline fun with(expected: String) = if(target.endsWith(expected)) fail("$target should not end with $expected", "$target ends with $expected")
}

class StringContainMatcher(override val target: String): Matcher<String>{
    inline fun any(values: List<String>) = if (!values.any { target.contains(it) }) fail("$target should contain any of $values", "$target did not contain any of $values")
    inline fun all(values: List<String>) = if(!values.all { target.contains(it) }) fail("$target should contain all of $values", "$target did not contain ${values filter { !target.contains(it) }}")
}

class StringNotContainMatcher(override val target: String): Matcher<String>{
    inline fun any(values: List<String>) = if(values.any { target.contains(it) }) fail("$target should not contain any of $values", "$target contained ${values filter { target.contains(it) }}")
    inline fun all(values: List<String>) = if (values.all { target.contains(it) })  fail("$target should not contain all of $values", "$target contained ${values filter { target.contains(it) }}")
}