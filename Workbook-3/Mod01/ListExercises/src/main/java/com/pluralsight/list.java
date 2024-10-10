package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {

    public static void main(String[] args) {

        //1.Create a new ArrayList for your favorite songs

        List<String> favoriteSongsList = new ArrayList<>();
        favoriteSongsList.add("Shape of You");
        favoriteSongsList.add("Levitating");
        favoriteSongsList.add("blabla");

        System.out.println("These are my favorite songs : " + favoriteSongsList);


//2.Remove 1 song
        favoriteSongsList.remove("blabla");
 //3.Short Song alphabetically
        Collections.sort(favoriteSongsList);


//For loop
        for (int i = 0; i < favoriteSongsList.size() ; i++) {
            System.out.println(favoriteSongsList.get(i));


        }

//For each Loop
        for (String song : favoriteSongsList)
        {
            System.out.println(song);

        }





    }


}
