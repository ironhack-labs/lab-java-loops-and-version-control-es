public class tarea1 {

    public static void main(String[] args) {
        int[] numeros = {3, 8, 1, 9, 2, 4}; // array con 6 numeros
        int diferencia = calcularDiferencia(numeros);
        System.out.println("La diferencia entre el valor más grande y el más pequeño es: " + diferencia);
    }

    public static int calcularDiferencia(int[] array) {
        if (array.length != 6) {
            throw new IllegalArgumentException("El array debe tener exactamente 6 elementos.");
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return max - min;
    }
}
