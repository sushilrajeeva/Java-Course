package Lecture2;

import java.util.Scanner;

public class FloatProduct {
    public static void main(String[] args) {
        System.out.println("This program computes the product of two floating point numbers");
        try {

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the first float number: ");
            float num1 = input.nextFloat();

            System.out.print("Please enter the second float number: ");
            float num2 = input.nextFloat();

            double product = ((double) num1) * ((double) num2);
            System.out.println("Product of the two float numbers is: " + product);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
