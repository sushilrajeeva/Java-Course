package L3_Loops_Assignment;

import java.util.ArrayList;

public class ElementOccurance {
    public static ArrayList<Integer> arr;
    public static void main(String[] args) {
        pupulateArray();
        isElementFound();
    }

    public static void pupulateArray() {
        int length = UserInput.userInput("This program checks if a number exist in your array", "Enter the length of the array : ");
        arr = new ArrayList<>();
        do {
            arr.add(UserInput.userInput("", "Enter array element : "));
        } while (arr.size() < length);
    }

    public static void isElementFound() {
        int number = UserInput.userInput("", "Enter the number you want to check : ");
        String res = " is not present in your array.";
        for (int num : arr) {
            if (num == number) {
                res = " is present in your array.";
                break;
            }
        }
        System.out.println("The number " + number + res);
    }
}