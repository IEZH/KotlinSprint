package lesson_4

fun main() {
    val Weather = "sunny"
    val Tent = "open"
    val humidity = 20
    val season = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых?" + (Weather == PERFECT_WEATHER && Tent == PERFECT_TENT && humidity == PERFECT_HUMIDITY && season != PERFECT_SEASON))
}

const val PERFECT_WEATHER = "sunny"
const val PERFECT_TENT = "open"
const val PERFECT_HUMIDITY = 20
const val PERFECT_SEASON = "winter"