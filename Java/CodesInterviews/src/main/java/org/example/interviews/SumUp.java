package org.example.interviews;

import java.util.HashMap;

public class SumUp {

    public boolean findPair(int[] arr, int k) {

        int left = 0;
        int right = arr.length - 1;

        while( left < right) {
            if (arr[left] + arr[right] == k ) {
                return true;
            } else if (arr[left] + arr[right] < k) {
                left++;
            } else {
                right --;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        SumUp sum = new SumUp();
        int[] arr = {5, 1, 12, 7, 3, 9};
        System.out.println(sum.findPair(arr, 18));


    }

}
