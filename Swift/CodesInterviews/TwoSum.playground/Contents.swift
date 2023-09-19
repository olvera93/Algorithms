import UIKit
import Foundation


func twoSum(nums: [Int], target: Int) -> [Int] {
    
    var ans: [Int] = []
    var map: [Int: Int] = [:]
    
    for i in 0..<nums.count {
        let diff = target - nums[i]
        if let index = map[diff] {
            ans.append(index)
            ans.append(i)
        } else {
            map[nums[i]] = i
        }
    }
    return ans
}

let nums1 = [2, 7, 11, 15]
var result = twoSum(nums: nums1, target: 9)
print(result)
