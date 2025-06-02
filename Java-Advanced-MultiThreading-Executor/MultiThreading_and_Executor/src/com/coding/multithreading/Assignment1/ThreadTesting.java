package com.coding.multithreading.Assignment1;

public class ThreadTesting {
    public static void main(String[] args) {
        PrintThread t1 = new PrintThread();
        PrintThread t2 = new PrintThread();

        t1.start();
        t2.start();
    }

}
