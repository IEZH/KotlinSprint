package lesson_10

fun main() {
    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    validation(password)
}
    fun validation(password: String) {
        if (password.length < 4) println("Логин или пароль недостаточно длинные")
    }
