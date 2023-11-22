import atomicTest.eq

fun main() {
    val list = listOf(1, 2, null)
    list.filterNotNull() eq "[1, 2]"
}