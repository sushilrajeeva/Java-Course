package com.coding.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorTesting {
    public static void main(String[] args) throws InterruptedException {

        //singleThreadExecutor();
        multipleThreadExecutor();

    }

    public static void singleThreadExecutor() {
        ExecutorService service =  Executors.newSingleThreadExecutor();
        PrintTask t1 = new PrintTask('$');
        PrintTask t2 = new PrintTask('*');
        PrintTask t3 = new PrintTask('#');

        service.submit(t1);
        service.submit(t2);
        service.submit(t3);
        service.shutdown();
    }

    public static void multipleThreadExecutor() throws InterruptedException {
        ExecutorService service =  Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            PrintTask task = new PrintTask((char) i);
            service.submit(task);
        }

        service.shutdown();
        System.out.println("****************** 1 ******************");;

        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("****************** 2 ******************");
            service.shutdownNow();
        }
    }
}
