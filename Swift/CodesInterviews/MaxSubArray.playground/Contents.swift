import UIKit
import Foundation

func maxSubArray(nums: [Int]) -> Int {
    var current = nums[0]
    var maxi = nums[0]
    
    for i in 1..<nums.endIndex {
        current = max(nums[i], nums[i] + current)
        maxi = max(maxi, current)
    }
    
    return maxi
}

let nums = [5, 4, -1, 7, 8]
let result = maxSubArray(nums: nums)
print(result)


