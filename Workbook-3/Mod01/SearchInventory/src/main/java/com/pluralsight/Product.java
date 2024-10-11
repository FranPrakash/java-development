package com.pluralsight;



// describing product
public class Product {

    private int id;
    private String name;
    private float price;

    //Constructor
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }


}
