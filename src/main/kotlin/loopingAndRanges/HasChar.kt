package loopingAndRangesfun hasChar(s: String, ch: Char): Boolean {    for (c in s) {        if (c == 't') return true    }    return false}fun hasChar2(s: String, ch: Char): Boolean = ch in sfun main() {    println(hasChar("Kotlin", 't'))    println(hasChar("Kotlin", 'a'))    println(hasChar2("Kotlin", 'x'))}