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
    val creatingPass = StringBuilder()
    for (i in 1..3) {
        val a = (0..9).random()
        val b = ('a'..'z').random()
        val c = ('A'..'Z').random()
        creatingPass.append(a)
        creatingPass.append(b)
        creatingPass.append(c)
    }
    val password = creatingPass.toString()
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

fun authorization(creatingLogin: String, password: String)  {
    do {
        println("Авторизация. \n" +
                "Введите логин:")
        val login = readln()

        println("Введите пароль:")
        val inputPassword: String = readln()
        if (login != creatingLogin || inputPassword != password)
            println("Неверное имя пользователя или пароль. Повторите попытку")
    } while (login == creatingLogin && inputPassword == password)
}

fun main() {
    registrationLogin()
    registrationPass()
    authorization()
    confirmationCode()
}

