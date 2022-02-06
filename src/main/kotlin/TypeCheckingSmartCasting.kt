fun main() {

    // Type Checking
    // Initializing list with String, Int and Boolean value
    val list = listOf<Any>("Erselan Khan", 21, false)

    // loop on above list
    list.forEach {
        when(it) {
            is String -> println("String value is: $it")
            is Int -> println("Int value is: $it")
            is Boolean -> println("Boolean value is: $it")
        }
    }

    // Smart Casting
    val studentWithRealObject: Any = Student()

    if (studentWithRealObject is Student) {
        println("Student name: ${studentWithRealObject.name}")
        println("Student age: ${studentWithRealObject.age}")
    }

}

data class Student(
    val name: String = "Erselan Khan",
    val age: Int = 27
) {
}