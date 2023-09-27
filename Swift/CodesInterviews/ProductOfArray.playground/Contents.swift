import UIKit

func productExceptSelf(nums: [Int]) -> [Int] {
    let n = nums.count
    var prefixProduct = [Int](repeating: 1, count: n)
    
    for i in 1..<n {
        prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1]
    }
    
    var suffiProduct = 1
    
    for i in nums.indices.reversed()  {
        prefixProduct[i] = prefixProduct[i] * suffiProduct
        suffiProduct = suffiProduct * nums[i]
    }
    
    return prefixProduct
}

let nums = [1, 2, 3, 4]
let result = productExceptSelf(nums: nums)
print(result)
