package scopeFunctions

import atomicTest.trace

fun whichGnome(gnome: Gnome?) {
    trace(gnome?.name)
    gnome?.let { trace(it.who()) }
    gnome?.run { trace(who()) }
    gnome?.apply { trace(who()) }
    gnome?.also { trace(it.who()) }
}

fun main() {
    whichGnome(Gnome("Bob"))
    whichGnome(null)
    trace eq """
    Bob
    Gnome: Bob
    Gnome: Bob
    Gnome: Bob
    Gnome: Bob
    null
  """
}