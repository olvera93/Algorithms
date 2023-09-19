package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; // [nums[i], diff]
            if (!map.containsKey(diff)) {
                map.put(nums[i], i );
            } else {
                ans[0] = i;
                ans[1] = map.get(diff);
            }
        }
        return ans;
    } // TC: O(n), SC: O(n)

    public static void main(String[] args) {

        TwoSum sum = new TwoSum();
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(sum.twoSum(nums, 9)));

    }


}
