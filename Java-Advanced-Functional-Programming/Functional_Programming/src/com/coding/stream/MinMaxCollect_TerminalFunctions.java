/**
 * Max, Min, Collect to List
 * 1. max() finds the largest element in the stream according to a given comparator or natural ordering.
 * 2. min() identifies the smallest element in the stream based on a provided comparator or natural ordering.
 * 3. collect(Collectors.toList) gathers all the elements of the stream into a new List.
 *
 * Examples
 * - List<Integer> numbers = List.of(1, 2, 3, 4, 5);
 * - Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
 * - maxNumber.ifPresent(System.out::println); // Output: 5
 *
 * - List<Integer> numbers = List.of(1, 2, 3, 4, 5);
 * - Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo); // Output: 1
 *
 * - List<String> words = Arrays.asList("Stream", "Operations", "Java");
 * - List<String> collectedWords = words.stream().collect(Collectors.toList());
 * - System.out.println(collectedWords); // Output: [Stream, Operations, Java]
 */

package com.coding.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxCollect_TerminalFunctions {
    public static void main(String[] args) {
        demonstrateMax();
        demonstrateMin();
        demonstrateCollectToList();
    }

    private static void demonstrateMax() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // 1a) Find max via natural ordering (Integer::compareTo)
        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);
        maxNumber.ifPresent(m -> System.out.println("Max (Integer): " + m));

        // 1b) Find max with a custom comparator (e.g. largest by absolute value)
        List<Integer> numsWithNegatives = List.of(-10, 7, -3, 22, 0);
        Optional<Integer> maxByAbs = numsWithNegatives.stream()
                .max(Comparator.comparingInt(Math::abs));
        maxByAbs.ifPresent(m -> System.out.println("Max by absolute value: " + m));
        System.out.println();
    }

    private static void demonstrateMin() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // 2a) Find min via natural ordering
        Optional<Integer> minNumber = numbers.stream()
                .min(Integer::compareTo);
        minNumber.ifPresent(m -> System.out.println("Min (Integer): " + m));

        // 2b) Find min with a custom comparator (e.g. shortest string length)
        List<String> words = Arrays.asList("Stream", "Operations", "Java");
        Optional<String> shortestWord = words.stream()
                .min(Comparator.comparingInt(String::length));
        shortestWord.ifPresent(s -> System.out.println("Shortest word: " + s));
        System.out.println();
    }

    private static void demonstrateCollectToList() {
        // 3) Collecting a filtered/subset stream back into a List
        List<String> words = Arrays.asList("Stream", "Operations", "Java", "Collect", "MinMax");

        List<String> longWords = words.stream()
                .filter(w -> w.length() >= 6)
                .collect(Collectors.toList());
        System.out.println("Original words: " + words);
        System.out.println("Words with length >= 6: " + longWords);
        System.out.println();
    }
}

