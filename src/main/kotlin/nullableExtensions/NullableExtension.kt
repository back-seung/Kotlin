import atomicTest.eq

fun String?.isNullOrEmpty(): Boolean =
    this == null || isEmpty()

fun main() {
    "".isNullOrEmpty() eq true
}