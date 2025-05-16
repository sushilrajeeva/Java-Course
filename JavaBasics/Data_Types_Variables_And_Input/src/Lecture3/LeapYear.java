package Lecture3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("This program determines if a given year is a leap year.");

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a year (e.g. 2024): ");
            int year = input.nextInt();

            boolean isLeap;
            // Leap-year rule: divisible by 4, but years divisible by 100 are _not_ leap
            // unless they’re also divisible by 400.
            if (year % 4 != 0) {
                isLeap = false;
            } else if (year % 100 != 0) {
                isLeap = true;
            } else {
                isLeap = (year % 400 == 0);
            }

            if (isLeap) {
                System.out.printf("%d is a leap year.%n", year);
            } else {
                System.out.printf("%d is not a leap year.%n", year);
            }
        } catch (Exception e) {
            System.err.println("Invalid input—please enter a valid integer year.");
        }
    }
}
