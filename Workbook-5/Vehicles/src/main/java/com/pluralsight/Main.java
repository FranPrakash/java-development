package com.pluralsight;

public class Main {

    //SuperConstructor

    public static void main(String[] args) {

        //instance vehicle types
        Moped slowRide = new Moped(2,"Red",5,1,2);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car mycar = new Car(2, "White", 2, 3,0);
        mycar.setColor("Yellow");


        Hovercraft myHovercraft = new Hovercraft(10,"Pink",3, 6,false);
        myHovercraft.setColor("White");
        myHovercraft.setFuelCapacity(10);
        myHovercraft.setNumberOfPassengers(3);

        Semitruck mySemiTruck = new Semitruck(5,"Green",2,5,"refrigerated");
        mySemiTruck.setColor("Pink");


        System.out.println("Car Color: " + mycar.getColor());
        System.out.println("Hovercraft Color :" + myHovercraft.getColor());
        System.out.println("Semitruck color:" + myHovercraft.getColor());
        System.out.println("Moped color" + slowRide.getColor());

    }

}
