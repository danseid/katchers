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

##List of katchers
All examples are using __should__, but it can also be replaced with __must__
###Any
Any matchers may be used on any type of object.
####be | !be  equal
Equal <matchfunction> should only be used on types, that implement equals function correctly

    1 should be equal 1   //✔
    2 should !be equal 1  //✔
    "string" should be equal "string" //✔
    "string" should be equal "str"    //✘
####be | !be  any
Match the result to any object in a list

    1 should be any of(1,2,3)                   //✔ of is a convenient function to create a list
    1 should be any arrayList(1,2,3)            //✔ same as above
    "abc" should be any of("cab", "bac", "abc") //✔
    4 should !be any of(1,2,3)                  //✔
    4 should !be any of (1,2,4)                 //✘

###Number
Matchers to use on number objects like Int, Float, Double ...
#### be | !be gt |greaterThan
    1 should be gt 0.0             //✔
    1 should be greaterThan 0      //✔ same as above
    1 should !be gt 1              //✔
    1.9 should !be gt 2            //✔
    1 should be gt 1               //✘
    1 should be gt 2               //✘
#### be | !be gte | greaterOrEqualThan
    1 should  be gte 0             //✔
    1 should  be greaterOrEqualThan 0    //✔ same as above
    1 should  be gte 1             //✔
    1 should !be gte 2             //✔
    1 should !be gte 1             //✘
    1 should  be gte 2             //✘
#### be | !be lt | lessThan
    1.5 should be lt 2             //✔
    1 should be lessThan 2        //✔ same as above
    1 should !be lt 1             //✔
    1 should !be lt 0             //✔
    1 should be lt 1              //✘
    1 should be lt 0              //✘
#### be | !be lte | lessOrEqualThan
    1 should  be lte 2             //✔
    1 should  be lessOrEqualThan 2    //✔ same as above
    1 should  be lte 1             //✔
    1 should !be lte 0             //✔
    1 should !be lte 1             //✘
    1 should  be lte 0             //✘

###String
Matchers to use on string objects
####have | !have length
    "string" should have length 6  //✔
    "" should !have length 1       //✔
    "string" should have length 0  //✘
####start | !start with
    "string" should start with "str"    //✔
    "string" should !start with "tring" //✔
    "string" should start with "ing"    //✘
####end | !end with
    "string" should end with "ing"      //✔
    "string" should !end with "in"      //✔
    "string" should end with "strin"    //✘
####contain | !contain any
    "string" should contain any of("s", "t", "a")  //✔
    "string" should !contain any of("a", "b", "c") //✔
    "string" should contain any of("a", "b", "c")  //✘
####contain | !contain all
    "string" should contain all of("s", "t", "r")  //✔
    "string" should !contain all of("a", "b", "c") //✔
    "string" should contain all of("s", "t", "a")  //✘


###Function
Matchers to use on () : R -> function
####fail | !fail with
    {throw NullPointerException()} should fail with NullPointerException()    //✔
    {1 should be equal 1} should !fail with AssertionError()                  //✔
    {"string" should be equal "string"} should fail with AssertionError()     //✘

