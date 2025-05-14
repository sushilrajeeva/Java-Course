package Lecture3;

import java.util.Scanner;

public class OddEve {
    public static void main(String[] args) {
        System.out.println("This program checks if the given input is odd or even");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num%2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        } catch (Exception e) {
            System.out.println("Enter a valid number.");
        }
    }
}
