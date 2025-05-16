package Lecture3;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("This program computes the grade given a valid mark out of 100");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a mark out of 100 to check your Grade: ");
            double marks = input.nextDouble();
            String grade = "F";
            if (marks > 100 || marks < 0) {
                throw new Exception();
            }
            if (marks >= 90) {
                grade = "A";
            } else if (marks >= 75) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 30) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Grade: " + grade);
        } catch (Exception e) {
            System.out.println("Please enter a valid number between 0 to 100 inclusive.");
        }
    }
}
