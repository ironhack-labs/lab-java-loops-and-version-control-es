import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }

    private static void exerciseOne() {
        int[] numbers = {-1, 5, 12, -15, 20, 35, -5};
        int maxnum = 0, minnum = 0;
        int difference = 0;

        System.out.println("Exercise 1");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxnum)
                maxnum = numbers[i];

            if (numbers[i] < minnum)
                minnum = numbers[i];
        }

        difference = maxnum - minnum;

        System.out.println("The difference is: " + difference);
    }

    private static void exerciseTwo() {
        int[] numbers = {-1, 5, 12, -15, 20, 35, -5};
        int min1 = numbers[0];
        int min2 = numbers[0];

        System.out.println("Exercise 2");

        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] < min1) {
                min2 = min1;
                min1 = numbers[i];
            }

            else if (numbers[i] < min2) {
                min2 = numbers[i];
            }
        }
        System.out.println("The smallest numbers are: " + min1 + " and " +min2);
    }
    private static void exerciseThree() {
        double x = 5, y = 6, result;

        System.out.println("Exercise 3");

        result = Math.pow(x , 2) + Math.pow(((4 * y)/5 - x), 2);

        System.out.println("The result is: " + result);
    }
}
