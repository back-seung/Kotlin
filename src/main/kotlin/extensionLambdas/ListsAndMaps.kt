@file:OptIn(ExperimentalStdlibApi::class)

package extensionLambdas

import atomicTest.eq

val characters: List<String> = buildList {
    add("Chars:")
    ('a'..'d').forEach { add("$it") }
}

val charmap: Map<Char, Int> = buildMap {
    ('A'..'F').forEachIndexed { n, ch ->
        put(ch, n)
    }
}

fun main() {
    characters eq "[Chars:, a, b, c, d]"
    //  characters eq characters2
    charmap eq "{A=0, B=1, C=2, D=3, E=4, F=5}"
}