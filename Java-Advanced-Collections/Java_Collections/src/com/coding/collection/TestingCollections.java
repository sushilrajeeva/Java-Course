package com.coding.collection;

import com.coding.collection.helper.PrintCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add((10));
        numList.add((-42));
        numList.add(4);
        PrintCollection.print(numList);

        System.out.println("After sorting");
        Collections.sort(numList);
        PrintCollection.print(numList);

        System.out.println("After reversing");
        Collections.reverse(numList);
        PrintCollection.print(numList);
    }
}
