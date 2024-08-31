public class tarea2 {

    public static void main(String[] args) {
        int[] numeros = {3, 8, 1, 9, 2, 4}; // Array de ejemplo
        encontrarMinimos(numeros);
    }

    public static void encontrarMinimos(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("El array debe tener al menos 2 elementos.");
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < min1) {
                min2 = min1; // El segundo mínimo ahora es el mínimo anterior
                min1 = num;  // El nuevo mínimo es el número actual
            } else if (num < min2 && num != min1) {
                min2 = num;  // Actualiza el segundo mínimo si es necesario
            }
        }

        System.out.println("El elemento más pequeño es: " + min1);
        System.out.println("El segundo elemento más pequeño es: " + min2);
    }
}

