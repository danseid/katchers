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

class FunctionFailMatcher<T: () -> Any>(override val target: T): Matcher<T>{
    fun with(error: Throwable) {
        var failed = true // assume it will fail
        try {
            target()
            failed = false // no Exception, so not failed
        } catch (e: Throwable){
            if(e.getName() != error.getName()) fail(error.getName(), e.getName())
        } finally {
            if(!failed) fail(error, "none")
        }
    }
}
class FunctionNotFailMatcher<T: () -> Any>(override val target: T): Matcher<T>{
    fun with(error: Throwable) {
        try {
            target()
        } catch (e: Throwable){
            if(e.getName() == error.getName()) fail("should not fail with ${error.getName()}", "failed with ${e.getName()}")
        }
    }
}

private inline fun Throwable.getName() = this.javaClass.getName()
public val assertionError : AssertionError = AssertionError()