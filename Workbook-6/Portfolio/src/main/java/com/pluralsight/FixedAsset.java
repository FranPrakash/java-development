package com.pluralsight;

public abstract class FixedAsset implements Valuable {
  //properties
    private String name;
    private double marketValue;

   //constructor
    public FixedAsset(double marketValue, String name) {
        this.marketValue = marketValue;
        this.name = name;
    }

//Implemented method
    @Override
    public double getValue() {
        return marketValue;
    }


}
