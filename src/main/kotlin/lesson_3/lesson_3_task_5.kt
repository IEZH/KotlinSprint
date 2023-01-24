package lesson_3

fun main() {
    val step = "D2-D4;0"
    val whereFrom = step.substringBefore('-')
    val a = step.substringAfter('-')
    val where = a.substringBefore(';')
    val stepNumber = a.substringAfter(';')

    println(whereFrom)
    println(where)
    println(stepNumber)


}