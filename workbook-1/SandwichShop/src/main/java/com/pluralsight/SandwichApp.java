package com.pluralsight;

import java.util.Scanner;

public class SandwichApp {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in); // Scanner object to receive input from the user.

        // Ask user for the type of Sandwich
        System.out.println("What type of sandwich do you want ? Please enter 1 or 2 \n");
        System.out.println("Size 1 Regular:$5.45");
        System.out.println("Size 2 Large:$8.95");

        // User choice's for sandwich
        byte choice = myScanner.nextByte(); // what if I use int ?

        // Ask user for their age to provide discounts.
        System.out.println("Discounts are available based on your age. Please provide your age: ");

        float basePrice; //declare the base price as a float variable // Declare variable before if statement.

        //calculate the basePrice based on user Input
        if (choice == 1)
            basePrice = 5.45f;
        else basePrice = 8.95f;

       //calculate the discount based on user Age Input
        byte discount; //declare the discount as a byte variable
       //Scanner object to Accept user's age and store it in an int variable
        int age = myScanner.nextInt();

        if (age <=17)  discount = 10;
        else if (age >=65) discount =20;
        else  discount = 0; {
        }

        // Calculate final cost of the sandwich
       float finalCost = basePrice * (100 - discount)/100;

        System.out.println("Base Price: $" + basePrice);
        System.out.println("Discount: $" + discount);
        System.out.println("Final Price : $" + finalCost);

        myScanner.close();
    }

}
