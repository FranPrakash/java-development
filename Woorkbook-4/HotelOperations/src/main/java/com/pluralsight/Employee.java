package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private float payRate;
    private float hoursWorked;

    //Getters
    public String getDepartment() {
        return department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public String getName() {
        return name;
    }

    public float getPayRate() {
        return payRate;
    }

    // Derived getters

    public float getRegularHours() {
        if (hoursWorked >= 40) {
            return 40;
        } else return hoursWorked; // because the hours worked is regular hours
    }

    public float getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40; // -40 because I will get the reminder hours that is going to be the overtime hours
        } else return 0;
    }

// over time hours are paid 50% higher than regular hours
    public float getTotalPay() {
       return this.getRegularHours() * this.payRate + this.getOvertimeHours()* this.payRate * 1.5f;
        //total pay = regular pay + over time pay
        // over time pay is = overtime hours * pay rate * 1.5 (50% more)
    }


}
