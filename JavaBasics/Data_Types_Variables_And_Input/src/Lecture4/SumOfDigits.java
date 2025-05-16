package Lecture4;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Integer n = userInput();
        if (n==null) {
            return;
        }

        System.out.println("Sum of digits in " + n + " is: " + sum(n));
    }

    public static Integer userInput() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter the number to get its sum of digits: ");
            return input.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a valid number!");
            return null;
        }
    }

    public static int sum(int n) {
        boolean sign = true;
        if (n < 0) {
            sign = false;
            n = Math.abs(n);
        }

        int total = 0;
        while (n>0) {
            int last = n%10;
            total += last;
            n = n/10;
        }

        if (sign) return total;
        return total * -1;

    }
}
