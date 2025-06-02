/**
 * Functional Interfaces
 * 1. Single Abstract Method (SAM): A functional interface has only one abstract method. However, it can have multiple default or static methods.
 * 2. Lambda compatibility: They are intended to be used with lambda expressions, providing a target type for lambdas and method references.
 * 3. @FunctionalInterface Annotation: While not mandatory, this annotation helps the compiler to indentify the intention of making an interface functional and to generate an error if the annotation interface does not satisfy the conditions.
 * 4. Common examples: Predicate, Consumer, BinaryOperator, Runnable, Callable, Comparator, and User-defined interfaces can be functional if they have only one abstract method.
 *
 * - Predicate<Integer> isPositive = x -> x > 0;
 * -- System.out.println(isPositive.test(5)); // Output: true
 * -- System.out.println(ispositive.test(-5)); // Output: false
 *
 * - Consumer<String> print = message -> System.out.println(message);
 * -- print.accept("Hello, World!"); // Output: Hello, World!
 *
 * - BinaryOperator<Integer> multiplier = (Integer a, Integer b) -> a * b;
 * -- System.out.println(multiplier.apply(3, 5)); // Output: 15
 *
 */

package com.coding.FunctionalInterfaces;

public class FunctionalInterfaceTest {
}
