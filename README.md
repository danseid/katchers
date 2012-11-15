##Introduction
Kotlin-Spec-Matchers is using Kotlin infix notation to provide a domain specific language (DSL) for expressing assertions
in JUnit test using the word *should*.

##Quick Start
Import spec.matchers.* into your JUnit TestCase:
    import spec.matchers.*
Try Equal or NotEqual
    1 should be equal 1
    1 should !be equal 2
# More Assertions
see Wiki