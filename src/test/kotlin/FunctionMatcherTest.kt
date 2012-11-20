/**.
 * User: Daniel Seidler
 * Date: 16.11.12
 * Time: 11:31
 */

import org.junit.Test as test
import org.katchers.*

public class FunctionMatcherTest {

    test fun functionNotThrowingAnException () {
        { } should !fail with AssertionError()

        failIfNoAssertionErrorThrown{
            { } should fail with AssertionError()
        }
    }

    test fun functionThrowingAnException () {
        { throw NullPointerException() } should fail with NullPointerException();
        { throw NullPointerException() } should !fail with AssertionError();

        failIfNoAssertionErrorThrown{
            { throw NullPointerException() } should fail with AssertionError()
        }

    }

    inline fun failIfNoAssertionErrorThrown(block: () -> Unit) {
        var assertErrorThrown = false
        try{
            block()
        }  catch (e: AssertionError){
            assertErrorThrown = true
        } finally {
            if(!assertErrorThrown) fail("AssertionError", "none")
        }
    }
}
