package interfaces// Single Abstract Method : 단일 추상 메서드// 추상 메소드가 단 1개 있는 인터페이스fun interface ZeroArg {    fun f(): Int}fun interface OneArg {    fun g(n: Int): Int}fun interface TwoArg {    fun h(i: Int, j: Int): Int}