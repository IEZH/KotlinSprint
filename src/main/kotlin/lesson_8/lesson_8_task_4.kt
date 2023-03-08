package lesson_8

fun main() {
    val recipe = arrayOf("грибы", "курица", "сливки", "масло", "соль", "перец", "лук", "зелень")
    for (i in recipe) {
    println("Ингредиент ${recipe.indexOf(i)}: $i")
    }

    println("Какой ингредиент Вы желаете заменить? (введите порядковый номер)")
    val oldIngredientIndex = readln().toInt()

    if (oldIngredientIndex !in recipe.indices) {
        println("Такого ингредиента нет в списке")
        return
    }

    println("Укажите, какой ингредиент Вы хотите добавить (введите слово)")
    val newIngredient = readln()
    recipe [oldIngredientIndex] = newIngredient

    println("Готово! Вы сохранили следующий список: ")
    for (i in recipe) {
        println("Ингредиент ${recipe.indexOf(i) + 1}: $i")
    }
}