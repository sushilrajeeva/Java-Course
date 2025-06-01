package com.coding.multithreading.runnable;

public class PrintTaskRunnable implements Runnable {

    private final char targetChar;

    // 2. Override the run() method

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d:%c ", i, targetChar);
        }
        System.out.printf("\n %s %c Task Done\n", Thread.currentThread().getName(), targetChar);
    }


    public PrintTaskRunnable(char targetChar) {
        this.targetChar = targetChar;
    }

}
