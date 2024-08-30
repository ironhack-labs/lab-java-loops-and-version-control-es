public class Main {
    public static void main(String[] args) {
        int[] Segundo = {2, 9, 15, 17, 1, 3};
        int min = Segundo[0];
        for (int i = 0; i < Segundo.length; i++) {

            if (Segundo[i] < min) {
                min = Segundo[i];
                System.out.println("El nuemro menor es: " + min);
            }
        }

    }
}