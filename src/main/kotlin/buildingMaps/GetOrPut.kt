package buildingMapsimport atomicTest.eqfun main() {    val map = mapOf(1 to "one", 2 to "two")    map.getOrElse(0) { "zero" }    val mutableMap = map.toMutableMap()    mutableMap.getOrPut(0) { "zero" } eq "zero"}