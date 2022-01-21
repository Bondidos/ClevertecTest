fun main(args: Array<String>) {

}
sealed class Animal(){
    abstract fun doAction()
    sealed class Bear(): Animal()
}