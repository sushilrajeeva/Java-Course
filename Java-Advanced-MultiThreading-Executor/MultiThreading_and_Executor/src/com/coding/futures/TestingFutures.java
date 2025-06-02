package com.coding.futures;

import java.util.concurrent.*;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        FetchName task1 = new FetchName("Sushil");
        FetchName task2 = new FetchName("Nikhil");
        FetchName task3 = new FetchName("Jaswant");
        FetchName task4 = new FetchName("Yatin");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.println("Checking...");

        System.out.printf("\n Full name is : %s", name1.get());
        System.out.printf("\n Full name is : %s", name2.get());
        System.out.printf("\n Full name is : %s", name3.get());
        System.out.printf("\n Full name is : %s", name4.get());

        service.shutdown();
    }
}
