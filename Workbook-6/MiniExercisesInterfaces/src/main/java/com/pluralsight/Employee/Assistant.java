package com.pluralsight.Employee;

//A specific type of PartTimeEmployee. They can be promoted.
//Abstract class
public  class Assistant extends PartTimeEmployee implements Promotable {


    @Override
    public void promote() {

    }

    @Override
    public double getSalary() {
        return 0;
    }
}
