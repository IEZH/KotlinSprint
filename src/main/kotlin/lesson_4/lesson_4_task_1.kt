package lesson_4

fun main() {
    val busyTablesToday = 13
    val busyTablesTomorrow = 9
    val freeTablesToday = busyTablesToday < NUMBERS_OF_TABLES
    val freeTablesTomorrow = busyTablesTomorrow < NUMBERS_OF_TABLES

    println("[Доступность столиков на сегодня: $freeTablesToday], \n[Доступность столиков на завтра: $freeTablesTomorrow]")

}
const val NUMBERS_OF_TABLES = 13