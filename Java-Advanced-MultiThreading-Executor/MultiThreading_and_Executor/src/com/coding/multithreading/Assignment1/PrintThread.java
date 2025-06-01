package com.coding.multithreading.Assignment1;

public class PrintThread extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hello from: %s%n", Thread.currentThread().getName());
        }
    }

    public PrintThread() {
        super();
    }
}
