/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 11:22
 */

import org.junit.Test as test
import spec.matchers.*

public class AnyMatchersTest {
    test fun integers() {
        1 should be equal 1
        1 should !be equal 2
    }

    test fun strings() {
        "" should be equal ""
        "a" should be equal "a"
        "a" should !be equal ""
    }
} 