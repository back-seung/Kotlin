import atomicTest.eq
import checkInstructions.DataFile

fun main() {
    DataFile("Results.txt")
        .bufferedReader()
        .use { it.readLines().first() } eq
            "Results"
}