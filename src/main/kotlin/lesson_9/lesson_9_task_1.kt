package lesson_9

fun main() {
    val recipe = listOf("ветчина", "сыр", "майонез", "картофель", "яйцо", "курица", "соль")
    println("В рецепте есть следующие ингредиенты:")
    recipe.forEach {
        println(it)
    }
}