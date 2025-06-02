package com.coding.Assignment1;

import com.coding.helpers.UserInput;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> userList = getUserList();
        printStream(userList);
        filterAndConcatinate(userList);
        filterOddNumbersAndPrint();
    }

    public static List<String> getUserList() {
        return UserInput.userInput("This program computes takes user inputs to build string array and prints on the console", "Enter first string", "Enter second string", "Enter third string", "Enter fourth string", "Enter fifth String");
    }

    public static void printStream(List<String> list) {
        System.out.println("Converting into streams and printing the user list");
//        list.stream().forEach(s -> System.out.println(s));
//        list.stream().forEach(System.out::println);
        list.forEach(System.out::println);
    }

    public static void filterAndConcatinate(List<String> list) {
        System.out.println("Filtering user list elements whose length is more than 5 and concatinating them");
        String res = list.stream().filter(ele -> ele.length() > 5).reduce("", (String a, String b) -> a.isEmpty() ? b : a + " " + b);
        System.out.println("Filter and Concatenate result -> " + res);
    }

    public static void filterOddNumbersAndPrint() {
        List<Integer> numbers = List.of(1, 2, 4, 5, 6, 7, 32, 45, 21, 4, 53, 31 ,56, 75, 75, 44, 23);
//        numbers.stream().filter(num -> num % 2 != 0).forEach(num -> System.out.print(num + " "));
        String res = numbers.stream().filter(num -> num % 2 != 0).map(num -> Integer.toString(num)).reduce("", (String a, String b) -> a.isEmpty() ? b : a + " " + b);
        System.out.println("Printing filtered odd numbers -> " + res);
    }


}
