package lesson_5

fun main() {
    val numberOne = 38
    val numberTwo = 115
    val rightAnswer = numberOne + numberTwo

    println("Сложите два числа $numberOne + $numberTwo")
    val answer = readLine()!!.toInt()
    if (answer == rightAnswer)
        println("Поздравляем, Вы не бот!")
        else println("Охх :( Ответ неверный. Повторите попытку.")
        }