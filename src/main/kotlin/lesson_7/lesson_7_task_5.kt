package lesson_7

fun main() {
    var password = ""

    println("Введите длину пароля:")
    val passwardLenght = readln().toInt()
    for (i in 0 until passwardLenght) {
        when ((0..2).random()) {
            0 -> password += (0..9).random()
            1 -> password += ('a'..'z').random()
            else -> password += ('A'..'Z').random()
        }
    }
    println(password)
    }
