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
    val gettingPass = StringBuilder()
    for (i in 1..3) {
        val a = (0..9).random()
        val b = ('a'..'z').random()
        val c = ('A'..'Z').random()
        gettingPass.append(a)
        gettingPass.append(b)
        gettingPass.append(c)
    }
    val createdPassword = gettingPass.toString()
    println("Ваш пароль: $createdPassword")
    return createdPassword
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
        val inputPassword: String = readln()
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

