package com.inheritance;

public class EqualsAndHashcodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Sushil", 28, "001");
        Person person2 = new Person("Sushil", 28, "001");

        if (person1.equals(person2)) {
            System.out.println("Both person's are same");
        } else {
            System.out.println("Both person's are different");
        }
    }
}
