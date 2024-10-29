package com.pluralsight;

public class Semitruck extends Vehicle {

    private String TrailerType;

    public Semitruck(int cargoCapacity, String color, int fuelCapacity, int numberOfPassengers, String trailerType) {
        super(cargoCapacity, color, fuelCapacity, numberOfPassengers);
        TrailerType = trailerType;
    }
}

