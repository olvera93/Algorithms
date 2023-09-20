package org.example.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        if (nums.length == 0) return false;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    } // TC: O(n), SC: O(n)

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 5, 3, 1, 2};
        ContainsDuplicate c = new ContainsDuplicate();
        System.out.println(c.containsDuplicate(nums));
    }
}
