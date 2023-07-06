package lesson_12

class WeatherXX(
    val numberOfDay: Int,
    val temperatureOfDay: Int,
    val temperatureOfNight: Int,
    val atmosphericPressure: Int,
    val isRain: Boolean
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
    val weatherList = mutableListOf<WeatherXX>()

    for (i in 1..10) {
        val temperatureOfDay = (Math.random() * 10 + 20).toInt()
        val temperatureOfNight = (Math.random() * 10 + 15).toInt()
        val atmosphericPressure = (Math.random() * 10 + 740).toInt()
        val isRain = Math.random() < 0.3 // вероятность дождя 30%

        val weather = WeatherXX(
            numberOfDay = i,
            temperatureOfDay = temperatureOfDay,
            temperatureOfNight = temperatureOfNight,
            atmosphericPressure = atmosphericPressure,
            isRain = isRain
        )

        weatherList.add(weather)
    }

    var rainyDays = 0

    for (weather in weatherList) {
        weather.temperatureOfDay
        weather.temperatureOfNight
        weather.atmosphericPressure
        if (weather.isRain) {
            rainyDays++
        }
        weather.displayWeather()
        println()
    }

    val averageTemperatureOfDay = weatherList.map { it.temperatureOfDay }.average()
    val averageTemperatureOfNight = weatherList.map { it.temperatureOfNight }.average()
    val averageAtmosphericPressure = weatherList.map { it.atmosphericPressure }.average()

    println("Средняя температура днем: $averageTemperatureOfDay")
    println("Средняя температура ночью: $averageTemperatureOfNight")
    println("Среднее атмосферное давление: $averageAtmosphericPressure")
    println("Количество дождливых дней: $rainyDays")
}
