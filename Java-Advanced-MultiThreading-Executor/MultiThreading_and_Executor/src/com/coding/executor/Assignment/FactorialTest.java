package com.coding.executor.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FactorialTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("This program runs the factorial in threads");
        computeFactorial();
    }

    public static void computeFactorial() throws ExecutionException, InterruptedException {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                Factorial task = new Factorial(i);
                list.add(service.submit(task));
            }

            for (Future<Integer> integerFuture : list) {
                System.out.printf("\n Result is %d", integerFuture.get());
            }

            service.shutdownNow();

            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Thread time out!! Forcefully shutting down the thread execution...");
                service.shutdownNow();
            }
        }
    }
}
