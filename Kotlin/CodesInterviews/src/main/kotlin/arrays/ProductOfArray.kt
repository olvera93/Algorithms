package arrays

class ProductOfArray {

    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val prefixProduct = IntArray(n)
        prefixProduct[0] = 1

        for (i in 1..<n) {
            prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1]
        }

        var suffixProduct = 1
        for (i in nums.indices.reversed()) {
            prefixProduct[i] =  prefixProduct[i] * suffixProduct
            suffixProduct *= nums[i]
        }

        return prefixProduct
    }
}

fun main() {
    val product = ProductOfArray()
    val nums = intArrayOf(1, 2, 3, 4)
    val nums2 = intArrayOf(11, 13, 12, 34)
    print(product.productExceptSelf(nums).contentToString())
    print(product.productExceptSelf(nums2).contentToString())
}