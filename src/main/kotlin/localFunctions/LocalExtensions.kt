package localFunctionsimport atomicTest.eqfun main() {    fun String.exclaim() = "$this!"    "Hello".exclaim() eq "Hello!"}