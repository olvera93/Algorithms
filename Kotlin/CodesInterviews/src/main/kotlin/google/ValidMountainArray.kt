package google

class ValidMountainArray {

    fun validMountainArray(A: Array<Int>): Boolean {

        var i = 1

        while (i < A.size && A[i] > A[i - 1]) {
            i += 1
        }

        if (i == 1 || i == A.size) {
            return false
        }

        while (i < A.size && A[i] < A[i - 1]) {
            i += 1
        }

        return i == A.size;
    }
}

fun main() {
    val validMountainArray = ValidMountainArray()
    val array = arrayOf(0, 3, 2, 1)
    println(validMountainArray.validMountainArray(array))
}