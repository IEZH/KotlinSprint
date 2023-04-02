package lesson_10

fun main() {
    var numberVictoryHuman = 0
    do {
        println("Пользователь бросает кости:")
        val resultOfUser = rollOfTheDice()

        println("Компьютер бросает кости:")
        val resultOfComputer = rollOfTheDice()

        if (resultOfUser > resultOfComputer) {
            println("Победило человечество")
            val numberVictory = numberVictoryHuman++
        }
        else if (resultOfUser == resultOfComputer) println("Ничья")
        else println("Победила машина")

        println("Хотите бросить кости еще раз? Введите да или нет")
        val choice = readln()
    } while (choice == "да")
    numberVictoryHuman
    println("Количество ваших побед - $numberVictoryHuman")
}

fun rollOfTheDice(): Int {
    val number1 = (1..6).random()
    val number2 = (1..6).random()
    println("выпало $number1 и $number2")
    val sum = number1 + number2
    return sum
}