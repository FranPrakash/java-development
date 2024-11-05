package com.pluralsight;

public class Shape {

    private String color;

    public void calculateArea() {
        System.out.println("Area shape");
    }

    public void CalculateCircumference() {
        System.out.println("Area circumference");
    }

    //Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
