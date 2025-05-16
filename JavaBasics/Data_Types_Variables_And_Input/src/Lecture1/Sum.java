package Lecture1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("This program adds two number");
        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int n1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Please enter the second number: ");
        int n2 = input2.nextInt();
        int sum = n1 + n2;
        System.out.println("Sum of your numbers is: " + sum);
    }
}
