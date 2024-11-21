package com.pluralsight;

import com.pluralsight.forms.*; //* import everything

import java.awt.*;

public class
MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(400, 400);
        Turtle turtle = new Turtle(world,-150, -150);
        
       // int width = 200;
       // int height = 200;

        //Square
       turtle.setPenWidth(3);
        turtle.setColor(Color.RED);

       turtle.forward(300);
       turtle.turnRight(90);
       turtle.forward(300);
       turtle.turnRight(90);
       turtle.forward(300);
       turtle.turnRight(90);
      turtle.forward(300);

        //first letter my name
        turtle.penUp();
        turtle.goTo(-120,-120);
        turtle.penDown();
        turtle.forward(200);
        turtle.turnRight(90);
        turtle.forward(120);
        turtle.penUp();
        turtle.goTo(-120,0);
        turtle.penDown();
        turtle.forward(100);
        turtle.penUp();

        // The letter R
        turtle.goTo(20,-120);
        turtle.penDown();
        turtle.turnLeft(90);
        turtle.forward(200);
        turtle.turnRight(90);
        turtle.forward(100);
        turtle.turnRight(90);
        turtle.forward(100);
        turtle.turnRight(90);
        turtle.forward(100);
        turtle.turnLeft(135);
        turtle.forward(145);










        //turtle.turnRight(45);
        //turtle.forward(hypotenuse);

        //turtle.penUp();
        //turtle.goTo(100, 100);
       // turtle.turnRight(90);

        //turtle.penDown();
        //turtle.forward(hypotenuse);
    }
}
