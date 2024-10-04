package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {


    public static void main(String[] args) {

 Scanner myScanner = new Scanner( System.in);

        Cellphone myCellphone = new Cellphone(); // Calling the Constructor

        System.out.println(" What is the serial number? ");
        myCellphone.setSerialNumber(myScanner.nextInt());

        System.out.println("What model is the phone? " );
        myCellphone.setModel(myScanner.nextLine());
        myScanner.nextLine(); // Jump one line

        System.out.println( " Who is the carrier?");
        myCellphone.setCarrier(myScanner.nextLine());

        System.out.println(" What is the phone number? ");
        myCellphone.setPhoneNumber(myScanner.nextLine());

        System.out.println(" Who is the owner of the phone? ");
        myCellphone.setOwner(myScanner.nextLine());

        System.out.print("Serial Number: " + myCellphone.getSerialNumber());
        System.out.print("Model: " + myCellphone.getModel());
        System.out.println("Carrier: " + myCellphone.getCarrier());
        System.out.println("Phone Number: " + myCellphone.getPhoneNumber());
        System.out.println("Owner: " + myCellphone.getOwner());

        myScanner.close();


    }

}
