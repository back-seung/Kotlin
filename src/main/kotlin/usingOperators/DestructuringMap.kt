import atomicTest.eq

fun main() {
    val map = mapOf("a" to 1)
    for ((key, value) in map) {
        key eq "a"
        value eq 1
    }
    // The Destructuring assignment becomes:
    for (entry in map) {
        val key = entry.component1()
        val value = entry.component2()
        key eq "a"
        value eq 1
    }
}