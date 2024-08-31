public class Lab1 {

    // Tarea 1: Diferencia entre el valor más grande y más pequeño en un arreglo
    public static int diferenciaEntreMaxYMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("El arreglo debe tener al menos un elemento.");
        }

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    // Tarea 2: Encontrar el más pequeño y el segundo más pequeño en un arreglo
    public static void encontrarMenores(int[] arr) {
        if (arr.length < 2) {
            System.out.println("El arreglo debe contener al menos dos elementos.");
            return;
        }

        int menor = Integer.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < menor) {
                segundoMenor = menor;
                menor = num;
            } else if (num < segundoMenor && num != menor) {
                segundoMenor = num;
            }
        }

        if (segundoMenor == Integer.MAX_VALUE) {
            System.out.println("No hay un segundo elemento más pequeño.");
        } else {
            System.out.println("Menor: " + menor + ", Segundo menor: " + segundoMenor);
        }
    }

    // Tarea 3: Calcular la expresión matemática
    public static double calcularExpresion(double x, double y) {
        return Math.pow(x, 2) + Math.pow((4 * y / 5) - x, 2);
    }

    // Metodo principal para ejecutar las tareas
    public static void main(String[] args) {
        // Ejemplos de arreglos para las tareas 1 y 2
        int[] arreglo = {5, 8, 2, 10, 3};

        // Ejecutar Tarea 1
        int diferencia = diferenciaEntreMaxYMin(arreglo);
        System.out.println("La diferencia entre el valor más grande y más pequeño es: " + diferencia);

        // Ejecutar Tarea 2
        encontrarMenores(arreglo);

        // Ejemplo de valores para la tarea 3
        double x = 2; // Valor de ejemplo para x
        double y = 3; // Valor de ejemplo para y

        // Ejecutar Tarea 3
        double resultadoExpresion = calcularExpresion(x, y);
        System.out.println("El resultado de la expresión es: " + resultadoExpresion);
    }
}
