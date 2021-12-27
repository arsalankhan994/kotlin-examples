fun main() {

    /*
    1. for loop using "in"
    */
    for(i in 0..5) {
        println("for loop using in")
    }

    /*
    2. for loop using "until"
    */
    for (i in 0 until 5) {
        println("for loop using until")
    }

    /*
    3. foreach on List
    */
    val names: List<String> = listOf("Erselan", "Khan")
    names.forEach {
        println(it)
    }

    /*
    4. foreach on List 2nd example
    */
    for (name in names) {
        println(name)
    }

    /*
    5. while loop
    */
    var i = 5
    while (i > 0) {
        println("while loop")
        i--
    }
}