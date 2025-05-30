package com.abstraction;

public class Car extends Vehicle {

    private int noOfDoors;

    public Car() {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Ccrrrr vrummmmmm");
    }

    @Override
    public void getSetGo() {
        System.out.println("Vehicle is starting!!! Get Set Go....");
    }
}
