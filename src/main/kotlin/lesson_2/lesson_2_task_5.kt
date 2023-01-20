package lesson_2

import kotlin.math.pow

fun main() {
    // SUM = X * (1 + %)n
    //где SUM — конечная сумма;
    //X — начальная сумма;
    //% — процентная ставка, процентов годовых /100;
    //n — количество периодов, лет (месяцев, кварталов).
    val startSum = 70000.0F
    val rate = 16.7F
    val term = 20 // лет
    val a = (1 + rate / 100.0)
    val sum = startSum * a.pow(term)

    println("%.3f".format(sum))


}