func moveZeroes(_ nums: inout [Int]) {
    var zeroIndex = 0
    let n = nums.count
    
    for nonZeroIndex in 0..<n {
        if nums[nonZeroIndex] != 0 {
            nums[zeroIndex] = nums[nonZeroIndex]
            zeroIndex += 1
        }
    }
    
    for i in zeroIndex..<n {
        nums[i] = 0
    }
    
    print(nums)
}

var nums = [0, 1, 0, 3, 12]
moveZeroes(&nums)
