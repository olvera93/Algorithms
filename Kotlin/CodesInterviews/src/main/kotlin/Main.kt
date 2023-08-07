import arrays.AnagramProblem
import arrays.ReverseArrayProblem
import java.util.Arrays

fun main(args: Array<String>) {

    println("Reverse Array Problem")
    val arrayReverse = ReverseArrayProblem()
    val nums = intArrayOf(1, 2, 3, 5, 6)
    println(arrayReverse.solve(nums).contentToString())
    println()

    println("Anagram Problem")
    val anagramProblem = AnagramProblem()
    val s1 = "restful"
    val s2 = "fluster"
    println(anagramProblem.solve(s1.toCharArray(), s2.toCharArray()))


}