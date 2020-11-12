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
 * @since 2012/11/20
 */

 fun <T>fail(expected: T, got: T): Unit {
    fail("""
       expected:  <$expected>
       got:       <$got>
    """)
}

 fun <T>of(vararg values: T): List<T> = values.toList()
