package functionsfun void(): Unit {    println("Java의 void는 Kotlin에서 Unit이라고 칭하는 듯")    println("Unit은 굳이 명시하지 않아도 됨 -> 명시하지 않으면 Unit이라고 해석함")}fun multiplyByTwo(x: Int): Int {    return x * 2;}fun main() {    val answer: Int = multiplyByTwo(2)    println("answer = ${answer}")    void()}