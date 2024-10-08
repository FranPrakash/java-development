package com.pluralsight;

import java.util.Scanner;

    public class FamousQuotes {



        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);

            // Declare a string array of length 10 to store quotes
            try {
                String[] quotes = {"A rose by any other name would smell as sweet. - William Shakespeare",
                        "All that glitters is not gold. - William Shakespeare",
                        "All the world’s a stage, and all the men and women merely players. - William Shakespeare",
                        "Ask not what your country can do for you; ask what you can do for your country. - John Kennedy",
                        "Ask, and it shall be given you; seek, and you shall find. - the Bible",
                        "Eighty percent of success is showing up. - Woody Allen",
                        "Eighty percent of success is showing up. - Woody Allen",
                        "For those to whom much is given, much is required. - the Bible",
                        "Frankly, my dear, I don't give a damn. - Rhett Butler (character)",
                        "Genius is one percent inspiration and ninety-nine percent perspiration. - Thomas Edison"};


                //User choice
                System.out.println(" Please select a number between 1 and 10: ");
                int choice = myScanner.nextInt();

                //Print the user choice quote
                System.out.println(quotes[choice - 1]);
            }
            catch (Exception e){
                System.out.println("Your choice was out of range!");
                // e.printStackTrace();



                myScanner.close();




            }




        }





}
