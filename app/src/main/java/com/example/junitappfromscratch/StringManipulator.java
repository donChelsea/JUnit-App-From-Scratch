package com.example.junitappfromscratch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class StringManipulator {
    private static StringManipulator ourInstance;

    public StringManipulator() {}

    public StringManipulator getInstance() {
        if (ourInstance == null) {
            ourInstance = new StringManipulator();
        }
        return ourInstance;
    }

    public boolean isLessThan10(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input must be a string object");
        }
        return input.length() < 10;
    }

    public boolean isOddLength(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input must be a string object");
        }
        return input.length() % 2 != 0;
    }

/*    public String zipperWords(String first, String second) {
        List<Character> zipperedChars = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < second.length(); j++) {
                zipperedChars.add(first.charAt(i));
                zipperedChars.add(second.charAt(j));
            }
        }
        for (char letter: zipperedChars) {
            stringBuilder.append(letter);
        }
        return stringBuilder.toString();
    }*/

    public String deconstructedWord(String word) {
        if (word == null || word.length() < 1) {
            return "";
        }
        StringBuilder pulledVowels = new StringBuilder();
        StringBuilder pulledCons = new StringBuilder();
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                pulledVowels.append(word.charAt(i));
            } else {
                pulledCons.append(word.charAt(i));
            }
        }
        return pulledCons + " " + pulledVowels;
    }

    public int wordSum(String first, String second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Must enter string values");
        }
        return first.length() + second.length();
    }

    public String longestWord(String[] words) {
        String longest = "";
        for (String word: words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public String[] wordSort(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        return words;
    }
}
