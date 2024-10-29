package com.pluralsight;

public class Car extends Vehicle {
    private int doorCount;
    //Super constructor
    public Car(int cargoCapacity, String color, int fuelCapacity, int numberOfPassengers, int doorCount) {
        super(cargoCapacity, color, fuelCapacity, numberOfPassengers);
        this.doorCount = doorCount;
    }
}