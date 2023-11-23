package creatingenerics

fun useList(list: List<Any>) {
//     if (list is List<String>) {}  // [1]
}

fun main() {
    val strings = listOf("a", "b", "c")
    val all: List<Any> = listOf(1, 2, "x")
    useList(strings)
    useList(all)
}

