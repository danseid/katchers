/**.
 * User: Daniel Seidler
 * Date: 16.11.12
 * Time: 11:31
 */

import org.junit.Test as test
import spec.matchers.fail
import kotlin.concurrent.withLock
import kotlin.nullable.find
import spec.matchers.*
import java.util.NoSuchElementException
import kotlin.test.failsWith

public class FunctionMatcherTest {
    test fun failWith() {
        val block = {throw ArrayIndexOutOfBoundsException()}

        try{
           block should fail with ArrayIndexOutOfBoundsException()
           block should !fail with NullPointerException()

        } catch (e: AssertionError){
            fail("no exception", e)
        }

        try {
            block should fail with NullPointerException()
            fail("assertion error", "no assertion error")
            block should !fail with ArrayIndexOutOfBoundsException()
            fail("assertion error", "no assertion error")

        } catch (e: AssertionError) {}
    }
}
