package lesson_9

fun main() {
    val numberOfIngredients = mutableListOf(2, 50, 15)

    println("Какое количество порций вы хотите приготовить?")
    val numberOfServings = readln().toInt()

    val numberOfIngredients2 = numberOfIngredients.map { it * numberOfServings }

    println("На $numberOfServings порций омлета вам понадобится: яиц - ${numberOfIngredients2[0]} шт., " +
            "молока - ${numberOfIngredients2[1]} мл., сливочного масла - ${numberOfIngredients2[2]} гр.")
}