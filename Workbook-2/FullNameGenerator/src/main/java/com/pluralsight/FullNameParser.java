package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println(" Please enter your full name : ");
        String fullName  = myScanner.nextLine();

        String[] nameParts = fullName.split(" "); //looking for space to split it

        // output to the user

        System.out.println("First name : " + nameParts[0]); // print the first name
        System.out.println("Middle name: " + nameParts [1]); // print the middle name
        System.out.println("Last name: " + nameParts [2]); // print the last name














    }


}
