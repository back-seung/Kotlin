package companionObjectsimport atomicTest.eqclass WithCompanion {    // 동반 객체    companion object {        val i = 3        fun f() = i * 3    }    fun g() = i + f()}fun WithCompanion.Companion.h() = f() * ifun main() {    val wc = WithCompanion()    wc.g() eq 12    WithCompanion.i eq 3    WithCompanion.f() eq 9    WithCompanion.h() eq 27}