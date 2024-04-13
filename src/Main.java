import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Creamos el Array numbers que utilizaremos para los diferentes ejercicios
        int[] numbers = {5,7,3,10,12,9,6,2,1,8};

        //Tarea 1, llama a la función calculateDifference que toma el array numbers como argumento
        calculateDifference(numbers);
        System.out.println();

        //Tarea 2, llama a la función smallerNumbers que toma el array numbers como argumento
        smallerNumbers(numbers);
        System.out.println();

        //Tarea 3, llama a la función calculateFormula, no necesita argumentos
        calculateFormula();

    }

    //Calcular resultado expresión matemática (Tarea 3)
    private static void calculateFormula() {

        //Creamos las variables, numeros random del 1 al 100, double para que el resultado acepte decimales
        double x = (int)(Math.random()*100+1);
        double y = (int)(Math.random()*100+1);

        //En la variable result guardamos el resultado de la fórmula y luego lo imprimimos
        double result = x*x + ((4 * y) / 5 - x) * ((4 * y) / 5 - x);
        System.out.println("El resultado de la fórmula para x="+ x +" e y="+ y +" es: " + result);
    }

    //Calcula el numero mas pequeño y el segundo mas pequeño de un array (Tarea 2)
    private static void smallerNumbers(int[] numbers) {
        //Ordenamos el Array de menor a mayor con el metodo sort
        Arrays.sort(numbers);

        //Imprimimos los 2 primeros elementos del Array que al estar ordenados de mayor a menor tienen que ser los más pequeños
        System.out.println("El número más pequeño es " + numbers[0]);
        System.out.println("El segundo número más pequeño es " + numbers[1]);
    }

    //Calcula el número mayor y menor de un array y la diferencia entre ambos (Tarea 1)
    private static void calculateDifference(int[] numbers) {
        //Creamos las variables menor y mayor y las inicializamos con el primer valor del Array
        int bigger = numbers[0];
        int smaller = numbers[0];

        //Recorremos el Array con 2 if para cada elemento
        for (int i = 0; i < numbers.length; i++) {
            //If para comprobar si el elemento actual es mayor que el guardado, si es asi lo guardamos en la variable bigger
            if (numbers[i] > bigger) {
                bigger = numbers[i];
            }
            //If para comprobar si el elemento actual es menor que el guardado, si es asi lo guardamos en la variable smaller
            if (numbers[i] < smaller) {
                smaller = numbers[i];
            }
        }
//esto es un comentario
        //Imprimimos los valores bigger, smaller y la diferencia entre ellos
        System.out.println("El mayor es: " + bigger);
        System.out.println("El menor es: " + smaller);
        System.out.println("La diferencia entre el mayor y el menor es: " + (bigger - smaller));

    }
}