// OperatorOverloading/DefaultEquality.kt
package operatorOverloading

import atomicTest.eq

class A(val i: Int)

data class D(val i: Int)

fun main() {
    // Normal class:
    val a = A(1)
    val b = A(1)
    val c = a
    (a == b) eq false
    (a == c) eq true
    // Data class:
    val d = D(1)
    val e = D(1)
    (d == e) eq true
}