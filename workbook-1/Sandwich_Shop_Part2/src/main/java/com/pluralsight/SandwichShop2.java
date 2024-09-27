package com.pluralsight;

import java.util.Scanner;

public class SandwichShop2 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in); // Scanner object to receive input from the user.

        // Ask user for the type of Sandwich
        System.out.println("What type of sandwich do you want ? Please enter 1 or 2 \n");
        System.out.println("Size 1 Regular:$5.45");
        System.out.println("Size 2 Large:$8.95");

        // User choice's for sandwich
        byte choice = myScanner.nextByte(); // what if I use int ?

        // Ask user choice for sandwich loaded
        System.out.println(" Would you like the Sandwich Loaded ? Yes or no ?");
        //Accept user choice using myScanner object's NextBoolean method and store it in a bool variable.
        boolean loadedSandwich = myScanner.nextBoolean();

        // Telling user additional costs
        System.out.println("There is an additional cost for a loaded sandwich");
        System.out.println("Additional $1.00 for regular sandwich");
        System.out.println("Additional $1.75 for large sandwich");


        // Ask user for their age to provide discounts.
        System.out.println("Discounts are available based on your age. Please provide your age: ");

        float basePrice = 0.0f; //declare the base price as a float variable // Declare variable before if statement.
        float loadedPrice = 0.0f; // My code was not running, It was asking for initialization of the variable that, is why
        //I gave it a value.


        //calculate the basePrice based on user Input
        if (choice == 1) {
            basePrice = 5.45f;
            if (loadedSandwich) loadedPrice = 1.0f;
            else basePrice = 8.95f;
            if (loadedSandwich) loadedPrice = 1.75f;
        }
        //calculate the discount based on user Age Input
        byte discount; //declare the discount as a byte variable
        //Scanner object to Accept user's age and store it in an int variable
        int age = myScanner.nextInt();

        if (age <=17)  discount = 10;
        else if (age >=65) discount =20;
        else  discount = 0; {
        }

        // Calculate final cost of the sandwich
        float finalCost = basePrice + loadedPrice * (100 - discount)/100;

        System.out.println("Base Price: $" + basePrice);
        System.out.println("loaded Charge :" + loadedPrice);
        System.out.println("Discount: $" + discount);
        System.out.println("Final Price : $" + finalCost);

        myScanner.close();
    }

}