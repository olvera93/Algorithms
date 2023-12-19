package arrays



class MaximumProductSubArray {

    fun maxProduct(nums: IntArray): Int {
        var ans = nums[0];
        var min = 1
        var max = 1

        for (i in nums.indices) {
            if (nums[i] == 0) {
                min = 1
                max = 1
                ans = Math.max(ans, nums[i])
                continue
            }

            val tmp = min
            min = Math.min(nums[i], Math.min(nums[i] * min, nums[i] * max))
            max = Math.max(nums[i], Math.max(nums[i] * tmp, nums[i] * max))
            ans = Math.max(ans, max)
        }

        return ans
    }
}

fun main() {
    val array = MaximumProductSubArray()
    val nums = intArrayOf(-2, 1, 0)
    print(array.maxProduct(nums))
}