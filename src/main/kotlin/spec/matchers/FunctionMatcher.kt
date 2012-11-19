package spec.matchers

/**
 * Created with IntelliJ IDEA.
 * User: m2909
 * Date: 19.11.12
 * Time: 09:51
 * To change this template use File | Settings | File Templates.
 */
class FunctionFailMatcher<R>(val target: () -> R): Matcher{
    fun with(error: Throwable) {
        var failed = true // assume it will fail
        try {
            target()
            failed = false // no Exception, so not failed
        } catch (e: Throwable){
            if(e.getName() != error.getName()) fail(error.getName(), e.getName())
        } finally {
            if(!failed) fail(error, "none")
        }
    }
}
class FunctionNotFailMatcher<R>(val target: () -> R): Matcher{
    fun with(error: Throwable) {
        try {
            target()
        } catch (e: Throwable){
            if(e.getName() == error.getName()) fail("should not fail with ${error.getName()}", "failed with ${e.getName()}")
        }
    }
}

inline fun Throwable.getName() = this.javaClass.getName()