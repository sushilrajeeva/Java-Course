package com.coding.collection.Enums;

public enum Treffic {
    RED("Stop"), GREEN("Go"), YELLOW("Caution");

    private final String action;

    Treffic(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
