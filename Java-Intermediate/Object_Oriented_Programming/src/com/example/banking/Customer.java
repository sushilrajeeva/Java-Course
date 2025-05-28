package com.example.banking;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1, "Sushil Rajeeva Bhandary", 5000);
        account.deposit(1000);
        System.out.println();
        account.withdraw(2000);
        System.out.println();
        account.deposit(-40);
        System.out.println();
        account.withdraw(-400);
        System.out.println();
        account.withdraw(8000);
    }
}
