package arrays
class ContainsDuplicate {

    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.isEmpty()) return false

        val set: MutableSet<Int> = mutableSetOf()
        for (num in nums) {
            if (set.contains(num)) {
                return true
            } else {
                set.add(num)
            }
        }
        return false
    }
}

fun main() {
    val duplicate = ContainsDuplicate()
    val nums = intArrayOf(1,1,1,3,3,4,3,2,4,2)
    println(duplicate.containsDuplicate(nums))
}