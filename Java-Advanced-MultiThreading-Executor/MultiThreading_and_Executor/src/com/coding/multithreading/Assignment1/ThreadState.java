package com.coding.multithreading.Assignment1;

public class ThreadState extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("\n From inside run %s \n", getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
