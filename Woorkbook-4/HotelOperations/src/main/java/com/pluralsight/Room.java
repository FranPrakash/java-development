package com.pluralsight;

public class Room {


    private int numberOfBeds;
    private Float price;
    private Boolean occupied;
    private Boolean dirty;
    //is available variable  No need for variable is available cause by knowing that a room is occupied or dirty its understandable it's not available

    //Constructor
    public Room(Boolean isDirty, Boolean isOccupied, int numberOfBeds, Float price) {
        this.dirty = isDirty;
        this.occupied = isOccupied;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    //Getter and setters
    public Boolean isAvailable() {
        if (!occupied && !dirty) { //If the room is not occupied and not dirty its available
            return true; //Its available
        } else {
            return false;
        }
    } //Set is not need because the variable doest exit

    public Boolean isDirty() {
        return dirty;
    }

    public void setDirty(Boolean dirty) {
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    //Exercise 2

    public void checkIn(){
        this.occupied = true; //Initializing the variable to true
        this.dirty = true;

    }

    public void checkOut(){
        this.cleanRoom(); // When guest check out cleanRoom method is going to be called

    }

    public void cleanRoom(){

    }


}