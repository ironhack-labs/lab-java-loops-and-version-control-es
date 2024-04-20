clearpackage org.example;

public class Tarea3 {
    public static void main(String[] args) {
        // Supongamos que ya tienes definidas las variables x y y
        int x = 3;
        int y = 5;

        // Llama al método calcularResultado y muestra el resultado
        System.out.println("El resultado de la expresión matemática es: " + calcularResultado(x, y));
    }

    public static double calcularResultado(int x, int y) {
        // Calcula el resultado de la expresión matemática
        double resultado = Math.pow(x, 2) + Math.pow((4 * y / 5 - x), 2);
        return resultado;
    }
}
