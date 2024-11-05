package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        //Testing the logic

        // Calling the constructor and creating an object , passing the parameters
        Room myRoom = new Room(true, true, 2, 120.0f);
        Room myRoom2 = new Room(false, false, 1, 120.0f);
        Room myRoom3 = new Room(true, true,2,15f);

        System.out.println("Is the room available " + myRoom.isAvailable());
        System.out.println("Is the room available " + myRoom2.isAvailable());
        System.out.println("Is the room available " + myRoom3.getPrice());

        Reservation myReservation = new Reservation(false, 2, "king");
        System.out.println(myReservation.getReservationTotal());
        System.out.println(myReservation.getPrice());

        Employee myEmployee = new Employee("Front Desk", 123, 55, "Jacob",15.50f);
        System.out.println(myEmployee.getRegularHours());
        System.out.println(myEmployee.getOvertimeHours());
        System.out.println(myEmployee.getTotalPay());






    }



}
