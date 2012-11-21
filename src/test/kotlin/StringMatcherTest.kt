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

/**
 * @author Daniel Seidler
 * @since 2012/11/21
 */
public class StringMatcherTest {
    test fun haveLength() {
        "" should have length 0
        "a" should have length 1
        "a" should !have length 0
        "" should !have length 1

        { "" should have length 1 } should fail with AssertionError();
        { "" should !have length 0 } should fail with AssertionError()

    }

    test fun startWith() {
        "abc" should start with "a"
        "abc" should !start with "b"
        "abc" should end with "c"
        "abc" should !end with "b"
        "abc" should end with "bc"
        "abc" should end with ""
        "" should !end with "abc"

        { "abc" should start with "b" } should fail with AssertionError();
        { "abc" should !start with "a" } should fail with AssertionError();
        { "abc" should end with "b" } should fail with AssertionError();
        { "abc" should !end with "c" } should fail with AssertionError();
    }

    test fun containAny() {
        "abc" should contain any of("a", "b", "c")
        "abc" should !contain any of("d", "e", "f");

        { "abc" should contain any of("d", "e", "f") } should fail with AssertionError();
        { "abc" should !contain any of("a", "e", "f") } should fail with AssertionError();


    }

    test fun containAll() {
        "abc" should contain all of("a", "b", "c")
        "abc" should !contain all of("d", "e");

        { "abc" should contain all of("a", "b", "d") } should fail with AssertionError();
        { "abc" should !contain all of("a", "b") } should fail with AssertionError();

    }

} 