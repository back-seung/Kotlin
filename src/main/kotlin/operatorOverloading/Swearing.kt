package operatorOverloading

import atomicTest.eq

infix fun String.`#!%`(s: String) =
    "$this Rowzafrazaca $s"

fun main() {
    "howdy" `#!%` "Ma'am!" eq
            "howdy Rowzafrazaca Ma'am!"
}