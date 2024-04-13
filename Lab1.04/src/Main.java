public class Main {
    public static void main(String[] args) {

        /*
        Tarea 1
        Escribe un método Java que devuelva la diferencia entre los valores más grande
        y más pequeño en un array de enteros.
        La longitud del array debe ser al menos 1.
        */

        diferenciaEntreValores();

        /*
        Tarea 2
        Escribe un método Java que encuentra los elementos más pequeños y segundos más pequeños de un array dado
        y los imprime en la consola.
        */

        valoresMasPequenos();

        /*
        Tarea 3
        Escribe un método Java que calcule el resultado de la siguiente expresión matemática,
        donde x y y son dos variables que ya han sido establecidas en tu código:

        x2 + (4y/5 - x)2
        */

        calculoMatematico();

    }

    private static void calculoMatematico() {
        double x = 6;
        double y = 4;
        double res = Math.pow(x,2) + Math.pow(((4*y)/5 - x), 2);

        System.out.println("El resultado de la operación es: " + res);
    }

    private static void valoresMasPequenos() {
        int[] myArray = {50,6, 4, 8, 20, 60, 7, 130};
        int menor1 = myArray[0];
        int menor2 = myArray[0];

        for (int j : myArray) {
            if (j < menor1) {
                menor2 = menor1;
                menor1 = j;
            } else if (j < menor2 && j > menor1) {
                menor2 = j;
            }
        }
        System.out.println("El primer valor más pequeño es: " + menor1 + "\nEl segundo más pequeño es: " + menor2);
    }

    private static void diferenciaEntreValores() {

        int[] myArray = {50, 2, 4, 8, 20, 60, 130};
        int mayor = myArray[0];
        int menor = myArray[0];


        for (int valorArray : myArray) {
            if (valorArray > mayor) {
                mayor = valorArray;
            } else if (valorArray < menor) {
                menor = valorArray;
            }
        }

        System.out.println("La diferencia entre " + mayor + " y " + menor + " es: " + (mayor-menor));
    }
}