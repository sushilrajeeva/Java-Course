package com.coding.collection.Set;

import com.coding.collection.helper.PrintCollection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Sushil"));
        System.out.println(names.add("FaceBook"));
        System.out.println(names.add("Sushil"));
        PrintCollection.print(names);
        System.out.println(names.contains("Sushil"));
        System.out.println(names.remove("Sushil"));
        PrintCollection.print((names));
    }
}
