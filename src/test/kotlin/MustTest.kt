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
import org.junit.Test as test
import org.katchers.*
import kotlin.test.assertTrue

/**
 * @author Daniel Seidler
 * @since 2012/11/23
 */
public class MustTest {

    test fun mustBeAnyMatcher() {
        assertTrue(Any().must(be) is AnyBeMatcher<Any>)
        assertTrue(Any().must(!be) is AnyNotBeMatcher<Any>)
    }

    test fun mustBeStringMatcher() {
        assertTrue(String().must(be) is AnyBeMatcher<String>)
        assertTrue(String().must(!be) is AnyNotBeMatcher<String>)
        assertTrue(String().must(contain) is StringContainMatcher)
        assertTrue(String().must(!contain) is StringNotContainMatcher)
        assertTrue(String().must(start) is StringStartMatcher)
        assertTrue(String().must(!start) is StringNotStartMatcher)
        assertTrue(String().must(end) is StringEndMatcher)
        assertTrue(String().must(!end) is StringNotEndMatcher)
        assertTrue(String().must(have) is StringHaveMatcher)
        assertTrue(String().must(!have) is StringNotHaveMatcher)
    }

//    test fun mustBeFunctionMatcher() {
//        assertTrue({}.must(fail) is FunctionFailMatcher<Unit>)
//        assertTrue({}.must(!fail) is FunctionNotFailMatcher<Unit>)
//        assertTrue({"string"}.must(fail) is FunctionFailMatcher<String>)
//        assertTrue({"string"}.must(!fail) is FunctionNotFailMatcher<String>)
//
//    }
}