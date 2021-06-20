package com.timbuchalka;

public class PyramidPattern {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int rows) {
        //1st row -> 1
        //2nd row -> 3
        //3rd row -> 5
        //4th row -> 7

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i + (i -1); j++) {
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
