fun main() {

    /*
    Simple object initialization
    */
    val objectInitialization = ObjectInitialization()
    objectInitialization.printMyName("Erselan Khan")
    objectInitialization.addTwoNumbers(firstNumber = 2, secondNumber = 2)
}

class ObjectInitialization {

    /*
    Must define the type of lateinit i.e "Number"
    */
    lateinit var initializationLateInitObject: Number

    fun printMyName(name: String) {
        println("My name is $name")
    }

    /*
    initializing lateinit variable
    */
    fun addTwoNumbers(firstNumber: Int, secondNumber: Int) {
        initializationLateInitObject = firstNumber + secondNumber
        printLateInitVariableValue()
    }

    /*
    accessing lateinit variable after checking it's initialization
    */
    fun printLateInitVariableValue() {
        if (this::initializationLateInitObject.isInitialized) {
            println("Print value: ${initializationLateInitObject.toInt()}")
        }
    }
}