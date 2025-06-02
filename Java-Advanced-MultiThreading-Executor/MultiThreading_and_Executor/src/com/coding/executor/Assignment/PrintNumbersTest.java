package com.coding.executor.Assignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PrintNumbersTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Single Thread Execution.....");
        singleThreadExecution();

        System.out.println("Multiple Thread execution");
    }

    public static void singleThreadExecution() throws InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintNumbersTask t1 = new PrintNumbersTask("$");
        service.submit(t1);
        service.shutdown();

        if (!service.awaitTermination(100, TimeUnit.SECONDS)) {
            System.out.println("Thread timeout!!! Shutting down forcefully....");
            service.shutdownNow();
        }
    }
}
