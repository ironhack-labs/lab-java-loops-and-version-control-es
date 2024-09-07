public class ElementosMinimos {
    // Método para encontrar los elementos más pequeños y
    // segundo más pequeños en un array
    public static void encontrarMinimos(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("El array debe tener al menos dos elementos.");
        }
        int min = Integer.MAX_VALUE;
        int segundoMin = Integer.MAX_VALUE;

        for (int i = 0; i < array.length;
        i++){
            if (array[i] < min) {
                segundoMin = min;
                min = array[i];
            } else if (array[i] < segundoMin && array[i] != min) {
                segundoMin = array[i];
            }
        }
        System.out.println("El elemento más pequeño es: " + min);
        System.out.println("El segundo elemento más pequeño es: " +
                segundoMin);
    }

    // Método principal para probar el método encontarMinimos
    public static void main(String[] args) {
        int[] array = {12, 13, 1, 10, 34, 1};
        encontrarMinimos(array);
    }
}
