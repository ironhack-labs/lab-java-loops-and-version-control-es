public class Main {
    public static void main(String[] args) {

        //lab 1
        int[] score = {10,2,4,8,13};
        int max = 0;
        int min = 0;

        for (int i = 0; i < score.length; i++) {
            if (i==0) {
                min = score[i];
                max = score[i];
            }
            if (score[i]>max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }

        }
        int differentBetweenScore = (max - min);
        System.out.println("LAB 1");
        System.out.println("The different between lower and best score is: " + differentBetweenScore + "!!");
        System.out.println("The lower score is: " + min +"!!");
        System.out.println("The best score is: " + max + "!!");

        //lab 2
        int[] examPoint ={90,34,32,87,12,7};
        int worstPunctuation = 0;
        int secondWorstPunctuation = 0;
        for (int i = 0; i < examPoint.length; i++) {
            if(i == 0){
                worstPunctuation = examPoint[i];
                secondWorstPunctuation = examPoint[i];
            }
            else{
                if(examPoint[i] < worstPunctuation){
                    secondWorstPunctuation = worstPunctuation;
                    worstPunctuation = examPoint[i];}
                if (examPoint[i] > worstPunctuation && examPoint[i] < secondWorstPunctuation){
                    secondWorstPunctuation = examPoint[i];
                }
            }
        }
        System.out.println("LAB 2");
        System.out.println("The worst punctuation is: " + worstPunctuation + "!!");
        System.out.println("The second worst punctuation is: " + secondWorstPunctuation + "!!");

        //lab 3
        double x = 32;
        double y = 88;
        double var1 =(4 * y/5) - x;
        double result = x * x + (var1 * var1);
        System.out.println("LAB 3");
        System.out.println("The correct answer is: " + result + "!!");
    }
}
