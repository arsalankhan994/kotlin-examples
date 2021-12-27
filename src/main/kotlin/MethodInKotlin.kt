fun main() {
    val methodInKotlin = MethodInKotlin()
    methodInKotlin.methodWithoutReturnTypeAndNoParameter()
    val first = methodInKotlin.methodWithReturnTypeAndNoParameter()
    println("return type of methodWithReturnTypeAndNoParameter: $first")
    methodInKotlin.methodWithoutReturnTypeWithParameter("Erselan Khan")
    val second = methodInKotlin.methodWithReturnTypeWithParameter("Erselan Khan")
    println("return type of methodWithReturnTypeWithParameter: $second")
}

class MethodInKotlin {
    fun methodWithoutReturnTypeAndNoParameter() {
        println("called method methodWithoutReturnTypeAndNoParameter")
    }

    fun methodWithReturnTypeAndNoParameter(): String {
        return "Erselan Khan"
    }

    fun methodWithoutReturnTypeWithParameter(name: String) {
        println("called method methodWithoutReturnTypeAndNoParameter, Print my name: $name")
    }

    fun methodWithReturnTypeWithParameter(name: String): String {
        return name
    }
}