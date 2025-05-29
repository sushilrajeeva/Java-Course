package com.assignment;

public class ArrayOperations {

    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics {
         double mean () {
             double sum = 0;
             if (numbers.length == 0) return 0;
             for (int number : numbers) {
                 sum += number;
             }
            return sum / numbers.length;
        }

        double median() {
            if (numbers.length == 0) return 0;
            return 0;
        }
    }
}
