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
        System.out.println("Would you like the Sandwich Loaded ? ");
        System.out.println("There is an additional cost for a loaded sandwich");
        System.out.println("Additional $1.00 for regular sandwich");
        System.out.println("Additional $1.75 for large sandwich");
        System.out.println("Please enter Yes or No : ");
        //Accept user choice using myScanner object's Next method and store it in a String variable.
        String loadedSandwich = myScanner.next(); // Declaring this variable as string


        // User provide age
        System.out.println("Discounts are available based on your age. Please provide your age: ");
        //Scanner object to Accept user's age
        int age = myScanner.nextInt();
        float basePrice; //declare the base price as a float variable // Declare variable before if statement.


        //calculate the basePrice based on user Input and loaded option

        float loadedPrice; //declare variable loadedPrice

        if (choice == 1) { // If user choose choice 1
            basePrice = 5.45f;
        }
        else { // user has selected choice 2
            basePrice = 8.95f;
        }

        if (loadedSandwich.equals ("yes") && choice == 1) { // I was trying to do this loadedSandwich == "yes" but didn't work and intelliJ suggest the equals method.
            loadedPrice = 1.0f;
        } else if (loadedSandwich.equals("yes") && choice == 2) {
            loadedPrice = 1.75f;
        } else loadedPrice =0.0f;


       // Calculate discount based on user age
        float discountAmount;

        if (age <=17){
            discountAmount = (basePrice + loadedPrice ) * 0.10f;
        }
        else if (age >=65) {
            discountAmount = (basePrice + loadedPrice ) * 0.20f;
        }
        else  discountAmount = 0.0f;

        // Calculate final cost of the sandwich

        float finalCost = basePrice + loadedPrice - discountAmount;

        System.out.println("Base Price: $" + basePrice);
        System.out.println("loaded Charge: $" + loadedPrice);
        System.out.println("Discount: $" + discountAmount);
        System.out.println("Final Price : $" + finalCost);

        myScanner.close();

    }

}