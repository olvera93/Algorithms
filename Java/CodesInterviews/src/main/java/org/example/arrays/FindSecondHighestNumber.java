package org.example.arrays;

public class FindSecondHighestNumber {

    public int secondHighest(int[] array) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int j: array) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax && j != max) {
                secondMax = j;
            }

        }

        return secondMax;

    }
}
