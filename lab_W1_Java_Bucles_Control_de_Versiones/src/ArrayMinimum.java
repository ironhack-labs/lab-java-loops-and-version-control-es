//Tarea 2
//Escribe un método Java que encuentra los elementos más pequeños y segundos más pequeños de un array dado y los imprime en la consola.

public class ArrayMinimum {
    // Método para encontrar el elemento más pequeño y el segundo más pequeño
    public static void foundMinimun(int[] numbers) {
        // Verificamos que el array tenga al menos dos elementos
        if (numbers.length < 2) {
            throw new IllegalArgumentException("El array debe tener al menos dos elementos.");
        }

        // Inicializamos el valor más pequeño y el segundo más pequeño
        int min = Integer.MAX_VALUE;
        int segundoMin = Integer.MAX_VALUE;

        // Recorremos el array para encontrar los dos valores más pequeños
        for (int number : numbers) {
            if (number < min) {
                segundoMin = min;  // Actualizamos el segundo más pequeño
                min = number;      // Actualizamos el mínimo
            } else if (number < segundoMin && number != min) {
                segundoMin = number; // Actualizamos el segundo más pequeño solo si no es igual al mínimo
            }
        }

        // Imprimimos el resultado
        System.out.println("The smallest value is: " + min);
        System.out.println("The second smallest value is: " + segundoMin);
    }

//    public static void main(String[] args) {
//        // Definimos un array de ejemplo
//        int[] array = {12, 5, 7, 1, 3, 9, 1};
//
//        // Llamamos al método para encontrar los valores mínimos
//        foundMinimun(array);
//    }

}
