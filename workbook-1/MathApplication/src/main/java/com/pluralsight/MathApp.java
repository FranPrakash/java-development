package com.pluralsight;
public class MathApp {
    public static void main (String[] args) {
//Question 1 :
        //I am using float as a variable
        float bobSalary = 2205.32f;
        float garySalary = 32665.46f;
        float highestSalary = Math.max(bobSalary,garySalary);
        // I am using math method from math class to calculate the maximum salary
        // I pass bob Salary and Gary salary to Math.max and it returns the maximum value.
        // The result is stored in the variable highestSalary.
        System.out.println(" The highest salary is " + highestSalary );

//Question 2:
        int carPrice = 10000;
        int truckPrice = 15000;
        // I am using math.min method to calculate the minimum value
        int smallestValue = Math.min( carPrice,truckPrice);
        System.out.println(" Smallest Value" + smallestValue);

 //Question 3:
        // Since the radius of the circle is 7.25 I am just using float as variable
        // and double to calculate the area because Math.Pi method is a double type.
        float radius = 7.25f;
        double area = Math.PI * radius * radius;
        System.out.println( " The area of a circle is " + area);

 //Question 4 :
      //Since the value is 5.0 I used float but to store the square root I used
     //double because math.sqrt returns double
     float value = 5.0f;
     double squareRoot = Math.sqrt(value);
     System.out.println("The square Root of the number" + value + "is" + squareRoot);

 //Question 5:
        // I stored the x and y co-ordinates of the two points as separate int variable.
        int point1_x = 5;
        int point1_y = 10;
        int point2_x = 85;
        int point2_y = 50;
        int dist_x = point2_x - point1_x; // calculate the distance in x co-ordinates
        int dist_y = point2_y - point1_y; // calculate the distance in y co-ordinates
        double distance = Math.sqrt(dist_x * dist_x + dist_y * dist_y);
        // storing distance as a double because Math.sqrt returns double.
        // used math sqrt formula to calculate distance between 2 points.
        System.out.println("The distance between the points is " + distance);

 //Question 6:
         // Since the given value is -3.8 I used float variable to store it, I used
        // math.abs to calculate the absolute value
        // than I called println method to print the result.
        float val = -3.8f;
        float absoluteValue = Math.abs(val);
        System.out.println("The absolute positive value of the number " + val + " is " + absoluteValue);

// Question 7:
        // I created a variable called randomNumber of type double and called the
        // math.random method
        // than used the method println to print the result.
        double randomNumber = Math.random();
        System.out.println("A random number between 0 and 1 is: " + randomNumber);




    }

}
