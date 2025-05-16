package Lecture4;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Integer[] arr = userInput();
        if (arr == null) {
            return;
        }
        int a = arr[0];
        int b = arr[1];
        System.out.println("Least Common Multiple of " + a + " and " + b + " is: " + leastCommonMultiple(a, b));
    }

    public static Integer[] userInput() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("This program computes the Least Common Multiple of two numbers");
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

    public static int leastCommonMultiple(int a, int b) {
        int gcd = greatestCommonDivisor(a, b);
        return (a*b) / gcd;
    }

    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a%b);
    }
}
