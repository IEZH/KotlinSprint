package lesson_12

class WeatherX(_numberOfDay: Int, _temperatureOfDay: Int, _temperatureOfNight: Int, _atmosphericPressure: Int, _rain: Boolean) {
    var numberOfDay = _numberOfDay
    var temperatureOfDay = _temperatureOfDay
    var temperatureOfNight = _temperatureOfNight
    var atmosphericPressure = _atmosphericPressure
    var rain = _rain

    fun displayWeather() {
        println("День $numberOfDay")
        println("Температура днем: $temperatureOfDay")
        println("Температура ночью: $temperatureOfNight")
        println("Атмосферное давление: $atmosphericPressure")
        println("Дождь: ${if (rain) "да" else "нет"}")
    }
}

fun main() {
    val day1 = WeatherX(_numberOfDay = 1, _temperatureOfDay = 15, _temperatureOfNight = 8, _atmosphericPressure = 751, _rain = false)

    val day2 = WeatherX(_numberOfDay = 2, _temperatureOfDay = 10, _temperatureOfNight = 5, _atmosphericPressure = 744, _rain = true)

    val day3 = WeatherX(_numberOfDay = 3, _temperatureOfDay = 12, _temperatureOfNight = 10, _atmosphericPressure = 754, _rain = false)

    day1.displayWeather()
    day2.displayWeather()
    day3.displayWeather()
}