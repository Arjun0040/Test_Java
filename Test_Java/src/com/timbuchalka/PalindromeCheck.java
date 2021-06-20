package com.timbuchalka;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Enter a num: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int num) {
        //10101
        String strNum = String.valueOf(num);
        int left = 0, right  = strNum.length() - 1;
        while (left < right) {
            if (strNum.charAt(left) != strNum.charAt(right))
                return false;
            left += 1;
            right -=1 ;
        }
        return true;
    }
}
