package downCastinginterface Base {    fun f()}class Derived1 : Base {    override fun f() {}    fun g() {}}class Derived2 : Base {    override fun f() {}    fun h() {}}fun main() {    val b1: Base = Derived1()    b1.f() // 부모 클래스의 일부분//    b1.g() 부모 클래스에 들어있지 않음    val b2: Base = Derived2()    b2.f() // 부모 클래스의 일부분//    b2.h() 부모 클래스에 들어있지 않음}