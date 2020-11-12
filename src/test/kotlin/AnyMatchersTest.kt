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

public class AnyMatchersTest {
    test fun integers() {
        1 should be equal 1
        1 should !be equal 2

        1 should be any of(1, 2, 3);
        4 should !be any of(1, 2, 3);

        { 4 should be any of(1, 2, 3) } should fail with AssertionError();
        { 1 should be any of(1, 2, 3) } should !fail with AssertionError();
        { 4 should !be any of(1, 2, 3) } should !fail with AssertionError();
        { 1 should !be any of(1, 2, 3) } should fail with AssertionError()

    }

    test fun strings() {
        "" should be equal ""
        "a" should be equal "a"
        "a" should !be equal ""

        "a" should be any of("a", "b", "c");
        "d" should !be any of("a", "b", "c");

        { "d" should be any of("a", "b", "c") } should fail with AssertionError();
        { "a" should be any of("a", "b", "c") } should !fail with AssertionError();
        { "d" should !be any of("a", "b", "c") } should !fail with AssertionError();
        { "a" should !be any of("a", "b", "c") } should fail with AssertionError()
    }

    test fun condition() {
        val book = object {
            val title = "Title"
            val author = "Author"
        }

        book should match condition { title == "Title" && author == "Author" }
        book should match condition { title == "" || author == "Author" }
        book should match condition { title == "Title" || author == "" }
        book should !match condition { title == "T" && author == "Author" }

        { book should match condition { title == "Titl" && author == "Author" } } should fail with assertionError
        { book should !match condition { title == "Title" && author == "Author" } } should fail with assertionError

        1 should match condition {this > 0 && this < 2}
        1 should !match condition {this < 1 || this > 1}
    }
} 