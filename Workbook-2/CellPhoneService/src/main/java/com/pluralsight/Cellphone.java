package com.pluralsight;

public class Cellphone {

// Class data

    int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;


    // Constructor needs the same name as the class
    // the parenthesis are empty because it's a parameterless constructor
   //this refers to the class
    public Cellphone(){
    this.serialNumber = 0;
    this.model = "";
    this.carrier = "";
    this.phoneNumber = "";
    this.owner = "";
    }

// Getter is a method that get the value of a variable from an object
// settler set the value of an object.

    public int getSerialNumber() {
        return this.serialNumber; // when a user call this method it returns the value of serial number so I don't need to give it a parameter.
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber; // when calling a settler have to provide the value that I want the variable to have.
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCarrier() {
        return this.carrier;
    }
    public void setCarrier(String Carrier) {
        this.carrier = carrier;
    }
     public String getPhoneNumber() {
         return this.phoneNumber;
     }
     public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

     public String getOwner() {
         return this.owner;
     }
     public void setOwner(String owner) {
          this.owner = owner;
     }


}



