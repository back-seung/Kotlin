package delegationTools

import atomicTest.eq
import kotlin.properties.Delegates.observable

class Team {
    var msg = ""
    var captain: String by observable("<0>") { prop, old, new ->
        msg += "${prop.name} $old to $new "
    }
}

fun main() {
    val team = Team()
    team.captain = "Adam"
    team.captain = "Amanda"
    team.msg eq "captain <0> to Adam " +
            "captain Adam to Amanda"
}