package com.pluralsight;

public class Product {

    int id ;
    int StockQuantity;
    String name;
    String description;
    String productCode;

    public Product(String description, int id, String name, String productCode, int stockQuantity) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.productCode = productCode;
        StockQuantity = stockQuantity;
    }

    public void productCode(){
        productCode.toUpperCase();

    }
}
