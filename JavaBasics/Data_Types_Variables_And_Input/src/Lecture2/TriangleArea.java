package Lecture2;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("This program computes the area of the triangle");

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the height of the triangle: ");
            double height = input.nextDouble();

            System.out.print("Please enter the breadth of the triangle: ");
            double breadth = input.nextDouble();

            double area = 0.5 * height * breadth;

            System.out.println("Area of the triangle is: " + area);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
