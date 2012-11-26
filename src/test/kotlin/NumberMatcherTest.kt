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
public class NumberMatcherTest {

    test fun shouldBeGreaterThan() {
        1 should be gt 0
        1 should !be gt 2
        { 1 should be gt 0 } should !fail with assertionError;
        { 1 should be gt 1 } should fail with assertionError;
        { 1 should !be gt 2 } should !fail with assertionError;

        1.0 should !be gt 1
        1 should be gt 0.9
        0.9 should !be gt 1

        { 0.9 should be gt 1 } should fail with assertionError;
        { 1 should be gt 1.1 } should fail with assertionError;
        { 1.1 should !be gt 1 } should fail with assertionError;
        { 1 should !be gt 0.9 } should fail with assertionError;


    }
    test fun shouldBeGreaterOrEqualThan() {
        1 should be gte 0
        1 should be gte 1
        1 should !be gte 2

        { 1 should be gte 0 } should !fail with assertionError;
        { 1 should be gte 1 } should !fail with assertionError;
        { 1 should be gte 2 } should fail with assertionError;

        { 1 should !be gte 1 } should fail with assertionError;
        { 1 should !be gte 0 } should fail with assertionError;
        { 1 should !be gte 2 } should !fail with assertionError;

        1.0 should be gte 1
        1.1 should be gte 1
        1 should be gte 0.9
        1 should be gte 1
        1.0 should be gte 1.0
        1.0 should be gte 0.9


    }

    test fun shouldBeLessThan() {
        1 should  be lt 2
        1 should !be lt 1
        1 should !be lt 0

        { 1 should  be lt 2 } should !fail with assertionError;
        { 1 should !be lt 1 } should !fail with assertionError;
        { 1 should !be lt 0 } should !fail with assertionError;

        { 1 should !be lt 2 } should fail with assertionError;
        { 1 should  be lt 1 } should fail with assertionError;
        { 1 should  be lt 0 } should fail with assertionError;


    }
    test fun shouldBeLessOrEqualThan() {
        1 should !be lte 0
        1 should  be lte 1
        1 should  be lte 2

        { 1 should !be lte 0 } should !fail with assertionError;
        { 1 should  be lte 1 } should !fail with assertionError;
        { 1 should  be lte 2 } should !fail with assertionError;

        { 1 should !be lte 2 } should fail with assertionError;
        { 1 should !be lte 1 } should fail with assertionError;
        { 1 should  be lte 0 } should fail with assertionError;
    }

}