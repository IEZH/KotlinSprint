package lesson_9

fun main() {

    val listOsIngredients: MutableList<String> = mutableListOf()

    for (i in 1..5) {
        println("Введите ингредиент:")
        listOsIngredients.add(readln())
    }

    val listOsIngredientsWithoutDouble = listOsIngredients.toSet().sorted().toMutableList()

    val index = listOsIngredientsWithoutDouble.lastIndex

    listOsIngredientsWithoutDouble[0] = listOsIngredientsWithoutDouble[0].replaceFirstChar { it.titlecase() }
    listOsIngredientsWithoutDouble[index] = listOsIngredientsWithoutDouble[index].plus(".")

    println(listOsIngredientsWithoutDouble.joinToString())
}

