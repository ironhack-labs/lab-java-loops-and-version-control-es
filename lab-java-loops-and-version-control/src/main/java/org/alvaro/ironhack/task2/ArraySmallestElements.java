package org.alvaro.ironhack.task2;

import org.alvaro.ironhack.util.UserInputHandler;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Esta clase contiene métodos para encontrar y mostrar
 * los dos elementos más pequeños de un arreglo de enteros.
 */
public class ArraySmallestElements {

    /**
     * Método principal que inicia el proceso de búsqueda y
     * muestra los elementos más pequeños y segundos más pequeños.
     */
    public static void start() {
        String userResponse;
        do {
            findAndPrintSmallestAndSecondSmallest();
            userResponse = UserInputHandler.getString("¿Desea volver a ejecutar el programa? (S/Si / N/No)");
        } while (userResponse.equalsIgnoreCase("S") ||
                userResponse.equalsIgnoreCase("SI"));
    }

    /**
     * Encuentra y muestra los elementos más pequeños y segundos más pequeños
     * de un arreglo de enteros proporcionado por el usuario.
     */
    private static void findAndPrintSmallestAndSecondSmallest() {
        int[] numbersUser = fillArray();
        // Eliminación de números repetidos
        int[] numbers = removeDuplicates(numbersUser);
        Integer secondSmallest = null;
        Integer smallest = null;

        for (int num : numbers) {
            if (smallest == null || num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num != smallest && (secondSmallest == null || num < secondSmallest)) {
                secondSmallest = num;
            }
        }

        displayResults(numbers, smallest, secondSmallest);
    }

    /**
     * Elimina los elementos duplicados de un arreglo de enteros.
     *
     * @param numbers El arreglo de enteros que puede contener elementos duplicados.
     * @return Un nuevo arreglo que contiene solo elementos únicos.
     */
    public static int[] removeDuplicates(int[] numbers){
        Set<Integer> uniqueElements = new HashSet<>();
        for (Integer a : numbers) {
            uniqueElements.add(a);
        }

        // Asegura que haya al menos 3 elementos únicos en el conjunto
        if (uniqueElements.size() < 3) {
            addMissingNumbers(uniqueElements);
        }

        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (Integer a : uniqueElements) {
            result[index++] = a;
        }
        return result;
    }

    /**
     * Rellena el conjunto con números faltantes para asegurar que tenga al menos 3 elementos únicos.
     *
     * @param uniqueElements El conjunto de elementos únicos.
     */
    private static void addMissingNumbers(Set<Integer> uniqueElements) {
        Random random = new Random();
        // Genera números aleatorios hasta que haya al menos 3 elementos únicos en el conjunto
        while (uniqueElements.size() < 3) {
            // Genera un número aleatorio en el rango de 900 a 1000
            int number = random.nextInt(100) + 900;
            uniqueElements.add(number);
        }
        System.out.println("Se han añadido números adicionales al arreglo debido a la falta de elementos únicos.");
    }

    /**
     * Muestra en la consola el arreglo original y los valores más pequeños y segundos más pequeños.
     *
     * @param numbers       El arreglo de enteros.
     * @param smallest      El valor más pequeño encontrado.
     * @param secondSmallest El segundo valor más pequeño encontrado.
     */
    private static void displayResults(int[] numbers, Integer smallest, Integer secondSmallest) {
        System.out.println("Del arreglo: " + Arrays.toString(numbers));
        System.out.println("El número más pequeño es: " + smallest +
                "\nEl segundo número más pequeño es: " + secondSmallest);
    }

    /**
     * Solicita al usuario que ingrese los elementos del arreglo.
     * Inicializa y llena el arreglo con los números proporcionados por el usuario.
     *
     * @return El arreglo de enteros ingresado por el usuario.
     */
    private static int[] fillArray() {
        int arraySize;
        do {
            arraySize = UserInputHandler.getNumber("Ingrese el tamaño del arreglo (tiene que ser mayor o igual a 2)");
        } while (arraySize < 2);

        int[] numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = UserInputHandler.getNumber("Ingrese el número en la posición " + (i + 1));
        }
        return numbers;
    }
}
