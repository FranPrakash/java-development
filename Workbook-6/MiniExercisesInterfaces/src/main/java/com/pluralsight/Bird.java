package com.pluralsight;

public class Bird extends Animal implements Flyable {

 @Override
 public void fly(){
     System.out.println("Bird is flying");
 }

    @Override
    public double area() {
        return 0;
    }

}
