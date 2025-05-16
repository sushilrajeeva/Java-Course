package Lecture3;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        System.out.println("This program checks if the number is positive, negative or zero");
        try (Scanner  input = new Scanner(System.in)) {
            System.out.print("Please enter the number: ");
            int num = input.nextInt();

            if (num == 0) {
                System.out.println("The number is Zero.");
            } else if (num < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is positive.");
            }
        } catch (Exception e) {
            System.out.println("Enter valid number.");
        }
    }
}
