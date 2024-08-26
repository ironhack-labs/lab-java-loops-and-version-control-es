public class Main {
    public static void main(String[] args) {

        Task1();

        Task2();

        Task3();
    }

    private static void Task3() {
        double x = 10.0;
        double y = 4.0;
        double parte1 = Math.pow(x, 2);
        double parte2 = Math.pow((4 * y / 5) - x, 2);
        double resultado = parte1 + parte2;

        System.out.println("Third Task:");
        System.out.println("The solution to the equation it's: " + resultado);
    }

    private static void Task2() {
        int [] Values2 = {3, 12, 32, 16, 22, 4};

        int minValue2 = Integer.MAX_VALUE;
        int secondMinValue2 = Integer.MAX_VALUE;

        for (int j = 0; j < Values2.length; j++) {
            if (Values2[j] < minValue2) {
                minValue2 = Values2[j];
            }
        }
        for (int j = 0; j < Values2.length; j++) {
            if (Values2[j] != minValue2 && Values2[j] < secondMinValue2) {
                secondMinValue2 = Values2[j];
            }
        }


        System.out.println("Second Task:");
        System.out.println("Lower value it's " + minValue2);
        System.out.println("Second lower value it's " + secondMinValue2);
        System.out.println("--------------------------------------------------");
    }

    private static void Task1() {
        int [] Values = {6, 5, 2, 9, 23, 15};

        int maxValue = Values[0];
        int minValue = Values[0];
        for (int i = 1; i < Values.length; i++) {
            if (Values[i] > maxValue) {
                maxValue = Values[i];
            }
            if (Values[i] < minValue) {
                minValue = Values[i];
            }
        }
        System.out.println("First Task:");
        System.out.println("Highest value it's " + maxValue);
        System.out.println("Lower value it's " + minValue);
        System.out.println("The difference between highest and minimum values it's: " + (maxValue - minValue));
        System.out.println("--------------------------------------------------");
    }




}