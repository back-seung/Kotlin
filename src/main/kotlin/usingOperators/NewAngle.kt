import atomicTest.eq

fun main() {
    val list = MutableList(10) { 'a' + it }
    list[7] eq 'h' // operator get()
    list.get(8) eq 'i' // Explicit call
    list[9] = 'x' // operator set()
    list.set(9, 'x') // Explicit call
    list[9] eq 'x'
    ('d' in list) eq true // operator contains()
    list.contains('e') eq true // Explicit call
}