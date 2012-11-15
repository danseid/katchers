/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 13:51
 */

import org.junit.Test as test
import spec.matchers.*
import sun.management.counter.Units

public class StringMatcherTest {
    test fun length() {
        "" should have length 0
        "a" should have length 1
        "a" should !have length 0
        "" should !have length 1
    }

    test fun with() {
        "abc" should start with "a"
        "abc" should !start with "b"
        "abc" should end with "c"
        "abc" should !end with "b"
        "abc" should end with "bc"
        "abc" should end with ""
        "" should !end with "abc"

        ("" should be).blank()
    }



} 