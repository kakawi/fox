package com.hlebon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    public String anagramString(String input) {
        String[] splittedStrings = input.split(" ");
        List<String> result = new ArrayList<>();
        for (String splittedString : splittedStrings) {
            result.add(anagramWord(splittedString));
        }
        return result.stream().collect(Collectors.joining(" "));
    }

    private String anagramWord(String word) {
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        char tempChar;
        while (start < end) {
            if (isNoLetter(chars[start])) {
                start++;
                continue;
            }
            if (isNoLetter(chars[end])) {
                end--;
                continue;
            }
            tempChar = chars[start];
            chars[start] = chars[end];
            chars[end] = tempChar;
            start++;
            end--;
        }
        return new String(chars);
    }

    private static boolean isNoLetter(char character) {
        return !Character.isLetter(character);
    }

}
