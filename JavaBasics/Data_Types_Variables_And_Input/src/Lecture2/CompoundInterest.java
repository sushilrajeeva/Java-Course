package Lecture2;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("This program computes the compound interest");

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the principle amount: ");
            double principle = input.nextDouble();

            System.out.print("Enter the time in years: ");
            double time = input.nextDouble();

            System.out.print("Enter the rate of interest: ");
            double rate = input.nextDouble();

            double interest = (principle * Math.pow((1 + (rate / 100)), time)) - principle;

            System.out.println("Compound interest is: " + interest);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }

    }
}
