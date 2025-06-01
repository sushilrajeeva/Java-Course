package com.coding.multithreading;

public class SecondTask extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.printf("\n %s Second Task Completed!! \n", Thread.currentThread().getName());
    }
}
