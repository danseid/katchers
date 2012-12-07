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
 * @since 2012/12/06
 */

class MapContainMatcher<K,V>(override val target: Map<K,V>): Matcher<Map<K,V>>{
    private inline fun item(key: K, value: V) = if(!(value == target.get(key))) fail("$target contains ($key=$value)", "$target doesn't contain ($key=$value)")
    inline fun item(el: Pair<K,V>) =  item(el.first, el.second)
}

class MapNotContainMatcher<K,V>(override val target: Map<K,V>): Matcher<Map<K,V>>{
    private inline fun item(key: K, value: V) = if(value == target.get(key)) fail("$target should not contain ($key=$value)", "$target contains ($key=$value)")
    inline fun item(el: Pair<K,V>) =  item(el.first, el.second)
}