package lesson_4

fun main() {
    val day = 5
    val flag = (day % 2) == 0
    val hands = !flag
    val legs = flag
    val back = flag
    val press = !flag

    println("""
    Упражнения для рук:    $hands
    Упражнения для ног:    $legs
    Упражнения для спины:  $back
    Упражнения для пресса: $press""".trimIndent())

}