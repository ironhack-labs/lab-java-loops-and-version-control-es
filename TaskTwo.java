package org.ironhack.lab104;

public class TaskTwo {
    public static void printMinAndSecondMin(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array length must be at least 2");
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Second minimum: " + secondMin);
    }
}