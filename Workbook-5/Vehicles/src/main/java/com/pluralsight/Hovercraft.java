package com.pluralsight;

public class Hovercraft extends Vehicle {

    private boolean isMilitary;
    //Super constructor
    public Hovercraft(int cargoCapacity, String color, int fuelCapacity, int numberOfPassengers, boolean isMilitary) {
        super(cargoCapacity, color, fuelCapacity, numberOfPassengers);
        this.isMilitary = isMilitary;
    }
}