package org.example.interviews;

import java.util.HashMap;

public class FindTheDuplicate {

    public int findDuplicate(int[] arr) {
        HashMap<Integer, Boolean> visited = new HashMap<>();

        for (int num: arr) {
            if (visited.containsKey(num)) {
                return num;
            } else {
                visited.put(num, true);
            }

        }

        return 0;

    }

    public static void main(String[] args) {
        FindTheDuplicate duplicate = new FindTheDuplicate();
        int[] arr = {4, 2, 1, 3, 1, 2, 2};
        System.out.println(duplicate.findDuplicate(arr));
    }

}
