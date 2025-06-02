package com.coding.executor.Assignment;

import java.util.Random;

public class PrintThread implements Runnable {

    Random random;

    @Override
    public void run() {
        int randomNumber = random.nextInt(5) + 1;
        try {
            Thread.sleep(randomNumber * 1000);
            System.out.println("ThreadName -> " + Thread.currentThread().getName() + " took " + randomNumber + " seconds to load..");
        } catch (InterruptedException e) {
            System.out.println("Ooops!! Something went wrong");
            throw new RuntimeException(e);
        }
    }

    public PrintThread() {
        this.random = new Random();
    }
}
