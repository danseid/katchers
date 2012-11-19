package spec.matchers

/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 12:21
 */

class IntMatcher(target: Int, verb: Verb) : AnyMatcher<Int>(target, verb){

    // greater than: target > value
    fun gt(value: Int) {
        greaterThan(value)
    }

    // greater than or equal: target > value
    fun gte(value: Int) {
         greaterOrEqualThan(value)
    }

    // less than: target > value
    fun lt(value: Int) {
        lessThan(value)
    }

    // less than or equal: target > value
    fun lte(value: Int) {
        lessOrEqualThan(value)
    }

    fun greaterThan(value: Int) {

    }

    fun lessThan(value: Int) {

    }

    fun greaterOrEqualThan(value: Int) {

    }

    fun lessOrEqualThan(value: Int) {

    }

}