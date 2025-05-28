package com.inheritance;

public class Vehicle {
    private int numberOfTires;

    public void commute() {
        System.out.printf("I am going from place A to place B using %d tires \n", numberOfTires);
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }
}
