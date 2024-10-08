package com.pluralsight;

public class Dice {

    // constructor is a method and always go inside a  class
    public Dice(){

    }

    // This method generate a random number between 1-6
   public static int roll (){

        int minValue = 1;
        int maxValue = 6;

       int randomNumber = (int)(Math.random() * maxValue) + minValue;


       return randomNumber;

   }


}
