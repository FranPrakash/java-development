package com.pluralsight;

public class House extends FixedAsset {
    //properties
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    //Constructor
    public House(double marketValue, String name, int bedrooms, int squareFeet, int yearBuilt) {
        super(marketValue, name);
        this.bedrooms = bedrooms;
        this.squareFeet = squareFeet;
        this.yearBuilt = yearBuilt;
    }

    @Override
    public double getValue() {
        return squareFeet*200;
    }
}
