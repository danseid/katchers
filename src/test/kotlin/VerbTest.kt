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
        assertEquals(be, Verb.BE)
        assertEquals(!be, Verb.NOTBE)
        assertEquals(!!be, Verb.BE)
    }

    test fun have() {
        assertEquals(have, Verb.HAVE)
        assertEquals(!have, Verb.NOTHAVE)
        assertEquals(!!have, Verb.HAVE)
    }

    test fun start() {
        assertEquals(start, Verb.START)
        assertEquals(!start, Verb.NOTSTART)
        assertEquals(!!start, Verb.START)
    }

    test fun end() {
        assertEquals(end, Verb.END)
        assertEquals(!end, Verb.NOTEND)
        assertEquals(!!end, Verb.END)
    }

    test fun contain() {
        assertEquals(contain, Verb.CONTAIN)
        assertEquals(!contain, Verb.NOTCONTAIN)
        assertEquals(!!contain, Verb.CONTAIN)
    }

    test fun match() {
        assertEquals(match, Verb.MATCH)
        assertEquals(!match, Verb.NOTMATCH)
        assertEquals(!!match, Verb.MATCH)
    }

    test fun fail() {
        assertEquals(fail, Verb.FAIL)
        assertEquals(!fail, Verb.NOTFAIL)
        assertEquals(!!fail, Verb.FAIL)
    }

}