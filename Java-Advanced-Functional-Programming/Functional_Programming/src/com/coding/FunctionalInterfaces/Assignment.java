package com.coding.FunctionalInterfaces;

import com.coding.helpers.UserInput;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Assignment {
    public static void main(String[] args) {
        isPrime();
        //factorial();
        factorialFP();
        System.out.println(toOptionalString());
    }

    public static void isPrime() {
        Candidate candidate = num -> {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i < (int) Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int num = UserInput.userInputInt("Enter a number to check if it is prime or not");
        String res = candidate.isCandidate(num) ? num + " is a prime number." : num + " is not a prime number.";
        System.out.println(res);
    }

    public static void factorial() {
        int number = UserInput.userInputInt("Enter a number to compute its factorial");
        int fact = 1;
        if (!(number == 0 || number == 1)) {
            for (int i = 2; i <= number; i++) {
                fact *= i;
            }
        }

        System.out.println("Factorial of the number is -> " + fact);
    }

    public static void factorialFP() {
        int number = UserInput.userInputInt("Enter a number to compute its factorial");
        OptionalInt factOpt =  IntStream.rangeClosed(2, number)
                .reduce((a, b) -> (a * b));

        int res = factOpt.orElse(1);
        System.out.println("Factorial of the number is -> " + res);
    }

    public static Optional<String> toOptionalString() {
        String input = UserInput.userInput("Enter a String to convert it into an Optional String");
        if (input.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(input.toUpperCase());
    }
}
