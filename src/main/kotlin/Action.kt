sealed class Action {

    override fun toString(): String {
        return this.javaClass.simpleName + "ing " + "\n"
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