package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {



    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //input from the user

        System.out.println("What is your full name ?");
        String fullName = myScanner.nextLine();
        System.out.println( "What date will you be coming ? note date format is MM/dd/yyyy ");
        String date = myScanner.nextLine();
        System.out.println( "How many tickets would you like ? ");
        int howManyTickets = myScanner.nextInt();

        //  check for invalid inputs . display error message if any values are missing
        if (fullName.isEmpty() || date.isEmpty() || howManyTickets == 0 ) {
            System.out.println(" Invalid options");
        }  else { // inputs are not missing

            //( howManyTickets + " ticket(s) reserved for " + date + "under " + fullName); }

            //Start printing the output: number of tickets
            System.out.print(howManyTickets + " ticket");

            if (howManyTickets > 1) {
                System.out.print("s");  // adding 's' in case that more than 1 ticket is selected
            }

            System.out.print(" reserved for ");

            // Start converting date from string to LocalDate format

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            // parse the date from string to localdate data type and store in a variable of localdate type
            LocalDate comingDate = LocalDate.parse(date, formatter);

            System.out.print(comingDate + " under " );

            // split the full name using space as delimiter to get the parts of the name
            //
            String[] nameParts = fullName.split(" ");
            String firstName = nameParts[0]; // first name is index at position 0
            String lastName;
            if (nameParts.length == 2) { // Check if name has 2 parts (middle name is missing)
                lastName = nameParts[1]; // if middle name is missing the last name is the element at position 1
            }
            else {
                lastName = nameParts[2]; // if there is middle name last name is the element at position 2
            }

            // print the full name in specified format
            System.out.print(lastName + ", " + firstName);

        }



    }

}
