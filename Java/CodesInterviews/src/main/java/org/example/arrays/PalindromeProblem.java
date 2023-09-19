package org.example.arrays;

public class PalindromeProblem {


    public boolean isPalindrome(String word) {
        word = word.replaceAll("\\s+", "").toLowerCase();

        int wordLength = word.length();

        for (int i = 0; i < wordLength / 2; i++) {
            if (word.charAt(i) != word.charAt(wordLength - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    public boolean isPalindromeNumber(int number) {

        String valueInt = String.valueOf(number);
        StringBuilder sb = new StringBuilder(valueInt);
        StringBuilder rev = sb.reverse();
        return rev.toString().equalsIgnoreCase(valueInt);
    }

}
