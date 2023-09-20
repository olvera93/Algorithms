import UIKit

func containsDuplicate(nums: [Int]) -> Bool {
    if nums.isEmpty {
        return false
    }
    
    var setNumber = Set<Int>()
    
    for num in nums {
        if setNumber.contains(num) {
            return true
        } else {
            setNumber.insert(num)
        }
    }
    
    return false
    
}

let nums = [1,1,1,3,3,4,3,2,4,2]
let result = containsDuplicate(nums: nums)
print(result)
