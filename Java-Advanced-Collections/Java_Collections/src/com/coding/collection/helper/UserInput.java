package com.coding.collection.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {

    public static int userInput(String message, String inputMessage) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage + " : ");
        return input.nextInt();
    }

    public static String userInput(String inputMessage) {
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage + " : ");
        return input.nextLine();
    }

    public static int userInputInt(String inputMessage) {
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage + " : ");
        return input.nextInt();
    }

    public static double userInputDouble(String inputMessage) {
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage + " : ");
        return input.nextDouble();
    }

    public static float userInputFloat(String inputMessage) {
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage + " : ");
        return input.nextFloat();
    }

    public static int[] userInput(String message, String inputMessage1, String inputMessage2) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        System.out.print(inputMessage1 + " : ");
        int a = input.nextInt();
        System.out.println();
        System.out.print(inputMessage2 + " : ");
        int b = input.nextInt();
        return new int[]{a, b};
    }

    public static List<String> userInputStrings(String message, String... inputMessages) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
//        System.out.print(inputMessage1 + " : ");
//        String a = input.nextLine();
//        System.out.println();
//        System.out.print(inputMessage2 + " : ");
//        String b = input.nextLine();
        List<String> inputs = new ArrayList<>();
        for (String inputMessage : inputMessages) {
            System.out.println(inputMessage + " : ");
            inputs.add(input.nextLine());
        }
        return inputs;
    }
}
