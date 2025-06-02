package com.coding.multithreading.Assignment1;

public class TestingThreadState {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();

        System.out.printf("\n Create the thread %s \n", t1.getState());

        t1.start();

        t1.join();

        System.out.printf("\n Thread finished %s \n", t1.getState());
    }
}
