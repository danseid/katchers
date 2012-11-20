package spec.matchers

/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 13:11
 */

class StringHaveMatcher(val target: String): Matcher{
    inline fun length(expected: Int) = target.length() should be equal expected
}

class StringNotHaveMatcher(val target: String): Matcher{
    inline fun length(expected: Int) = target.length() should !be equal expected
}

class StringStartMatcher(val target: String): Matcher{
    inline fun with(expected: String) = if(!target.startsWith(expected)) fail("$target should start with $expected", "$target starts with ${target.charAt(0)}")
}

class StringNotStartMatcher(val target: String): Matcher{
    inline fun with(expected: String) = if(target.startsWith(expected)) fail("$target should not start with $expected", "$target starts with $expected")
}

class StringEndMatcher(val target: String): Matcher{
    inline fun with(expected: String) = if(!target.endsWith(expected)) fail("$target should end with $expected", "$target ends with ${target.charAt(target.length - 1)}")
}

class StringNotEndMatcher(val target: String): Matcher{
    inline fun with(expected: String) = if(target.endsWith(expected)) fail("$target should not end with $expected", "$target ends with $expected")
}

class StringContainMatcher(val target: String): Matcher{
    inline fun any(values: List<String>) = if (!values.any { target.contains(it) }) fail("$target should contain any of $values", "$target did not contain any of $values")
    inline fun all(values: List<String>) = if(!values.all { target.contains(it) }) fail("$target should contain all of $values", "$target did not contain ${values filter { !target.contains(it) }}")
}

class StringNotContainMatcher(val target: String): Matcher{
    inline fun any(values: List<String>) = if(values.any { target.contains(it) }) fail("$target should not contain any of $values", "$target contained ${values filter { target.contains(it) }}")
    inline fun all(values: List<String>) = if (values.all { target.contains(it) })  fail("$target should not contain all of $values", "$target contained ${values filter { target.contains(it) }}")
}