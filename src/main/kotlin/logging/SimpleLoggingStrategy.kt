package logging

import checkInstructions.DataFile

val logFile = // Reset ensures an empty file:
    DataFile("simpleLogFile.txt").reset()

fun debug(msg: String) =
    System.err.println("Debug: $msg")

fun trace(msg: String) =
    logFile.appendText("Trace: $msg\n")

fun main() {
    debug("Simple Logging Strategy")
    trace("Line 1")
    trace("Line 2")
    println(logFile.readText())
}
