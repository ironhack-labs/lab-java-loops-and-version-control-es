public class DiferenciaMaxMin {
    // Método para encontrar la diferencia entre el valor
    //  más grande y más pequeño en un array
    public static int diferenciaMaxMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array debe tener al menos un elemento.");

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

    // Método principal para probar el método diferenciaMaxMin
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 9, 2};
        System.out.println("La diferencia entre el valor más grande" +
                " y el más pequeño es: " + diferenciaMaxMin(array));
    }

}
