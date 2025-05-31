package com.Assignment1;

public class Car extends Vehicle {
    @Override
    public void service() {
        super.service();

        System.out.println("Car's service....");
    }
}
