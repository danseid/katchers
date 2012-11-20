package spec.matchers

import kotlin.test.*

/**
 * Created with IntelliJ IDEA.
 * User: m2909
 * Date: 15.11.12
 * Time: 08:39
 * To change this template use File | Settings | File Templates.
 */

trait Matcher {
    inline protected fun notSupported(): Unit = fail("Not Supported Condition ")
}

open class AnyBeMatcher<T>(val target: T): Matcher {
    inline fun equal(value: T) = if (value != target) fail(value, target)
    open inline fun any(values: List<T>) = if(!values.any { it == target }) fail("any of $values", target)
}

open class AnyNotBeMatcher<T>(val target: T): Matcher {
    inline fun equal(value: T) = if (value == target) fail(value, target)
    open inline fun any(values: List<T>) = if(values any { it == target }) fail("not any of $values", target)
}



