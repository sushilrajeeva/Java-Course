package com.Assignment1;

public class Test {

    public static void main(String[] args) {
        System.out.println("Testing Assignment Calculator with method overloading");
        System.out.println("This is with two int addition : " + Calculator.add(1, 2));
        System.out.println("This is with three int addition : " + Calculator.add(1, 2, 3));
        System.out.println("This is with two double addition : " + Calculator.add(1.0, 2.0));
        System.out.println("This is with one int and one double addition : " + Calculator.add(1, 2.0));

        System.out.println("*******************************************************************************");
        System.out.println("Testing the Vehicle and Car with super keyword");
        Car c = new Car();
        c.service();
    }
}
