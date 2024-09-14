//Tarea 1
//Escribe un método Java que devuelva la diferencia entre los valores más grande y más pequeño en un array de enteros. La longitud del array debe ser al menos 1.

public class ArrayDifference {
    // Método que calcula la diferencia entre el valor más grande y más pequeño en un array
    public static int diferenciaMaxMin(int[] numbers) {
        if (numbers.length < 1) {
            throw new IllegalArgumentException("The array must have at least one element.");
        }

        // Inicializamos los valores mínimo y máximo con el primer elemento del array
        int max = numbers[0];
        int min = numbers[0];

        // Recorremos el array para encontrar el máximo y mínimo
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Retornar la diferencia entre el máximo y el mínimo
        return max - min;
    }

//    public static void main(String[] args) {
//        // Definimos un array de ejemplo
//        int[] array = {10, 3, 7, 5, 1, 9};
//
//        // Llamamos al método diferenciaMaxMin y almacenamos el resultado
//        int result = diferenciaMaxMin(array);
//
//        // Imprimimos el resultado
//        System.out.println("The difference between the maximum and minimum value is: " + result);
//    }
}
