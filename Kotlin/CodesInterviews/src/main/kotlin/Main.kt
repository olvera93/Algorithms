import arrays.ReverseArrayProblem
import java.util.Arrays

fun main(args: Array<String>) {

    val arrayReverse = ReverseArrayProblem()
    val nums = intArrayOf(1, 2, 3, 5, 6)
    println(Arrays.toString(arrayReverse.solve(nums)))
}