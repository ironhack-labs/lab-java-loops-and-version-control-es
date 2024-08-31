public class Main {
    public static void main(String[] args) {

        int[] numeros = {42, 17, 63, 85, 29};
        int tamNum = numeros.length;
        int max = numeros[0];
        int min = numeros[0];
        int min2 = Integer.MAX_VALUE;

        System.out.println("Mi muestra de datos es: ");

        for (int i = 0; i < tamNum; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 1; i < tamNum; i++) {
            if ( numeros[i] > max) {
                max = numeros[i];
            }
            if ( numeros[i] < min) {
                min2 = min;
                min = numeros[i];
            } else if (numeros[i] < min2) {
                min2 = numeros[i];
            }

        }
        //System.out.println(max);
        System.out.println("La diferencia entre el mayor y el menor es: " + (max - min));
        System.out.println();
        System.out.println("Los dos valores más pequeños son: " + min + " y " + min2);
        System.out.println("El resultado de la expresión es:");
        System.out.println((max*max)+((((4*min)/5)-max)*(((4*min)/5)-max)));



    }
}