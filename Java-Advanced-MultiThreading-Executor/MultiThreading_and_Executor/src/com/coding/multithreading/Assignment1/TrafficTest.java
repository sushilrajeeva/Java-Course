package com.coding.multithreading.Assignment1;

public class TrafficTest {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread(Traffic.RED);
        TrafficLightThread yellow = new TrafficLightThread(Traffic.YELLOW);
        TrafficLightThread green = new TrafficLightThread(Traffic.GREEN);

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
        red.join();
    }
}
