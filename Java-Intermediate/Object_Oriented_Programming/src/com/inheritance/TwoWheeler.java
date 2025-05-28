package com.inheritance;

public class TwoWheeler extends Vehicle {

    TwoWheeler() {
        setNumberOfTires(2);
    }

    public void horn() {
        System.out.println("Two wheeler horn");
    }
}
