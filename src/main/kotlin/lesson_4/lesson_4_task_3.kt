package lesson_4

fun main() {
    val sunnyWeather = true
    val openTent = true
    val humidity20 = true
    val seasonNotWinter = false

    println("Благоприятные ли условия сейчас для роста бобовых?" + (sunnyWeather == SUNNY_WEATHER && openTent == OPEN_TENT && humidity20 == HUMIDITY_20 && seasonNotWinter == SEASON_NOT_WINTER))
}
const val SUNNY_WEATHER = true
const val OPEN_TENT = true
const val HUMIDITY_20 = true
const val SEASON_NOT_WINTER = true