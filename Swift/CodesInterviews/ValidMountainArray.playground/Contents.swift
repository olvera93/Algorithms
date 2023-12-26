
func validMountainArray(_ A: [Int]) -> Bool {
    
    var i = 1
    
    while i < A.count && A[i] > A[i-1] {
        i += 1
    }
    if i == 1 || i == A.count {
        return false
    }
    
    while i < A.count && A[i] < A[i-1] {
        i += 1
    }
    
    return i == A.count
}

var array = [0,3,2,1]
var result = validMountainArray(array)
print(result)
