package Lecture5;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {3, 6, 8, 27, 85, 98, 99, 68, 34, 42, 100};
        System.out.println("This program lets you search in an array");
        System.out.print("Enter the number you want to search: ");

        int num = input.nextInt();
        boolean flagFound = isFound(arr, num);
        if (flagFound) {
            System.out.println("Your number was found in the array");
        } else {
            System.out.println("Your number was not found in the array");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        for (int j : arr) {
            if (j == num) return true;
        }
        return false;
    }
}
