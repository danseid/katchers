package spec.matchers
/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 12:22
 */

// ANY MATCHER
public fun <T>T.should(val verb: BE): AnyBeMatcher<T> = AnyBeMatcher(this)
public fun <T>T.should(val verb: NOTBE): AnyNotBeMatcher<T> = AnyNotBeMatcher(this)

//STRING MATCHER
public fun String.should(val verb: HAVE): StringHaveMatcher = StringHaveMatcher(this)
public fun String.should(val verb: NOTHAVE): StringNotHaveMatcher = StringNotHaveMatcher(this)
public fun String.should(val verb: START): StringStartMatcher = StringStartMatcher(this)
public fun String.should(val verb: NOTSTART): StringNotStartMatcher = StringNotStartMatcher(this)
public fun String.should(val verb: END): StringEndMatcher = StringEndMatcher(this)
public fun String.should(val verb: NOTEND): StringNotEndMatcher = StringNotEndMatcher(this)
public fun String.should(val verb: CONTAIN): StringContainMatcher = StringContainMatcher(this)
public fun String.should(val verb: NOTCONTAIN): StringNotContainMatcher = StringNotContainMatcher(this)


//FUNCTION MATCHER
public fun <R>jet.Function0<R>.should(verb: FAIL): FunctionFailMatcher<R> = FunctionFailMatcher(this)
public fun <R>jet.Function0<R>.should(verb: NOTFAIL): FunctionNotFailMatcher<R> = FunctionNotFailMatcher(this)
