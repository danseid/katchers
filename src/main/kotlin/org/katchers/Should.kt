/*
 * Copyright 2012 Daniel Seidler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.katchers

/**
 * @author Daniel Seidler
 * @since 2012/11/20
 * Should Matcher Functions
 */

// Any should be
public fun <T>T.should(val verb: BE): AnyBeMatcher<T> = AnyBeMatcher(this)
public fun <T>T.should(val verb: NOTBE): AnyNotBeMatcher<T> = AnyNotBeMatcher(this)

// String should have | start | end | contain
public fun String.should(val verb: HAVE): StringHaveMatcher = StringHaveMatcher(this)
public fun String.should(val verb: NOTHAVE): StringNotHaveMatcher = StringNotHaveMatcher(this)
public fun String.should(val verb: START): StringStartMatcher = StringStartMatcher(this)
public fun String.should(val verb: NOTSTART): StringNotStartMatcher = StringNotStartMatcher(this)
public fun String.should(val verb: END): StringEndMatcher = StringEndMatcher(this)
public fun String.should(val verb: NOTEND): StringNotEndMatcher = StringNotEndMatcher(this)
public fun String.should(val verb: CONTAIN): StringContainMatcher = StringContainMatcher(this)
public fun String.should(val verb: NOTCONTAIN): StringNotContainMatcher = StringNotContainMatcher(this)

// Number should be
public inline fun Number.should(val verb: BE): NumberBeMatcher = NumberBeMatcher(this)
public inline fun Number.should(val verb: NOTBE): NumberNotBeMatcher = NumberNotBeMatcher(this)


//() -> Unit should fail
public fun <R>jet.Function0<R>.should(verb: FAIL): FunctionFailMatcher<R> = FunctionFailMatcher(this)
public fun <R>jet.Function0<R>.should(verb: NOTFAIL): FunctionNotFailMatcher<R> = FunctionNotFailMatcher(this)
