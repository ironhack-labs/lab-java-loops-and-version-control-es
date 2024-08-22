package org.alvaro.ironhack.task1;

import org.alvaro.ironhack.util.UserInputHandler;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase proporciona funcionalidades para calcular la diferencia entre
 * el valor máximo y el valor mínimo en un arreglo de enteros.
 * También permite al usuario ingresar los datos del arreglo y ejecutar
 * el cálculo varias veces si lo desea.
 */
public class ArrayValueDifference {
    private final static Scanner entrada = new Scanner(System.in);

    /**
     * Método principal que inicia el programa.
     * Permite al usuario ejecutar el cálculo de la diferencia y decidir
     * si desea realizar otra ejecución del programa.
     */
    public static void start() {
        String userResponse;
        do {
            calculateValueDifference();
            userResponse = UserInputHandler.getString("¿Desea volver a ejecutar el programa? (S/Si / N/No)");
        } while (userResponse.equalsIgnoreCase("S") ||
                userResponse.equalsIgnoreCase("SI"));
    }

    /**
     * Solicita al usuario que ingrese los elementos del arreglo.
     * Inicializa y llena el arreglo con los números proporcionados por el usuario.
     *
     * @return El arreglo de enteros ingresado por el usuario.
     */
    private static int[] fillArray() {
        int arraySize = UserInputHandler.getNumber("Ingrese el tamaño del arreglo");
        int[] numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = UserInputHandler.getNumber("Ingrese el número en la posición " + (i + 1));
        }
        return numbers;
    }

    /**
     * Calcula y muestra la diferencia entre el valor máximo y mínimo en el arreglo de enteros.
     * También imprime el arreglo ingresado, el número mayor y el número menor.
     */
    private static void calculateValueDifference() {
        int[] numbers = fillArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
            if (max < number) {
                max = number;
            }
        }
        displayResults(numbers, max, min);
    }

    /**
     * Muestra los resultados del cálculo: el arreglo ingresado, el número mayor y el número menor,
     * y luego imprime la diferencia entre el valor máximo y mínimo.
     *
     * @param numbers El arreglo de enteros ingresado por el usuario.
     * @param max El valor máximo en el arreglo.
     * @param min El valor mínimo en el arreglo.
     */
    private static void displayResults(int[] numbers, int max, int min) {
        System.out.println("El arreglo ingresado es: " + Arrays.toString(numbers));
        System.out.println("Número mayor: " + max);
        System.out.println("Número menor: " + min);
        printResult(min, max);
    }

    /**
     * Imprime la diferencia entre el valor máximo y mínimo.
     * Indica si no hay diferencia cuando los valores son iguales.
     *
     * @param min El valor mínimo en el arreglo.
     * @param max El valor máximo en el arreglo.
     */
    private static void printResult(int min, int max) {
        if (min == max) {
            System.out.println("Los números son iguales, no hay diferencia.");
        } else {
            int result = max - min;
            System.out.println("La diferencia es: " + result);
        }
    }
}
