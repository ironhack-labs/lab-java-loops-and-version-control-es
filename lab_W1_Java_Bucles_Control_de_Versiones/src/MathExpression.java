//Tarea 3
//Escribe un método Java que calcule el resultado de la siguiente expresión matemática, donde x y y son dos variables que ya han sido establecidas en tu código:

public class MathExpression {
    // Método para calcular la expresión matemática
    public static double calculateExpression(double x, double y) {

        // Parte 1: x^2
        double part1 = Math.pow(x, 2);

        // Parte 2: (4y/5 - x)^2
        double part2 = Math.pow((4 * y / 5) - x, 2);

        // Suma de las dos partes
        double result2 = part1 + part2;

        // Devolvemos el resultado final
        return result2;
    }
//    public static void main(String[] args) {
//        // Definimos los valores de x e y
//        double x = 2;
//        double y = 1;
//
//        // Calculamos el resultado usando el método calcularExpresion
//        double result = calculateExpression(x, y);
//
//        // Imprimimos el resultado en la consola
//        System.out.println("The result of the expression is: " + result);
//    }
}


