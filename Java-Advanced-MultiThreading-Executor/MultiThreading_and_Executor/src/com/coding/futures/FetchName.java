package com.coding.futures;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {

    private final String name;

    public FetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("\n Getting full name from server....");
        Thread.sleep(4000);
        return  "Mr. " + name;
    }
}
