package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    //exercise2

    private double startTime; //Variable created to track the punch in time
    private double todayHours; //Variable created to calculate today hours


    public Employee(String department, int employeeID, float hoursWorked, String name, float payRate) {
        this.department = department;
        this.employeeID = employeeID;
        this.hoursWorked = hoursWorked;
        this.name = name;
        this.payRate = payRate;
    }

    //Getters
    public String getDepartment() {
        return department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double getPayRate() {
        return payRate;
    }

    // Derived getters

    public double getRegularHours() {
        if (hoursWorked >= 40) {
            return 40;
        } else return hoursWorked; // because the hours worked is regular hours
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40; // -40 because I will get the reminder hours that is going to be the overtime hours
        } else return 0;
    }

// over time hours are paid 50% higher than regular hours
    public double getTotalPay() {
       return this.getRegularHours() * this.payRate + this.getOvertimeHours()* this.payRate * 1.5;
        //total pay = regular pay + over time pay
        // over time pay is = overtime hours * pay rate * 1.5 (50% more)
    }

//Exercise 2
    public void punchIn(double punchInTime){
        this.startTime = punchInTime; // setting the value of start time variable as punchInTime because the pouchIn method accept punchInTime as parameters

    }

    public void punchOut(double punchOutTime){

        this.todayHours = punchOutTime - this.startTime; // calculated the hours worked in a day todayhours = punch out - punch in time
        this.hoursWorked = this.hoursWorked + this.todayHours; // add the hours worked today to total hours worked calculating hours worked + todayhours storing in hours worked

    }
   //TODO: Bonus
   public void punchTimeCard(){

   }


}
