// TAREA 1 - Finding the difference
class myArrayDifference {
    public static int differenceMaxMin(int[] numbers) {

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return max - min;
    }
    public static void main() {
        int[] array = {4, 24, 27, 32};
        System.out.println("The difference is: " + differenceMaxMin(array)); //
    }
}
// TAREA 2 - MinMax Values
//
//
//Escribe un método Java que:
// encuentra los elementos más pequeños y segundos más pequeños de un array dado
// y los imprime en la consola.
class mydifferenceMaxMin {

    public static void main() {
        int[] array = {2, 4, 6, 8};
        findMinimum(array);
    }
    public static void findMinimum(int[] numbers) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < min1) {
                min2 = min1;  // update min2 before changing min1
                min1 = number;
            } else if (number < min2 && number != min1) {
                min2 = number;
            }
        }

        System.out.println("The lowest value or minimum is: " + min1);
        System.out.println("The second lowest or second to minimum is: " + min2);
    }
}


//TAREA 3 Calculate a formula

class myMathExpression {

    public static double calculateExpression(double x, double y) {
        // calculateExpression method takes two parameters, x and y,
        // that represent the variables in the mathematical expression.

        double term1 = Math.pow(x, 2); // Calculates x * 2
        double term2 = Math.pow((4 * y / 5) - x, 2); // calculates (4y/5 - x)^2
        return term1 + term2; // adds both terms


    //
    }
    public static void main() {
        // sample
        double x = 32.0; //
        double y = 3.0; //
        double result = calculateExpression(x, y);
        System.out.println("the formula answer is " + result);
    }
}