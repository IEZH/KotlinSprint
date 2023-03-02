package lesson_7

fun main() {
    do {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        println("Введите код, полученный в SMS:")
        val interCode = readln().toInt()
    } while (interCode != code)
    println("Добро пожаловать!")

}