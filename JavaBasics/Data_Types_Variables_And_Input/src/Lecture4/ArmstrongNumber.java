package Lecture4;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Integer n = userInput();
        if (n==null) {
            return;
        }
        String isArm = isArmstrongNumber(n) ? "is an Armstrong Number" : "is not an Armstrong Number";
        System.out.println("The number " + n + " " + isArm);
    }

    public static Integer userInput() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter the number to check if its an Armstrong Number: ");
            return input.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a valid number!");
            return null;
        }
    }

    public static Integer getLength(int n) {
        int length = 0;
        while (n>0) {
            length += 1;
            n=n/10;
        }
        return length;
    }

    public static boolean isArmstrongNumber(int n) {
        if (n == 0) {
            return true;
        }
        if (n<0) {
            return false;
        }

        int len = getLength(n);

        double total = 0;
        int original = n;
        while (n>0) {
            total += Math.pow(n%10, len);
            n = n/10;
        }

        return (total == original);

    }
}
