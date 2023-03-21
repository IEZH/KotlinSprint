package lesson_9

fun main() {

    println("Укажите 5 ингредиентов:")
    val userInput = readln()

    val ingredients: List<String> = userInput.split(", ")

    for (item in ingredients.sorted()) println(item)
    }