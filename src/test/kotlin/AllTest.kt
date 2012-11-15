/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 15:57
 */

import org.junit.runners.Suite;
import org.junit.runner.RunWith;

RunWith(javaClass<Suite>())
Suite.SuiteClasses(javaClass<VerbTest>(), javaClass<AnyMatchersTest>(), javaClass<StringMatcherTest>(), javaClass<ShouldTest>())
public class AllTest {}