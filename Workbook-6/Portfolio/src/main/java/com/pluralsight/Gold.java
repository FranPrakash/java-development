package com.pluralsight;

public class Gold extends FixedAsset {

  private double weight;

  //Constructor
    public Gold(double marketValue, String name, double weight) {
        super(marketValue, name);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
