package com.timbuchalka;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 5, 4, 3, 3, 2, 5, 6, 4, 6, 7, 9};
        int[] newArr = removeDuplicates(arr);

        for (int num : newArr) {
            System.out.print(num +" ");
        }

    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> distinct = new HashSet<>();
        for (int num : arr) {
            distinct.add(num);
        }

        int[] array = new int[distinct.size()];
        int i = 0;
        for (int num : distinct) {
            array[i] = num;
            i += 1;
        }

        return array;

    }
}
