package com.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        TwoWheeler twoWheeler = new TwoWheeler();
        vehicle.commute();
        twoWheeler.commute();
        twoWheeler.horn();

        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.horn();
        motor.start();
    }
}
