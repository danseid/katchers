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
 * @since 2012/12/07
 */


class CollectionContainMatcher<T>(override val target: Collection<T>): Matcher<Collection<T>>{
    fun item(el: T) = if(!target.contains(el)) fail("$target contains $el", "$target doesn't contain $el")
}

class CollectionNotContainMatcher<T>(override val target: Collection<T>): Matcher<Collection<T>>{
    fun item(el: T) = if(target.contains(el)) fail("$target should not contain $el", "$target contains $el")
}

class CollectionHaveMatcher<T>(override val target: Collection<T>): Matcher<Collection<T>>{
    fun size(size: Int) = if(target.size() != size) fail("$target should have size $size", "$target has size ${target.size()}")
}

class CollectionNotHaveMatcher<T>(override val target: Collection<T>): Matcher<Collection<T>>{
    fun size(size: Int) = if(target.size() == size) fail("$target should not have size $size", "$target has size ${target.size()}")
}