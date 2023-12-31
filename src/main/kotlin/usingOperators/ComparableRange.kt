package usingOperators

import atomicTest.eq

class F(val i: Int) : Comparable<F> {
    override fun compareTo(other: F) =
        i.compareTo(other.i)
}

fun main() {
    val range = F(1)..F(7)
    (F(3) in range) eq true
    (F(9) in range) eq false
}