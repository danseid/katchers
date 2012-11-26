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
 * @since 2012/11/23
 */
public class NumberRangesMatcherTest {

    test fun shouldBeInRange() {
        1 should be in range(1..2)
        1 should be in range(1.0..2.0)
        1.1 should be in range(1..2)
        1.1 should be in range(1.0..2.0)
        1 should be in range(0.9..1.1);
        {1 should be in range(1.1..1.2)} should fail with assertionError;
        {1.09 should be in range(1.1..1.2)} should fail with assertionError
        {1.201 should be in range(1.1..1.2)} should fail with assertionError
    }

    test fun shouldNotBeInRange() {
        1 should !be in range(1.1..2.0)
        1.0 should !be in range(1.1..2.0)
        1.99 should !be in range(2..3)
        1.99 should !be in range(1.991..1.992)
        1 should !be in range(0.9..0.99);
        {1.001 should !be in range(1..2)} should fail with assertionError;
        {1.11 should !be in range(1.10..1.12)} should fail with assertionError
        {1.1999 should !be in range(1.1..1.2)} should fail with assertionError

    }
}