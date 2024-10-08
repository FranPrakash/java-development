package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BedTimeStories {
    public static void main(String[] args) {


  //String array store the name of the Bed time Stories
String[] storyFiles = {"goldilocks.txt", "hansel_and_gretel.txt_mary_had_a_little_lamb.txt"};

Scanner myScanner = new Scanner(System.in);

//User choice of bed time stories
        System.out.println("What Bed time storie do you want to read ? Select an option below :");
        System.out.println("1-Goldilocks");
        System.out.println("2-Hansel and Gretel");
        System.out.println("3-Marry had a little lamb");

        int UserChoice = myScanner.nextInt();

        try {
            FileInputStream fis = new FileInputStream("goldilocks.txt");
            Scanner storyScanner = new Scanner(fis);
            while (storyScanner.hasNextLine()) {
                UserChoice = storyScanner.nextLine();
            System.out.println(UserChoice);
        }
            storyScanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
