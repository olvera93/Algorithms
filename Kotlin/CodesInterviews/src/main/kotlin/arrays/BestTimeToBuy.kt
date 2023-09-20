package arrays

class BestTimeToBuy {

    fun maxProfit(prices: IntArray): Int {
        if (prices.count() == 1) return 0

        var profit = 0
        var left = 0

        for (right in 1..<prices.count()) {
            if (prices[right] > prices[left]) {
                profit = Math.max(profit, prices[right]-prices[left])
            } else {
                left = right
            }
        }
        return profit
    }
}

fun main() {
    val b = BestTimeToBuy()
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    println(b.maxProfit(prices))
}