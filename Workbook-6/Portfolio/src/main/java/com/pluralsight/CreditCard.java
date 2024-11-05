package com.pluralsight;

public class CreditCard implements Valuable {

    private String name;
    private String accountNumber;
    private double balance;

    //Constructor
    public CreditCard(String accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public void charge (double amount){
        this.balance +=amount;
    }

    public void pay(double amount){
        this.balance -=amount;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
