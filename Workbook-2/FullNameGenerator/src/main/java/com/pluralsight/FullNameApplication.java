package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //User input
        System.out.println("Please enter you name bellow. ");
        System.out.println("Please enter your fist name: ");
        String firstName = myScanner.nextLine();
        System.out.println("Please enter your middle name: ");
        String middleName = myScanner.nextLine();
        System.out.println("Please enter your last name");
        String lastName = myScanner.nextLine();
        System.out.println("Please enter your Suffix: ");
        String suffix = myScanner.nextLine();


        System.out.print(firstName + " "); // " " space


        if (middleName == "") { // "" Empty string . If empty print nothing.
            System.out.print("");
        } else {
            System.out.print(middleName + " ");
        }

        System.out.print(lastName);


        if (suffix == "") {
            System.out.print("");
        } else System.out.print(", " + suffix);


        myScanner.close();


    }

}
