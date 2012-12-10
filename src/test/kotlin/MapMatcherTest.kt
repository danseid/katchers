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
 * @since 2012/12/06
 */
public class MapMatcherTest {

    test fun mapShouldContainItem() {
        mapOf(1 to "1", 2 to "2", 3 to "3") should contain item (1 to "1")
        mapOf(1 to 2, 2 to 3, 4 to 5) should contain item (1 to 2)
        { mapOf(1 to 2, 2 to 3, 4 to 5) should contain item (1 to 3) } should fail with assertionError

        mapOf(1 to "1", 2 to "2", 3 to "3") should !contain item (1 to "2")
        mapOf(1 to 2, 2 to 3, 4 to 5) should !contain item (1 to 3)
        { mapOf(1 to 2, 2 to 3, 4 to 5) should !contain item (1 to 2) } should fail with assertionError
    }

    test fun mapShouldhaveSize() {
        mapOf(1 to 1) should have size 1
        mapOf(1 to 1) should !have size 0

        { mapOf(1 to 1) should have size 0 } should fail with assertionError
        { mapOf(1 to 1) should have size 2 } should fail with assertionError
        { mapOf(1 to 1) should !have size 1 } should fail with assertionError



    }

    test fun mapShouldContainKey() {
        mapOf(1 to 2, 3 to 4, 5 to 6) should contain key 1
        mapOf("1" to 2) should contain key "1"
        { mapOf(1 to 2) should contain key 2 } should fail with assertionError

        mapOf(1 to 2, 3 to 4, 5 to 6) should !contain key 2
        mapOf("1" to 2) should !contain key "2"
        { mapOf(1 to 2) should !contain key 1 } should fail with assertionError
    }

    test fun mapShouldContainValue() {
        mapOf(1 to 2, 3 to 4, 5 to 6) should contain value 2
        mapOf("1" to 2) should contain value 2
        { mapOf(1 to 2) should contain value 1 } should fail with assertionError

        mapOf(1 to 2, 3 to 4, 5 to 6) should !contain value 1
        mapOf("1" to 2) should !contain value 1
        { mapOf(1 to 2) should !contain value 2 } should fail with assertionError


    }
}
