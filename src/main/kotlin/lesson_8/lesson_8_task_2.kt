package lesson_8

fun main() {
    val recipe = arrayOf("грибы", "курица", "сливки", "масло", "соль", "перец", "лук", "зелень")

    println("Введите ингредиент:")
    val ingredient = readLine()

    for (i in recipe) {
        if (ingredient == i) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}