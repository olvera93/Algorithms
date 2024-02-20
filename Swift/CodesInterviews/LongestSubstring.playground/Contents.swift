func lengthOfLongestSustring(_ s: String) -> Int {
    if s.count <= 1  { return s.count }
    
    var m = [Character: Int]()
    var ans = 0
    var left = 0
    var right = 0
    
    for i in 0..<s.count {
        let index = s.index(s.startIndex, offsetBy: i)
        let char = s[index]
        
        if let val = m[char] {
            left = max(left, val + 1)
        }
        
        right += 1
        m[char] = i
        ans = max(right - left, ans)
    }
        
    return ans
    
}

var result = lengthOfLongestSustring("abccde")
print(result)
