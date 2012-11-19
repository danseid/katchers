/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 16:26
 */

import kotlin.test.assertTrue
import org.junit.Test as test
import spec.matchers.*

public class ShouldTest {
    test fun shouldBeAnyMatcher() {
        assertTrue(Any().should(be) is AnyBeMatcher<Any>)
    }

    test fun shouldBeStringMatcher() {
        assertTrue(String().should(be) is StringMatcher)
    }
} 