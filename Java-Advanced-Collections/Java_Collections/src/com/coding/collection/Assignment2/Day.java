package com.coding.collection.Assignment2;

public enum Day {
    MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false), FRIDAY(false), SATURDAY(true), SUNDAY(true);

    private final boolean weekend;

    Day(boolean weekend) {
        this.weekend = weekend;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public boolean isWeekday() {
        return !weekend;
    }

    public String getType () {
        return weekend ? "Weekend" : "Weekday";
    }
}
