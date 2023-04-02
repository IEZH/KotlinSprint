package lesson_10

fun main() {
    println("Задайте длину пароля:")
    val passwordLength = readln().toInt()

    generationPass(passwordLength)
}

fun generationPass(passwordLength: Int): StringBuilder {
    val pass = StringBuilder()
    for (i in 1..passwordLength) {
        val a = ("012345678\"9#\\$%&'()*+,-./:;>=<?@[]^_`~ ").random()
        pass.append(a)
    }

    println(pass)
    return pass
}
