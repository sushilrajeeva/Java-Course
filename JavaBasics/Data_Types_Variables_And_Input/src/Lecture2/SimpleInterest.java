package Lecture2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("This program computes the simple interest");

        try {
            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter the principle amount: ");
            double principle = input1.nextDouble();

            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter the time in years: ");
            double time = input2.nextDouble();

            Scanner input3 = new Scanner(System.in);
            System.out.print("Enter the rate of interest: ");
            double rate = input3.nextDouble();

            double interest = (principle * time * rate) / 100;

            System.out.println("Simple interest is: " + interest);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }

    }
}
