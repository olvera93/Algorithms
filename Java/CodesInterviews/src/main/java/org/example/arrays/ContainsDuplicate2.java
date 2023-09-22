package org.example.arrays;

import java.util.HashMap;

public class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - (map.get(nums[i])) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        ContainsDuplicate2 c = new ContainsDuplicate2();
        System.out.println(c.containsNearbyDuplicate(nums, 2));
    }
}
