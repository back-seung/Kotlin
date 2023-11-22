import checkInstructions.DataFile
import atomicTest.*

fun main() {
    DataFile("Results.txt").forEachLine {
        if (it.startsWith("#"))
            trace("$it")
    }
    trace eq "# ok"
}