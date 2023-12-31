package lateInitialization

import atomicTest.trace

class WithLate {
    lateinit var x: String
    fun status() = "${::x.isInitialized}"
}

lateinit var y: String

fun main() {
    trace("${::y.isInitialized}")
    y = "Ready"
    trace("${::y.isInitialized}")
    val withlate = WithLate()
    trace(withlate.status())
    withlate.x = "Set"
    trace(withlate.status())
    trace eq "false true false true"
}