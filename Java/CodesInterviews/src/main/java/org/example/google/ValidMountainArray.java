package org.example.google;

public class ValidMountainArray {

    public Boolean validMountainArray(int [] array) {
        int i = 1;

        while(i < array.length && array[i] > array[i - 1]) {
            i += 1;
        }

        if (i == 1 || i == array.length){
            return false;
        }

        while (i < array.length && array[i] < array[i - 1]) {
            i += 1;
        }

        return i == array.length;

    }

    public static void main(String[] args) {
        int [] array = {0, 3, 2, 1};
        ValidMountainArray validMountainArray = new ValidMountainArray();
        System.out.println(validMountainArray.validMountainArray(array));
    }




}
