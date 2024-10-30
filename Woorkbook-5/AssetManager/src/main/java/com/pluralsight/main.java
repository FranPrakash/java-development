package com.pluralsight;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        //Create an ArrayList of Asset objects
        ArrayList<Asset> AssetsList = new ArrayList<Asset>();

        AssetsList.add(new Vehicle("9/30/2023", "Fran's car", 10000, "Tesla", 7000, 2024));
        AssetsList.add(new Vehicle("29/09/2023", "Shawn's car", 50000, "Ford", 10000, 2024));

        AssetsList.add(new House("30/10/2022", "Main house", 50000, "San Francisco", 1, 1000, 2000));
        AssetsList.add(new House("31/10/2021", "Vacation house", 2000, "Concord", 2, 1000, 2000));

        for (Asset a : AssetsList) {
            System.out.println(a.getDescription() + " - " + a.getDateAcquired() + " : " + a.getOriginalCost() + "  => " + a.getValue());

        }
    }
}
