package lesson_12

class Weather() {
    var numberOfDay = 0
    var temperatureOfDay = 20
    var temperatureOfNight = 12
    var atmosphericPressure = 750
    var rain = false

    fun displayWeather() {
        println("День $numberOfDay")
        println("Температура днем: $temperatureOfDay")
        println("Температура ночью: $temperatureOfNight")
        println("Атмосферное давление: $atmosphericPressure")
        println("Дождь: ${if (rain) "да" else "нет"}")
    }
}

fun main() {

    val day1 = Weather()
    day1.numberOfDay = 1
    day1.temperatureOfDay = 25
    day1.temperatureOfDay = 18
    day1.atmosphericPressure = 747
    day1.rain = true

    val day2 = Weather()
    day2.numberOfDay = 2
    day2.temperatureOfDay = 27
    day2.temperatureOfDay = 21
    day2.atmosphericPressure = 752
    day2.rain = false

    day1.displayWeather()
    day2.displayWeather()
}