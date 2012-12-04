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
 * @since 2012/11/20
 * Verb: an object that will be passed to a should function: <expression>.should(<verb>)
 * using an infix notation it will be written like this: <expression> should verb
 * example: string should be
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

public class FAILFUN: Verb {
    fun not() = notfailfun
}

public class NOTFAILFUN: Verb {
    fun not() = failfun
}

/* VALUES */
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
val failfun = FAILFUN()
val notfailfun = NOTFAILFUN()
