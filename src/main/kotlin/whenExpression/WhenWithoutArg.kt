import org.junit.Test

class Person(val name: String, val ageType: Age)

enum class Age {
    Kid, Teenager, Adult
}

@Test
fun `Boolean으로 판단되는 when은 () 생략이 가능하다`() {
    val seunghan = Person("seunghan", Age.Adult)
    when {
        seunghan.ageType == Age.Adult -> println("으른")
        seunghan.ageType == Age.Teenager -> println("청소년")
        seunghan.ageType == Age.Kid -> println("어린이")
    }
}

fun main() {
    `Boolean으로 판단되는 when은 () 생략이 가능하다`()
}