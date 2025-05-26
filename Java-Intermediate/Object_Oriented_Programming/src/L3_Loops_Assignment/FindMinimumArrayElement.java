package L3_Loops_Assignment;

import java.util.ArrayList;

public class FindMinimumArrayElement {
    public static ArrayList<Integer> arr;
    public static void main(String[] args) {
        pupulateArray();
        findMinimum();
    }

    public static void pupulateArray() {
        int length = UserInput.userInput("This program computes the minimum element of the array", "Enter the length of the array : ");
        arr = new ArrayList<>();
        do {
            arr.add(UserInput.userInput("", "Enter array element : "));
        } while (arr.size() < length);
    }

    public static void findMinimum() {
        int minimum = Integer.MAX_VALUE;
        for (int value : arr) {
            minimum = Math.min(minimum, value);
        }
        System.out.println("The minimum array element is : " + minimum);
    }
}
