fun main() {

    /*
    Without Extension Functions
    if we are using a class "SomeThirdPartyClass" and
    we want to add one more function, then
    we need to inherit the "SomeThirdPartyClass" class with
    "MyClass" and write that function inside it and
    use "MyClass" everywhere instead of "SomeThirdPartyClass" class
    */

    // Using third-party class and its functionality
    val someThirdPartyClass = SomeThirdPartyClass()
    someThirdPartyClass.firstFunctionality()
    someThirdPartyClass.secondFunctionality()

    // Need to add one more method, but we can't as it is a third-party class,
    // so we need to inherit that class my own class
    val myClass = MyClass()
    myClass.firstFunctionality()
    myClass.secondFunctionality()
    myClass.thirdFunctionality()



    /*
    With Extension Functions*
    */
    val someThirdPartyClassWithExtensionFunction = SomeThirdPartyClass()
    someThirdPartyClassWithExtensionFunction.firstFunctionality()
    someThirdPartyClassWithExtensionFunction.secondFunctionality()
    someThirdPartyClassWithExtensionFunction.thirdFunctionality()

}

open class SomeThirdPartyClass {
    open fun firstFunctionality() {}
    fun secondFunctionality() {}
}

class MyClass: SomeThirdPartyClass() {
    fun thirdFunctionality() {}
}

/*
Extension Function
*/
fun SomeThirdPartyClass.thirdFunctionality() {

}

