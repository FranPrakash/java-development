package com.pluralsight;

public class Jewelry extends FixedAsset{

   private double karat;

   //Constructor
    public Jewelry(double marketValue, String name, double karat) {
        super(marketValue, name);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
