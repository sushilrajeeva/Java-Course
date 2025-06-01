package com.coding.collection.Assignment1;

import com.coding.collection.helper.PrintCollection;
import com.coding.collection.helper.UserInput;

import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        List<String> inputs = UserInput.userInputStrings("1. Concatenating variable strings", "Enter First String", "Enter Second String", "Enter Third String");
        System.out.println("After concatenating strings : " + concatinateStrings(inputs.toArray(new String[0])));
        System.out.println("2. Sort the list objects in descending order using a custom comparator");
        System.out.println("Original List");
        PrintCollection.print(inputs);
        System.out.println("After sorting in descending order");
        sortStrings(inputs);
        PrintCollection.print(inputs);
        System.out.println("3. Number of times Sushil occurs in the List : " + getCount(inputs, "Sushil"));
        System.out.println("4. Swap the first and last elements in the array");
        System.out.println("After Swap...");
        swapArrayElements(inputs, 0, 2);
        PrintCollection.print(inputs);
        System.out.println("5. Reversing the list");
        reverseArray(inputs);
        PrintCollection.print(inputs);

        Queue<Student> queue = new PriorityQueue<>(
                Comparator.comparing(Student::getGrade)
        );

        Student sushil  = new Student("Sushil",  "A");
        Student nikhil  = new Student("Nikhil",  "D");
        Student bharath = new Student("Bharath", "C");

        queue.add(sushil);
        queue.add(nikhil);
        queue.add(bharath);

        System.out.println("\n6. Students ordered by grade (A → Z):");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("7. Count the number of unique charecters in a given string");
        String str = UserInput.userInput("Enter the String");
        System.out.printf("Number of unique charecters in %s : %d \n", str, uniqueCharecters(str));

    }

    public static String concatinateStrings(String... str) {
        StringBuilder res = new StringBuilder();
        for (String s : str) {
            res.append(s);
        }
        return res.toString();
    }

    public static void sortStrings(List<String> list) {
        list.sort(Comparator.reverseOrder());
    }

    public static int getCount(List<String> list, String target) {
        return Collections.frequency(list, target);
    }

    public static void swapArrayElements(List<String> list, int index1, int index2) {
        String temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void reverseArray(List<String> list) {
        Collections.reverse(list);
    }

    public static int uniqueCharecters(String str) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i< str.length(); i++) {
            set.add(str.charAt(i));
        }
        return set.size();
    }

}
