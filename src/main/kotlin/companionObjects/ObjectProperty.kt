package companionObjectsimport atomicTest.eqclass WithObjectProperty {    companion object {        private var n: Int = 0    }    fun increment() = ++n}fun main() {    val a = WithObjectProperty()    val b = WithObjectProperty()    a.increment() eq 1    b.increment() eq 2    a.increment() eq 3}