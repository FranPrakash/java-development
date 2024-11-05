package com.pluralsight;

//8. Create a program, and add this:

public class main {

    Shape s1 = new Shape();
    Shape s2 = new Square(4);
    Shape s3 = new Circle(4);

    //set the fields and call the methods for calculating on each
    




    s1.setColor("Pink");
   s2.setColor("White");
   s3.setColor("Green");
   s1.calculateArea();
   s1.setcalculateCircumference();
   s2.setcalculateArea();
   s2.setcalculateCircumference();
   s3.setcalculateArea();
   s3.setcalculateCircumference();

}
// set the fields and call the methods for calculating on each
// can you print the radius of the circle? access in here, not in circle
// can you print the side size of the square?