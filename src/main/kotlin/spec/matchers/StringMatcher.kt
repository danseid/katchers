package spec.matchers

/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 13:11
 */

/*
class StringMatcher(target: String, verb: Verb): AnyMatcher<String>(target, verb){
    fun length(expected: Int) {
        when (verb) {
            Verb.HAVE -> target.length() should be equal expected
            Verb.NOTHAVE -> target.length() should !be equal expected
            else-> notSupported()
        }
    }

    fun with(expected: String) {
        when(verb){
            Verb.START -> target.startsWith(expected) should be equal true
            Verb.NOTSTART -> target.startsWith(expected) should !be equal true
            Verb.END -> target.endsWith(expected) should be equal true
            Verb.NOTEND -> target.endsWith(expected) should !be equal true
            else -> notSupported()
        }
    }

    override fun any(values: List<String>): Unit {
        when(verb){
            Verb.CONTAIN -> {
                if (!values.any { target.contains(it) }) fail("$target should contain any of $values", "$target did not contain any of $values")
            }
            Verb.NOTCONTAIN -> {
                if(values.any {target.contains(it) }) fail("$target should not contain any of $values", "$target contained ${values filter { target.contains(it) }}")
            }
            else -> super.any(values)
        }
    }

    fun all(values: List<String>): Unit {
        when(verb) {
            Verb.CONTAIN -> {
                if(!values.all { target.contains(it) }) fail("$target should contain all of $values", "$target did not contain ${values filter { !target.contains(it) }}")
            }
            Verb.NOTCONTAIN -> {
                if (values.all { target.contains(it) })  fail("$target should not contain all of $values", "$target contained ${values filter { target.contains(it) }}")
            }
            else -> notSupported()
        }
    }
}
*/

class StringHaveMatcher(val target: String): Matcher{
    inline fun length(expected: Int) = target.length() should be equal expected
}

class StringNotHaveMatcher(val target: String): Matcher{
    inline fun length(expected: Int) = target.length() should !be equal expected
}

class StringStartMatcher(val target: String): Matcher{
    fun with(expected: String) {

    }
}

class StringNotStartMatcher(val target: String): Matcher{
    fun with(expected: String) {

    }
}

class StringEndMatcher(val target: String): Matcher{
    fun with(expected: String) {

    }
}

class StringNotEndMatcher(val target: String): Matcher{
    fun with(expected: String) {

    }
}

class StringContainMatcher(val target: String): Matcher{
    fun any(values: List<String>) {
    }
    fun all(values: List<String>) {

    }
}

class StringNotContainMatcher(val target: String): Matcher{
    fun any(values: List<String>) {
    }
    fun all(values: List<String>) {

    }
}