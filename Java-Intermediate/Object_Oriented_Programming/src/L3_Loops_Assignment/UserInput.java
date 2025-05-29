package L3_Loops_Assignment;

import java.util.Scanner;

public class UserInput {

    public static int userInput(String message, String inputMessage) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage);
        return input.nextInt();
    }

    public static String userInput(String inputMessage) {
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage);
        return input.nextLine();
    }

    public static int userInputInt(String inputMessage) {
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage);
        return input.nextInt();
    }

    public static double userInputDouble(String inputMessage) {
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage);
        return input.nextDouble();
    }

    public static float userInputFloat(String inputMessage) {
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage);
        return input.nextFloat();
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
}
