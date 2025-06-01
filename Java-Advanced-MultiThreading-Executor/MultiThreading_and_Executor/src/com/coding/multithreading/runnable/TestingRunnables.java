package com.coding.multithreading.runnable;

public class TestingRunnables {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        PrintTaskRunnable p1 = new PrintTaskRunnable('*');
        PrintTaskRunnable p2 = new PrintTaskRunnable('&');
        PrintTaskRunnable p3 = new PrintTaskRunnable('#');

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();

        // Wait for all three to finish before measuring time
        t1.join();
        t2.join();
        t3.join();

        long endTime = System.currentTimeMillis();
        System.out.printf("\n %s Total time taken: %d \n", Thread.currentThread().getName(), (endTime - startTime));

    }
}
