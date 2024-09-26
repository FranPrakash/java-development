package com.pluralsight;



import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        //I am creating a scanner object to accept user input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        //Accepting the next float input from the user and using it to float variable
        float firstNumber = myScanner.nextFloat();
        System.out.println( "Enter the second number");
        float secondNumber = myScanner.nextFloat();
        //I am accepting the next float input from the user amd using it to float variable

        System.out.println( "Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.println("Please select an option"); // Receive an input string from user
        String option = myScanner.next(); // I am using the method myScanner.next() because next.line didnt work.

        switch(option) { // I am using switch statement to print out the result based on the user choice.
            case "A": //User selected addition option
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break; // Break makes the pc exit the switch block after print the output
            case "S": //User selected subtraction option
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case "M": //User selected multiplication option
                System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            case "D": //User selected division option
                System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        }

        myScanner.close(); // Closing the scanner
    }
}
