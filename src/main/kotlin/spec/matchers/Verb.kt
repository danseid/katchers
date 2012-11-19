package spec.matchers

/**
 * User: Daniel Seidler
 * Date: 15.11.12
 * Time: 08:40
 *
 */
trait Verb {

}

public class BE: Verb {
    fun not() = notbe
}
public class NOTBE: Verb {
    fun not() = be
}
public class HAVE: Verb {
    fun not() = nothave
}
public class NOTHAVE: Verb {
    fun not() = have
}
public class START: Verb {
    fun not() = notstart
}
public class NOTSTART: Verb {
    fun not() = start
}
public class END: Verb {
    fun not() = notend
}
public class NOTEND: Verb {
    fun not() = end
}
public class CONTAIN: Verb {
    fun not() = notcontain
}
public class NOTCONTAIN: Verb {
    fun not() = contain
}
public class MATCH: Verb {
    fun not() = notmatch
}
public class NOTMATCH: Verb {
    fun not() = match
}
public class FAIL: Verb {
    fun not() = notfail
}
public class NOTFAIL: Verb {
    fun not() = fail
}

val be = BE()
val notbe = NOTBE()
val have = HAVE()
val nothave = NOTHAVE()
val start = START()
val notstart = NOTSTART()
val end = END()
val notend = NOTEND()
val contain = CONTAIN()
val notcontain = NOTCONTAIN()
val match = MATCH()
val notmatch = NOTMATCH()
val fail = FAIL()
val notfail = NOTFAIL()
