package extensionLambdas

import atomicTest.eq

private fun messy(): String {
    val built = StringBuilder()      // [1]
    built.append("ABCs: ")
    ('a'..'x').forEach { built.append(it) }
    return built.toString()          // [2]
}

private fun clean() = buildString {
    append("ABCs: ")
    ('a'..'x').forEach { append(it) }
}

private fun cleaner() =
    ('a'..'x').joinToString("", "ABCs: ")

fun main() {
    messy() eq "ABCs: abcdefghijklmnopqrstuvwx"
    messy() eq clean()
    clean() eq cleaner()
}