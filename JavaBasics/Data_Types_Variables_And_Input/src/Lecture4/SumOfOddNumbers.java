package Lecture4;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Integer n = userInput();
        if (n == null) {
            return;
        }
        System.out.println("Sum of all odd numbers from 1 to " + n + " is: " + sum(n));
    }

    public static Integer userInput() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter the number to get its sum of all numbers from 1 to N: ");
            int in = input.nextInt();
            if (in <= 0) {
                throw new Exception();
            }
            return in;
        } catch (Exception e) {
            System.out.println("Please enter a valid number from 1 to N!");
            return null;
        }
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int sum(int n) {
        int total = 0;
        while (n > 0) {
            if (isOdd(n)) {
                total += n;
            }
            n-=1;
        }
        return total;
    }
}
