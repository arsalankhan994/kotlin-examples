fun main() {
    val stringObject: String = "Erselan Khan"
    val stringNullObject: String? = null

    /*
    First start with non-null object
    */
    val value = stringObject.equals("Erselan Khan")
    println("vale: $value")

    /*
    1. Handle null object using try/catch
    */
    try {
        stringNullObject!!.length
    } catch (exception: NullPointerException) {
        println("NullPointerException")
    }

    /*
    2. Handle null object using if check
    */
    if (stringNullObject != null) {
        println("stringNullObject: $stringNullObject")
    } else {
        println("stringNullObject is null")
    }

    /*
    3. Handle null object using safe calls
    */
    println(stringNullObject?.length)

    /*
    4. Handle null object using Elvis operator
    */
    val length = stringNullObject?.length ?: -1
    println("length is: $length")

    /*
    5. Handle null object using extension function
    */
    if (!stringNullObject.isNullOrBlank()) {
        println("stringNullObject: $stringNullObject")
    } else {
        println("stringNullObject is null")
    }
}