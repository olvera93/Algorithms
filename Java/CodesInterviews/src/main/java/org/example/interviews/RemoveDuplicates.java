package org.example.interviews;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

    public int[] removeDuplicates(int[] arr) {

        if (arr.length == 0) return new int[0];

        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        for (int num : arr) {
            set.add(num);
        }
        int[] notDuplicatesArr = new int[set.size()];
        for (int num: set) {
            notDuplicatesArr[index++] = num;
        }

        return notDuplicatesArr;
    }

    public static void main(String[] args) {
        RemoveDuplicates remove = new RemoveDuplicates();
        int[] arr = {2, 3, 3, 5, 5, 5, 7, 7, 9, 10, 10};
        int[] result = remove.removeDuplicates(arr);

        System.out.println("Array después de eliminar duplicados:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }


}
