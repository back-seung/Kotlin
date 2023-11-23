package unitTesting

import kotlin.test.*

class SampleTest {
    @Test
    fun testFortyTwo() {
        expect(42, "Incorrect,") { fortyTwo() }
    }

    @Test
    fun testAllGood() {
        assertTrue(allGood(), "Not good")
    }
}