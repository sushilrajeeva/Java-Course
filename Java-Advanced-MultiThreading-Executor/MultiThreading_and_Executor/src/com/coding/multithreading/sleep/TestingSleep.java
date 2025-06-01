package com.coding.multithreading.sleep;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before sleeping");
        Thread.sleep(1000);
        System.out.println("Woke up");
    }
}
