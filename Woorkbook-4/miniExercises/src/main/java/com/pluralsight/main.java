package com.pluralsight;

public class main {

    public static void main(String[] args) {

      //Calling constructor and creating myBook object
        Book myBook = new Book( "Maaike", 13 , 45 , "Learn java with projects" );
        myBook.displayDetails();

        //Calling constructor and creating myDog object
        Dog myDog = new Dog("Woof " , "Beagle ", "Bobby ");
        Dog myDog2 = new Dog("Woof ","Poodle", "Bella ");




        //Using myDog object and dogBark method to display the dog bark
       myDog.dogBark();
       myDog2.dogBark();

       //Using myDog object and dogBark method to display walkPersonName
       myDog.walk("Fran ");
       String[] names = {"Fran","Osmig", "Sophia"};
       myDog.walk(names);



    }


}
