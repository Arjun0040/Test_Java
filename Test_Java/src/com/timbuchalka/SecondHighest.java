package com.timbuchalka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        int[] num = {10, 12, 30, 20, 50};
        System.out.println(secondHighestNum(num));
    }

    static int secondHighestNum(int[] array) {
        int highest = getHighest(array);
        int[] nums = getCopyOf(array, highest);
        return getHighest(nums);
    }

    static int getHighest(int[] array) {
        int highest = array[0];
        for (int i = 1; i < array.length; i++) {
            highest = Math.max(highest, array[i]);
        }
        return highest;
    }


    static int[] getCopyOf(int[] array, int highest) {
        int[] nums = new int[array.length - 1];
        int i = 0;
        for (int num : array) {
            if (num != highest)
                nums[i++] = num;
        }
        return nums;
    }
}
