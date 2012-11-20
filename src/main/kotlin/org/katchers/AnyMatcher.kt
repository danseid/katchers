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

import kotlin.test.*

/**
 * @author Daniel Seidler
 * @since 2012/11/19
 */

trait Matcher {
    inline protected fun notSupported(): Unit = fail("Not Supported Condition ")
}

open class AnyBeMatcher<T>(val target: T): Matcher {
    inline fun equal(value: T) = if (value != target) fail(value, target)
    open inline fun any(values: List<T>) = if(!values.any { it == target }) fail("any of $values", target)
}

open class AnyNotBeMatcher<T>(val target: T): Matcher {
    inline fun equal(value: T) = if (value == target) fail(value, target)
    open inline fun any(values: List<T>) = if(values any { it == target }) fail("not any of $values", target)
}


