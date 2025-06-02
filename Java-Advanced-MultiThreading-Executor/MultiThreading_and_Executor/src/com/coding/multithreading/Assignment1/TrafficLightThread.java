package com.coding.multithreading.Assignment1;

public class TrafficLightThread extends Thread {

    private final Traffic color;

    public TrafficLightThread(Traffic color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("\n %s active \n", color);
        try {
            Thread.sleep(color.getOnTimeInMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\n %s this color is inactive now \n", color);
    }
}
