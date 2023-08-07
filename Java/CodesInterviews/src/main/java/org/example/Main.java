package org.example;

import org.example.arrays.ReverseArrayProblem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ReverseArrayProblem reverseArrayProblem = new ReverseArrayProblem();
        int[] nums = new int[]{1,2,3,5,6,7};
        System.out.println(Arrays.toString(reverseArrayProblem.solve(nums)));
    }
}