package com.coding.multithreading.synchronize;

public class UpdaterThread extends Thread {

    private final Counter counter;

    public UpdaterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            this.counter.increment();
        }
    }
}
