package propertyDelegation

import atomicTest.eq
import kotlin.properties.ReadOnlyProperty

class Person(
    private val first: String,
    private val last: String
) {
    val name by     // SAM conversion:
    ReadOnlyProperty<Person, String> { _, _ ->
        "$first $last"
    }
}

fun main() {
    val alien = Person("Floopy", "Noopers")
    alien.name eq "Floopy Noopers"
}