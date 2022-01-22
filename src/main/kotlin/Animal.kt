sealed class Animal {
    fun doAction(action: Action) {
        print("$this $action")
    }

    abstract fun isActionAllowed(action: Action): Boolean

    override fun toString(): String {
        return this.javaClass.simpleName
    }

    object Bear : Animal() {
        private val nonAbleActions = listOf(
            Action.Fly
        )

        override fun isActionAllowed(action: Action) = nonAbleActions.contains(action)
    }

    object Duck : Animal() {
        private val nonAbleActions = listOf(
            Action.Hunt,
            Action.Roar
        )

        override fun isActionAllowed(action: Action) = nonAbleActions.contains(action)
    }

    object Hummingbird : Animal() {
        private val nonAbleActions = listOf(
            Action.Walk,
            Action.Swim,
            Action.Hunt,
            Action.Roar
        )

        override fun isActionAllowed(action: Action) = nonAbleActions.contains(action)
    }

    object Wolf : Animal() {
        private val nonAbleActions = listOf(
            Action.Swim,
            Action.Fly
        )

        override fun isActionAllowed(action: Action) = nonAbleActions.contains(action)
    }

    object Beaver : Animal() {
        private val nonAbleActions = listOf(
            Action.Hunt,
            Action.Roar,
            Action.Fly
        )

        override fun isActionAllowed(action: Action) = nonAbleActions.contains(action)
    }
}
