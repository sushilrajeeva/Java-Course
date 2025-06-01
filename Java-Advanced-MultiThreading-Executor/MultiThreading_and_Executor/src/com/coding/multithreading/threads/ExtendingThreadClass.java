package com.coding.multithreading.threads;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("Starting First thread");
        t1.start();
        System.out.println("Starting Second thread");
        t2.start();
        System.out.println("Starting Third thread");
        t3.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("%s Time taken : %d\n", Thread.currentThread().getName(), (endTime - startTime));
    }
}
