package org.example.interviews;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i +1; j < n ;j++) {
                if (nums[i] == nums[j]) count ++;
            }

            if (count > n/2) return nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
       MajorityElement majorityElement = new MajorityElement();
        int [] nums ={2,2,1,1,1,2,2};

        System.out.println(majorityElement.majorityElement(nums));
    }
}
