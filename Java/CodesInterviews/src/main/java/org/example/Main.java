package org.example;

import org.example.arrays.AnagramProblem;
import org.example.arrays.ReverseArrayProblem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Reverse Array Problem");

        ReverseArrayProblem reverseArrayProblem = new ReverseArrayProblem();
        int[] nums = new int[]{1,2,3,5,6,7};
        System.out.println(Arrays.toString(reverseArrayProblem.solve(nums)));
        System.out.println();

        System.out.println("Anagram Problem");
        AnagramProblem anagramProblem = new AnagramProblem();
        String s1 = "restful";
        String s2 = "fluster";
        System.out.println(anagramProblem.solve(s1.toCharArray(), s2.toCharArray()));
        System.out.println();

    }
}