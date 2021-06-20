package com.timbuchalka;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hi How are you";
        System.out.println(reverseWords(sentence));
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        return sb.toString();
    }
}
