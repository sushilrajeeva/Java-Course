package com.coding.multithreading.Assignment1;

public enum Traffic {
    RED(9000),
    YELLOW(1000),
    GREEN(4000);


    private final int onTimeInMills;

    Traffic(int onTimeInMills) {
        this.onTimeInMills = onTimeInMills;
    }

    public int getOnTimeInMills() {
        return onTimeInMills;
    }
}
