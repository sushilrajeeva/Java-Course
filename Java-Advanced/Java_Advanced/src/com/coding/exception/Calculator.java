package com.coding.exception;

import com.coding.helper.UserInput;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int[] inputs = UserInput.userInput("This is a calculator that divides two numbers", "Please enter your first Number", "Please enter your second number");
        int a = inputs[0];
        int b = inputs[1];

        try {
            int result = a / b;
            System.out.printf("Result is %d \n", result);
        } catch (ArithmeticException exception) {
            System.out.printf("%s, enter valid values. \n", exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array index is out of bound!!");
        } catch (Throwable throwable) {
            System.out.println("General exception");
        } finally {
            System.out.println("I am in finally block");
        }

    }
}
