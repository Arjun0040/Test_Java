package com.timbuchalka;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("Hi How are you"));
    }

    static String removeWhiteSpaces(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();

    }
}
