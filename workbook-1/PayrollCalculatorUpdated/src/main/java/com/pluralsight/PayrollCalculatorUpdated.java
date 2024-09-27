package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculatorUpdated {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in); // I am creating a scanner object to receive user input

        System.out.println(" What is your name"); // Ask user's name

        String name = myScanner.next(); // User provides name

        System.out.println("Enter hours worked: ");

        float hours = myScanner.nextFloat();// User provides the hours worked

        System.out.println("Enter your pay rate: ");// Ask the user's pay rate

        float payRate = myScanner.nextFloat();//User provides their pay rate and it is stored in a float variable

        // Display the employee's name and their gross pay.
        // float grossPay = hours * payRate; Using to calculate the gross pay
        float grossPay = calculatePay(hours, payRate); // Calling a method to calculate gross pay.

        System.out.println("Employee Name is: " + name); //
        System.out.println( "Gross Pay is: " + grossPay);

        myScanner.close();
    }


    // Create a method to calculate pay so that we can separate the calculation rules for grossPay.

    public static float calculatePay (float hour, float payRate) {
        // return type is float because the gross pay is float

        float grossPay = hour * payRate;
        return grossPay;

    }
}

