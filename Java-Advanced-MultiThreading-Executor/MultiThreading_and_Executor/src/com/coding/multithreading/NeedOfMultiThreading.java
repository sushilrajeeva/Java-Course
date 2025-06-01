package com.coding.multithreading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("First Task");
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d, ", i);
        }
        System.out.println();
        System.out.println("Task Completed!!");

        System.out.println("Second Task");
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println();
        System.out.println("Task Completed!!");

        System.out.println("Third Task");
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("$%d, ", i);
        }
        System.out.println();
        System.out.println("Task Completed!!");
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken : " + (endTime - startTime));
    }
}
