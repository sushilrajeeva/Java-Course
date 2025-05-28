package com.example.utils;

import L3_Loops_Assignment.UserInput;
import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("This Calculator class computes the area of the shapes");
        System.out.printf("Area of the Rectangle is %f", getRectangleArea());
        System.out.println();
        System.out.printf("Area of the Circle is %f", getCircleArea());
    }

    public static double getRectangleArea() {
        int[] inputs =  UserInput.userInput("This computes the area of the rectangle", "Enter the length of the rectangle : ", "Enter the width of the rectangle : ");
        int length = inputs[0];
        int breadth = inputs[1];
        Rectangle rectangle = new Rectangle(length, breadth);
        return rectangle.getLength() * rectangle.getBreadth();
    }

    public static double getCircleArea() {
        int radius =  UserInput.userInput("This computes the area of the rectangle", "Enter the radius of the rectangle : ");
        Circle circle = new Circle(radius);
        return circle.getPi() * Math.pow(circle.getRadius(), 2);
    }
}
