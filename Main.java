package org.ironhack.lab104;

public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        int result = TaskThree.calculateExpression(x, y);
        System.out.println("Result: " + result);

        int[] arr1 = {1, 2, 3, 4, 5};
        int diff1 = TaskOne.getMaxMinDifference(arr1);
        System.out.println("Difference between max and min of arr1: " + diff1);

        int[] arr2 = {2, 3, 1, 4, 5};
        TaskTwo.printMinAndSecondMin(arr2);
    }
}