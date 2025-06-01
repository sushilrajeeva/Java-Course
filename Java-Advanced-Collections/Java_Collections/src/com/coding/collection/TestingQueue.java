package com.coding.collection;

import com.coding.collection.helper.PrintCollection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);

        PrintCollection.print(queue);

        System.out.println("Peek : " + queue.peek());
        System.out.println("element : " + queue.element());
    }
}
