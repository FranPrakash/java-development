package com.pluralsight;

import java.util.Scanner;

// exercise 2 Have it display the properties of a cell phone in a meaningful way.
public class CellPhoneApplication {

    public static void display(CellPhone phone) {

        System.out.print("\nSerial Number: " + phone.getSerialNumber());
        System.out.print("\nModel: " + phone.getModel());
        System.out.print("\nCarrier: " + phone.getCarrier());
        System.out.print("\nPhone Number: " + phone.getPhoneNumber());
        System.out.print("\nOwner: " + phone.getOwner());
    }


    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        CellPhone myCellphone = new CellPhone(); // Calling the Constructor

        System.out.println("What is the serial number? ");
        myCellphone.setSerialNumber(myScanner.nextInt());
        myScanner.nextLine();
        System.out.println("What model is the phone? ");
        myCellphone.setModel(myScanner.nextLine());

        System.out.println("Who is the carrier?");
        myCellphone.setCarrier(myScanner.nextLine());

        System.out.println("What is the phone number? ");
        myCellphone.setPhoneNumber(myScanner.nextLine());

        System.out.println("Who is the owner of the phone? ");
        myCellphone.setOwner(myScanner.nextLine());

        System.out.print("Serial Number: " + myCellphone.getSerialNumber());
        System.out.print("\nModel: " + myCellphone.getModel());
        System.out.print("\nCarrier: " + myCellphone.getCarrier());
        System.out.print("\nPhone Number: " + myCellphone.getPhoneNumber());
        System.out.print("\nOwner: " + myCellphone.getOwner());

        //cellphone2 // created another object of the same class cellphone so I can display the cellphone 2

        CellPhone myCellphone2 = new CellPhone(); // Calling the Constructor
        System.out.println("\nEnter the 2nd cellphone details");
        System.out.println("What is the serial number? ");
        myCellphone2.setSerialNumber(myScanner.nextInt());
        myScanner.nextLine();
        System.out.println("What model is the phone? ");
        myCellphone2.setModel(myScanner.nextLine());

        System.out.println("Who is the carrier?");
        myCellphone2.setCarrier(myScanner.nextLine());

        System.out.println("What is the phone number? ");
        myCellphone2.setPhoneNumber(myScanner.nextLine());

        System.out.println("Who is the owner of the phone? ");
        myCellphone2.setOwner(myScanner.nextLine());


        // exercise 2 Then call that method twice -- passing it your two CellPhone objects

        display(myCellphone);
        display(myCellphone2);
        System.out.println();

        myCellphone.dial( myCellphone2.getPhoneNumber() );
        myCellphone2.dial( myCellphone.getPhoneNumber() ); // Then your second cell phone dial your first one using the code


        myScanner.close();


    }

}
