package lesson_6

fun main() {
    println("Укажите количество секунд:")
    val seconds = readln().toInt()

    var counter = seconds
    while (counter > 0) {
        counter--
        Thread.sleep(1000)
    }
    println("Прошло $seconds секунд")

}