/**
 * List<String> myList = List.of("Apple", "Banana", "Cherry", "Date");
 * myList.stream()
 *      .filter(s -> s.endsWith("e"))
 *      .forEach(s -> System.out.println(s));
 *
 * 1. Purpose: Used to filter elements of a stream based on a given predicate (a condition). Only elements that satisfy the condition are included in the resulting stream.
 * 2. Lazy Operation: It's a lazy operation, meaning it's not executed until a terminal operation (like collect or forEach) is invoked on the stream.
 * 3. Returns a stream: filter itself returns a new stream with elements that match the predicate.
 */

package com.coding.stream;

import java.util.List;

public class FilterTest {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Date", "Mango");
        System.out.println("Given Fruit List : " + fruits);
        System.out.println("Fruit list size : " + fruits.size());

        // Printing fruits in fruit list
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
        // Printing fruits in fruit list using forEach
//        fruits.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String fruit) {
//                System.out.println(fruit);
//            }
//        });
        fruits.stream().forEach(fruit -> System.out.println(fruit));

        System.out.println("Filter and print all the fruits that ends with e");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));

        // here forEach is the terminal operation so only when we have forEach or something like that terminal operation only then java executes the expression as funcitonal programming uses lazy execution.

    }
}
