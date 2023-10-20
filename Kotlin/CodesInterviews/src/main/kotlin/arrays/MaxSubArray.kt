package arrays

class MaxSubArray {

    fun maxSubArray(nums: IntArray): Int {
        var current = nums[0]
        var max = nums[0]

        for (i in 1..nums.lastIndex) {
            current = Math.max(nums[i], nums[i] + current)
            max = Math.max(max, current)
        }

        return max
    }
}

fun main() {
    val nums = intArrayOf(5, 4, -1, 7, 8 )
    val max = MaxSubArray()
    println("${max.maxSubArray(nums)}")
}