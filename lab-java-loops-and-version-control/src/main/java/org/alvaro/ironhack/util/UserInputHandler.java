package org.alvaro.ironhack.util;

import java.util.Scanner;

public class UserInputHandler {

    private static final Scanner entrada = new Scanner(System.in);

    /**
     * Solicita al usuario un número a través de un mensaje específico.
     * Valida que la entrada sea un número entero.
     *
     * @param message Mensaje a mostrar al usuario para la entrada.
     * @return El número entero ingresado por el usuario.
     */
    public static int getNumber(String message) {
        String numberInput;
        do {
            System.out.print(message + ": ");
            numberInput = entrada.nextLine();
        } while (!isNumeric(numberInput));
        return Integer.parseInt(numberInput);
    }

    /**
     * Verifica si la cadena proporcionada representa un número entero válido.
     *
     * @param numberInput La cadena que se va a verificar.
     * @return true si la cadena representa un número entero válido, false en caso contrario.
     */
    private static boolean isNumeric(String numberInput) {
        try {
            Integer.parseInt(numberInput);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("El número no es válido, por favor intente de nuevo.");
        }
        return false;
    }

    /**
     * Solicita al usuario una cadena a través de un mensaje específico.
     *
     * @param message Mensaje a mostrar al usuario para la entrada.
     * @return La cadena ingresada por el usuario.
     */
    public static String getString(String message) {
        System.out.print(message + ": ");
        return entrada.nextLine();
    }

    /**
     * Cierra el recurso Scanner.
     */
    public static void close() {
        if (entrada != null) {
            entrada.close();
        }
    }
}
