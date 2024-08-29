package myMathExpression;
public class myMathExpression {
    public static double calculateExpression(double x, double y) {
    // calculateExpression method takes two parameters, x and y,
    // that represent the variables in the mathematical expression.

    double term1 = Math.pow(x, 2); // Calculates x * 2
    double term2 = Math.pow((4 * y / 5) - x, 2); // calculates (4y/5 - x)^2
    return term1 + term2; // adds both terms

    //
}

    public static void main(String[] args) {
        // sample
        double x = 32.0; //
        double y = 3.0; //
        double result = calculateExpression(x, y);
        System.out.println("the formula answer is " + result);
    }
}

