package com.timbuchalka;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(16));
        System.out.println(powerOfTwo(32));
        System.out.println(powerOfTwo(64));
        System.out.println(powerOfTwo(14));
    }

    static boolean powerOfTwo(int num) {
        if (num == 0)
            return false;
        return ((num & (num - 1)) == 0);
    }
}
