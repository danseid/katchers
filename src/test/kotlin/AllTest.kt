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
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
/**
 * @author Daniel Seidler
 * @since 2012/11/21
 */
RunWith(javaClass<Suite>())
Suite.SuiteClasses(
        javaClass<VerbTest>(),
        javaClass<AnyMatchersTest>(),
        javaClass<StringMatcherTest>(),
        javaClass<ShouldTest>(),
        javaClass<MustTest>(),
        javaClass<FunctionMatcherTest>(),
        javaClass<NumberMatcherTest>(),
        javaClass<NumbersTest>(),
        javaClass<NumberRangesMatcherTest>(),
        javaClass<CollectionMatcherTest>(),
        javaClass<MapMatcherTest>()


)
public class AllTest {}