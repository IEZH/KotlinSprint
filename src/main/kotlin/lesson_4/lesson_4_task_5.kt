package lesson_4

fun main() {
    println("Есть ли повреждения корпуса: ")
    val shipDamage: Boolean = readLine().toBoolean()

    println("Благоприятные ли метеоусловия: ")
    val favorableWeather: Boolean = readLine().toBoolean()

    println("Текущая численность экипажа: ")
    val teamSize = readLine()!!.toInt()

    println("Текущее количество ящиков провизии: ")
    val provisions = readLine()!!.toInt()

    val resultText = if ((shipDamage == false) && (favorableWeather == true || false) && (teamSize >= MIN_TEAM_SIZE && teamSize < MAX_TEAM_SIZE)
        && (provisions > MIN_PROVISIONS)) "Корабль может отправляться"
     else if ((shipDamage == true) && (teamSize == MAX_TEAM_SIZE) && (favorableWeather == true) && (provisions > MIN_PROVISIONS))
        "Корабль может отправляться" else "Корабль не может отправляться"

    println(resultText)

}
const val MIN_TEAM_SIZE = 55
const val MAX_TEAM_SIZE = 70
const val MIN_PROVISIONS = 50