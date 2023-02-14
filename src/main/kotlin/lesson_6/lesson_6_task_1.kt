package lesson_6

fun main() {
    println("Регистрация \n" +
            "Создайте логин:")
    val creatingLogin = readLine()

    println("Придумайте пароль:")
    val creatingPassword = readLine()

    println("Поздравляем! Регистрация прошла успешно. \n" +
            "Вход в приложение \n" +
            "Введите логин:")

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