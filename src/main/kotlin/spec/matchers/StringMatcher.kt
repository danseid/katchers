package spec.matchers

import java.io.SyncFailedException
import kotlin.test.fail

/**.
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 13:11
 */

class StringMatcher(target: String, verb: Verb) : AnyMatcher<String>(target, verb){
    fun length(expected: Int) {
      when (verb) {
          Verb.HAVE -> target.length() should be equal expected
          Verb.NOTHAVE -> target.length() should !be equal expected
          else-> notSupported()
      }
    }

    fun with(expected: String) {
        when(verb){
            Verb.START -> target.startsWith(expected) should be equal true
            Verb.NOTSTART -> target.startsWith(expected) should !be equal true
            Verb.END -> target.endsWith(expected) should be equal true
            Verb.NOTEND -> target.endsWith(expected) should !be equal true
            else -> notSupported()
        }
    }

    fun any(strings: List<String>) : Unit{
        val stringsContained = strings filter {target.contains(it)}

        when(verb){
             Verb.CONTAIN -> {
                 if (stringsContained.size == 0) fail("$target should contain any of $strings", "$target did not contain any of $strings")
             }
             Verb.NOTCONTAIN -> {
                 if(stringsContained.size > 0) fail("$target should not contain any of $strings", "$target contained $stringsContained")
             }
             else -> notSupported()
         }
    }

    fun all(strings: List<String>) : Unit {
        val stringsContained = strings filter {target.contains(it)}
        val stringsNotContained = strings filter {!target.contains(it)}

        when(verb) {
            Verb.CONTAIN -> {
               if(stringsNotContained.size  > 0) fail("$target should contain all of $strings", "$target did not contain $stringsNotContained")
            }
            Verb.NOTCONTAIN -> {
                if (stringsNotContained.size != strings.size)  fail("$target should not contain all of $strings", "$target contained $stringsContained")
            }
            else -> notSupported()
        }
    }

}