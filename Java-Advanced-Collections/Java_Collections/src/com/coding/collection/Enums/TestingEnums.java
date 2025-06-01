package com.coding.collection.Enums;

public class TestingEnums {


    public static void main(String[] args) {
        Treffic color = Treffic.RED;
        Grade grade = Grade.A;

        System.out.println("Traffic color : " + color);
        System.out.println("Grade : " + grade);

        for (Treffic value : color.values()) {
            System.out.println(value);
        }
        color = Treffic.GREEN;
        System.out.println(color.getAction());
        System.out.println(Treffic.valueOf("YELLOW"));
    }
}
