package lesson_8

fun main() {
    val recipe = arrayOf("грибы", "курица", "сливки", "масло", "соль", "перец", "лук", "зелень")

    println("Введите ингредиент:")
    val ingredient = readLine()

    if (ingredient in recipe)
    println("Ингредиент $ingredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
        }

