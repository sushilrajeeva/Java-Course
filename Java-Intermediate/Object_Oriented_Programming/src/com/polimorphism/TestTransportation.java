package com.polimorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();
        Plane p = new Plane();

//        Vehicle vCar = new Car();
//        Car cVehicle = (Car) new Vehicle();
//        Object o = new Car();

//        castTest(v);

//        castTest(p);

        p.start();
        c.start();

        castTest(c);

    }

    private static void castTest(Vehicle v) {
//        Car cVehicle = (Car) v;
//        System.out.println("Casting doors : " + ((Car) v).noOfDoors());
//        System.out.println("cVehicle doors : " + cVehicle.noOfDoors());
//        cVehicle.start();
        v.start();
    }
}
