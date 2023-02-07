package lesson_5

fun rand(start: Int, end: Int): Int {

    return (start..end).random()
}

fun main() {
    val winningNumberOne = 1
    val winningNumberTwo = 100

    println("Введите первое число:")
    val numberOne = readLine()!!.toInt()

    println("Введите второе число:")
    val numberTwo = readLine()!!.toInt()

    if ((numberOne == winningNumberOne || numberOne == winningNumberTwo) && (numberTwo == winningNumberTwo || numberTwo == winningNumberOne))
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((numberOne == winningNumberOne || numberOne == winningNumberTwo) || (numberTwo == winningNumberTwo || numberTwo == winningNumberOne))
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")

    for (i in 1..2) println("выигрышные цифры: ${rand(winningNumberOne, winningNumberTwo)}")
}