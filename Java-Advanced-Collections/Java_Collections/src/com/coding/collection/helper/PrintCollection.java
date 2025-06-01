package com.coding.collection.helper;

import java.util.Collection;

public class PrintCollection {
    public static <E> void print(Collection<E> collection) {
        int i = 0;
        System.out.println("Printing collection...");
        for (E e : collection) {
            System.out.printf("%d : %s \n", i++, e);
        }
    }
}
