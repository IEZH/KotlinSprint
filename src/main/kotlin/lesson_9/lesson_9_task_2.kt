package lesson_9

fun main() {
    val listOfIngredients = mutableListOf("макароны", "фарш", "соль")

    println("В рецепте есть базовые ингредиенты:")
    listOfIngredients.forEach {
        println(it)
    }

    println("Желаете добавить еще?")
    val answer = readln()
    if (answer != "да") return

    println("Какой ингредиент вы хотите добавить?")
    val newIngredient = readln()

    listOfIngredients.add(newIngredient)

    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")

}