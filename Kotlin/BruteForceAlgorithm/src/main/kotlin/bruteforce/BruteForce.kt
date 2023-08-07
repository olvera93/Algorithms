package bruteforce

import java.util.Arrays

/**
 * Brute for Algorithm<BR>
 *     It will search for s pattern into an array if the pattern if found it will return the index of the array
 *     where the first letter of the pattern was found
 *     If not match is found it will return -1
 */
class BruteForce {

    /**
     * This method searched for the pattern into an array and return the index of the first char that matches.<BR>
     *     If no match is found -1 is returned
     * array = abcdef
     * pattern = def -> 4
     * @param array
     * @param pattern
     * @return
     */
    fun firstMatch(array: CharArray, pattern: CharArray): Int {
        for (i in 0..array.size - pattern.size ) {
            for (j in pattern.indices) {
                if (array[i + j] != pattern[j]) break
                if (j == pattern.size-1) return i;
            }
        }
        return -1
    }

    /**
     * This method searches for a pattern into an array and return an array of int
     * with the indexes of the elements found
     * @param array
     * @param pattern
     * @return
     */
    fun everyMatch(array: CharArray, pattern: CharArray): IntArray {
        val found = intArrayOf(array.size)
        Arrays.fill(found, -1)
        var index = 0
        for (i in 0..array.size - pattern.size) {
            for (j in pattern.indices) {
                if (array[i + j] != pattern[j]) break
                if (j == pattern.size-1) {
                    found[index++] = i
                }
            }
        }
        return found
    }

}