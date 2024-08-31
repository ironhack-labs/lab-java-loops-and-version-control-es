public class Main {
    public static void main(String[] args) {

        //ejercicio1lab();
        //ejercicio2lab();
        //ejercicio3lab();


    }

    private static void ejercicio3lab() {
        double x = 5;
        double y = 4;

        double result = calcularExpresion(x,y);
        System.out.println("El resultado es: " + result);
    }

    private static double calcularExpresion(double x, double y) {

        double parentesis = (4*y)/5 - x;
        double result = Math.pow(x,2) * Math.pow(parentesis,2);

        return result;
    }

    private static void ejercicio2lab() {
        int[] arreglo = {32,56,72,24,17,4};

        int min = Integer.MAX_VALUE;
        int segundoMin = Integer.MAX_VALUE;

        for(int valor : arreglo){
            if(valor < min){
                segundoMin = min;
                min = valor;
            } else if (valor < segundoMin && valor !=min) {
                segundoMin = valor;
            }
        }

        System.out.println("El numero con menor valor es: " + min);
        System.out.println("El numero con menor valor es: " + segundoMin);
    }

    private static void ejercicio1lab() {
        int[] numeros = {30,52,37,24,73};
        int diferencia = calcularMaxMin(numeros);
        System.out.println("La diferencia entre el numero maximo y minimo es " + diferencia);
    }

    private static int calcularMaxMin(int[] numeros ) {

        int min = numeros[0];
        int max = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] < min) {
                min = numeros[i];
            }
            if(numeros[i] > max){
                max = numeros[i];
            }
        }

        return max - min;
    }
}