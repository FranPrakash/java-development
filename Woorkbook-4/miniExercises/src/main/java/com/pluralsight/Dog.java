package com.pluralsight;

import java.util.ArrayList;

public class Dog {

    String name;
    String breed;
    String sound;
    ArrayList<String> dogWalkersList = new ArrayList<String>();

    //constructor
    public Dog(String sound, String breed, String name) {
        this.sound = sound;
        this.breed = breed;
        this.name = name;
    }

    //Constructor with  dog walker list
    public Dog(ArrayList<String> dogWalkersList, String name) {
        this.dogWalkersList = dogWalkersList;
        this.name = name;

    }

    //Method dog Bark
    public void dogBark(){
        System.out.print( this.name );
        System.out.println("Says " + this.sound);

    }
     //method to walk the dog
    public void walk (String walkPersonName){

        System.out.println(walkPersonName + "takes " + this.name + "to walk ");
    }

    public void walk (String[] walkPersonNames) {
        for (String walkPerson : walkPersonNames) {
            System.out.println(walkPerson + "takes " + this.name + "to walk ");
        }
    }


    }

