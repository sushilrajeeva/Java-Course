package com.coding.collection.Assignment2;

public class TestDay {
    public static void main(String[] args) {
        System.out.println("Printing all the enum week names");
        int a = 1;
        for (Day value : Day.values()) {
            System.out.printf("%d. %s is a %s \n", a++, value, value.getType());
        }
    }
}
