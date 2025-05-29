package com.encapsulation.banking;

public class Employee {
    private String name;
    private int age;
    private float salary;

    public Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("************* Here is the Employee Details *************");
        System.out.printf("Employee Name : %s", this.name);
        System.out.println();
        System.out.printf("Employee Age : %d", this.age);
        System.out.println();
        System.out.printf("Employee Salary : %f USD", this.salary);
        System.out.println();
        System.out.println("********************************************************");
    }
}
