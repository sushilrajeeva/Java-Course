package com.coding.executor.Assignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PrintThreadTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This prints all the thread names");
        printThreadNames();
    }

    public static void printThreadNames() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            PrintThread task = new PrintThread();
            service.submit(task);
        }
        service.shutdown();

        if (!service.awaitTermination(20, TimeUnit.SECONDS)) {
            System.out.println("Thread time out!! Forcefully shutting down threads");
            service.shutdownNow();
        }
    }
}
