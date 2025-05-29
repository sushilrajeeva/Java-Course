package com.assignment;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("Testing array operations");
        ArrayOperations opr = new ArrayOperations(new int[] {1, 3, 5, 9});
        System.out.printf("Mean : %f", opr.new Statistics().mean());
    }
}
