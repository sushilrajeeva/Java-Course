package com.polimorphism;

public class Vehicle  {

    private int noOfTires;

    Vehicle() {
        this.noOfTires = 0;
    }

    Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void start () {

        System.out.println("Starting the vehicle!!");
    }
}
