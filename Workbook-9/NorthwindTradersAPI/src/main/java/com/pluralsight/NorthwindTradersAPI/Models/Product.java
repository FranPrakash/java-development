package com.pluralsight.NorthwindTradersAPI.Models;

public class Product {

private int productId;
private String productName;
private int categoryId;
private double unitPrice;

//Constructor
    public Product(int categoryId, int productId, String productName, int unitPrice) {
        this.categoryId = categoryId;
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }
//Getters and setters
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
