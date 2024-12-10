package com.pluralsight.NorthwindTradersAPI.dao;

//Step 4 Create DAO interfaces for both Product and Category.

import com.pluralsight.NorthwindTradersAPI.Models.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> getAll();
    public Product getById(int id);



}
