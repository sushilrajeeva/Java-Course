package com.coding.varargs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println("Sum of n numbers " + sum(1, 2, 3, 4, 5, 6));
    }

    public static int sum(int... elements) {
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return sum;
    }
}
