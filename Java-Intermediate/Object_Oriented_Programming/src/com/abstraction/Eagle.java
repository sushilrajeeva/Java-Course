package com.abstraction;

public class Eagle extends Bird{
    public Eagle(String breed) {
        super(breed);
    }

    @Override
    public void fly() {
        System.out.printf("%s is flying!!\n", this.getBreed());
    }
}
