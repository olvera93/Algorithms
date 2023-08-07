package org.example.arrays;

public class ReverseArrayProblem {

    // this is the algorithm that reverses the input array (nums)
    public int[] solve(int[] nums) {

        // hint: define 2 pointers (pointing to the last and first item of the array) and make a single iteration ...
        int left = 0;
        int right = nums.length-1;

        while(left < right) {
            swap(nums,left, right);
            left ++;
            right --;

        }


        return nums;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}
