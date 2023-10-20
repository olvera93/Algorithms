package org.example.arrays;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], nums[i] + current);
            max = Math.max(max, current);
        }
        return max;
    } // TC: O(n), SC: O(n)

    public static void main(String[] args) {
        int[] nums = { 5, 4, -1, 7, 8 };
        MaximumSubArray max = new MaximumSubArray();
        System.out.println(max.maxSubArray(nums));

    }

}
