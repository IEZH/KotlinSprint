package lesson_5

fun main() {
// База пользователей:
    val log1 = "Batman"
    val pass1 = "password"

    println("Введите свой логин:")
    val inputLog = readLine()

    if (inputLog != log1) {
        println("Такого логина не существет. Пройдите регистрацию")
        return }

    println("Введите пароль:")
    val inputPass = readLine()

    if (inputPass == pass1)
        println("Добро пожаловать, $log1")
    else println("Ошибка авторизации. Неверный пароль.")

}

