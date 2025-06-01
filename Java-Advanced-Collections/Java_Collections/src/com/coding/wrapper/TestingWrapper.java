package com.coding.wrapper;

public class TestingWrapper {
    public static void main(String[] args) {
        Integer first = 55;
        Integer second = Integer.valueOf(45);
        Integer third = Integer.valueOf("34");

        System.out.printf("First = %d, second = %d, third = %d \n", first, second, third);
    }
}
