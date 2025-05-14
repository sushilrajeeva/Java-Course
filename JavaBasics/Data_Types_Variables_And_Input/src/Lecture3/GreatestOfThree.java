package Lecture3;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        System.out.println("This program prints the greatest of the three number");
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter the first number: ");
            int a = input.nextInt();

            System.out.print("Enter the second number: ");
            int b = input.nextInt();

            System.out.print("Enter the third number: ");
            int c = input.nextInt();

            if (a >= b && a >= c) {
                System.out.println(a + " is the greatest.");
            } else if (b >= a && b >= c) {
                System.out.println(b + " is the greatest.");
            } else {
                System.out.println(c + " is the greatest.");
            }

        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        }
    }
}
