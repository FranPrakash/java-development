package com.pluralsight;

public class Book {

   String title;
   String author;
   double price;
   int isbn;

   //Constructor
    public Book(String author, int isbn, double price, String title) {
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.title = title;

    }
    //Method display details
    public void displayDetails (){
        System.out.println("Book Details");
        System.out.println("Author: " + this.author);
        System.out.println("Title: " + this.title);
        System.out.println("Isbn: " + this.isbn);
        System.out.println("Price: " + this.price);
    }

    }




