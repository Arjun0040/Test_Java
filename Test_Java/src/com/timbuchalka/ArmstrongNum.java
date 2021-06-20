package com.timbuchalka;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {


            int num = 153;
        System.out.println(isArmstrongNum(num));

    }

    public static boolean isArmstrongNum(int num) {
        int sum = 0;
        int copy  = num;
        while (num > 0) {
            int lastDigit = getLastDigit(num);
            int cubeLastDigit = cubeLastDigit(lastDigit);
            sum += cubeLastDigit;
            num /= 10;
        }

        return sum == copy;

    }

    static int getLastDigit(int num) {
        return num % 10;
    }

    static int cubeLastDigit(int lastDigit) {
        return lastDigit * lastDigit * lastDigit;
    }
}



