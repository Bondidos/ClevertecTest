package test2

import test2.Constants.BEARS
import test2.Constants.BEARS_NUMBER
import test2.Constants.BEAVERS
import test2.Constants.BEAVERS_NUMBER
import test2.Constants.DUCKS
import test2.Constants.DUCKS_NUMBER
import test2.Constants.HUMMINGBIRDS
import test2.Constants.HUMMINGBIRDS_NUMBER
import test2.Constants.WOLFS
import test2.Constants.WOLFS_NUMBER

class AnimalHelper {
    private val list = mutableListOf<Animal>()

    init {
        createBears()
        createBeavers()
        createDucks()
        createHummingbirds()
        createWolfs()
    }

    private fun createBears() = createAnimal(BEARS_NUMBER, BEARS)
    private fun createDucks() = createAnimal(DUCKS_NUMBER, DUCKS)
    private fun createHummingbirds() = createAnimal(HUMMINGBIRDS_NUMBER, HUMMINGBIRDS)

    private fun createWolfs() = createAnimal(WOLFS_NUMBER, WOLFS)
    private fun createBeavers() = createAnimal(BEAVERS_NUMBER, BEAVERS)
    private fun createAnimal(number: Int, animalType: String) {
        (1..number).forEach { index ->
            when (animalType) {
                BEARS -> list.add(
                    Animal.Bear("$animalType#$index")
                )
                DUCKS -> list.add(
                    Animal.Duck("$animalType#$index")
                )
                HUMMINGBIRDS -> list.add(
                    Animal.Hummingbird("$animalType#$index")
                )
                WOLFS -> list.add(
                    Animal.Wolf("$animalType#$index")
                )
                BEAVERS -> list.add(
                    Animal.Beaver("$animalType#$index")
                )
            }
        }
    }

    fun getAnimals() = list.shuffled()
}