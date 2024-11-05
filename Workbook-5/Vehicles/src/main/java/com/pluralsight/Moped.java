package com.pluralsight;

public class Moped extends Vehicle {
    private int pedalCount;
    //Super constructor

    public Moped(int cargoCapacity, String color, int fuelCapacity,  int numberOfPassengers, int pedalCount) {
        super(cargoCapacity, color, fuelCapacity, numberOfPassengers);
        this.pedalCount = pedalCount;
    }
}