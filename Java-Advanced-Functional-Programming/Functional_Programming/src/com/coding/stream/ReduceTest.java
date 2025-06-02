/**
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
 * int sum = numbers.stream().
 *                   .reduce(0, (a, b) -> a + b);
 * // sum: 15
 *
 * 1. Purpose: Used to reduce the elements of a stream to a single value. It takes a binary operator as a parameter and applies it repeatedly, combining the elements of the stream.
 * 2. Versatile: Can be used for summing, finding min or max, and combining elements in a myriad of ways.
 * 3. Optional or Default value: Without an identity value, reduce returns an Optional. With an identity value, it returns a default value if the stream is empty.
 */

package com.coding.stream;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 100, 6, 7);
        System.out.println("Given numbers list -> " + numbers);

        // find sum of the numbers
//        int sum = 0;
//        for (Integer number : numbers) {
//            sum += number
//        }
//        System.out.println(sum);

        // find sum of the numbers using reduce
//        int sumUsingReduce1 = numbers.stream()
//                .reduce(0, new BinaryOperator<Integer>() {
//                    @Override
//                    public Integer apply(Integer integer, Integer integer2) {
//                        return integer + integer2;
//                    }
//                });
//
//        System.out.println("Sum using Reduce 1 -> " + sumUsingReduce1);
        // advanced reduce
        int sumUsingReduce2 = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum using Reduce 2 -> " + sumUsingReduce2);

        // get max number
        int maxNumber = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

        System.out.println("Max value in the numbers array using reduce -> " + maxNumber);

    }
}
