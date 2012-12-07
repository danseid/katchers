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
import kotlin.test.assertTrue
import org.junit.Test as test
import org.katchers.*
/**
 * @author Daniel Seidler
 * @since 2012/11/21
 */
public class ShouldTest {
    test fun shouldBeAnyMatcher() {
        assertTrue(Any().should(be) is AnyBeMatcher<Any>)
        assertTrue(Any().should(!be) is AnyNotBeMatcher<Any>)
    }

    test fun shouldBeStringMatcher() {
        assertTrue(String().should(be) is AnyBeMatcher<String>)
        assertTrue(String().should(!be) is AnyNotBeMatcher<String>)
        assertTrue(String().should(contain) is StringContainMatcher)
        assertTrue(String().should(!contain) is StringNotContainMatcher)
        assertTrue(String().should(start) is StringStartMatcher)
        assertTrue(String().should(!start) is StringNotStartMatcher)
        assertTrue(String().should(end) is StringEndMatcher)
        assertTrue(String().should(!end) is StringNotEndMatcher)
        assertTrue(String().should(have) is StringHaveMatcher)
        assertTrue(String().should(!have) is StringNotHaveMatcher)
    }

    test fun shouldBeFunctionMatcher() {
        {} should !fail with AssertionError();
        {1 > 0} should !fail with AssertionError();
        try {
            {throw NullPointerException()} should !fail with NullPointerException()
        } catch (e: Throwable) {
             assertTrue(e is AssertionError)
        }
    }
} 