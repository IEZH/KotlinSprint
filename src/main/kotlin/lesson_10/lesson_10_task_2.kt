package lesson_10

fun main() {
    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    if (!validation(password)) println("Логин или пароль недостаточно длинные")
}
fun validation(password: String): Boolean {
    return password.length >= 4
}
