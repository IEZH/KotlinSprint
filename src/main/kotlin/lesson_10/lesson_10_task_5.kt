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
        when ((0..2).random()) {
            0 -> password += (0..9).random()
            1 -> password += ('a'..'z').random()
            else -> password += ('A'..'Z').random()
        }
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
    val returnFromRegistrationLoginFun = registrationLogin()
    val returnFromRegistrationPassFun = registrationPass()
    authorization(creatingLogin = returnFromRegistrationLoginFun, createdPassword = returnFromRegistrationPassFun)
    confirmationCode()
}

