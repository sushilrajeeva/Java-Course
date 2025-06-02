package com.coding.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 1. Shortcuts: Lmabda expressions are quick, nameless functions for small tasks.
 * 2. Syntax: Written as (parameters) -> {body}, linking inputs to actions.
 * 3. Functional Interfaces: They work with interfaces that have only one method, making code concise.
 * 4. Readability: They make code shorter and cleaner, especially with collections.
 * 5. Useful with collections: Great for managing lists and sets, like filtering or sorting.
 *
 * Lambda Syntax
 * - No arguments: () -> System.out.println("Hello";
 * - One argument: s -> System.out.println(s);
 * - Two arguments: (x, y) -> x + y;
 * - with explicit argument types:
 *          (Integer x, Integer y) -> x + y;
 * - Multiple statements:
 *          (x, y) -> {
 *              System.out.println(x);
 *              System.out.println(y);
 *              return (x + y);
 *          }
 */

public class LambdaExpression {
    public static void main(String[] args) {

        // lambda function
        // 1. Simple addition: (int a, int b) -> a + b;
        //    Use BiFunction<T, U, R> for a function taking (T, U) and returning R.
        BiFunction<Integer, Integer, Integer> adder = (Integer a, Integer b) -> a + b;
        System.out.println("3 + 5 = " + adder.apply(3, 5)); // prints 3 + 5 = 8

        // 2. Check if a number is even: (int number) -> number % 2 == 0;
        //    Use Predicate<T> for a boolean‐returning test on T.
        Predicate<Integer> isEven = (Integer number) -> number % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10)); // true
        System.out.println("Is 7 even?  " + isEven.test(7));  // false

        // 3. Print a message: (String message) -> System.out.println(message);
        //    Use Consumer<T> for a lambda that takes T and returns void.
        Consumer<String> printer = (String message) -> System.out.println("You said: " + message);
        printer.accept("Hello, lambdas!");

        // 4. Sort a list of strings by length: (String s1, String s2) -> s1.length() - s2.length();
        //    Use Function to map, or directly use Comparator in a sort call.
        List<String> words = Arrays.asList("banana", "kiwi", "watermelon", "apple");
        // Using a Comparator via List.sort(…)
        words.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println("Sorted by length: " + words);
        // Alternatively, using a method reference:
        // words.sort(Comparator.comparingInt(String::length));

        // 5. Runnable with lambda (no parameters): () -> System.out.println("Hello, World!");
        //    Use Runnable for a no‐arg, void lambda.
        Runnable sayHello = () -> System.out.println("Hello, World!");
        sayHello.run();

        // 6. Extra example: Function<T, R> to transform one type to another
        Function<String, Integer> stringToLen = (String s) -> s.length();
        System.out.println("Length of 'Lambda' is " + stringToLen.apply("Lambda"));

        // 7. Multiple statements in a lambda body:
        BiFunction<Integer, Integer, Integer> multiplyAndPrint = (x, y) -> {
            System.out.println("Multiplying " + x + " and " + y);
            int result = x * y;
            System.out.println("Result = " + result);
            return result;
        };
        multiplyAndPrint.apply(4, 7);

    }


}
