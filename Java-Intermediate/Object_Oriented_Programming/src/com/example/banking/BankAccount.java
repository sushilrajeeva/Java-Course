package com.example.banking;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.printf("Can't deposit negative balance %f to your account! Your current balance is : %f USD", amount, this.balance);
        } else {
            this.balance += amount;
            System.out.printf("%f USD deposited successfully!, your new balance is : %f USD", amount, this.balance);
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.printf("Can't Withdraw negative amount %f from your account! Your current balance is : %f USD", amount, this.balance);
        }
        else if (amount > this.balance) {
            System.out.printf("Can't withdraw %f USD from your account! balance is low. Your current balance is : %f USD", amount, this.balance);
        } else {
            this.balance -= amount;
            System.out.printf("%f USD withdrawn successfully!, your new balance is : %f USD", amount, this.balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
