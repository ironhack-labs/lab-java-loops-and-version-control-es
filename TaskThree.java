package org.ironhack.lab104;

public class TaskThree {
    public static int calculateExpression(int x, int y) {
        int firstPart = x * x;
        int secondPart = ((4 * y) / 5) - x;
        int result = firstPart + (secondPart * secondPart);

        return result;
    }
}