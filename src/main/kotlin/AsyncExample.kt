import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
    var totalTime = measureTimeMillis {
        val one = async { getFirstResultFromInternet() }
        val two = async { getSecondResultFromInternet() }
        println("The result is ${one.await() + " " + two.await()}")
    }
    println("Total time is $totalTime") // printing total execution time
}

suspend fun getFirstResultFromInternet(): String {
    println("Getting First Result From Internet")
    delay(5000) // add some delay
    return "Hello"
}

suspend fun getSecondResultFromInternet(): String {
    println("Getting Second Result From Internet")
    delay(5000) // add some delay
    return "World"
}