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
 * @since 2012/11/21
 */

// Any must be
// Any must
public fun <T>T.must(val verb: BE): AnyBeMatcher<T> = AnyBeMatcher(this)
public fun <T>T.must(val verb: NOTBE): AnyNotBeMatcher<T> = AnyNotBeMatcher(this)
public fun <T>T.must(val verb: MATCH): AnyMatchMatcher<T> = AnyMatchMatcher(this)
public fun <T>T.must(val verb: NOTMATCH): AnyNotMatchMatcher<T> = AnyNotMatchMatcher(this);

// String must have | start | end | contain
public fun String.must(val verb: HAVE): StringHaveMatcher = StringHaveMatcher(this)
public fun String.must(val verb: NOTHAVE): StringNotHaveMatcher = StringNotHaveMatcher(this)
public fun String.must(val verb: START): StringStartMatcher = StringStartMatcher(this)
public fun String.must(val verb: NOTSTART): StringNotStartMatcher = StringNotStartMatcher(this)
public fun String.must(val verb: END): StringEndMatcher = StringEndMatcher(this)
public fun String.must(val verb: NOTEND): StringNotEndMatcher = StringNotEndMatcher(this)
public fun String.must(val verb: CONTAIN): StringContainMatcher = StringContainMatcher(this)
public fun String.must(val verb: NOTCONTAIN): StringNotContainMatcher = StringNotContainMatcher(this)

// Number must be
public inline fun Number.must(val verb: BE): NumberBeMatcher = NumberBeMatcher(this)
public inline fun Number.must(val verb: NOTBE): NumberNotBeMatcher = NumberNotBeMatcher(this)

//() -> Unit must fail
public fun <T: () -> Any>T.must(verb: NOTFAIL): FunctionNotFailMatcher<T> = FunctionNotFailMatcher(this)
public fun <T: () -> Any>T.must(verb: FAIL): FunctionFailMatcher<T> = FunctionFailMatcher(this)

//Collection
public fun <T>Collection<T>.must(verb: CONTAIN): CollectionContainMatcher<T> = CollectionContainMatcher<T>(this)
public fun <T>Collection<T>.must(verb: NOTCONTAIN): CollectionNotContainMatcher<T> = CollectionNotContainMatcher<T>(this)

//Maps
public fun <R,T>Map<R,T>.must(verb: CONTAIN): MapContainMatcher<R,T> = MapContainMatcher<R,T>(this)
public fun <R,T>Map<R,T>.must(verb: NOTCONTAIN): MapNotContainMatcher<R,T> = MapNotContainMatcher<R,T>(this)
