fun main(args: Array<String>) {
//    print(AnimalHelper().getAnimals())

val actionHelper = ActionHelper()
    val bear = Animal.Bear
    bear.doAction(actionHelper.getAction())
   // println(actionHelper.getAction().toString())
}

sealed class Animal {
    abstract fun doAction(action: Action)

    object Bear : Animal() {
        override fun doAction(action: Action) {
            print("$this $action")
        }

        override fun toString(): String {
            return "Bear"
        }
    }

    object Duck : Animal() {
        override fun doAction(action: Action) {
            print(action)
        }

        override fun toString(): String {
            return "Duck"
        }
    }

    object Hummingbird : Animal() {
        override fun doAction(action: Action) {
            print(action)
        }

        override fun toString(): String {
            return "Hummingbird"
        }
    }

    object Wolf : Animal() {
        override fun doAction(action: Action) {
            print(action)
        }

        override fun toString(): String {
            return "Wolf"
        }
    }

    object Beaver : Animal() {
        override fun doAction(action: Action) {
            print(action)
        }

        override fun toString(): String {
            return "Beaver"
        }
    }

}


class ActionHelper() {
    private val list = listOf(
        Action.Walk,
        Action.Fly,
        Action.Eat,
        Action.Drink,
        Action.Swim,
        Action.Sleep,
        Action.Hunting,
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
    // сделать список действий и доставать рандомно в зависимости от того какой животное запрашивает
    object Walk : Action(){
        override fun toString(): String {
            return "Walking"
        }
    }
    object Fly : Action(){
        override fun toString(): String {
            return "Flying"
        }
    }
    object Eat : Action(){
        override fun toString(): String {
            return "Eating"
        }
    }
    object Drink : Action(){
        override fun toString(): String {
            return "Drinking"
        }
    }
    object Swim : Action(){
        override fun toString(): String {
            return "Swimming"
        }
    }
    object Sleep : Action(){
        override fun toString(): String {
            return "Sleeping"
        }
    }
    object Hunting : Action(){
        override fun toString(): String {
            return "Hunting"
        }
    }
    object Roar : Action(){
        override fun toString(): String {
            return "Roaring"
        }
    }

}

