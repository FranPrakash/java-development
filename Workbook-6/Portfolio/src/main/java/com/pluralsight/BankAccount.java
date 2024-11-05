package com.pluralsight;

public class BankAccount implements Valuable {

    private String name;
    private String accountNumber;
    private double balance;

    //Constructor
    public BankAccount(String accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double amount) {
this.balance=balance;
    }

    public void witdraw(double amount) {

    }


    @Override
    public double getValue() {
        return 0;
    }
}
