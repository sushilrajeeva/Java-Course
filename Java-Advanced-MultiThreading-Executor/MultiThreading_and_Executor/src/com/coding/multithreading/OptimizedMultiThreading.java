package com.coding.multithreading;

public class OptimizedMultiThreading {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("This program runs the program in multiple threads to optimize the performance of the program!!");
        long startTime = System.currentTimeMillis();
        PrintTask t1 = new PrintTask('*');
        PrintTask t2 = new PrintTask('$');
        PrintTask t3 = new PrintTask('#');

        t1.start();
        t2.start();
        t3.start();
        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Time taken: %d ms\n",
                Thread.currentThread().getName(),
                (endTime - startTime));
    }
}
