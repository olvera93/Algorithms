package arrays

class ContainsDuplicate2 {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map: HashMap<Int, Int> = HashMap<Int, Int>()
        for (i in nums.indices) {
            if (map.containsKey(nums[i])) {
                if (i - (map[nums[i]]!!) <= k) return true
            }
            map.put(nums[i], i)
        }
        return false
    }
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 1, 2, 3)
    val c = ContainsDuplicate2()
    println(c.containsNearbyDuplicate(nums, 2))
}