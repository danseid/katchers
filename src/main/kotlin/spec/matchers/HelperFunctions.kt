package spec.matchers

/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 15:20
 */
import kotlin.test.*


fun <T>fail(expected: T, got: T) : Unit  {
    fail("""
       expected:  <$expected>
       got:       <$got>
    """)
}

fun <T>of(vararg values: T) : List<T> {
    return values.toList()
}