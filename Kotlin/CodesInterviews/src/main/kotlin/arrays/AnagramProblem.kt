package arrays

import java.util.Arrays

class AnagramProblem {

    fun solve(s1: CharArray, s2: CharArray): Boolean {
        // you get the s1 and s2 strings (char sequences) and you have to return true (if they are anagram) or false otherwise
        if (s1.size != s2.size) return false

        // sort the letters of the strings
        // O(NlogN) this is the "bottleneck" of the algorithm
        Arrays.sort(s1)
        Arrays.sort(s2)

        // consider all the letters one by one and we have to
        // compare these letters
        // O(N) but the overall running time is O(NlogN) + O(N) = O(NlogN)
        for (i in s1.indices) {
            if (s1[i] != s2[i]) return false
        }

        return true
    }

}
