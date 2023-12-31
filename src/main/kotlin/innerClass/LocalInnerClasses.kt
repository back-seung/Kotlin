package innerClass

import atomicTest.eq

fun interface Pet {
    fun speak(): String
}

object CreatePet {
    fun home() = " home!"
    fun dog(): Pet {
        val say = "Bark"

        // Local inner class:
        class Dog : Pet {
            override fun speak() = say + home()
        }
        return Dog()
    }

    fun cat(): Pet {
        val emit = "Meow"
        // 익명 내부 클래스
        return object : Pet {
            override fun speak() = emit + home()
        }
    }

    fun hamster(): Pet {
        val squeak = "Squeak"
        // SAM conversion:
        return Pet { squeak + home() }
    }
}

fun main() {
    CreatePet.dog().speak() eq "Bark home!"
    CreatePet.cat().speak() eq "Meow home!"
    CreatePet.hamster().speak() eq "Squeak home!"
}