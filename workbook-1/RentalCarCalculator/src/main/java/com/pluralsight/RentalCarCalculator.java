package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    //Start by get all the information from the user

    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Hello, please provide some information regarding your car rental : ");
        System.out.println("What is your pick up date ? ");
        String pickupDate = myscanner.nextLine();
        System.out.println("For how many days are you going to rent the car ? ");
        int rentalCarDays = myscanner.nextInt();
        System.out.println("Do you need a GPS ? True or False ? please note, GPS charge is $2.95/day");
        boolean gps = myscanner.nextBoolean();
        System.out.println("Do you need a toll tag ? True or False ? please note, toll tag charge $3.95/day");
        boolean tollTag = myscanner.nextBoolean();
        System.out.println("Do you need a roadside assistance ? True or False ? please note, RA charge is 3.95/day");
        boolean roadsideAssistance = myscanner.nextBoolean();
        System.out.println("How old are you? ");
        int age = myscanner.nextInt();

        // Declaring variable that I need to calculate the if statement // variable always before if statement

        float basicCarRentalCost;
        float tollTagCost;
        float gpsCost;
        float roadsideAssistanceCost;
        float underAgeDriveCost;
        float totalCost;

        // Calculations

        basicCarRentalCost = rentalCarDays * 29.99f; // // Calculate this to be used later

        if (gps) {
            gpsCost = rentalCarDays * 2.95f;
        } else {
            gpsCost = 0;
        }

        if (tollTag) {
            tollTagCost = rentalCarDays * 3.95f;
        } else {
            tollTagCost = 0;
        }

        if (roadsideAssistance) {
            roadsideAssistanceCost = rentalCarDays * 3.95f;
        } else {
            roadsideAssistanceCost = 0;
        }

        if (age < 25) {
            underAgeDriveCost = basicCarRentalCost * 0.3f;
        } else {
            underAgeDriveCost = 0;
        }


        //Total costs display output to users

        float optionsCost = tollTagCost + gpsCost + roadsideAssistanceCost; // Calculating here so I can use later
        totalCost = optionsCost + basicCarRentalCost + underAgeDriveCost; // Total user you pay for everything

        System.out.println("Basic car rental cost : " + basicCarRentalCost);
        System.out.println("Options Costs : " + optionsCost);
        System.out.println("underAgeDriveCost : " + underAgeDriveCost);
        System.out.println("Total cost : " + totalCost);


    }

}

