package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BedTimeStories {
    public static void main(String[] args) {


  //String array store the name of the Bed time Stories
String[] storyFiles = {"goldilocks.txt","hansel_and_gretel.txt","mary_had_a_little_lamb.txt"};

Scanner myScanner = new Scanner(System.in);

//User choice of bed time stories
        System.out.println("What Bed time storie do you want to read ? Select an option below :");
        System.out.println("1-Goldilocks");
        System.out.println("2-Hansel and Gretel");
        System.out.println("3-Marry had a little lamb");

        int UserChoice = myScanner.nextInt();

        try {
            // creating a file input stream object
            FileInputStream fis = new FileInputStream(storyFiles[UserChoice -1]); // The -1 converts the user choice (1,2 or 3) to positions in the array (0,1 aor 2).
            Scanner storyScanner = new Scanner(fis); // passing the file input stream object to the scanner constructor

            while (storyScanner.hasNextLine()) {
            System.out.println(storyScanner.nextLine());
        }
            storyScanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
