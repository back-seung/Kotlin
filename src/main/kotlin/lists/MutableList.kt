package listsimport atomicTest.eqfun main() {    // listOf 읽기 전용 리스트 리턴    // mutableListOf 가변 List 리턴    val list = mutableListOf<Int>()    list.add(1)    list.addAll(listOf(2, 3))    list += 4    list += listOf(5, 6)    list eq listOf(1, 2, 3, 4, 5, 6)}