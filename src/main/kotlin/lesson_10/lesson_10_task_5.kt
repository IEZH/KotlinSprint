package lesson_10

fun registrationLogin(): String {
    var creatingLogin: String
    do {
        println("Создайте логин (длина должна быть более 4 символов):")
        creatingLogin = readln()
        if (creatingLogin.length <= 4) println("Недопустимая длина логина, попробуйте еще раз")
    } while (creatingLogin.length <= 4)
    return creatingLogin
}

fun registrationPass(): String {
    var password = ""

    for (i in 0 until 8) {
        val range = ('!'..'9').random()
        password += range
        }
    println("Ваш пароль: $password")
    return password
}

fun confirmationCode() {
    do {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        println("Введите код, полученный в SMS:")
        val interCode = readln().toInt()
    } while (interCode != code)
    println("Поздравляем, авторизация прошлла успешно!")
}

fun authorization(creatingLogin: String, createdPassword: String)  {
    do {
        println("Авторизация.\nВведите логин:")
        val inputLogin = readln()

        println("Введите пароль:")
        val inputPassword = readln()
        if (inputLogin != creatingLogin || inputPassword != createdPassword)
            println("Неверное имя пользователя или пароль. Повторите попытку")
    } while (inputLogin != creatingLogin || inputPassword != createdPassword)
}

fun main() {
    val login = registrationLogin()
    val pass = registrationPass()
    authorization(creatingLogin = login, createdPassword = pass)
    confirmationCode()
}

