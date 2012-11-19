package spec.matchers

/**
 * Created with IntelliJ IDEA.
 * User: m2909
 * Date: 19.11.12
 * Time: 09:51
 * To change this template use File | Settings | File Templates.
 */

class FunctionMatcher<R>(target: () -> R, verb: Verb): AnyMatcher<() -> R>(target, verb){
    fun with(error: Throwable) {
        when (verb) {
            Verb.FAIL -> {
                try {
                    target()
                    fail(error, "none")
                } catch (e: Throwable){
                    if(e.getName() != error.getName()) fail(error.getName(), e.getName())
                }
            }
            Verb.NOTFAIL -> {
                try {
                    target()
                } catch (e: Throwable){
                    if(e.getName() == error.getName()) fail(error.getName(), e.getName())
                }

            }
            else -> notSupported()
        }
    }
}

inline fun Throwable.getName() = this.javaClass.getName()