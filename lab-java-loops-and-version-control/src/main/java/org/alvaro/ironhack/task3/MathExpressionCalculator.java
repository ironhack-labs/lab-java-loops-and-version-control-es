package org.alvaro.ironhack.task3;

import org.alvaro.ironhack.util.UserInputHandler;

/**
 * Esta clase calcula y muestra el resultado de una expresión matemática basada en dos variables.
 * La expresión es: x² + ((4y/5) - x)²
 */
public class MathExpressionCalculator {

    /**
     * Método principal que inicia el proceso de cálculo de la expresión.
     * Solicita al usuario los valores para las variables x e y, muestra el resultado
     * y pregunta si desea volver a ejecutar el programa.
     */
    public static void start() {
        String userResponse;
        do {
            collectNumbers();
            userResponse = UserInputHandler.getString("¿Desea volver a ejecutar el programa? (S/Si / N/No)");
        } while (userResponse.equalsIgnoreCase("S") ||
                userResponse.equalsIgnoreCase("SI"));
    }

    /**
     * Calcula el resultado de la expresión matemática: x² + ((4y/5) - x)²
     *
     * @param x El valor de la variable x.
     * @param y El valor de la variable y.
     */
    private static void calculateExpression(double x, double y) {
        // Calcula el término (4y/5) - x
        double term1 = (4 * y / 5) - x;
        // Calcula x²
        double term2 = Math.pow(x, 2);
        // Calcula ((4y/5) - x)²
        double term3 = Math.pow(term1, 2);
        // Suma los resultados
        double result = term2 + term3;
        System.out.printf("El resultado de la expresión x² + ((4y/5) - x)² donde x=%.1f y=%.1f es: %.2f%n", x, y, result);
    }

    /**
     * Solicita al usuario que ingrese los valores para las variables x e y,
     * y luego llama al método para calcular y mostrar el resultado de la expresión.
     */
    private static void collectNumbers() {
        double x = UserInputHandler.getNumber("Introduce la variable 'X'");
        double y = UserInputHandler.getNumber("Introduce la variable 'Y'");
        calculateExpression(x, y);
    }
}
