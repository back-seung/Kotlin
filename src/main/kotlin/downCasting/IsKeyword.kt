package downCastingfun main() {    val b1: Base = Derived1() // 업캐스트    if(b1 is Derived1) // is 검사 영역        b1.g()    val b2: Base = Derived2()    if(b2 is Derived2)        b2.h()}// 스마트 캐스트는 is 를 사용해// when의 인자가 어떤 타입인지 검사하는 when식 내부에서 유용하다.