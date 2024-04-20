package org.ironhack.lab104;

public class TaskOne {
    public static int getMaxMinDifference(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException("Array length must be at least 1");
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        return max - min;
    }
}