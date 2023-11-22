import atomicTest.eq

fun ignore(message: Message1) =
    !message.isImportant() &&
            message.sender in setOf("Boss", "Mom")

fun main() {
    val text = "Let's discuss goals " +
            "for the next year"
    val msgs = listOf(
        Message1("Boss", text, false, listOf()),
        Message1(
            "Boss", text, false, listOf(
                Attachment("image", "cute cats")
            )
        )
    )
    msgs.filter(::ignore).size eq 1
    msgs.filterNot(::ignore).size eq 1
}