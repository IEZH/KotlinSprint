package lesson_12

class WeatherXX(
    val numberOfDay: Int,
    val temperatureOfDay: Int,
    val temperatureOfNight: Int,
    val atmosphericPressure: Int,
    val isRain: Boolean = false
) {

    fun displayWeather() {
        println("День $numberOfDay")
        println("Температура днем: $temperatureOfDay")
        println("Температура ночью: $temperatureOfNight")
        println("Атмосферное давление: $atmosphericPressure")
        println("Дождь: ${if (isRain) "да" else "нет"}")
    }
}

fun main() {
    val day1 = WeatherXX(
        numberOfDay = 1,
        temperatureOfDay = 30,
        temperatureOfNight = 26,
        atmosphericPressure = 751
    ).displayWeather()

    val day2 = WeatherXX(
        numberOfDay = 2,
        temperatureOfDay = 29,
        temperatureOfNight = 27,
        atmosphericPressure = 744
    ).displayWeather()

    val day3 = WeatherXX(
        numberOfDay = 3,
        temperatureOfDay = 31,
        temperatureOfNight = 28,
        atmosphericPressure = 754
    ).displayWeather()
}