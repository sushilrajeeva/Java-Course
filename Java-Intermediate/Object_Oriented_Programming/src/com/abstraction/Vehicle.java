package com.abstraction;

import java.util.Objects;

public abstract class Vehicle implements Transport {
    private int noOfTires;

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public abstract void makeStartSound();

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vehicle vehicle)) return false;
        return noOfTires == vehicle.noOfTires;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(noOfTires);
    }
}
