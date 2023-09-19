package arrays

class TwoSums {

    fun twoSumt(nums: IntArray, target: Int): IntArray {
        val ans = IntArray(2)
        val map: HashMap<Int, Int> = HashMap()

        for (i in nums.indices) {
            val diff = target - nums[i]
            if (!map.containsKey(diff)) {
                map[nums[i]] = i
            } else {
                ans[0] = i
                ans[1] = map[diff]!!
            }
        }

        return ans

    }
}

fun main(args: Array<String>) {
    val sum = TwoSums()
    val nums = intArrayOf(2, 7, 11, 15)
    println(sum.twoSumt(nums, 9).contentToString())
}