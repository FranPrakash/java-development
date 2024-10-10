package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAge {

    public static void main(String[] args) {

        //5.Create a list of the ages of the people in your breakout room

        List<Integer> agePeopleBr = new ArrayList<>();

        agePeopleBr.add(25);
        agePeopleBr.add(22);
        agePeopleBr.add(23);


        System.out.println("These are the age of people in my Breakout room" + agePeopleBr);

        //6.Make a new list, and add all the ages times 2

        List<Integer> agePeopleBrTimes2 = new ArrayList<>();

        agePeopleBrTimes2.add(50);
        agePeopleBrTimes2.add(44);
        agePeopleBrTimes2.add(46);


        //7.Sort them the second list numerically
        Collections.sort(agePeopleBrTimes2);

        System.out.println("These are the age times 2 : " + agePeopleBrTimes2);


        //8.Calculate the sum and the average
        int sum = 0;
        for ( int age : agePeopleBrTimes2) {

            sum+= age;
        }

        System.out.println("The calculate of the sum is :" + sum);



    }


}
