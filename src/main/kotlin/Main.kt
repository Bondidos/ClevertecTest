import Constants.DAY
import Constants.EVENING
import Constants.MORNING
import kotlinx.coroutines.*

private var isAlive = false
private val animalHelper = AnimalHelper()
private val actionHelper = ActionHelper()
private val animalList = animalHelper.getAnimals()
private var dayPhase = MORNING

fun main() {

    runBlocking {
        print("One day of wild nature... \n\n")
        while (dayPhase <= EVENING) {
            dayCycle()
            dayPhase++
        }
    }
    print("\nZoo is closed, please go home =)")
}

suspend fun dayCycle() {
    when (dayPhase) {
        MORNING -> {
            isAlive = true
            print("\nMORNING...\n\n")
            cycle()
            delay(10000)
        }
        DAY -> {
            isAlive = true
            print("\nDAY...\n\n")
            cycle()
            delay(10000)
        }
        EVENING -> {
            isAlive = true
            print("\nEVENING...\n\n")
            cycle()
        }
    }
}

fun cycle() {
    while (isAlive) {
        doAction()
    }
}

private fun doAction() {

    animalList.forEach { animal ->
        when (animal) {
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

private fun generateValidAction(animal: Animal): Action {

    var action = actionHelper.getAction()
    while (animal.isActionAllowed(action)) {
        action = actionHelper.getAction()
    }
    return action
}
