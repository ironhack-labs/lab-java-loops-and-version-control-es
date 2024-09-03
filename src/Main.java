public class Main {

    public static void main(String[] args) {
        int[] numeros = {22, 8, 12, 7, 6, 4, 13};
        numerosMenores(numeros);
    }

    public static void numerosMenores(int[] array) {


        int menor, segundoMenor;

        if (array[0] < array[1]) {
            menor = array[0];
            segundoMenor = array[1];
        } else {
            menor = array[1];
            segundoMenor = array[0];
        }

        for (int i = 2; i < array.length; i++) {
            int num = array[i];

            if (num < menor) {
                segundoMenor = menor;
                menor = num;
            } else if (num < segundoMenor) {
                segundoMenor = num;
            }
        }

        System.out.println("El menor valor es: " + menor);
        System.out.println("El segundo menor valor es: " + segundoMenor);
    }
}

//{

//int[] numbers = {18, 9, 12, 6, 26, 3};
//int diferencia = calcularDiferencia(numbers);
//    }
//
//
//private static int calcularDiferencia(int[] array) {
//
//    int max = array[0];
//    int min = array[0];
//
//    for (int num : array) {
//
//        if (num > max) {
//
//            max = num;
//        }
//
//        if (num < min) {
//
//            min = num;
//        }
//    }
//
//    System.out.println("La Diferencia entre el MaxNum Y MinNum es " + (max - min));
//
//    return max; //
//}
//}
// Ex 3
//public static double calcularExpresion(double x, double y) {
//    // Calcula la expresión
//    double resultado = Math.pow(x, 2) + Math.pow((4 * y / 5) - x, 2);
//    return resultado;
//}
//
//public static void main(String[] args) {
//
//    double x = 6.0;
//    double y = 1.0;
//
//    double resultado = calcularExpresion(x, y);
//    System.out.println("El resultado de la expresión es: " + resultado);
//}
//}














