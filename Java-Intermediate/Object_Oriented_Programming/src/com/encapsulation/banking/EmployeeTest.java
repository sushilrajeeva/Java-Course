package com.encapsulation.banking;

import L3_Loops_Assignment.UserInput;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("This class tests the employee class");
        String name = UserInput.userInput("Enter the Employee name : ");
        int age = UserInput.userInputInt("Enter the employee age : ");
        float salary = UserInput.userInputFloat("Enter the employee salary : ");
        Employee employee = new Employee(name, age, salary);
        employee.displayEmployeeDetails();
    }
}
