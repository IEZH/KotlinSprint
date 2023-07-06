package lesson_13

class Contact(
    val name: String,
    val numberPhone: Long,
    val company: String? = null
)

fun main() {
    val contact1 = Contact(
        name = "Ваня бро",
        numberPhone = 89815524555,
    )
}