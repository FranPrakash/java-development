package com.pluralsight;

public class Main {

    public static void main(String[] args) {

    //Create an instance of Dice named dice.
        // mydice is the object and new dice is the constructor call

  Dice mydice = new Dice();

  int roll1 = 0;
  int roll2= 0;
  int twoCounter = 0;
  int fourCounter = 0;
  int sixCounter = 0;
  int sevenCounter= 0;

  // i is a counter to use to run the forloop
        for (int i = 1; i <= 100; i++) {
            roll1 = mydice.roll();
            roll2 = mydice.roll();
            System.out.println( "Roll "+i +": " + roll1 + "-" + roll2 + " sum : " + (roll1+roll2));
            if ((roll1 + roll2) == 2 ) { // parentheses tell first sum roll1+roll2 then test if its equal to 2
               twoCounter++; // incrementing two counter
            }
            if ((roll1 + roll2) == 4 ) {
                fourCounter++;
            }
            if((roll1 + roll2) == 6) {
                sixCounter++;
            }
            if((roll1 + roll2)== 7) {
                sevenCounter++;
            }


        }

        System.out.println("Number of time the sum is two: " + twoCounter );
        System.out.println("Number of time the sum is four: " + fourCounter);
        System.out.println("Number of time the sum is six: " + sixCounter);
        System.out.println("Number of time the sum is seven: " + sevenCounter);

}
}