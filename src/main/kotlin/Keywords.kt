fun main() {

    // Non changeable values in Kotlin
    val personAge = 27
    /*personAge = 26*/ // we can not reassign value to val variable

    // Changeable values in Kotlin
    var name = "Erselan Khan"
    name = "Khan Erselan"



    // Multi Condition in Kotlin using when/else
    val list = listOf("Erselan Khan", 27, "arsalankhan994@gmail.com")
    when(list[(list.indices).random()]) {
        "Erselan Khan" -> println("name is ${list[0]}")
        27 -> println("age is ${list[1]}")
        "arsalankhan994@gmail.com" -> println("email is ${list[2]}")
        else -> println("Else condition")
    }



    /*
    object classes example
    */
    val singleton = SingletonClass.age
    println(singleton)
    SingletonClass.updateAge(20)
    println(SingletonClass.age)



    /*
    Class bound methods and variable
    */
    val someVariable = ClassBoundMethod
    someVariable.classBoundMethod()
    someVariable.name

    /*
    Data class example
    */
    val dataClass = StudentDataClass()
    dataClass.copy()
    dataClass.toString()

}

/*
By Default all class are non-inheritable in Kotlin
*/
class NonInheritedClass {

}

/*
Try to Inherit non-inheritable class
*/
class InheritNonInheritableClass : NonInheritedClass() {

}

/*
Using open keyword to inherit this class
*/
open class InheritableClass {

}

/*
Try to Inherit inheritable class
*/
class InheritInheritableClass : InheritableClass() {

}

/*
One create single instance of this class like Singleton Design Pattern
*/
object SingletonClass {
    var age: Int = 27
    fun updateAge(age: Int) {
        this.age = age
    }
}

/*
Create a class variable, so we don't need to create an instance of this class to access name variable
*/
class ClassBoundMethod {
    companion object {
        val name: String = "Erselan Khan"

        fun classBoundMethod() {

        }
    }
}

abstract class AbstractClasses() {
    abstract fun someAbstractMethod()
}

class SomeClassName: AbstractClasses() {
    override fun someAbstractMethod() {

    }
}


/*
Data class to store data, this class needs atleast one argument
*/
data class StudentDataClass(
    private val name: String = ""
) {

}