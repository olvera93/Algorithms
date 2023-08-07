package org.example;

import org.example.bruteforce.BruteForce;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BruteForce b = new BruteForce();
        String s = "academy";
        char[] array = s.toCharArray();
        System.out.println(b.firstMatch(array, new char[]{'a', 'd'}));
        System.out.println(Arrays.toString(b.everyMatch(array, new char[]{'a', 'd'})));

    }
}