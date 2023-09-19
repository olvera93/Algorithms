package org.example.arrays;

public class ReverseStringProblem {

    public String reverseString(String word) {

        StringBuilder wordReverse = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--){
            wordReverse.append(word.charAt(i));
        }

        System.out.println(wordReverse);

        String[] array = word.split(" ");
        StringBuilder newWord = new StringBuilder();

        for (String s : array) {
            StringBuilder sb = new StringBuilder(s);
            String aux = sb.reverse().toString();
            newWord.append(aux.concat(" "));
        }

        return newWord.toString();
    }
}
