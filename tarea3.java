public class tarea3 {
    public static void main(String[] args) {
        // Ejemplo de valores para x y y
        double x = 2.0;
        double y = 3.0;

        // Llamada al método para calcular la expresión
        double resultado = formula(x, y);

        // Imprimir el resultado
        System.out.println("El resultado de la expresión es: " + resultado);
    }

    public static double formula(double x, double y) {
        // Cálculo de la expresión
        double parte1 = x * x;
        double parte2 = (4 * y / 5) - x;
        double resultado = parte1 + (parte2 * parte2);

        return resultado;
    }
}