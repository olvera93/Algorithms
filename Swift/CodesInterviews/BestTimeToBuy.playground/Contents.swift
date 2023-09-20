import UIKit
import Foundation


func maxProfit(prices: [Int]) -> Int {
    if prices.count == 1 {
        return 0
    }
    
    var profit = 0
    var left = 0
    
    for right in 1..<prices.count {
        if prices[right] > prices[left] {
            profit = max(profit, prices[right] - prices[left])
        } else {
            left = right
        }
    }
    
    return profit
}

let prices = [ 7, 1, 5, 3, 6, 4 ]
var result = maxProfit(prices: prices)
print(result)
