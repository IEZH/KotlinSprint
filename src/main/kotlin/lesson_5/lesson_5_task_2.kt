package lesson_5

fun main() {
    val yearOfBirth = 1995
    if ((2023 - yearOfBirth) >= AGE_OF_MAJOTITY)
        println("Показать экран со скрытым контентом")
    else println ("Вернуться на главный экран")

}
const val AGE_OF_MAJOTITY = 18