package org.example.interviews;

import java.util.HashMap;
import java.util.Hashtable;

public class FirstRepeatingCharacter {

    public char firstRepeatingCharacter(String str){
        // your code here
        HashMap<Character, Boolean> visited = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (visited.containsKey(ch)) {
                return ch;
            } else {
                visited.put(ch, true);
            }
        }

        return '\0';
    }


    public static void main(String[] args) {
        FirstRepeatingCharacter first = new FirstRepeatingCharacter();
        String input = "abcdefgab";
        char firstRepeating = first.firstRepeatingCharacter(input);
        if (firstRepeating != '\0') {
            System.out.println("El primer carácter repetido es: " + firstRepeating);
        } else {
            System.out.println("No hay caracteres repetidos.");
        }
    }
}
