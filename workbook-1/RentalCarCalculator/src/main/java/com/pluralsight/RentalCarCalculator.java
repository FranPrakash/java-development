package com.pluralsight;

import java.util.Scanner;


public class RentalCarCalculator {

public static void main (String[] args) {

    Scanner myScanner = new Scanner(System.in);

    // Start by getting information from the user


        System.out.println( "Hello ! please provide some information about your car rental: ");
        System.out.println( "What is your pick up date ? ");
        String pickUpDate = myScanner.nextLine();
        System.out.println(" For how many days are you going to rent the car ?");
        int rentalCarDays = myScanner.nextInt();
        System.out.println(" Do you need a toll tag ? True or False ? please note, toll tag charge is $3.95/day");
        boolean toolTag = myScanner.nextBoolean();
        System.out.println(" Do you need a GPS  ? True or False ? please note, GPS charge is $2.95/day ");
        boolean gps = myScanner.nextBoolean();
        System.out.println(" Do you need a roadside assistance ? True or False ? please note, roadside assistance charge is $3.95/day");
        boolean roadsideAssistance = myScanner.nextBoolean();
        System.out.println ("How old are you ?");
        int age = myScanner.nextInt();


        //Declaring variables to be used

    float basicCarRentalCost;
    float tollTagCost;
    float gpsCost;
    float roadSideAssistanceCost;
    float underageDriveSurchargeCost;
    float totalCost;

    // Calculations

    basicCarRentalCost = rentalCarDays * 29.99f; // Calculate this to be used in the if else

    if (toolTag  ) { tollTagCost = rentalCarDays * 3.95f;}
    else {tollTagCost = 0f;}

    if (gps ) { gpsCost = rentalCarDays * 2.95f;}
    else { gpsCost = 0f;}

    if (roadsideAssistance ) { roadSideAssistanceCost = rentalCarDays *3.95f;}
    else { roadSideAssistanceCost = 0f;}

    if (age <25 ) {underageDriveSurchargeCost = basicCarRentalCost * 0.3f;}
    else {underageDriveSurchargeCost = 0f;}

    //Display output to users
    //Total Cost

   float optionsCost = tollTagCost + gpsCost + roadSideAssistanceCost;
    totalCost = basicCarRentalCost + optionsCost + underageDriveSurchargeCost;

    System.out.println( "Basic car rental cost : " + basicCarRentalCost);
    System.out.println( "options Costs: " + optionsCost);
    System.out.println( "UnderAge Drive Cost : " + underageDriveSurchargeCost);
    System.out.println( "Total Cost : " + totalCost);




    }
}