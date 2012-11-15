/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 16:26
 */

import org.junit.Test as test
import spec.matchers.*
import kotlin.test.assertTrue

public class ShouldTest {
    test fun shouldBeAnyMatcher() {
       assertTrue(Any().should(be) is AnyMatcher<Any>)
    }

    test fun shouldBeStringMatcher() {
        assertTrue(String().should(be) is StringMatcher)
    }
} 