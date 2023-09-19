package org.example.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapProblem {

    public String countWordRepeat(List<String> words) {

        Map<String, Integer> counter = new HashMap<String, Integer>();

        words.forEach(
                word -> counter.put(word, counter.containsKey(word) ? counter.get(word) + 1 : 1)
        );

        return counter.toString();
    }

    public void upperCaseFirstLetter(List<String> words) {
        words.stream().filter(w -> w.contains("M")).map(String::toUpperCase).forEach(System.out::println);
    }

    public static Map<String, List<Character>> countVowels(List<String> words) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');

        Map<String, List<Character>> vowelCounts = new HashMap<>();

        words.forEach(
                word -> vowelCounts.put(word, word.chars().mapToObj(c -> (char) c).filter(vowels::contains).collect(Collectors.toList()))
        );

        return vowelCounts;
    }

    public Map<String, Integer> countVowels2(List<String> words) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');

        Map<String, Integer> vowelCounts = new HashMap<>();
        words.forEach(
                w -> vowelCounts.put(w, (int) w.chars().mapToObj(c -> (char) c).filter(vowels::contains).count())
        );


        return vowelCounts;

    }

}
