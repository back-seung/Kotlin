package multipleinheritanceinterface Animalinterface Mammal : Animalinterface AquaticAnimal : Animal// 코틀린은 자바에서 다중 상속을 금지하는 대신, 다중 인터페이스 상속을 허용하는 설계를 그대로 따른다.class Dolphin : Mammal, AquaticAnimal