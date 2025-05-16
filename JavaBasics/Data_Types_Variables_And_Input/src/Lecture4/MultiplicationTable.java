package Lecture4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Integer n = userInput();
        if (n==null) {
            return;
        }
        for(int i = 1; i<=10; i++) {
            multiply(n, i);
        }
    }

    public static Integer userInput() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter the number to get its multiplication table: ");
            return input.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a valid number!");
            return null;
        }
    }

    public static void multiply(int a, int b) {
        System.out.println(a + " x " + b + " = " + (a*b));
    }
}
