sealed class Animal {
    abstract val name: String
    fun doAction(action: Action) {
        print("${this.name} $action")
    }

    abstract fun isActionAllowed(action: Action): Boolean

    /*override fun toString(): String {
//        return this.javaClass.simpleName
        return this.name
    }*/

    class Bear(private val animalName: String) : Animal() {
        private val nonAbleActions = listOf(
            Action.Fly
        )
        override val name: String
            get() = animalName

        override fun isActionAllowed(action: Action) = nonAbleActions.contains(action)
    }

    class Duck(private val animalName: String) : Animal() {
        private val nonAbleActions = listOf(
            Action.Hunt,
            Action.Roar
        )
        override val name: String
            get() = animalName

        override fun isActionAllowed(action: Action) = nonAbleActions.contains(action)
    }

    class Hummingbird(private val animalName: String) : Animal() {
        private val nonAbleActions = listOf(
            Action.Walk,
            Action.Swim,
            Action.Hunt,
            Action.Roar
        )
        override val name: String
            get() = animalName

        override fun isActionAllowed(action: Action) = nonAbleActions.contains(action)
    }

    class Wolf(private val animalName: String) : Animal() {
        private val nonAbleActions = listOf(
            Action.Swim,
            Action.Fly
        )
        override val name: String
            get() = animalName

        override fun isActionAllowed(action: Action) = nonAbleActions.contains(action)
    }

    class Beaver(private val animalName: String) : Animal() {
        private val nonAbleActions = listOf(
            Action.Hunt,
            Action.Roar,
            Action.Fly
        )
        override val name: String
            get() = animalName

        override fun isActionAllowed(action: Action) = nonAbleActions.contains(action)
    }
}
