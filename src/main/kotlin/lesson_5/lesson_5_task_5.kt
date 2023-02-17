package lesson_5

fun main() {
    val winningNumberOne = (1..100).random()
    val winningNumberTwo = (1..100).random()

    println("Введите первое число:")
    val numberOne = readln().toInt()

    println("Введите второе число:")
    val numberTwo = readln().toInt()

    if ((numberOne == winningNumberOne || numberOne == winningNumberTwo) && (numberTwo == winningNumberTwo || numberTwo == winningNumberOne))
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((numberOne == winningNumberOne || numberOne == winningNumberTwo) || (numberTwo == winningNumberTwo || numberTwo == winningNumberOne))
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")

    println("выигрышные цифры: $winningNumberOne, $winningNumberTwo")
}