package lesson_6

fun main() {
    println("Вход в приложение \n" +
            "Введите логин:")
    val login = readLine()

    println("Введите пароль:")
    var password = readLine()

    println("Проверка на человечность. Реши пример")

    for (i in 3 downTo 1) {
        val a = (1..9).random()
        val b = (1..9).random()
        val c = a + b
        println("(осталось попыток: $i) \n" +
                " $a + $b =")
    val answer = readln().toInt()
    if (c == answer) {
    println("Добро пожаловать!")
    return
    } else {
        continue
        }
    }
    println("Доступ запрещен")
}