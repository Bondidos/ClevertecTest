
private var isAlive = true
private val animalHelper = AnimalHelper()
private val actionHelper = ActionHelper()
private val animalList = animalHelper.getAnimals()

fun main() {
    while (isAlive) {
        doAction()
    }
}

private fun doAction() {

    animalList.forEach { animal ->
        when(animal){
            is Animal.Bear ->
                animal.doAction(generateValidAction(animal))
            is Animal.Wolf -> animal.doAction(generateValidAction(animal))
            is Animal.Duck -> animal.doAction(generateValidAction(animal))
            is Animal.Beaver -> animal.doAction(generateValidAction(animal))
            is Animal.Hummingbird -> animal.doAction(generateValidAction(animal))
        }
    }
    isAlive = false
}

private fun generateValidAction(animal: Animal): Action{

    var action = actionHelper.getAction()
    while (animal.isActionAllowed(action)){
        action= actionHelper.getAction()
    }
    return action
}
