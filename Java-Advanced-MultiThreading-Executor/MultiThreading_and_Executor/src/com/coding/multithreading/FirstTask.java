package com.coding.multithreading;

public class FirstTask extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d, ", i);
        }
        System.out.printf("\n %s First Task Completed!! \n", Thread.currentThread().getName());
    }
}
