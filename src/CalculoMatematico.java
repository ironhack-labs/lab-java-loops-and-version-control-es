public class CalculoMatematico {
    public static void main(String[] args) {
        // Variables x y y deben ser inicializadas con algunos valores
        double x = 4.0; // Ejemplo de valor para x
        double y = 4.0; // Ejemplo de valor para y

        // Calcular el resultado de la expresión
        double resultado = calcularExpresion(x, y);

        // Imprimir el resultado
        System.out.println("El rsultado de la expresión es: " + resultado);
    }

    public static double calcularExpresion(double x, double y) {
        return Math.pow(x,2) + Math.pow((4 * y / 5) - x, 2);
    }
}
