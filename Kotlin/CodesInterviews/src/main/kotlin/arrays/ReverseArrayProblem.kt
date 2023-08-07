package arrays

class ReverseArrayProblem {

    // this is the algorithm that reverses the input array (nums)
    fun solve(nums: IntArray): IntArray {
        var left = 0
        var right = nums.size - 1

        while (left < right) {
            swap(nums, left, right)
            left ++
            right --
        }

        return nums
    }

    private fun swap(nums: IntArray, index1: Int, index2: Int) {
        val temp = nums[index1]
        nums[index1] = nums[index2]
        nums[index2] = temp
    }

}