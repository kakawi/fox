package com.hlebon;

public class Main {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String result = anagram.anagramString("a1bcd efg!h");
        String result2 = anagram.anagramString("q3we1rt2y");
        System.out.println(result);
        System.out.println(result2);
    }
}
