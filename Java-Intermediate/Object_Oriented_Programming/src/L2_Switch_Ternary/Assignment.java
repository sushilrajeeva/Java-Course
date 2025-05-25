package L2_Switch_Ternary;

import java.util.Scanner;

public class Assignment {

    public static int userInput(String message, String inputMessage) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage);
        return input.nextInt();
    }

    public static int[] userInput(String message, String inputMessage1, String inputMessage2) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage1);
        int a = input.nextInt();
        System.out.println();
        System.out.print(inputMessage2);
        int b = input.nextInt();
        return new int[]{a, b};
    }

    public static int findMinimum() {

        int[] res = userInput("This program computes the minimum of two numbers", "Enter the first number : ", "Enter the second number : ");
        int a = res[0];
        int b = res[1];
        return a <= b ? a : b;
    }

    public static String findOddEven() {
        int a = userInput("This program computes if a given number is odd or even", "Enter the number : ");
        int compute = a%2;
        return switch (compute) {
            case 0 -> "Even";
            default -> "Odd";
        };
    }

    public static  int findAbsolute() {
        int a = userInput("This program computes the absolute value of a number", "Enter the number : ");
        return a < 0 ? -a : a;
    }

    public static void computeStudentScoreCategory() {
        int score = userInput("This program computes the students score category", "Enter the score : ");
        String res =  score > 80 ? "High" : score >= 50 ? "Moderate" : "Low";
        System.out.println("The student score " + score + " is " + res);
    }

    public static void computeMonthOfTheYear() {
        int num = userInput("This program computes the month of the year based on a number (1-12)", "Enter the month in number : ");
        String month = switch(num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
        System.out.println("The month corresponding to " + num + " is " + month);
    }

    public static void calculator() {
        int arithematic = userInput("This program computes arithematic operation between two numbers", "Enter the operator 1 for addition, 2 for subtraction, 3 for multiplication and any other number for division : ");
        int[] inputs = userInput("", "Enter the first number : ", "Enter the second number : ");
        int a = inputs[0];
        int b = inputs[1];

        int res = switch (arithematic) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            default -> a / b;
        };

        System.out.println("Result -> " + res);
    }

    public static void main(String[] args) {
        int res1 = findMinimum();
        System.out.println("Minimum of two numbers is : " + res1);

        String res2 = findOddEven();
        System.out.println("The given number is " + res2);

        int res3 = findAbsolute();
        System.out.println("The absolute value is " + res3);

        computeStudentScoreCategory();

        computeMonthOfTheYear();

        calculator();
    }

}
