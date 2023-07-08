package lesson_13

class ContactX(val name: String, val numberPhone: Long, val company: String? = null,) {
    fun printInfo() {
        val companyNull = company ?: "[не указано]"
        println("Имя: $name Номер: $numberPhone Компания: $companyNull")
    }
}

fun main() {
    val contact1 = ContactX("Ваня бро",89150114755,null,).printInfo()
}