package com.timbuchalka;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(17));
        System.out.println(isPrime(11));
        System.out.println(isPrime(29));
    }

    static boolean isPrime(int num) {
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
