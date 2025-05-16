package Lecture4;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Integer n = userInput();
        if (n==null) {
            return;
        }

        System.out.println("Reverse of digits in " + n + " is: " + reverseDigits(n));
    }

    public static Integer userInput() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter the number to get reverse of its digits: ");
            return input.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a valid number!");
            return null;
        }
    }

    public static int reverseDigits(int n) {
        boolean sign = true;
        if (n<0) {
            sign = false;
            n = Math.abs(n);
        }

        int number = 0;

        while (n>0) {
            number = number * 10 + n%10;
            n=n/10;
        }

        if (sign) return number;
        return number * -1;

    }
}
