package com.pluralsight;

import java.sql.SQLOutput;

public class Square extends Shape {

    private float sideSize;

    public Square(float sideSize) {
        this.sideSize = sideSize;
    }

//Getters and Setters

    public float getSideSize() {
        return sideSize;
    }

    public void setSideSize(float sideSize) {
        this.sideSize = sideSize;
    }

    //7. Override the methods for calculating in both square and circle
    @Override
    public void calculateArea() {
        System.out.println(sideSize * sideSize);
    }

    @Override
    public void CalculateCircumference() {
        System.out.println(sideSize * 4);
    }
}
