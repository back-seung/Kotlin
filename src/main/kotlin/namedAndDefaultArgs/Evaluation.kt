package namedAndDefaultArgsclass DefaultArgval da = DefaultArg()fun g(d: DefaultArg = da) = println(d)fun h(d: DefaultArg = DefaultArg()) = println(d)fun main() {    g() // 아래 g()와 같은 객체    g() // 위  g()와 같은 객체    h() // 새 객체    h() // 새 객체}