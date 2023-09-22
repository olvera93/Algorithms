import UIKit

func containsNearbyDuplicate(nums: [Int], k: Int) -> Bool {
    
    var map = [Int: Int]()
    
    for i in 0..<nums.count {
        if (map[nums[i]] != nil) {
            if i-(map[nums[i]] ?? 0) <= k {
                return true
            }
        }
        map[nums[i]] = i
        
    }
    return false
}

let nums = [1, 2, 3, 1, 2, 3]
let result = containsNearbyDuplicate(nums: nums, k: 2)
print(result)
