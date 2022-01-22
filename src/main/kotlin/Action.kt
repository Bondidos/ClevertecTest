import java.util.*

sealed class Action {

    override fun toString(): String {
        return "is "+this.javaClass.simpleName.lowercase(Locale.getDefault()) + "ing " + "\n"
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