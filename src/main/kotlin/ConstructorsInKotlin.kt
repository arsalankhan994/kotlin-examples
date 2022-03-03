fun main() {

    /*
    Primary Constructor Example
    */
    val primaryConstructorOnly = PrimaryConstructorOnly()
    println("My name is ${primaryConstructorOnly.name}")
    println("My age is ${primaryConstructorOnly.age}")

    val primaryConstructorWithParams = PrimaryConstructorWithParams(
        "Erselan Khan",
        27
    )
    println("My name is ${primaryConstructorWithParams.name}")
    println("My age is ${primaryConstructorWithParams.age}")


    /*
    Secondary Constructor Example
    */
    val secondaryConstructor = SecondaryConstructor("Erselan Khan")
    println("Secondary Constructor: My name is ${secondaryConstructor.name}")
    println("Secondary Constructor: My age is ${secondaryConstructor.age}")

}

class PrimaryConstructorOnly() {
    val name = "Erselan Khan"
    val age = 27
}

class PrimaryConstructorWithParams(
    internal val name: String,
    internal val age: Int
) {

}

class SecondaryConstructor() {
    lateinit var name : String
    var age = 27

    /*
    Two secondary constructor
    one for name and other for age
    */
    constructor(name: String): this() {
        this.name = name
    }
    constructor(age: Int): this() {
        this.age = age
    }
}