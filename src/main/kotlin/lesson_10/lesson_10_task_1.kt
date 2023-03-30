package lesson_10

fun main() {
    println("Пользователь бросает кости:")
    val resultOfUser = throwingDice()

    Thread.sleep(2000)

    println("Компьютер бросает кости:")
    val resultOfComputer = throwingDice()

    Thread.sleep(2000)

    if (resultOfUser > resultOfComputer) println("Победило человечество")
    else if (resultOfUser == resultOfComputer) println("Ничья")
    else println("Победила машина")
}
fun throwingDice() : Int {
    val number1 = (1..6).random()
    val number2 = (1..6).random()
    println("выпало $number1 и $number2")
    val sum = number1 + number2
    return sum
}
