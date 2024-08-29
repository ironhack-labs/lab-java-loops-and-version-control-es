package org.alvaro.ironhack;

import org.alvaro.ironhack.task1.ArrayValueDifference;
import org.alvaro.ironhack.task2.ArraySmallestElements;
import org.alvaro.ironhack.task3.MathExpressionCalculator;
import org.alvaro.ironhack.util.UserInputHandler;

public class Main {

    /**
     * Muestra el menú de opciones al usuario.
     */
    private static void printMenu() {
        System.out.println("Seleccione una tarea:");
        System.out.println("1. Tarea 1: Diferencia de Valores en un Arreglo");
        System.out.println("2. Tarea 2: Elementos Más Pequeños del Arreglo");
        System.out.println("3. Tarea 3: Cálculo de Expresión Matemática");
        System.out.println("4. Salir");
    }

    public static void main(String[] args) {
        int userChoice;
        do {
            printMenu();
            userChoice = UserInputHandler.getNumber("Ingrese el número de la opción deseada");

            switch (userChoice) {
                case 1:
                    ArrayValueDifference.start();
                    break;
                case 2:
                    ArraySmallestElements.start();
                    break;
                case 3:
                    MathExpressionCalculator.start();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }

        } while (userChoice != 4);

        UserInputHandler.close();
    }
}
