package org.example;

import org.example.arrays.*;
import org.example.collections.HashMapProblem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Reverse Array Problem");

        ReverseArrayProblem reverseArrayProblem = new ReverseArrayProblem();
        int[] nums = new int[]{1, 2, 3, 5, 6, 7};
        Arrays.sort(nums);
        for (int n:
             nums) {
            System.out.println(n);
        }
        System.out.println(Arrays.toString(reverseArrayProblem.solve(nums)));
        System.out.println();

        System.out.println("Anagram Problem");
        AnagramProblem anagramProblem = new AnagramProblem();
        String s1 = "restful";
        String s2 = "fluster";
        System.out.println(anagramProblem.solve(s1.toCharArray(), s2.toCharArray()));
        System.out.println();

        System.out.println(countWord("abcabcbb"));

        ReverseStringProblem r = new ReverseStringProblem();
        System.out.println("Reverse : " + r.reverseString("Welcome to this Javascript Guide!"));

        PalindromeProblem p = new PalindromeProblem();
        System.out.println("Palindrome: " + p.isPalindrome("A ti no, bonita"));
        System.out.println("Palindrome Number: " + p.isPalindromeNumber(121));

        int arr[] = {92, 15, 46, 47, 94, 89, 94, 52, 86, 36, 100, 94, 89};
        FindSecondHighestNumber f = new FindSecondHighestNumber();
        System.out.println("Second Highest Number: " + f.secondHighest(arr));

        HashMapProblem h = new HashMapProblem();
        List<String> names = new ArrayList<>(
                Arrays.asList("Java", "JavaScript", "Python", "C", "Ruby", "Java", "C", "Python", "Java")
        );

        List<String> people = new ArrayList<>(
                Arrays.asList("Mario", "Maria", "Miguel", "Marta", "Paco", "Pablo"));
        h.upperCaseFirstLetter(people);
        System.out.println("Count Word Repeat: " + h.countWordRepeat(names));
        System.out.println("Count Vowels: " + h.countVowels(names));
        System.out.println("Count Vowels 2: " + h.countVowels2(names));
    }

    public static int countWord(String word) {
        //  Longest Substring Without Repeating Characters
        //  Given a string s, find the length of the longest substring without repeating characters.
        //  Input: s = "abcabcbb"
        //  Output: 3
        int start = 0;
        int end = 0;
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();

        while (end < word.length()) {
            if (!charSet.contains(word.charAt(end))) {
                charSet.add(word.charAt(end));
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                charSet.remove(word.charAt(start));
                start++;
            }
        }

        return maxLength;


    }


}