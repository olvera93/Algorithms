
func maxArea(_ height: [Int]) -> Int {
    var maxArea = 0
    var l = 0
    var r = height.count-1
    
    while(l < r) {
        maxArea = max(maxArea, min(height[l], height[r]) * (r - l))
        if (height[l] < height[r]) {
            l += 1
        } else {
            r -= 1
        }
    }
    return maxArea
}

var height = [1,8,6,2,5,4,8,3,7]
var result = maxArea(height)
print(result)
