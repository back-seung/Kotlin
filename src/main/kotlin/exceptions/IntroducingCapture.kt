package exceptionsimport atomicTest.*fun main() {    capture { "1$".toInt() } eq "NumberFormatException: For input string: \"1$\""}