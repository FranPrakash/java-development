package com.pluralsight;

import java.util.HashMap;

public class HashmapExercise {

    public static void main(String[] args) {



        //1. Create a map for name of the people your breakout room and their favorite fruit

        HashMap<String, String> namePeopleBr
                = new HashMap<String, String>();

        namePeopleBr.put("Adrian", "Apple");
        namePeopleBr.put("Sameem", "Banana");
        namePeopleBr.put("Gabriel", "Orange");

        System.out.println(namePeopleBr);

        //2. Create a map for numbers and their squared counter parts (2 and 4, 3 and 9, 4 and 16)

        HashMap<Integer, Integer> numbersSquared
                = new HashMap<Integer, Integer>();

        numbersSquared.put(2, 4);
        numbersSquared.put(3, 9);
        numbersSquared.put(4, 16);

        System.out.println(numbersSquared);

//3. Create a map for a string owner and a list of puppies he/she owns

        HashMap<String, String> ownerPuppies
                = new HashMap<String, String>();
        ownerPuppies.put("Adrian", "Labrador Retriever");
        ownerPuppies.put("Sameem", "Beagle");
        ownerPuppies.put("Gabriel", "Bulldog");

        System.out.println(ownerPuppies);


    }

}
