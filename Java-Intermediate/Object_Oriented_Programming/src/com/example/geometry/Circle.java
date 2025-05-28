package com.example.geometry;

import java.util.Scanner;

public class Circle {
    private int radius;
    private final double pi = 3.142;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }
}
