import atomicTest.eq

data class Message1(
    val sender: String,
    val text: String,
    val isRead: Boolean,
    val attachments: List<Attachment>
)

data class Attachment(
    val type: String,
    val name: String
)

fun Message1.isImportant(): Boolean =
    text.contains("Salary increase") ||
            attachments.any {
                it.type == "image" &&
                        it.name.contains("cat")
            }

fun main() {
    val messages = listOf(
        Message1(
            "Boss", "Let's discuss goals " +
                    "for next year", false,
            listOf(Attachment("image", "cute cats"))
        )
    )
    messages.any(Message1::isImportant) eq true
}