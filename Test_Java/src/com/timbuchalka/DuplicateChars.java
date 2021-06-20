package com.timbuchalka;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {
    //Aabcdeeffgh
    public static void main(String[] args) {
        duplicateChars("Aabcdeeffgh");
    }

    static void duplicateChars(String str) {
        String newString = str.toLowerCase();
        Map<Character, Integer> dup = new HashMap<>();
        for (int i = 0; i < newString.length(); i++) {
            dup.put(newString.charAt(i), dup.getOrDefault(newString.charAt(i), 0) + 1);
        }
        printDuplicateChars(dup);
    }

    static void printDuplicateChars(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() +" ");
            }
        }
    }
}
