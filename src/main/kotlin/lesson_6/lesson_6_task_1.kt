package lesson_6

fun main() {
    println("""Регистрация
        |Создайте логин:""".trimMargin())
    val creatingLogin = readLine()

    println("Придумайте пароль:")
    val creatingPassword = readLine()

    println("""Поздравляем! Регистрация прошла успешно. 
        |Вход в приложение 
        |Введите логин:""".trimMargin())

    val login = readLine()

    println("Введите пароль:")
    var password = readLine()

    if (password == creatingPassword) {
        println("Авторизация прошла успешно")
    } else {
        do {
            println("Неверный пароль")
            password = readLine()
        } while (password != creatingPassword)
        println("Авторизация прошла успешно")
    }
}