class AnimalHelper {
    private val list = mutableListOf<Animal>()

    init {
        createBears()
        createBeavers()
        createDucks()
        createHummingbirds()
        createWolfs()
    }

    private fun createBears() = createAnimal(Constants.BEARS_NUMBER, Animal.Bear)
    private fun createDucks() = createAnimal(Constants.DUCKS_NUMBER, Animal.Duck)
    private fun createHummingbirds() = createAnimal(
        Constants.HUMMINGBIRDS_NUMBER,
        Animal.Hummingbird
    )
    private fun createWolfs() = createAnimal(Constants.WOLFS_NUMBER, Animal.Wolf)
    private fun createBeavers() = createAnimal(Constants.BEAVERS_NUMBER, Animal.Beaver)
    private fun createAnimal(number: Int, type: Animal) {
        (1..number).forEach { _ ->
            list.add(type)  //todo animal type instance?
        }
    }

    fun getAnimals() = list.shuffled()
}