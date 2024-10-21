package com.pluralsight;

public class Reservation {

    //Declare variables
    private String roomType;
    //No need to variable price since the value of price can be get from room type and is weekend
    private int numberOfNights;
    private Boolean isWeekend;
   //No need to the variable getReservationTotal because I can get the value of the stay with roomType, numbersOfNights and isWeekend

    //Constructor
    public Reservation(Boolean isWeekend, int numberOfNights, String roomType) {
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
        this.roomType = roomType;
    }

    //Getters and Setters
    public Boolean getWeekend() {
        return isWeekend;
    }

    public void setWeekend(Boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
 // checking if room type is king or double
    public Float getPrice() {
        if (roomType == "king" && isWeekend == false) {
            return 139.00f;
        } else if (roomType == "double" && isWeekend == false) {//Else if because I have another condition to check
            return 124.00f;
        } else if (roomType == "king" && isWeekend == true) {
            return 139.00f * 1.10f; // Increase value by 10%
        } else if (roomType == "double" && isWeekend == true) {
            return 124.00f * 1.10f; //Increase value by 10%
        } else return 0f; // returning zero if the room type is not king or double
    }

    public float getReservationTotal() {
        return this.getPrice()* this.numberOfNights; // getPrice method already has condition so im multiplying by numberOfNights
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
