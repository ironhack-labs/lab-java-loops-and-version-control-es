public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        double resultado = calcularExpresion(x, y);
        System.out.println(" El resultado de la expresion es: " + resultado);
    }

    public static double calcularExpresion(int x, int y){
        if (5 - x == 0) {
            throw new ArithmeticException("La expresion (5 - x) es igual a cero.");

        }
    double parteInterna = (4.0 * y) / (5 - x);
    double resultado = Math.pow(x, 2) * Math.pow(parteInterna, 2);

    return resultado;

    }

}




