package org.example.facebook;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        int n = nums.length;

        for (int nonZeroIndex = 0; nonZeroIndex < n; nonZeroIndex++) {
            if (nums[nonZeroIndex] != 0) {
                nums[zeroIndex] = nums[nonZeroIndex];
                zeroIndex++;
            }
        }

        for (int i = zeroIndex; i < n; i++) {
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
    }
}


