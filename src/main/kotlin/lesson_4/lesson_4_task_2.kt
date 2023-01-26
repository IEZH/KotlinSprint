package lesson_4

fun main() {
    var cargoWeight = 20
    var cargoVolume = 80

    println("Average для груза с весом $cargoWeight кг и объемом $cargoVolume л:" + (WEIGHTMAX >= cargoWeight && cargoWeight >= WEIGHTMIN && cargoVolume < VOLUMEMAX))
    cargoWeight = 50
    cargoVolume = 100

    println("Average для груза с весом $cargoWeight кг и объемом $cargoVolume л:" + (WEIGHTMAX >= cargoWeight && cargoWeight >= WEIGHTMIN && cargoVolume < VOLUMEMAX))


}
const val WEIGHTMIN = 35
const val WEIGHTMAX = 100
const val VOLUMEMAX = 100