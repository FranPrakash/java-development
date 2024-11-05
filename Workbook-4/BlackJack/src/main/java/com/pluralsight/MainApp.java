package com.pluralsight;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        // Create a new deck
        Deck myDeck = new Deck();
        // Shuffle the Deck
        myDeck.shuffle();

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Welcome to BlackJack");
        System.out.println("How many players are playing today?");
        int playerCount = myscanner.nextInt();

        String[] players = new String[playerCount]; // Create a string array to save the name of the players

        // Prompting the user for the name of the players one by one
        int i = 0;
        while(i < playerCount) {
            System.out.println("Enter the name of Player "+(i+1));
            players[i] = myscanner.nextLine();
            i++;
        }
    }
}

//Todo:Finish this exercise