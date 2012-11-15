package spec.matchers
/**
 * Created with IntelliJ IDEA.
 * User: m2909
 * Date: 15.11.12
 * Time: 08:39
 * To change this template use File | Settings | File Templates.
 */
import kotlin.test.*

open class AnyMatcher<T> (val target: T, val verb: Verb) {
    fun equal(value: T){
        when (verb) {
            Verb.BE -> {if (!value.equals(target)) fail(value, target)}
            Verb.NOTBE -> {if (value == target) fail(value, target)}
            else -> notSupported()
        }
    }
    protected fun notSupported(): Unit = fail("Not Supported Condition " + verb)
}



