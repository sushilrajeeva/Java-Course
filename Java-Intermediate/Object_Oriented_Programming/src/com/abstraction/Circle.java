package com.abstraction;

public class Circle extends Shape{

    private double radius;
    private final double PI = 3.142;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return this.PI * Math.pow(this.radius, 2);
    }
}
