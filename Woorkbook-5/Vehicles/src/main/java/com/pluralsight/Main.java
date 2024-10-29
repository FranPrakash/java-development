package com.pluralsight;

public class Main extends Vehicle {

    public static void main(String[] args) {

        //instance vehicle types
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car mycar = new Car();
        mycar.setColor("Yellow");
        mycar.setNumberOfSeats(5);
        mycar.setMaxSpeed(120f);

        Hovercraft myHovercraft = new Hovercraft();
        myHovercraft.setColor("White");
        myHovercraft.setFuelCapacity(10);
        myHovercraft.setNumberOfPassengers(3);

        Semitruck mySemiTruck = new Semitruck();
        mySemiTruck.setColor("Pink");
        mySemiTruck.setNumberOfSeats(5);
        mySemiTruck.setMaxSpeed(150f);

        System.out.println("Car Color: " + mycar.getColor());
        System.out.println("Hovercraft Color :" + myHovercraft.getColor());
        System.out.println("Semitruck color:" + myHovercraft.getColor());
        System.out.println("Moped color" + slowRide.getColor());

    }


}
