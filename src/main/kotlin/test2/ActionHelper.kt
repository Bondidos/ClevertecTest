package test2

class ActionHelper {
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