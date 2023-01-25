package lesson_3

fun main() {
    val step = "D2-D4;0"
    val whereFrom = step.substringBefore('-')
    val where = step.substringAfter('-').substringBefore(';')
    val stepNumber = step.substringAfter(';')

    println(whereFrom)
    println(where)
    println(stepNumber)
}