package Lecture4;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Integer n = userInput();
        if (n == null) return;

        System.out.println(n + " is " + isPrime(n));
    }

    public static Integer userInput() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("This program checks if the given number is Prime or not.");
            System.out.print("Please enter the number: ");
            return input.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a valid number!");
            return null;
        }
    }

    public static String isPrime(int n) {
        // number is not prime if it is 1 or less than it
        if (n <= 1) return "not prime";

        for (int i = 2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "not prime";
            }
        }
        return "prime";
    }
}
