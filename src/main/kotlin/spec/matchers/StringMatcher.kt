package spec.matchers

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

    fun blank() : Unit{

    }


}