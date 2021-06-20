package com.timbuchalka;

import java.util.HashMap;
import java.util.Map;

public class OddNumOfTimes {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2, 3, 3, 4, 4, 1, 1, 5, 5};
        System.out.println(oddCountedNums(array));
    }

    public static int oddCountedNums(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            counts.put(arr[i], counts.getOrDefault(arr[i],0 ) +1);
        }
        return oddCountedNum(counts);
    }

    static int oddCountedNum(Map<Integer, Integer> counts) {
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1)
                return entry.getKey();
        }
        return -1;
    }
}
