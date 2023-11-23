package creatingenerics

import atomicTest.eq

fun <T, R> Crate<T>.map(f: (T) -> R): List<R> =
    listOf(f(get()))

fun main() {
    Crate(Car()).map { it.toString() + "x" } eq
            "[Carx]"
}