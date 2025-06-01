package com.coding.multithreading;

// 1. Define a class that extends Thread
public class PrintTask extends Thread{

    private final char targetChar;

    // 2. Override the run() method

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d:%c ", i, targetChar);
        }
        System.out.printf("\n%c Task Done\n", targetChar);
    }


    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }

}
