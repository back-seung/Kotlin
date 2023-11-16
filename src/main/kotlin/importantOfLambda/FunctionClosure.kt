import atomicTest.eq

var x = 100

fun useX() {
    x++
}

fun main() {
    useX()
    x eq 101
}