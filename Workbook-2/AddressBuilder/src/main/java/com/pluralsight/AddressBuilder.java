package com.pluralsight;

import java.util.Scanner;


public class AddressBuilder {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");
        System.out.println("What's your full name ? "); // just one input
        String fullName = myScanner.nextLine();


        StringBuilder billingAdressBuilder = new StringBuilder(); // // Create a string builder object for get user input from billing adress.
        System.out.print("Billing Street : ");
        billingAdressBuilder.append(myScanner.nextLine());

        System.out.print("Billing City : ");
        billingAdressBuilder.append(myScanner.nextLine());


        System.out.print("Billing State: ");
        billingAdressBuilder.append(myScanner.nextLine());

        System.out.print("Billing Zip: ");
        billingAdressBuilder.append(myScanner.nextInt()); //zip code is integer ?
        myScanner.nextLine(); // skip a line

        StringBuilder shippingAddressBuilder = new StringBuilder(); //Create a string builder object for get user input from shipping Address
        System.out.print("Shipping Street: ");
        shippingAddressBuilder.append(myScanner.nextLine());

        System.out.print("Shipping city: "+ "\n");
        shippingAddressBuilder.append(myScanner.nextLine());


        System.out.print("Shipping state: ");
        shippingAddressBuilder.append(myScanner.nextLine());

        System.out.print("Shipping zip: ");
        shippingAddressBuilder.append(myScanner.nextInt()); //Zip is integer ?

        //call toString() method to get the result as a string
        String billingAdress = billingAdressBuilder.toString();
        String shippingAdress = billingAdressBuilder.toString();


        //Display the user information
        System.out.println("Full Name" + fullName);
        System.out.println("Billing Address: " + billingAdress);
        System.out.println("Shipping Address: " + shippingAdress);

        myScanner.close();






    }

}
