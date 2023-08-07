package org.example.bruteforce;

import java.util.Arrays;

/**
 * Brute for Algorithm<BR>
 *     It will search for s pattern into an array if the pattern if found it will return the index of the array
 *     where the first letter of the pattern was found
 *     If not match is found it will return -1
 */
public class BruteForce {

    /**
     * This method searched for the pattern into an array and return the index of the first char that matches.<BR>
     *     If no match is found -1 is returned
     * array = abcdef
     * pattern = def -> 4
     * @param array
     * @param pattern
     * @return
     */
    public int firstMatch(char[] array, char[] pattern) {
        for (int i = 0; i <= array.length-pattern.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (array[i+j] != pattern[j]) break;
                if (j == pattern.length-1) return i;
            }
        }
        return -1;
    }

    /**
     * This method searches for a pattern into an array and return an array of int
     * with the indexes of the elements found
     * @param array
     * @param pattern
     * @return
     */
    public int[] everyMatch(char[] array, char[] pattern) {
        int[] found = new int[array.length];
        Arrays.fill(found, -1);
        int index = 0;
        for (int i = 0; i <= array.length-pattern.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (array[i+j] != pattern[j]) break;
                if (j == pattern.length-1) {
                    found[index++] = i;
                }
            }
        }
        return found;
    }

}
