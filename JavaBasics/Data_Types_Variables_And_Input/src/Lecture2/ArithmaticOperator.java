package Lecture2;

import java.util.Scanner;

public class ArithmaticOperator {
    // This program takes two number and shows result of all the arithmatic operators (+,-,*,/,%)
    public static void main(String[] args) {
        System.out.println("This program takes two number and shows result of all the arithmatic operators (+,-,*,/,%)");
        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Please enter the second number: ");
        int num2 = input2.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("Sum of first two numbers is: " + sum);
        System.out.println("Subtraction of first two numbers is: " + sub);
        System.out.println("Multiplication of first two numbers is: " + mul);
        System.out.println("Division of first two numbers is: " + div);
        System.out.println("Modulos of first two numbers is: " + mod);
    }

}
