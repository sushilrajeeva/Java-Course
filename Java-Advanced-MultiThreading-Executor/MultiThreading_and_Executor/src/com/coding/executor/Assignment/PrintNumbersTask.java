package com.coding.executor.Assignment;

public class PrintNumbersTask implements Runnable {
    private final String taskName;

    public PrintNumbersTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println();
        for (int i = 1; i < 10; i++) {
            System.out.printf("%s:%d", taskName, i);
        }
        System.out.printf("\n %s:%s Task Completed", Thread.currentThread().getName(), taskName);
    }


}
