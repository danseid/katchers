package spec.matchers

/**
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 08:40
 *
 */

enum class Verb{
    BE
    NOTBE
    HAVE
    NOTHAVE
    START
    NOTSTART
    END
    NOTEND
    CONTAIN
    NOTCONTAIN
    MATCH
    NOTMATCH
    FAIL
    NOTFAIL
    fun not(): Verb {
        return when(this){
            BE -> NOTBE
            NOTBE -> BE
            HAVE -> NOTHAVE
            NOTHAVE -> HAVE
            START -> NOTSTART
            NOTSTART -> START
            END -> NOTEND
            NOTEND -> END
            CONTAIN -> NOTCONTAIN
            NOTCONTAIN -> CONTAIN
            MATCH -> NOTMATCH
            NOTMATCH -> MATCH
            FAIL -> NOTFAIL
            NOTFAIL -> FAIL
            else -> BE
        }
    }
}

val be = Verb.BE
val have = Verb.HAVE
val start = Verb.START
val end = Verb.END
val contain = Verb.CONTAIN
val match = Verb.MATCH
val fail = Verb.FAIL
