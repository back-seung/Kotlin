package listsimport atomicTest.eqfun main() {    // var/val 가변 리스트 대입하는 경우    val list1 = mutableListOf('A')    list1 += 'A' // == list1.plusAssign('A') 컴파일러와 +=을 plusAssign()으로 변환해준다.    var list2 = mutableListOf('A')    list2 += 'A' // 다음 줄과 같다    list2.plusAssign('A')    // val에 불변 리스트를 대입하는 경우    val list3 = listOf('B')//    list3 += 'B' // 다음 줄과 같다//    list3 = list3 + 'B'    var list4 = listOf('C')    list4 += 'C'    val newList = list4 + 'C'    list4 = newList    list1 eq "[A, A, A]"    list2 eq "[A, A, A]"    list3 eq "[B]"    list4 eq "[C, C, C]"}