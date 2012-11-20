/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 11:22
 */

import org.junit.Test as test
import  org.katchers.*

public class AnyMatchersTest {
    test fun integers() {
        1 should be equal 1
        1 should !be equal 2

        1 should be any of(1, 2, 3);
        4 should !be any of(1, 2, 3);

        { 4 should be any of(1, 2, 3) } should fail with AssertionError();
        { 1 should be any of(1, 2, 3) } should !fail with AssertionError();
        { 4 should !be any of(1, 2, 3) } should !fail with AssertionError();
        { 1 should !be any of(1, 2, 3) } should fail with AssertionError()
    }

    test fun strings() {
        "" should be equal ""
        "a" should be equal "a"
        "a" should !be equal ""

        "a" should be any of("a", "b", "c");
        "d" should !be any of("a", "b", "c");

        { "d" should be any of("a", "b", "c") } should fail with AssertionError();
        { "a" should be any of("a", "b", "c") } should !fail with AssertionError();
        { "d" should !be any of("a", "b", "c") } should !fail with AssertionError();
        { "a" should !be any of("a", "b", "c") } should fail with AssertionError()
    }
} 