package com.abstraction;


public class TestShape {
    public static void main(String[] args) {
        System.out.println("Testing the shape");
        System.out.println("************** Creating Circle **************");
        Circle circle = new Circle(10);
        System.out.printf("Area of Circle with radius %.2f is : %.2f \n", circle.getRadius(), circle.calculateArea());
        System.out.println("*********************************************");
        System.out.println("************** Creating Square **************");
        Square square = new Square(10);
        System.out.printf("Area of Square with length %.2f is : %.2f \n", square.getLength(), square.calculateArea());
        System.out.println("*********************************************");
    }
}
