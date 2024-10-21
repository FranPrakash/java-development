package com.pluralsight;

public class Room {


    private int numberOfBeds;
    private Float price;
    private Boolean Occupied;
    private Boolean Dirty;
    //is available variable  No need for variable is available cause by knowing that a room is occupied or dirty its understandable it's not available

    //Constructor
    public Room(Boolean isDirty, Boolean isOccupied, int numberOfBeds, Float price) {
        this.Dirty = isDirty;
        this.Occupied = isOccupied;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    //Getter and setters
    public Boolean isAvailable() {
        if (!Occupied && !Dirty) { //If the room is not occupied and not dirty its available
            return true; //Its available
        } else {
            return false;
        }
    } //Set is not need because the variable doest exit

    public Boolean isDirty() {
        return Dirty;
    }

    public void setDirty(Boolean dirty) {
        Dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Boolean isOccupied() {
        return Occupied;
    }

    public void setOccupied(Boolean occupied) {
        Occupied = occupied;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}