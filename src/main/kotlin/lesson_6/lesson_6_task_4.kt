package lesson_6

fun main() {
    val winNumber = (1..9).random()

    for (i in 5 downTo 1) {
        println("Угадайте число от 1 до 9 (осталось попыток: $i):")
        val number = readln().toInt()
        if (number == winNumber) {
            println("Это была великолепная игра!")
            return
        } else continue
    }
    println("Было загадано число $winNumber")
    }