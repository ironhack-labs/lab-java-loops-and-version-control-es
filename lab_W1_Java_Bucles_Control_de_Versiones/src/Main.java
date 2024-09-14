

public class Main {
    public static void main(String[] args) {
        // Definimos un array de ejemplo
        int[] array = {12, 5, 7, 1, 3, 9, 1};

        // Llamamos al método para encontrar los valores mínimos
        ArrayMinimum.foundMinimun(array);

        // ---------------------

        // Definimos un array de ejemplo
        int[] array1 = {10, 3, 7, 5, 1, 9};

        // Llamamos al método diferenciaMaxMin y almacenamos el resultado
        int result = ArrayDifference.diferenciaMaxMin(array1);

        // Imprimimos el resultado
        System.out.println("The difference between the maximum and minimum value is: " + result);

        // ----------------------------

        // Definimos los valore`s de x e y
        double x = 3;
        double y = 4;

        // Calculamos el resultado usando el método calcularExpresion
        double result2 = MathExpression.calculateExpression(x, y);

        // Imprimimos el resultado en la consola
        System.out.println("The result of the expression is: " + result2);
    }

}





