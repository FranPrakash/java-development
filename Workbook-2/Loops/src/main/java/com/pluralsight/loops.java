package com.pluralsight;

public class loops {

    public static void main(String[] args) {

        // While loops
        int i = 1; // initial value of the counter
        boolean done = false;
        while (!done) { // as long done is false
            System.out.println("hi " + i);
            i++; // increasing the value by 1 everytime the loop executes
            if (Math.random() < 0.05) {
                done = true;
            }
        }

        // For loop
        for (int x = 2; x < 20; x = x + 2) {
            System.out.println(x);
        }

        // For each loop
        String[] favoriteFruits = {"banana", "apple", "papaya", "blueberry"};

        for (String fruit : favoriteFruits) {
            System.out.println("I love " + fruit);


        }

    }
}