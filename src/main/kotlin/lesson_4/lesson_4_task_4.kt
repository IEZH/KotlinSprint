package lesson_4

fun main() {
    val day = 5
    val flag = day % 2
    val hands = flag == 1
    val legs = flag != 1
    val back = flag != 1
    val press = flag == 1

    println("""
    Упражнения для рук:    $hands
    Упражнения для ног:    $legs
    Упражнения для спины:  $back
    Упражнения для пресса: $press""".trimIndent())



}