package com.coding.executor;

// 1. Define a class that implements Runnable
public class PrintTask implements Runnable {

    private final char targetChar;

    // 2. Override the run() method
    @Override
    public void run() {
        for (int i = 1; i<=100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf(" %d:%c ", i, targetChar);
        }
        System.out.printf("\n %s %c task completed ", Thread.currentThread().getName(), targetChar);
    }

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
