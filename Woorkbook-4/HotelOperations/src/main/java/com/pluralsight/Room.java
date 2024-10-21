package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private Float price;
    private Boolean isOccupied;
    private Boolean isDirty;
    //No need for variable is available cause by knowing that a room is occupied or dirty its understandable it's not available

    //Constructor
    public Room(Boolean isDirty, Boolean isOccupied, int numberOfBeds, Float price) {
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    //Getter and setters

    public Boolean isAvailable() {
        if (!isOccupied && !isDirty) { //If the room is not occupied and not dirty its available
            return true; //Its available
        } else {
            return false;
        }
    } //Set is not need because the variable doest exit

    public Boolean isDirty() {
        return isDirty;
    }

    public void setDirty(Boolean dirty) {
        isDirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}