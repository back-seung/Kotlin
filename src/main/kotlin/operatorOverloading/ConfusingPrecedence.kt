package operatorOverloading

import atomicTest.eq

fun main() {
    val x: Int? = 1
    val y: Int = 2
    val sum = x ?: 0 + y
    sum eq 1
    (x ?: 0) + y eq 3    // [1]
    x ?: (0 + y) eq 1    // [2]
}