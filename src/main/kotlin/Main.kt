fun main(args: Array<String>) {
//    print(AnimalHelper().getAnimals())
    val action = ActionHelper().getAction()
    val animal = Animal.Bear
    animal.doAction(action)
}

sealed class Animal {
    fun doAction(action: Action) {
        print("$this $action")
    }

    override fun toString(): String {
        return this.javaClass.simpleName
    }

    object Bear : Animal()
    object Duck : Animal()
    object Hummingbird : Animal()
    object Wolf : Animal()
    object Beaver : Animal()

}


class ActionHelper() {
    private val list = listOf(
        Action.Walk,
        Action.Fly,
        Action.Eat,
        Action.Drink,
        Action.Swim,
        Action.Sleep,
        Action.Hunt,
        Action.Roar,
    )

    fun getAction() = list.random()

}

class AnimalHelper() {
    private val list = mutableListOf<Animal>()

    init {
        createBears()
        createBeavers()
        createDucks()
        createHummingbirds()
        createWolfs()
    }

    private fun createBears() = createAnimal(3, Animal.Bear)
    private fun createDucks() = createAnimal(4, Animal.Duck)
    private fun createHummingbirds() = createAnimal(7, Animal.Hummingbird)
    private fun createWolfs() = createAnimal(5, Animal.Wolf)
    private fun createBeavers() = createAnimal(2, Animal.Beaver)
    private fun createAnimal(number: Int, type: Animal) {
        (1..number).forEach { _ ->
            list.add(type)
        }
    }

    fun getAnimals() = list.toList().shuffled()
}

sealed class Action {

    override fun toString(): String {
        return this.javaClass.simpleName + "ing"
    }

    object Walk : Action()
    object Fly : Action()
    object Eat : Action()
    object Drink : Action()
    object Swim : Action()
    object Sleep : Action()
    object Hunt : Action()
    object Roar : Action()
}

