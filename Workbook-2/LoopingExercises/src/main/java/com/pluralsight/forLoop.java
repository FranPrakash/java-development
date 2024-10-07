package com.pluralsight;

public class forLoop {

    public static void main(String[] args) throws InterruptedException {


        // declare an integer variable as a counter starting value of 10.
       // loop until counter reaches 1.
      // reduce the value of counter by 1 in each loop run


        for (int i = 10; i >1; i--) {

            System.out.println(i);
            Thread.sleep(1000); // add 1 second delay

        }
        System.out.println("Launch!");
        
        
    }
    
    
}
