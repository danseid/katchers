package spec.matchers

/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 12:22
 */

public fun <T>T.should(val verb: BE): AnyBeMatcher<T> {
    return AnyBeMatcher(this)
}

public fun <T>T.should(val verb: NOTBE): AnyNotBeMatcher<T> {
    return AnyNotBeMatcher(this)
}


public fun String.should(verb: Verb): StringMatcher {
    return StringMatcher(this, verb)
}

public fun <R>jet.Function0<R>.should(verb: Verb): FunctionFailMatcher<R>{
        return FunctionFailMatcher(this)
}
