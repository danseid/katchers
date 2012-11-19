/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 10:40
 */

import kotlin.test.assertEquals
import org.junit.Test as test
import spec.matchers.*

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