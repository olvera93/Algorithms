package facebook

import java.util.Arrays

class MoveZeroes {

    fun moveZeroes(nums: Array<Int>) {
        var zeroIndex = 0
        val n = nums.size

        for (nonZeroIndex in 0..<n) {
            if (nums[nonZeroIndex] != 0) {
                nums[zeroIndex] = nums[nonZeroIndex];
                zeroIndex++
            }
        }

        for (i in zeroIndex..<n ) {
            nums[i] = 0
        }

        println(nums.contentToString())
    }

}

fun main() {
    val moveZeroes = MoveZeroes()
    val nums = arrayOf(0, 1, 0, 3, 12)
    moveZeroes.moveZeroes(nums)
}