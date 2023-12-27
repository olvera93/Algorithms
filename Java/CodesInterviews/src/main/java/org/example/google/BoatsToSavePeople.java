package org.example.google;

import java.util.Arrays;

public class BoatsToSavePeople {

    public Integer numRescueBoats(int[] people, int limit) {
        int[] sortedPeople = Arrays.stream(people).sorted().toArray();
        int smallest = 0;
        int biggest = sortedPeople.length - 1;
        int boats = 0;

        while (biggest >= smallest) {
            if (sortedPeople[smallest] + sortedPeople[biggest] <= limit) {
                biggest -= 1;
                smallest += 1;
            } else {
                biggest -= 1;
            }
            boats += 1;
        }

        return boats;
    }

    public static void main(String[] args) {
        BoatsToSavePeople boats = new BoatsToSavePeople();
        int [] people = {3, 5, 3, 4};
        int limit = 5;
        System.out.println(boats.numRescueBoats(people, limit));
    }
}
