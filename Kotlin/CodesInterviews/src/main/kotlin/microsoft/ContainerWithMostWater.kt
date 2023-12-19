package microsoft

import kotlin.math.max
import kotlin.math.min

class ContainerWithMostWater {

    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        var l = 0
        var r = height.size - 1

        while (l < r) {
            maxArea = max(maxArea, min(height[l], height[r]) * (r - l))

            if (height[l] < height[r]) {
                l += 1
            } else {
                r -= 1
            }
        }
        return maxArea
    }


}

fun main() {

    val height = intArrayOf(1,8,6,2,5,4,8,3,7)
    val water = ContainerWithMostWater()
    println(water.maxArea(height))

}
