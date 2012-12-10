#KATCHERS

*library of matchers for building test expressions in [Kotlin](http://kotlin.jetbrains.org/)*

##Introduction

*Katchers* is using Kotlin infix notation to provide a domain specific language (DSL) for expressing assertions in tests using the word *should* or *must*. All of the expressions are statically typed
 so you get full compiler assistance.


##Usage


__1. Import `import org.katchers.*`__

__2. Write assertions `1 should be equal 1`__

##Syntax

Every matcher expression starts with a *__result__* we want to validate, followed by *__should__ or __must__*, a *__verb__(i.e.: be, have, contain ...)*, *__matchfunction__(depends on type of result and verb we are using)*  and *__expected value__(depends on matchfunction)*.

    <result|object> should <verb> <matchfunction> <expected>
###Negation of verbs
Every verb can be negated by  __!__  operator

    1 should !be equal 2

###For more examples see [wiki](https://github.com/danseid/katchers/wiki)