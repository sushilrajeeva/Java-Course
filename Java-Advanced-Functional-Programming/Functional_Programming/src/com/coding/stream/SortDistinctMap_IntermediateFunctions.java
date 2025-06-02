/**
 * Sort, Distinct, Map
 *
 * 1. sorted() orders the elements of a stream based on their natural order or a provided comparator.
 * 2. distinct() filters out duplicate elements, ensuring that every element in the resulting stream is unique.
 * 3. map() applies a function to each element of a stream, transforming them into a new stream of results based on the function.
 *
 * Examples
 * - List<Integer> numbers = List.of(5, 4, 3, 1, 2);
 * - List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
 * - System.out.println(sortedNumbers); // Output
 *
 * - List<String> items = List.of("apple", "banana", "apple", "banana", "orange");
 * - List<String> distinctItems = items.stream().distinct().collect(Collectors.toList());
 * - System.out.println(distinctItems); // Output: [apple, banana, orange]
 *
 * - List<String> words = List.of("stream", "Operations", "Java");
 * - List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
 * - System.out.println(upperCaseWords); // Output: [STREAM, OPERATIONS, JAVA]
 *
 */

package com.coding.stream;

import java.util.*;
import java.util.stream.Collectors;

public class SortDistinctMap_IntermediateFunctions {
    public static void main(String[] args) {
        demonstrateSorted();
        demonstrateDistinct();
        demonstrateMap();

        demonstrateEmployeeSort();

        demonstrateMapSquare();
    }

    private static void demonstrateSorted() {
        List<Integer> numbers = List.of(5, 4, 3, 1, 2);

        // 1a) Using natural order (ascending):
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()               // sorts in ascending order by default
                .collect(Collectors.toList());
        System.out.println("Original numbers: " + numbers);
        System.out.println("After sorted():    " + sortedNumbers);

        // 1b) Using a custom comparator (descending):
        List<Integer> descending = numbers.stream()
                .sorted((a, b) -> b - a) // comparator for descending order
                .collect(Collectors.toList());
        System.out.println("After sorted(desc): " + descending);
        System.out.println();
    }

    private static void demonstrateDistinct() {
        List<String> items = List.of("apple", "banana", "apple", "banana", "orange");

        List<String> distinctItems = items.stream()
                .distinct()              // removes duplicates, keeps first occurrence
                .collect(Collectors.toList());
        System.out.println("Original items: " + items);
        System.out.println("After distinct(): " + distinctItems);
        System.out.println();
    }

    private static void demonstrateMap() {
        List<String> words = List.of("stream", "Operations", "Java");

        // 3a) Convert each word to uppercase
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase) // maps each String → its uppercase version
                .collect(Collectors.toList());
        System.out.println("Original words:    " + words);
        System.out.println("After map(UPPER):  " + upperCaseWords);

        // 3b) Map each string to its length
        List<Integer> lengths = words.stream()
                .map(String::length)      // maps each String → length (Integer)
                .collect(Collectors.toList());
        System.out.println("After map(length): " + lengths);
        System.out.println();
    }

    public static void demonstrateEmployeeSort() {
        List<Employee> employees = List.of(new Employee("Sushil", 200000), new Employee("Jaswant", 180000), new Employee("Nikhil", 145000));
        employees.stream().sorted((employee1, employee2) -> Integer.compare(employee1.getSalary(), employee2.getSalary())).forEach(System.out::println);
    }

    public static void demonstrateMapSquare () {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println("Given number list : " + numbers);

        int res =  numbers.stream().mapToInt(ele -> (int)Math.pow(ele, 2)).sum();

        System.out.println("After squaring each number and computing the resulting sum : " + res);


    }
}
