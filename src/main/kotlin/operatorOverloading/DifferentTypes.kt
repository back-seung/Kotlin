package operatorOverloading

import atomicTest.eq

operator fun E.plus(i: Int) = E(v + i)

fun main() {
    E(1) + 10 eq E(11)
}