package org.example;

public class Tarea1 {
    public static void main(String[] args) {
        // Llama al método findDifference con un ejemplo de array de enteros
        int[] array = {4, 9, 2, 7, 5};
        System.out.println("Diferencia entre el valor máximo y mínimo: " + findDifference(array)); // No es necesario usar Tarea1.findDifference
    }

    public static int findDifference(int[] arr) {
        // Verifica que el array tenga al menos un elemento
        if (arr.length < 1) {
            System.out.println("El array debe tener al menos un elemento.");
            return 0; // Se puede manejar este caso de error de la manera que desees
        }

        int max = arr[0]; // Inicializar el máximo con el primer elemento del array
        int min = arr[0]; // Inicializar el mínimo con el primer elemento del array

        // Encontrar el máximo y el mínimo en el array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Calcular y devolver la diferencia entre el máximo y el mínimo
        return max - min;
    }
}
