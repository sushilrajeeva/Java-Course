package com.coding.multithreading.Assignment1;

public class HelloThread extends Thread {
    private int threadNumber;

    public HelloThread (int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("\n %s Thread Starting - %d \n", Thread.currentThread().getName(), threadNumber );
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("\n %s Thread Ended - %d \n", Thread.currentThread().getName(), threadNumber );

    }
}
