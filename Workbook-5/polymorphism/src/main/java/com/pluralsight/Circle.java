package com.pluralsight;

public class Circle extends Shape{

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    //Getters and setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    //7. Override the methods for calculating in both square and circle
    @Override
    public void calculateArea(){
        System.out.println(Math.PI*radius*radius);  //calculate area circle
    }

    @Override
    public void CalculateCircumference(){
        System.out.println(2 * Math.PI * radius);
    }
}
