import bruteforce.BruteForce
import java.util.Arrays

fun main(args: Array<String>) {

    val b = BruteForce()
    val s = "academy"
    val array: CharArray = s.toCharArray()

    println("FirstMatch method:  ${b.firstMatch(array, charArrayOf('m', 'y'))}")
    println("EveryMatch method: ${b.everyMatch(array, charArrayOf('m', 'y')).contentToString()}")
}