package lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457
    val travelHour = travelTime / 60
    val travelMinute = travelTime - travelHour * 60
    val arrivalMinuteClean = departureMinute + travelMinute
    val arrivalHour = departureHour + travelHour + arrivalMinuteClean / 60
    val arrivalMinute = arrivalMinuteClean - 60

    print(arrivalHour)
    print(":")
    print(arrivalMinute)
}