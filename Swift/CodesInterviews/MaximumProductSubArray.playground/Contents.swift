import UIKit

func maxProduct(nums: [Int]) -> Int {
    var ans = nums[0]
    var mini = 1
    var maxi = 1
    
    for i in 0..<nums.endIndex {
        if nums[i] == 0 {
            mini = 1
            maxi = 1
            ans = max(ans, nums[i])
        }
        
        var tmp = mini
        mini = min(nums[i], min(nums[i] * mini, nums[i] * maxi))
        maxi = max(nums[i], max(nums[i] * tmp, nums[i] * maxi))
        ans = max(ans, maxi)
    }
    
    return ans
}

let nums = [5, 4, -1, 7, 8]
let result = maxProduct(nums: nums)
print(result)
