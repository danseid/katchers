package spec.matchers

/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 12:22
 */

public fun <T>T.should(verb: Verb): AnyMatcher<T> {
    return AnyMatcher(this, verb)
}

public fun String.should(verb: Verb): StringMatcher {
    return StringMatcher(this, verb)
}

public fun <R>jet.Function0<R>.should(verb: Verb): FunctionMatcher<R>{
        return FunctionMatcher(this, verb)
}

public fun Int.should(verb: Verb) : IntMatcher {
    return IntMatcher(this, verb)
}