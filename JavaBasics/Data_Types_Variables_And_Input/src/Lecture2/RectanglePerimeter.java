package Lecture2;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        System.out.println("This program computes the perimeter of a rectangle");

        try {
            Scanner input1 = new Scanner(System.in);
            System.out.print("Please enter the first side: ");
            int a = input1.nextInt();

            Scanner input2 = new Scanner(System.in);
            System.out.print("Please enter the second side: ");
            int b = input2.nextInt();

            Scanner input3 = new Scanner(System.in);
            System.out.print("Please enter the third side: ");
            int c = input3.nextInt();

            Scanner input4 = new Scanner(System.in);
            System.out.print("Please enter the fourth side: ");
            int d = input4.nextInt();

            int perimeter = a + b + c + d;

            System.out.println("Perimeter of the given rectangle is: " + perimeter);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
