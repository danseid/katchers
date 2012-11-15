package spec.matchers

/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 12:22
 */

public inline fun <T>T.should(pre: Verb): AnyMatcher<T> {
    return AnyMatcher(this, pre)
}

public inline fun String.should(pre: Verb): StringMatcher {
    return StringMatcher(this, pre)
}