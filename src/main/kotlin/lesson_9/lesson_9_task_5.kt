package lesson_9

fun main() {

    val listOsIngredients: MutableList<String> = mutableListOf()

    for (i in 1..5) {
        println("Введите ингредиент:")
        listOsIngredients.add(readln())
    }

    val listOsIngredientsWithoutDouble = listOsIngredients.toSet().sorted().toMutableList()

    listOsIngredientsWithoutDouble[0] = listOsIngredientsWithoutDouble[0].replaceFirstChar { it.titlecase() }
    listOsIngredientsWithoutDouble[4] = listOsIngredientsWithoutDouble[4].plus(".")

    println(listOsIngredientsWithoutDouble)
}

