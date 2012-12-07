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
public class CollectionMatcherTest {

    test fun collectionShouldContainItem() {
        listOf(1, 2, 3) should contain item 3
        setOf(1, 2, 3) should contain item 2
        listOf("1", "2") should contain item "2"
        { listOf(1, 2, 3) should contain item 4 } should fail with assertionError

        listOf(1, 2, 3) should !contain item 4
        listOf("1", "2") should !contain item "3"
        { listOf(1, 2, 3) should !contain item 3 } should fail with assertionError
    }

    test fun collectionShouldHaveSize() {
        listOf(1,2,3) should have size 3
        listOf(1).drop(1) should have size 0
        {listOf(1,2,3) should have size 2} should fail with assertionError
        {listOf(1,2,3) should have size 4} should fail with assertionError

        listOf(1,2,3) should !have size 4
        listOf(1).drop(1) should !have size 1
        {listOf(1,2,3) should !have size 3} should fail with assertionError
        {listOf(1).drop(1) should !have size 0} should fail with assertionError

    }

}