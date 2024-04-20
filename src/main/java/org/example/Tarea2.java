package org.example;

public class Tarea2 {
    public static void main(String[] args) {
        int[] array = {4, 9, 2, 7, 5};
        findSmallestAndSecondSmallest(array);
    }

    public static void findSmallestAndSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("El array debe tener al menos dos elementos.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("El elemento más pequeño es: " + smallest);
        System.out.println("El segundo elemento más pequeño es: " + secondSmallest);
    }
}
