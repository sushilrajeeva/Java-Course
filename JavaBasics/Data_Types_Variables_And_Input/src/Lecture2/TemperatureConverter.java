package Lecture2;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("This program converts temperature between Fahrenheit and Celsius.");

        try (Scanner input = new Scanner(System.in)) {
            // 1) Prompt for scale
            System.out.print("Please enter the temperature scale you have (F or C): ");
            String scale = input.nextLine().trim().toUpperCase();

            // 2) Validate scale
            if (!scale.equals("C") && !scale.equals("F")) {
                throw new IllegalArgumentException("Scale must be 'F' or 'C'.");
            }

            // 3) Prompt for temperature
            System.out.print("Enter the temperature value (" + scale + "): ");
            double value = input.nextDouble();

            // 4) Convert
            double result;
            String targetScale;
            if (scale.equals("F")) {
                // F → C: (F − 32) × 5/9
                result = (value - 32) * 5.0 / 9.0;
                targetScale = "C";
            } else {
                // C → F: (C × 9/5) + 32
                result = (value * 9.0 / 5.0) + 32;
                targetScale = "F";
            }

            // 5) Display with two decimal places
            System.out.printf("%.2f %s is %.2f %s%n", value, scale, result, targetScale);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid input—please run again and enter numeric values where required.");
        }
    }
}
