package com.pluralsight;

import java.util.Scanner;

public class FutureValueCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in); // Scanner object to receive users inputs.

        //User inputs

        System.out.println(" WELCOME TO THE FUTURE VALUE CALCULATOR !");

        System.out.println(" Please provide the deposit Amount : ");
        double depositAmount = myScanner.nextDouble();
        System.out.println("Please provide the interest Rate : ");
        double interestRate = myScanner.nextDouble();
        System.out.println("Please provide the number of Years : ");
        double numberOfYears = myScanner.nextDouble();

        // Calculations. Set the compounding frequency per year, formula says  compounded daily, so n = 365
        int n = 365;

        double r = interestRate / 100; // Calculate rate in decimal. R is the rate or annual interest rate expressed as a decimal.

        //Formula for future value : A = P(1+r/n)(nt) A= future value, P = Principal or deposit , R= Annual interest rate in decimal,
        // n = is the number of times that interest in compounded every year, t = time or number of years.

        double futureValue = depositAmount * Math.pow((1 + ( r / n)), (n * numberOfYears));

        //Total interest earned calculations
        double interestEarned = futureValue - depositAmount;


        System.out.println("Your future value is : " + futureValue);
        System.out.println("Total interest earned :" + interestEarned);


        myScanner.close();
    }

}
