package lesson_5

fun main() {
    val winningNumberOne = 15
    val winningNumberTwo = 77

    println("Введите первое число:")
    val numberOne = readLine()!!.toInt()

    println("Введите второе число:")
    val numberTwo = readLine()!!.toInt()

    if (numberOne == winningNumberOne && numberTwo == winningNumberTwo)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (numberOne == winningNumberOne || numberTwo == winningNumberTwo)
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
}