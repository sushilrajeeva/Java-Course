package Lecture4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Integer n = userInput();
        if (n==null) {
            return;
        }
        System.out.println("Factorial of " + n + " is:" + factorial(n));
    }

    public static Integer userInput() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter the number to get its factorial: ");
            int in = input.nextInt();
            if (in < 0) {
                throw new Exception();
            }
            return in;
        } catch (Exception e) {
            System.out.println("Please enter a valid number from 0 to N!");
            return null;
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }
}
