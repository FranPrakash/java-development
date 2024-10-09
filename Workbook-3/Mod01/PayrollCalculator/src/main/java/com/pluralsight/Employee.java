package com.pluralsight;

public class Employee {

    //
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    // Declare the Constructor
    public Employee(int employeeID, String name , double hoursWorked, double payRate){
        this.employeeId=employeeID;
        this.name=name;
        this.hoursWorked=hoursWorked;
        this.payRate=payRate;

    }

    //Getter and setters and getEmployee method

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }


    // GetGrossPay Method and gross pay calculate

    public double getGrossPay() {

        double grossPay = this.payRate * this.hoursWorked;
        return grossPay;

    }




}


