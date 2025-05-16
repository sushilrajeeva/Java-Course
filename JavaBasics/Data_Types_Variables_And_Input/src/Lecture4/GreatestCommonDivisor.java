package Lecture4;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Integer[] arr = userInput();
        if (arr == null) {
            return;
        }
        int a = arr[0];
        int b = arr[1];
        System.out.println("Greatest Common Divisor of " + a + " and " + b + " is: " + greatestCommonDivisor(a, b));
    }

    public static Integer[] userInput() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("This program computes the Greatest Common Divisor of two numbers");
            System.out.print("Please enter the First Number: ");
            int x = input.nextInt();
            if (x <= 0) {
                throw new Exception();
            }
            System.out.print("Please enter the Second Number: ");
            int y = input.nextInt();
            if (y <= 0) {
                throw new Exception();
            }
            return new Integer[]{x, y};
        } catch (Exception e) {
            System.out.println("Please enter a valid number from 1 to N!");
            return null;
        }
    }

    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a%b);
    }
}
