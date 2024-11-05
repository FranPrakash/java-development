package com.pluralsight.Employee;

public class Manager extends FullTimeEmployee implements Promotable{

    //A specific type of FullTimeEmployee. They can be promoted.

    @Override
    public void promote() {

    }

    @Override
    public double getSalary() {
        return 0;
    }
}
