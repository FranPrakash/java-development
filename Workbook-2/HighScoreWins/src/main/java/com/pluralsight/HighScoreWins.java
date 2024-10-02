package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a game score: ");
        String gameScore =myScanner.nextLine();


        String[] scoreData = gameScore.split(Pattern.quote("|")); // Split to create 2 parts teams name and team score
        String[] teamNames = scoreData [0].split(":"); //split the first element of string scoreData to create 2 parts
        String[] teamScoreData = scoreData[1].split(":"); // split the 2nd string teamNames to create 1) team 0 score and 2) team 1 score

        int team0Score = Integer.parseInt(teamScoreData[0]); // Convert team 0 score to int
        int team1Score = Integer.parseInt(teamScoreData[1]); // convert team 1 score to int


        if (team0Score > team1Score) {
            System.out.println("Winner: " + teamNames[0]);//print winner is team 0
        } else {
            System.out.println("Winner: " + teamNames[1]); // print winner is team 1
        }

        myScanner.close();



    }

}
