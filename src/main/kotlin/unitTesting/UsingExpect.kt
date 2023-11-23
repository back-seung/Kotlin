package unitTesting

import atomicTest.capture
import kotlin.test.assertFails
import kotlin.test.assertFailsWith
import kotlin.test.expect

fun testFortyTwo2(n: Int = 42) {
    expect(n, "Incorrect,") { fortyTwo() }
}

fun main() {
    testFortyTwo2()
    capture {
        testFortyTwo2(43)
    } contains
            listOf(
                "expected:",
                "<43> but was:", "<42>"
            )
    assertFails { testFortyTwo2(43) }
    capture {
        assertFails { testFortyTwo2() }
    } contains
            listOf(
                "Expected an exception",
                "to be thrown",
                "but was completed successfully."
            )
    assertFailsWith<AssertionError> {
        testFortyTwo2(43)
    }
    capture {
        assertFailsWith<AssertionError> {
            testFortyTwo2()
        }
    } contains
            listOf(
                "Expected an exception",
                "to be thrown",
                "but was completed successfully."
            )
}