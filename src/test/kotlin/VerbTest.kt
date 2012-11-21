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

import kotlin.test.assertEquals
import org.junit.Test as test
import org.katchers.*

/**
 * @author Daniel Seidler
 * @since 2012/11/21
 */

public class VerbTest {
    test fun be() {
        assertEquals(!be, notbe)
        assertEquals(!!be, be)
    }

    test fun have() {
        assertEquals(!have, nothave)
        assertEquals(!!have, have)
    }

    test fun start() {
        assertEquals(!start, notstart)
        assertEquals(!!start, start)
    }

    test fun end() {
        assertEquals(!end, notend)
        assertEquals(!!end, end)
    }

    test fun contain() {
        assertEquals(!contain, notcontain)
        assertEquals(!!contain, contain)
    }

    test fun match() {
        assertEquals(!match, notmatch)
        assertEquals(!!match, match)
    }

    test fun fail() {
        assertEquals(!fail, notfail)
        assertEquals(!!fail, fail)
    }

}