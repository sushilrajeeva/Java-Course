package com.coding.Assignment1;

import com.coding.helpers.UserInput;

import java.util.function.BiFunction;

public class LambdaTest {
    public static void main(String[] args) {
        multiplicationUsingLambda();
    }

    public static void multiplicationUsingLambda() {
        int[] inputs = UserInput.userInput("This program computes multiplication of two numbers using lambda expression",
                "Enter first number", "Enter second number");
        int a = inputs[0];
        int b = inputs[1];

        BiFunction<Integer, Integer, Integer> multiplier = (Integer x, Integer y) -> x * y;
        System.out.printf("%d * %d = %d \n", a, b, multiplier.apply(3, 5));
    }
}
