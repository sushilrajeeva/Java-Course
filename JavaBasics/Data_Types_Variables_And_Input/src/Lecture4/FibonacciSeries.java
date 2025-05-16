package Lecture4;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Integer n = userInput();
        if (n == null) return;

        System.out.println("Fibonacci series up to " + n + " is: " + fibonacciSeries(n));
    }

    public static Integer userInput() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter a non-negative integer for Fibonacci series: ");
            int in = input.nextInt();
            if (in < 0) {
                throw new Exception();
            }
            return in;
        } catch (Exception e) {
            System.out.println("Invalid input—please enter an integer ≥ 0.");
            return null;
        }
    }

    public static String fibonacciSeries(int n) {
        int[] memo = new int[n + 1];
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(fib(i, memo)).append(" ");
        }
        return res.toString().trim();
    }

    public static int fib(int n, int[] memo) {
        if (memo[n] != 0) {
            return memo[n];
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }
}
