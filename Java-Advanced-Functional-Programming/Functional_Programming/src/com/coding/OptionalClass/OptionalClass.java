/**
 * Optional Class
 * 1. Creating Optional Objects: Optional.empty(), Optional.of(), Optional.ofNullable()
 * 2. Checking Value Presence: isPresent() and ifPresent()
 * 3. Default Values: orElse() and orElseGet()
 * 4. Value Transformation: map()
 * 5. Throwing Exception: orElseThrow()
 *
 * Creating optional objects
 * - Optional<String> optionalEmpty = Optional.empty();
 * - Optional<String> optionalOf = Optional.of("Java");
 * - Optional<String> optionalNullable = Optional.ofNullable(null);
 *
 * Checking prese of value
 * - if (optionalOf.isPresent()) {
 *     System.out.println("Value is present: " + optionalOf.get());
 * }
 *
 * Using orElse to provide a fallback
 * - tring orElseExample = optionalEmpty.orElse("Default Value");
 * - System.out.println("Using orElse: " + orElseExample);
 *
 * Using ifPresent to perform an action if value is present
 * - optionalOf.ifPresent(System::out::println);
 */

package com.coding.OptionalClass;

import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3 ,4, 2, 5, 6, 3);
        System.out.println("Given number list = " + numbers);
        Optional<Integer> total = numbers.stream()
                .reduce((Integer a, Integer b) -> a + b);
//        if (total.isPresent()) {
//            System.out.println("Sum of all numbers = " + total.get());
//        } else {
//            System.out.println("List is empty");
//        }

        total.ifPresent(sum -> System.out.println("Sum of all numbers = " + sum));
        if (!total.isPresent()) {
            System.out.println("List is empty");
        }
    }
}
