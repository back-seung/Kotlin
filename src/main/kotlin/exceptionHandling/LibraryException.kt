// ExceptionHandling/LibraryException.kt
package exceptionHandling

import atomicTest.*

fun testCode(code: Int) {
    if (code <= 1000) {
        throw IllegalArgumentException(
            "'code' must be > 1000: $code"
        )
    }
}

fun main() {
    try {
        // A1 is 161 in base-16 (hex) notation:
        testCode("A1".toInt(16))
    } catch (e: IllegalArgumentException) {
        e.message eq
                "'code' must be > 1000: 161"
    }
    try {
        testCode("0".toInt(1))
    } catch (e: IllegalArgumentException) {
        e.message eq
                "radix 1 was not in valid range 2..36"
    }
}