

// TAREA - 1 ---------------


public class Main {
    public static void main(String[] args) {
        int[] numeros = {10, 3, 5, 6};
        int diferencia = calcularDiderencia(numeros);
        System.out.println(" La diferencia ente el digito mas grande i el mas pequeño es: " + diferencia);
    }

    public static int calcularDiderencia(int[] arr) {
        if (arr == null || arr.length != 4)
            throw new IllegalArgumentException(" El array tiene que tener exactamente 4 digitos");
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max) {
                min = arr[i];
            }
        }
        return max - min;
    }
}







// TAREA - 2 ---------------------


public class Main {
    public static void main(String[] args) {
        int[] numeros = {34, 12, 5, 22, 64};
        encontrarMinimos(numeros);
    }

    public static void encontrarMinimos(int[] arr){
        if (arr == null || arr.length != 5){
            throw new IllegalArgumentException(" el array debe tener 5 numeros exactamente");
        }

        int minimo = Integer .MAX_VALUE;
        int minimo2 = Integer .MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimo) {
                minimo2 = minimo;
                minimo = arr[i];
            } else if (arr[i] < minimo2 && arr[i] != minimo){
                minimo2 = arr[i];
            }
        }
    }
}






// TAREA - 3 -------------------


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
