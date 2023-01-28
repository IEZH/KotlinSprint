package lesson_4

fun main() {
    var cargoWeight = 20
    var cargoVolume = 80

    println("Average для груза с весом $cargoWeight кг и объемом $cargoVolume л:" + (WEIGHT_MAX >= cargoWeight && cargoWeight >= WEIGHT_MIN && cargoVolume < VOLUME_MAX))
    cargoWeight = 50
    cargoVolume = 100

    println("Average для груза с весом $cargoWeight кг и объемом $cargoVolume л:" + (WEIGHT_MAX >= cargoWeight && cargoWeight >= WEIGHT_MIN && cargoVolume < VOLUME_MAX))


}
const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME_MAX = 100